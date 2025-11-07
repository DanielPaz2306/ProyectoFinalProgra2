/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parkplus;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFileChooser;

/**
 *
 * @author pchin
 */
public class ImportarExportar {
    
    private File archivo;

    public ImportarExportar(File archivo) {
        this.archivo = archivo;
    }
    
    
    
    public static File seleccionarCSV() {
            JFileChooser chooser = new JFileChooser();
            chooser.setDialogTitle("Selecciona el archivo CSV a importar");
            int resultado = chooser.showOpenDialog(null);

            if (resultado == JFileChooser.APPROVE_OPTION) {
                return chooser.getSelectedFile();
            } else {
                System.out.println("No se seleccionó ningún archivo.");
                return null;
            }
        }

    
}
