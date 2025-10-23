package com.mycompany.parkplus;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author pchin
 */
public class ConexionSQL {
   private static final String URL =
    "jdbc:sqlserver://PABLO\\SQLEXPRESS;databaseName=PARKPLUS;encrypt=false;integratedSecurity=true;";
    
   public static Connection conectar() {
    Connection conexion = null;
    try {
        conexion = DriverManager.getConnection(URL);
        System.out.println("✅ Conexión exitosa a SQL Server");
    } catch (SQLException e) {
        System.out.println("❌ Error al conectar: " + e.getMessage());
    }
    return conexion;
}
    
}
