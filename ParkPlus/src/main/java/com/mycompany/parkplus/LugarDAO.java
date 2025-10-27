package com.mycompany.parkplus;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;

public class LugarDAO {
    private String placa;
    private String tipoVehiculo;
    private double tarifaPorHora;

    public LugarDAO(String placa) {
        this.placa = placa;
    } //Constructor para Registrar Carros y Motos
    public LugarDAO(String placa, String tipoVehiculo) {
        this.placa = placa;
        this.tipoVehiculo = tipoVehiculo;
    } //Constructor para Registrar Catedráticos

    // Registrar la entrada de un vehículo
    public Integer registrarEntradaMoto(String placa) {
        int lugarOcupado = 0;
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
                    lugarOcupado = rs.getInt("numero");
                    psReg.setInt(3, lugarOcupado);
                    psReg.executeUpdate();
                }

                JOptionPane.showMessageDialog(null, "El Vehículo " + placa + " ingresó en lugar M" + rs.getInt("numero"));
                lugarOcupado = rs.getInt("numero");
                return lugarOcupado;
            } else {
                JOptionPane.showMessageDialog(null, "No hay lugares disponibles, espere a que se desocupe uno");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            
        }
        return lugarOcupado;
    }
    public Integer registrarEntradaCarro(String placa) {
        int lugarOcupado = 0;
        String queryLugar = "SELECT TOP 1 * FROM lugaresCarros WHERE ocupado = 0 ORDER BY numero";
        try (Connection conn = ConexionSQL.conectar();
             PreparedStatement psLugar = conn.prepareStatement(queryLugar); //Prepara un objeto con el query que ya puse arriba, y lo uso para evitar inyecciones SQL, y luego puedo complementarlo con ps.setString
             ResultSet rs = psLugar.executeQuery()) {

            if (rs.next()) {
                int idLugar = rs.getInt("id");
                // EL LUGAR PASA A ESTAR OCUPADO
                String updateLugar = "UPDATE lugaresCarros SET ocupado = 1, placa = ?, hora_entrada = ? WHERE id = ?";
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
                    lugarOcupado = rs.getInt("numero");
                    psReg.setInt(3, lugarOcupado);
                    psReg.executeUpdate();
                }

                JOptionPane.showMessageDialog(null, "El Vehículo " + placa + " ingresó en lugar C" + rs.getInt("numero"));
                lugarOcupado = rs.getInt("numero");
                return lugarOcupado;
            } else {
                JOptionPane.showMessageDialog(null, "No hay lugares disponibles, espere a que se desocupe uno");
                
            }

        } catch (SQLException e) {
            e.printStackTrace();
            
        }
        return lugarOcupado;
    } 
    public Integer registrarEntradaCatedratico(String placa, String tipoVehiculo) {
        int lugarOcupado = 0;
        String queryLugar = "SELECT TOP 1 * FROM lugaresCatedraticos WHERE ocupado = 0 ORDER BY numero";
        try (Connection conn = ConexionSQL.conectar();
             PreparedStatement psLugar = conn.prepareStatement(queryLugar);
             ResultSet rs = psLugar.executeQuery()) {

            if (rs.next()) {
                int idLugar = rs.getInt("id");
                // ACTUALIZA EL LUGAR
                String updateLugar = "UPDATE lugaresCatedraticos SET ocupado = 1, placa = ?, hora_entrada = ?, tipoVehiculo = ? WHERE id = ?";
                try (PreparedStatement psUpdate = conn.prepareStatement(updateLugar)) {
                    psUpdate.setString(1, placa);
                    psUpdate.setObject(2, LocalDateTime.now());
                    psUpdate.setString(3, tipoVehiculo);
                    psUpdate.setInt(4, idLugar);
                    psUpdate.executeUpdate();
                }

                // INGRESAR AL HISTORICO
                String insertRegistro = "INSERT INTO historico (placa, hora_entrada, tipo_vehiculo ,lugarOcupado) VALUES (?, ?, ?, ?)";
                try (PreparedStatement psReg = conn.prepareStatement(insertRegistro)) {
                    psReg.setString(1, placa);
                    psReg.setObject(2, LocalDateTime.now());
                    psReg.setString(3, tipoVehiculo);
                    lugarOcupado = rs.getInt("numero");
                    psReg.setInt(4, lugarOcupado);
                    psReg.executeUpdate();
                }

                JOptionPane.showMessageDialog(null, "El Vehículo " + placa + " ingresó en lugar CT" + rs.getInt("numero"));
                lugarOcupado = rs.getInt("numero");
                return lugarOcupado;
               
            } else {
                JOptionPane.showMessageDialog(null, "No hay lugares disponibles, espere a que se desocupe uno");
                
            }

        } catch (SQLException e) {
            e.printStackTrace();
            
        }
        return lugarOcupado;
    }
    
    
    // EVENTO PARA REGISTRAR LAS SALIDAS DE VEHICULOS CON TARIFA VARIABLE
    public double registrarSalidaCarroVariable(String placa, double tarifaPorHora) {
        double total = 0;
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
                    total = Math.ceil(horas) * tarifaPorHora;

                    String updateRegistro = "UPDATE historico SET hora_salida = ?, total_pagar = ? " +
                            "WHERE placa = ? AND hora_salida IS NULL";
                    try (PreparedStatement psReg = conn.prepareStatement(updateRegistro)) {
                        psReg.setTimestamp(1, Timestamp.valueOf(salida));
                        psReg.setDouble(2, total);
                        psReg.setString(3, placa);
                        psReg.executeUpdate();
                    }

                    
                    return total;

                } else {
                    JOptionPane.showMessageDialog(null, "No se encuentra el Vehiculo Ingresado");
                    
                }
            }

        } 
        catch (SQLException e) {
            e.printStackTrace();
            
        }
        return total;
    }
    public double registrarSalidaMotoVariable(String placa, double tarifaPorHora) {
        double total = 0;
        String queryLugar = "SELECT * FROM lugaresMoto WHERE placa = ?";
        try (Connection conn = ConexionSQL.conectar();
             PreparedStatement psLugar = conn.prepareStatement(queryLugar)) {

            psLugar.setString(1, placa);
            try (ResultSet rs = psLugar.executeQuery()) {
                if (rs.next()) {
                    int idLugar = rs.getInt("id");
                    Timestamp entrada = rs.getTimestamp("hora_entrada");
                    LocalDateTime salida = LocalDateTime.now();

                    //LIBERA EL LUGAR
                    String updateLugar = "UPDATE lugaresMoto SET ocupado = 0, placa = NULL, hora_entrada = NULL WHERE id = ?";
                    try (PreparedStatement psUpdate = conn.prepareStatement(updateLugar)) {
                        psUpdate.setInt(1, idLugar);
                        psUpdate.executeUpdate();
                    }

                    // ACTUALIZA EL REGISTRO CON HORA ENTRADA, SALIDA Y TOTAL
                    double horas = (double) (Timestamp.valueOf(salida).getTime() - entrada.getTime()) / (1000*60*60);
                    total = Math.ceil(horas) * tarifaPorHora;

                    String updateRegistro = "UPDATE historico SET hora_salida = ?, total_pagar = ? " +
                            "WHERE placa = ? AND hora_salida IS NULL";
                    try (PreparedStatement psReg = conn.prepareStatement(updateRegistro)) {
                        psReg.setTimestamp(1, Timestamp.valueOf(salida));
                        psReg.setDouble(2, total);
                        psReg.setString(3, placa);
                        psReg.executeUpdate();
                    }

                    return total;
                } else {
                    JOptionPane.showMessageDialog(null, "No se encuentra el Vehiculo Ingresado");
                   
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
            
        }
        return total;
    }
    public double registrarSalidaCatedraticoVariable(String placa, double tarifaPorHora) {
        double total = 0;
        String queryLugar = "SELECT * FROM lugaresCatedraticos WHERE placa = ?";
        try (Connection conn = ConexionSQL.conectar();
             PreparedStatement psLugar = conn.prepareStatement(queryLugar)) {

            psLugar.setString(1, placa);
            try (ResultSet rs = psLugar.executeQuery()) {
                if (rs.next()) {
                    int idLugar = rs.getInt("id");
                    Timestamp entrada = rs.getTimestamp("hora_entrada");
                    LocalDateTime salida = LocalDateTime.now();

                    //LIBERA EL LUGAR
                    String updateLugar = "UPDATE lugaresCatedraticos SET ocupado = 0, placa = NULL, hora_entrada = NULL WHERE id = ?";
                    try (PreparedStatement psUpdate = conn.prepareStatement(updateLugar)) {
                        psUpdate.setInt(1, idLugar);
                        psUpdate.executeUpdate();
                    }

                    // ACTUALIZA EL REGISTRO CON HORA ENTRADA, SALIDA Y TOTAL
                    double horas = (double) (Timestamp.valueOf(salida).getTime() - entrada.getTime()) / (1000*60*60);
                    total = Math.ceil(horas) * tarifaPorHora;

                    String updateRegistro = "UPDATE historico SET hora_salida = ?, total_pagar = ? " +
                            "WHERE placa = ? AND hora_salida IS NULL";
                    try (PreparedStatement psReg = conn.prepareStatement(updateRegistro)) {
                        psReg.setTimestamp(1, Timestamp.valueOf(salida));
                        psReg.setDouble(2, total);
                        psReg.setString(3, placa);
                        psReg.executeUpdate();
                    }

                    return total;

                } else {
                    JOptionPane.showMessageDialog(null, "No se encuentra el Vehiculo Ingresado");
                    
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
            
        }
        return total;
    }
    
    public double registrarSalidaCarroFlat(String placa){
        double total = 0;
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
                    total = 10;

                    String updateRegistro = "UPDATE historico SET hora_salida = ?, total_pagar = ? " +
                            "WHERE placa = ? AND hora_salida IS NULL";
                    try (PreparedStatement psReg = conn.prepareStatement(updateRegistro)) {
                        psReg.setTimestamp(1, Timestamp.valueOf(salida));
                        psReg.setDouble(2, total);
                        psReg.setString(3, placa);
                        psReg.executeUpdate();
                    }

                    
                    return total;

                } else {
                    JOptionPane.showMessageDialog(null, "No se encuentra el Vehiculo Ingresado");
                
                }
            }

        } 
        catch (SQLException e) {
            e.printStackTrace();
           
        }
        return total;
    }
    public double registrarSalidaMotoFlat(String placa){
        double total = 0;
        String queryLugar = "SELECT * FROM lugaresMoto WHERE placa = ?";
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
                    total = 10;

                    String updateRegistro = "UPDATE historico SET hora_salida = ?, total_pagar = ? " +
                            "WHERE placa = ? AND hora_salida IS NULL";
                    try (PreparedStatement psReg = conn.prepareStatement(updateRegistro)) {
                        psReg.setTimestamp(1, Timestamp.valueOf(salida));
                        psReg.setDouble(2, total);
                        psReg.setString(3, placa);
                        psReg.executeUpdate();
                    }

                    return total;

                } else {
                    JOptionPane.showMessageDialog(null, "No se encuentra el Vehiculo Ingresado");
                    
                }
            }

        } 
        catch (SQLException e) {
            e.printStackTrace();
            
        }
        return total;
    }
    public double registrarSalidaCatedraticoFlat(String placa){
        double total = 0;
        String queryLugar = "SELECT * FROM lugaresCatedráticos WHERE placa = ?";
        try (Connection conn = ConexionSQL.conectar();
             PreparedStatement psLugar = conn.prepareStatement(queryLugar)) {

            psLugar.setString(1, placa);
            try (ResultSet rs = psLugar.executeQuery()) {
                if (rs.next()) {
                    int idLugar = rs.getInt("id");
                    Timestamp entrada = rs.getTimestamp("hora_entrada");
                    LocalDateTime salida = LocalDateTime.now();

                    //LIBERA EL LUGAR
                    String updateLugar = "UPDATE lugaresCatedraticos SET ocupado = 0, placa = NULL, hora_entrada = NULL WHERE id = ?";
                    try (PreparedStatement psUpdate = conn.prepareStatement(updateLugar)) {
                        psUpdate.setInt(1, idLugar);
                        psUpdate.executeUpdate();
                    }

                    // ACTUALIZA EL REGISTRO CON HORA ENTRADA, SALIDA Y TOTAL
                    double horas = (double) (Timestamp.valueOf(salida).getTime() - entrada.getTime()) / (1000*60*60);
                    total = 10;

                    String updateRegistro = "UPDATE historico SET hora_salida = ?, total_pagar = ? " +
                            "WHERE placa = ? AND hora_salida IS NULL";
                    try (PreparedStatement psReg = conn.prepareStatement(updateRegistro)) {
                        psReg.setTimestamp(1, Timestamp.valueOf(salida));
                        psReg.setDouble(2, total);
                        psReg.setString(3, placa);
                        psReg.executeUpdate();
                    }

                    return total;

                } else {
                    JOptionPane.showMessageDialog(null, "No se encuentra el Vehiculo Ingresado");
                   
                }
            }

        } 
        catch (SQLException e) {
            e.printStackTrace();
           
        }
        return total;
    }
}