package com.mycompany.parkplus;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;

public class LugarDAO {

    // Registrar la entrada de un vehículo
    public boolean registrarEntradaMoto(String placa) {
        String queryLugar = "SELECT TOP 1 * FROM lugaresMotos WHERE ocupado = 0 ORDER BY numero";
        try (Connection conn = ConexionSQL.conectar();
             PreparedStatement psLugar = conn.prepareStatement(queryLugar);
             ResultSet rs = psLugar.executeQuery()) {

            if (rs.next()) {
                int idLugar = rs.getInt("id");
                // Actualizar el lugar como ocupado
                String updateLugar = "UPDATE lugaresMotos SET ocupado = 1, placa = ?, hora_entrada = ? WHERE id = ?";
                try (PreparedStatement psUpdate = conn.prepareStatement(updateLugar)) {
                    psUpdate.setString(1, placa);
                    psUpdate.setTimestamp(2, Timestamp.valueOf(LocalDateTime.now()));
                    psUpdate.setInt(3, idLugar);
                    psUpdate.executeUpdate();
                }

                // Insertar registro de entrada
                String insertRegistro = "INSERT INTO historico (placa, hora_entrada, tipo_vehiculo) VALUES (?, ?, 'MOTOCICLETA', ?)";
                try (PreparedStatement psReg = conn.prepareStatement(insertRegistro)) {
                    psReg.setString(1, placa);
                    psReg.setTimestamp(2, Timestamp.valueOf(LocalDateTime.now()));
                    Integer lugarOcupado = rs.getInt("numero");
                    psReg.setInt(3, lugarOcupado);
                    psReg.executeUpdate();
                }

                JOptionPane.showMessageDialog(null, "El Vehículo " + placa + " ingresó en lugar M" + rs.getInt("numero"));
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "No hay lugares disponibles, espere a que se desocupe uno");
                return false;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean registrarEntradaCarro(String placa) {
        String queryLugar = "SELECT TOP 1 * FROM lugaresCarros WHERE ocupado = 0 ORDER BY numero";
        try (Connection conn = ConexionSQL.conectar();
             PreparedStatement psLugar = conn.prepareStatement(queryLugar); //Prepara un objeto con el query que ya puse arriba, y lo uso para evitar inyecciones SQL, y luego puedo complementarlo con ps.setString
             ResultSet rs = psLugar.executeQuery()) {

            if (rs.next()) {
                int idLugar = rs.getInt("id");
                // EL LUGAR PASA A ESTAR OCUPADO
                String updateLugar = "UPDATE lugaresCarro SET ocupado = 1, placa = ?, hora_entrada = ? WHERE id = ?";
                try (PreparedStatement psUpdate = conn.prepareStatement(updateLugar)) {
                    psUpdate.setString(1, placa);
                    psUpdate.setTimestamp(2, Timestamp.valueOf(LocalDateTime.now()));
                    psUpdate.setInt(3, idLugar);
                    psUpdate.executeUpdate();
                }

                // INGRESO a HISTORICO
                String insertRegistro = "INSERT INTO historico (placa, hora_entrada, tipo_vehiculo, lugarOcupado) VALUES (?, ?, 'CARRO', ?)";
                try (PreparedStatement psReg = conn.prepareStatement(insertRegistro)) {
                    psReg.setString(1, placa);
                    psReg.setTimestamp(2, Timestamp.valueOf(LocalDateTime.now()));
                    Integer lugarOcupado = rs.getInt("numero");
                    psReg.setInt(3, lugarOcupado);
                    psReg.executeUpdate();
                }

                JOptionPane.showMessageDialog(null, "El Vehículo " + placa + " ingresó en lugar C" + rs.getInt("numero"));
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "No hay lugares disponibles, espere a que se desocupe uno");
                return false;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    } 
    
    public boolean registrarEntradaCatedratico(String placa, String tipoVehiculo) {
        String queryLugar = "SELECT TOP 1 * FROM lugares WHERE ocupado = 0 ORDER BY numero";
        try (Connection conn = ConexionSQL.conectar();
             PreparedStatement psLugar = conn.prepareStatement(queryLugar);
             ResultSet rs = psLugar.executeQuery()) {

            if (rs.next()) {
                int idLugar = rs.getInt("id");
                // ACTUALIZA EL LUGAR
                String updateLugar = "UPDATE lugares SET ocupado = 1, placa = ?, hora_entrada = ? WHERE id = ?";
                try (PreparedStatement psUpdate = conn.prepareStatement(updateLugar)) {
                    psUpdate.setString(1, placa);
                    psUpdate.setTimestamp(2, Timestamp.valueOf(LocalDateTime.now()));
                    psUpdate.setInt(3, idLugar);
                    psUpdate.executeUpdate();
                }

                // INGRESAR AL HISTORICO
                String insertRegistro = "INSERT INTO registros (placa, hora_entrada, tipo_vehiculo ,lugarOcupado) VALUES (?, ?, ?, ?)";
                
                try (PreparedStatement psReg = conn.prepareStatement(insertRegistro)) {
                    psReg.setString(1, placa);
                    psReg.setTimestamp(2, Timestamp.valueOf(LocalDateTime.now()));
                    psReg.setString(3, tipoVehiculo);
                    Integer lugarOcupado = rs.getInt("numero");
                    psReg.setInt(4, lugarOcupado);
                    psReg.executeUpdate();
                }

                JOptionPane.showMessageDialog(null, "El Vehículo " + placa + " ingresó en lugar CT" + rs.getInt("numero"));
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "No hay lugares disponibles, espere a que se desocupe uno");
                return false;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    // EVENTO PARA REGISTRAR LA SALIDA DE UN VEHICULO
    public boolean registrarSalidaCarro(String placa, double tarifaPorHora) {
        String queryLugar = "SELECT * FROM lugaresCarros WHERE placa = ?";
        try (Connection conn = ConexionSQL.conectar();
             PreparedStatement psLugar = conn.prepareStatement(queryLugar)) {

            psLugar.setString(1, placa);
            try (ResultSet rs = psLugar.executeQuery()) {
                if (rs.next()) {
                    int idLugar = rs.getInt("id");
                    Timestamp entrada = rs.getTimestamp("hora_entrada");
                    LocalDateTime salida = LocalDateTime.now();

                    //LIBERA EL LUGAR
                    String updateLugar = "UPDATE lugaresCarros SET ocupado = 0, placa = NULL, hora_entrada = NULL WHERE id = ?";
                    try (PreparedStatement psUpdate = conn.prepareStatement(updateLugar)) {
                        psUpdate.setInt(1, idLugar);
                        psUpdate.executeUpdate();
                    }

                    // ACTUALIZA EL REGISTRO CON HORA ENTRADA, SALIDA Y TOTAL
                    double horas = (double) (Timestamp.valueOf(salida).getTime() - entrada.getTime()) / (1000*60*60);
                    double total = Math.ceil(horas) * tarifaPorHora;

                    String updateRegistro = "UPDATE registros SET hora_salida = ?, total_pagar = ? " +
                            "WHERE placa = ? AND hora_salida IS NULL";
                    try (PreparedStatement psReg = conn.prepareStatement(updateRegistro)) {
                        psReg.setTimestamp(1, Timestamp.valueOf(salida));
                        psReg.setDouble(2, total);
                        psReg.setString(3, placa);
                        psReg.executeUpdate();
                    }

                    System.out.println("✅ Vehículo " + placa + " salió. Total a pagar: Q" + total);
                    return true;

                } else {
                    System.out.println("❌ No se encontró vehículo con placa " + placa);
                    return false;
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean registrarSalidaMoto(String placa, double tarifaPorHora) {
        String queryLugar = "SELECT * FROM lugares WHERE placa = ?";
        try (Connection conn = ConexionSQL.conectar();
             PreparedStatement psLugar = conn.prepareStatement(queryLugar)) {

            psLugar.setString(1, placa);
            try (ResultSet rs = psLugar.executeQuery()) {
                if (rs.next()) {
                    int idLugar = rs.getInt("id");
                    Timestamp entrada = rs.getTimestamp("hora_entrada");
                    LocalDateTime salida = LocalDateTime.now();

                    //LIBERA EL LUGAR
                    String updateLugar = "UPDATE lugares SET ocupado = 0, placa = NULL, hora_entrada = NULL WHERE id = ?";
                    try (PreparedStatement psUpdate = conn.prepareStatement(updateLugar)) {
                        psUpdate.setInt(1, idLugar);
                        psUpdate.executeUpdate();
                    }

                    // ACTUALIZA EL REGISTRO CON HORA ENTRADA, SALIDA Y TOTAL
                    double horas = (double) (Timestamp.valueOf(salida).getTime() - entrada.getTime()) / (1000*60*60);
                    double total = Math.ceil(horas) * tarifaPorHora;

                    String updateRegistro = "UPDATE registros SET hora_salida = ?, total_pagar = ? " +
                            "WHERE placa = ? AND hora_salida IS NULL";
                    try (PreparedStatement psReg = conn.prepareStatement(updateRegistro)) {
                        psReg.setTimestamp(1, Timestamp.valueOf(salida));
                        psReg.setDouble(2, total);
                        psReg.setString(3, placa);
                        psReg.executeUpdate();
                    }

                    System.out.println("✅ Vehículo " + placa + " salió. Total a pagar: Q" + total);
                    return true;

                } else {
                    System.out.println("❌ No se encontró vehículo con placa " + placa);
                    return false;
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean registrarSalidaCatedratico(String placa, double tarifaPorHora) {
        String queryLugar = "SELECT * FROM lugares WHERE placa = ?";
        try (Connection conn = ConexionSQL.conectar();
             PreparedStatement psLugar = conn.prepareStatement(queryLugar)) {

            psLugar.setString(1, placa);
            try (ResultSet rs = psLugar.executeQuery()) {
                if (rs.next()) {
                    int idLugar = rs.getInt("id");
                    Timestamp entrada = rs.getTimestamp("hora_entrada");
                    LocalDateTime salida = LocalDateTime.now();

                    //LIBERA EL LUGAR
                    String updateLugar = "UPDATE lugares SET ocupado = 0, placa = NULL, hora_entrada = NULL WHERE id = ?";
                    try (PreparedStatement psUpdate = conn.prepareStatement(updateLugar)) {
                        psUpdate.setInt(1, idLugar);
                        psUpdate.executeUpdate();
                    }

                    // ACTUALIZA EL REGISTRO CON HORA ENTRADA, SALIDA Y TOTAL
                    double horas = (double) (Timestamp.valueOf(salida).getTime() - entrada.getTime()) / (1000*60*60);
                    double total = Math.ceil(horas) * tarifaPorHora;

                    String updateRegistro = "UPDATE registros SET hora_salida = ?, total_pagar = ? " +
                            "WHERE placa = ? AND hora_salida IS NULL";
                    try (PreparedStatement psReg = conn.prepareStatement(updateRegistro)) {
                        psReg.setTimestamp(1, Timestamp.valueOf(salida));
                        psReg.setDouble(2, total);
                        psReg.setString(3, placa);
                        psReg.executeUpdate();
                    }

                    System.out.println("✅ Vehículo " + placa + " salió. Total a pagar: Q" + total);
                    return true;

                } else {
                    System.out.println("❌ No se encontró vehículo con placa " + placa);
                    return false;
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}