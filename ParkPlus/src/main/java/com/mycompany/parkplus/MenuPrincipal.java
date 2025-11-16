/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.parkplus;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author pchin
 */
public class MenuPrincipal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MenuPrincipal.class.getName());
    private JToggleButton[] buttons;
    private int capacidadCarros = 0;
    private int capacidadMotos = 0;
    private int capacidadCatedraticos = 0;
    
    public MenuPrincipal() {
        
        initComponents();
        iniciarVerificacionLugaresCarros();
        iniciarVerificacionLugaresCatedraticos();
        iniciarVerificacionLugaresMotos();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPanel1 = new javax.swing.JPanel();
        btnNuevoTicket = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        panelMapa = new javax.swing.JPanel();
        btnC1 = new javax.swing.JToggleButton();
        btnC2 = new javax.swing.JToggleButton();
        btnC3 = new javax.swing.JToggleButton();
        btnC4 = new javax.swing.JToggleButton();
        btnC5 = new javax.swing.JToggleButton();
        btnC6 = new javax.swing.JToggleButton();
        btnC7 = new javax.swing.JToggleButton();
        btnC8 = new javax.swing.JToggleButton();
        btnC9 = new javax.swing.JToggleButton();
        btnC10 = new javax.swing.JToggleButton();
        btnC11 = new javax.swing.JToggleButton();
        btnC12 = new javax.swing.JToggleButton();
        btnC13 = new javax.swing.JToggleButton();
        btnC14 = new javax.swing.JToggleButton();
        btnC15 = new javax.swing.JToggleButton();
        btnC16 = new javax.swing.JToggleButton();
        btnC17 = new javax.swing.JToggleButton();
        btnC18 = new javax.swing.JToggleButton();
        btnC19 = new javax.swing.JToggleButton();
        btnC20 = new javax.swing.JToggleButton();
        btnCT10 = new javax.swing.JToggleButton();
        btnCT11 = new javax.swing.JToggleButton();
        btnCT12 = new javax.swing.JToggleButton();
        btnCT13 = new javax.swing.JToggleButton();
        btnCT14 = new javax.swing.JToggleButton();
        btnCT15 = new javax.swing.JToggleButton();
        btnCT16 = new javax.swing.JToggleButton();
        btnCT17 = new javax.swing.JToggleButton();
        btnCT18 = new javax.swing.JToggleButton();
        btnCT9 = new javax.swing.JToggleButton();
        btnCT8 = new javax.swing.JToggleButton();
        btnCT7 = new javax.swing.JToggleButton();
        btnCT6 = new javax.swing.JToggleButton();
        btnCT5 = new javax.swing.JToggleButton();
        btnCT4 = new javax.swing.JToggleButton();
        btnCT3 = new javax.swing.JToggleButton();
        btnCT2 = new javax.swing.JToggleButton();
        btnCT1 = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnM1 = new javax.swing.JToggleButton();
        btnM2 = new javax.swing.JToggleButton();
        btnM3 = new javax.swing.JToggleButton();
        btnM4 = new javax.swing.JToggleButton();
        btnM5 = new javax.swing.JToggleButton();
        btnM6 = new javax.swing.JToggleButton();
        btnM7 = new javax.swing.JToggleButton();
        btnM8 = new javax.swing.JToggleButton();
        btnM9 = new javax.swing.JToggleButton();
        btnM10 = new javax.swing.JToggleButton();
        btnM11 = new javax.swing.JToggleButton();
        btnM12 = new javax.swing.JToggleButton();
        btnM13 = new javax.swing.JToggleButton();
        btnM14 = new javax.swing.JToggleButton();
        btnM15 = new javax.swing.JToggleButton();
        btnM16 = new javax.swing.JToggleButton();
        btnM17 = new javax.swing.JToggleButton();
        btnM18 = new javax.swing.JToggleButton();
        jLabel6 = new javax.swing.JLabel();
        txtCapacidadCarros = new javax.swing.JLabel();
        txtCapacidadCatedraticos = new javax.swing.JLabel();
        txtCapacidadMotos = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        panelDatosUser = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 153, 255));

        jPanel1.setBackground(new java.awt.Color(89, 193, 193));

        btnNuevoTicket.setFont(new java.awt.Font("Poppins SemiBold", 1, 12)); // NOI18N
        btnNuevoTicket.setForeground(new java.awt.Color(0, 102, 0));
        btnNuevoTicket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/siguiente.png"))); // NOI18N
        btnNuevoTicket.setText("Ingreso");
        btnNuevoTicket.setAlignmentX(-1.0F);
        btnNuevoTicket.setBorder(null);
        btnNuevoTicket.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnNuevoTicket.setFocusPainted(false);
        btnNuevoTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoTicketActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Poppins SemiBold", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exportar.png"))); // NOI18N
        jButton1.setText("Importar/Exportar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Poppins SemiBold", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registro.png"))); // NOI18N
        jButton2.setText("Ingresar Registros");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Poppins SemiBold", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 0, 0));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salida.png"))); // NOI18N
        jButton6.setText("Salida");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        panelMapa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnC1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnC1.setText("jToggleButton4");
        btnC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC1ActionPerformed(evt);
            }
        });
        panelMapa.add(btnC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 90, 40));

        btnC2.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnC2.setText("jToggleButton120");
        panelMapa.add(btnC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 90, 40));

        btnC3.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnC3.setText("jToggleButton1");
        panelMapa.add(btnC3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 90, 40));

        btnC4.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnC4.setText("jToggleButton2");
        panelMapa.add(btnC4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 90, 40));

        btnC5.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnC5.setText("jToggleButton3");
        panelMapa.add(btnC5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 90, 40));

        btnC6.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnC6.setText("jToggleButton5");
        panelMapa.add(btnC6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 90, 40));

        btnC7.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnC7.setText("jToggleButton6");
        panelMapa.add(btnC7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 90, 40));

        btnC8.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnC8.setText("jToggleButton7");
        panelMapa.add(btnC8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 90, 40));

        btnC9.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnC9.setText("jToggleButton8");
        panelMapa.add(btnC9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 90, 40));

        btnC10.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnC10.setText("jToggleButton9");
        panelMapa.add(btnC10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 90, 40));

        btnC11.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnC11.setText("jToggleButton10");
        panelMapa.add(btnC11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 90, 40));

        btnC12.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnC12.setText("jToggleButton11");
        panelMapa.add(btnC12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 90, 40));

        btnC13.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnC13.setText("jToggleButton12");
        panelMapa.add(btnC13, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 90, 40));

        btnC14.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnC14.setText("jToggleButton13");
        panelMapa.add(btnC14, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 90, 40));

        btnC15.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnC15.setText("jToggleButton14");
        panelMapa.add(btnC15, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 90, 40));

        btnC16.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnC16.setText("jToggleButton15");
        panelMapa.add(btnC16, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 90, 40));

        btnC17.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnC17.setText("jToggleButton16");
        panelMapa.add(btnC17, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 90, 40));

        btnC18.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnC18.setText("jToggleButton17");
        panelMapa.add(btnC18, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 90, 40));

        btnC19.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnC19.setText("jToggleButton18");
        panelMapa.add(btnC19, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 90, 40));

        btnC20.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnC20.setText("C20");
        panelMapa.add(btnC20, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 90, 40));

        btnCT10.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnCT10.setText("jToggleButton1");
        btnCT10.setEnabled(false);
        panelMapa.add(btnCT10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 80, -1));

        btnCT11.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnCT11.setText("jToggleButton2");
        btnCT11.setEnabled(false);
        panelMapa.add(btnCT11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 80, -1));

        btnCT12.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnCT12.setText("jToggleButton3");
        btnCT12.setEnabled(false);
        panelMapa.add(btnCT12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 80, -1));

        btnCT13.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnCT13.setText("jToggleButton4");
        btnCT13.setEnabled(false);
        panelMapa.add(btnCT13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 80, -1));

        btnCT14.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnCT14.setText("jToggleButton5");
        btnCT14.setEnabled(false);
        panelMapa.add(btnCT14, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 80, -1));

        btnCT15.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnCT15.setText("jToggleButton6");
        btnCT15.setEnabled(false);
        panelMapa.add(btnCT15, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 80, -1));

        btnCT16.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnCT16.setText("jToggleButton7");
        btnCT16.setEnabled(false);
        panelMapa.add(btnCT16, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 80, -1));

        btnCT17.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnCT17.setText("jToggleButton8");
        btnCT17.setEnabled(false);
        panelMapa.add(btnCT17, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 80, -1));

        btnCT18.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnCT18.setText("jToggleButton9");
        btnCT18.setEnabled(false);
        panelMapa.add(btnCT18, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 80, -1));

        btnCT9.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnCT9.setText("jToggleButton10");
        btnCT9.setEnabled(false);
        panelMapa.add(btnCT9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 80, -1));

        btnCT8.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnCT8.setText("jToggleButton11");
        btnCT8.setEnabled(false);
        panelMapa.add(btnCT8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 80, -1));

        btnCT7.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnCT7.setText("jToggleButton12");
        btnCT7.setEnabled(false);
        panelMapa.add(btnCT7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 80, -1));

        btnCT6.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnCT6.setText("jToggleButton13");
        btnCT6.setEnabled(false);
        panelMapa.add(btnCT6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 80, -1));

        btnCT5.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnCT5.setText("jToggleButton14");
        btnCT5.setEnabled(false);
        panelMapa.add(btnCT5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 80, -1));

        btnCT4.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnCT4.setText("jToggleButton15");
        btnCT4.setEnabled(false);
        panelMapa.add(btnCT4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 80, -1));

        btnCT3.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnCT3.setText("jToggleButton16");
        btnCT3.setEnabled(false);
        panelMapa.add(btnCT3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 80, -1));

        btnCT2.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnCT2.setText("jToggleButton17");
        btnCT2.setEnabled(false);
        panelMapa.add(btnCT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 80, -1));

        btnCT1.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnCT1.setText("jToggleButton18");
        btnCT1.setEnabled(false);
        panelMapa.add(btnCT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 80, -1));

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel4.setText("Carros");
        panelMapa.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel5.setText("Catedraticos");
        panelMapa.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        btnM1.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnM1.setText("jToggleButton1");
        panelMapa.add(btnM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, 60, -1));

        btnM2.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnM2.setText("jToggleButton2");
        panelMapa.add(btnM2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 60, -1));

        btnM3.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnM3.setText("jToggleButton3");
        panelMapa.add(btnM3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 60, -1));

        btnM4.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnM4.setText("jToggleButton4");
        panelMapa.add(btnM4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 60, -1));

        btnM5.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnM5.setText("jToggleButton5");
        panelMapa.add(btnM5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 60, -1));

        btnM6.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnM6.setText("jToggleButton6");
        panelMapa.add(btnM6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 60, -1));

        btnM7.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnM7.setText("jToggleButton7");
        panelMapa.add(btnM7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 60, -1));

        btnM8.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnM8.setText("jToggleButton8");
        panelMapa.add(btnM8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 60, -1));

        btnM9.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnM9.setText("jToggleButton9");
        panelMapa.add(btnM9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 60, -1));

        btnM10.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnM10.setText("jToggleButton10");
        panelMapa.add(btnM10, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 60, -1));

        btnM11.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnM11.setText("jToggleButton11");
        panelMapa.add(btnM11, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, 60, -1));

        btnM12.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnM12.setText("jToggleButton12");
        panelMapa.add(btnM12, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, 60, -1));

        btnM13.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnM13.setText("jToggleButton13");
        panelMapa.add(btnM13, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, 60, -1));

        btnM14.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnM14.setText("jToggleButton14");
        panelMapa.add(btnM14, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, 60, -1));

        btnM15.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnM15.setText("jToggleButton15");
        panelMapa.add(btnM15, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 60, -1));

        btnM16.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnM16.setText("jToggleButton16");
        panelMapa.add(btnM16, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, 60, -1));

        btnM17.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnM17.setText("jToggleButton17");
        panelMapa.add(btnM17, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 270, 60, -1));

        btnM18.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnM18.setText("jToggleButton18");
        panelMapa.add(btnM18, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, 60, -1));

        jLabel6.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel6.setText("Motos");
        panelMapa.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, -1, -1));

        txtCapacidadCarros.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        txtCapacidadCarros.setText("jLabel7");
        panelMapa.add(txtCapacidadCarros, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, -1, -1));

        txtCapacidadCatedraticos.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        txtCapacidadCatedraticos.setText("jLabel7");
        panelMapa.add(txtCapacidadCatedraticos, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, -1, -1));

        txtCapacidadMotos.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        txtCapacidadMotos.setText("jLabel7");
        panelMapa.add(txtCapacidadMotos, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, -1, -1));

        jButton7.setFont(new java.awt.Font("Poppins SemiBold", 1, 12)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Reportes.png"))); // NOI18N
        jButton7.setText("Reportes");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNuevoTicket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(panelMapa, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMapa, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNuevoTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        panelDatosUser.setBackground(new java.awt.Color(204, 204, 255));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoInicio.png"))); // NOI18N
        jButton4.setContentAreaFilled(false);

        javax.swing.GroupLayout panelDatosUserLayout = new javax.swing.GroupLayout(panelDatosUser);
        panelDatosUser.setLayout(panelDatosUserLayout);
        panelDatosUserLayout.setHorizontalGroup(
            panelDatosUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
        );
        panelDatosUserLayout.setVerticalGroup(
            panelDatosUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosUserLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelDatosUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDatosUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CargaArchivo nuevaCarga = new CargaArchivo();
        nuevaCarga.setAlwaysOnTop(true);
        nuevaCarga.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnNuevoTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoTicketActionPerformed
        NuevoTicket entrada = new NuevoTicket();
        entrada.setVisible(true);
    }//GEN-LAST:event_btnNuevoTicketActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      NuevaSalida salida = new NuevaSalida();
      salida.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnC1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      NuevoRegistro reg = new NuevoRegistro();
      reg.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Reportes rep = new Reportes();
        rep.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } 
        catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new MenuPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnC1;
    private javax.swing.JToggleButton btnC10;
    private javax.swing.JToggleButton btnC11;
    private javax.swing.JToggleButton btnC12;
    private javax.swing.JToggleButton btnC13;
    private javax.swing.JToggleButton btnC14;
    private javax.swing.JToggleButton btnC15;
    private javax.swing.JToggleButton btnC16;
    private javax.swing.JToggleButton btnC17;
    private javax.swing.JToggleButton btnC18;
    private javax.swing.JToggleButton btnC19;
    private javax.swing.JToggleButton btnC2;
    private javax.swing.JToggleButton btnC20;
    private javax.swing.JToggleButton btnC3;
    private javax.swing.JToggleButton btnC4;
    private javax.swing.JToggleButton btnC5;
    private javax.swing.JToggleButton btnC6;
    private javax.swing.JToggleButton btnC7;
    private javax.swing.JToggleButton btnC8;
    private javax.swing.JToggleButton btnC9;
    private javax.swing.JToggleButton btnCT1;
    private javax.swing.JToggleButton btnCT10;
    private javax.swing.JToggleButton btnCT11;
    private javax.swing.JToggleButton btnCT12;
    private javax.swing.JToggleButton btnCT13;
    private javax.swing.JToggleButton btnCT14;
    private javax.swing.JToggleButton btnCT15;
    private javax.swing.JToggleButton btnCT16;
    private javax.swing.JToggleButton btnCT17;
    private javax.swing.JToggleButton btnCT18;
    private javax.swing.JToggleButton btnCT2;
    private javax.swing.JToggleButton btnCT3;
    private javax.swing.JToggleButton btnCT4;
    private javax.swing.JToggleButton btnCT5;
    private javax.swing.JToggleButton btnCT6;
    private javax.swing.JToggleButton btnCT7;
    private javax.swing.JToggleButton btnCT8;
    private javax.swing.JToggleButton btnCT9;
    private javax.swing.JToggleButton btnM1;
    private javax.swing.JToggleButton btnM10;
    private javax.swing.JToggleButton btnM11;
    private javax.swing.JToggleButton btnM12;
    private javax.swing.JToggleButton btnM13;
    private javax.swing.JToggleButton btnM14;
    private javax.swing.JToggleButton btnM15;
    private javax.swing.JToggleButton btnM16;
    private javax.swing.JToggleButton btnM17;
    private javax.swing.JToggleButton btnM18;
    private javax.swing.JToggleButton btnM2;
    private javax.swing.JToggleButton btnM3;
    private javax.swing.JToggleButton btnM4;
    private javax.swing.JToggleButton btnM5;
    private javax.swing.JToggleButton btnM6;
    private javax.swing.JToggleButton btnM7;
    private javax.swing.JToggleButton btnM8;
    private javax.swing.JToggleButton btnM9;
    private javax.swing.JButton btnNuevoTicket;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JPanel panelDatosUser;
    private javax.swing.JPanel panelMapa;
    private javax.swing.JLabel txtCapacidadCarros;
    private javax.swing.JLabel txtCapacidadCatedraticos;
    private javax.swing.JLabel txtCapacidadMotos;
    // End of variables declaration//GEN-END:variables

private void iniciarVerificacionLugaresCarros() {
    
    JToggleButton[] buttons = {
        btnC1, btnC2, btnC3, btnC4, btnC5, btnC6, btnC7, btnC8, btnC9, btnC10,
        btnC11, btnC12, btnC13, btnC14, btnC15, btnC16, btnC17, btnC18, btnC19, btnC20
    };

    for (int i = 0; i < buttons.length; i++) {
        JToggleButton btn = buttons[i];
        btn.setText(String.valueOf(i + 1));
        btn.setOpaque(true);
        btn.setContentAreaFilled(true);
        btn.setBorderPainted(true);
        btn.putClientProperty("JButton.buttonType", "square");
        btn.setEnabled(false);
    }

    Thread hilo = new Thread(() -> {
        while (true) {
            try (Connection con = ConexionSQL.conectar();
                 Statement st = con.createStatement();
                 ResultSet rs = st.executeQuery("SELECT numero, ocupado, placa FROM lugaresCarros")) {

                int[] ocupados = new int[buttons.length];
                String[] placas = new String[buttons.length];

                while (rs.next()) {
                    int id = rs.getInt("numero");
                    int ocupado = rs.getInt("ocupado");
                    String placa = rs.getString("placa");

                    if (id >= 1 && id <= buttons.length) {
                        ocupados[id - 1] = ocupado;
                        placas[id - 1] = placa;
                    }
                }

                SwingUtilities.invokeLater(() -> {
                    int capacidadCarros = 0;
                    for (int i = 0; i < buttons.length; i++) {
                        
                        JToggleButton btn = buttons[i];
                        if (ocupados[i] == 1) {
                            capacidadCarros++;
                            btn.setBackground(Color.RED);
                            btn.setForeground(Color.WHITE);
                            btn.setToolTipText("Lugar " + (i + 1) + " — Ocupado por: " + placas[i]);
                        } else {
                            btn.setBackground(Color.GREEN);
                            btn.setForeground(Color.BLACK);
                            btn.setToolTipText("Lugar " + (i + 1) + " — Libre");
                        }
                    }
                    double cap = ((double) capacidadCarros / buttons.length) * 100;
                    txtCapacidadCarros.setText(String.format("%.0f%%", cap));
                });
                
                Thread.sleep(2000);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    });

    hilo.setDaemon(true);
    hilo.start();
}
private void iniciarVerificacionLugaresCatedraticos() {

    JToggleButton[] buttons = {
        btnCT1, btnCT2, btnCT3, btnCT4, btnCT5, btnCT6,
        btnCT7, btnCT8, btnCT9, btnCT10, btnCT11, btnCT12,
        btnCT13, btnCT14, btnCT15, btnCT16, btnCT17, btnCT18
    };

    for (int i = 0; i < buttons.length; i++) {
        JToggleButton btn = buttons[i];
        btn.setText(String.valueOf(i + 1));
        btn.setEnabled(false);
        btn.setOpaque(true);
        btn.setContentAreaFilled(true);
        btn.setBorderPainted(true);
        btn.setBackground(new Color(0, 128, 0));
        btn.setForeground(Color.WHITE);
        btn.setToolTipText("Lugar CT " + (i + 1) + " — Libre");
    }

    Thread hilo = new Thread(() -> {
        while (true) {
            try (Connection con = ConexionSQL.conectar();
                 Statement st = con.createStatement();
                 ResultSet rs = st.executeQuery("SELECT numero, ocupado, placa FROM lugaresCatedraticos")) {

                int[] ocupados = new int[buttons.length];
                String[] placas = new String[buttons.length];

                while (rs.next()) {
                    int numero = rs.getInt("numero");
                    int ocupado = rs.getInt("ocupado");
                    String placaActual = rs.getString("placa");
                    if (numero >= 1 && numero <= buttons.length) {
                        ocupados[numero - 1] = ocupado;
                        placas[numero - 1] = placaActual;
                    }
                }

                SwingUtilities.invokeLater(() -> {
                    int capacidadCatedraticos = 0;
                    for (int i = 0; i < buttons.length; i++) {
                        JToggleButton btn = buttons[i];
                        if (ocupados[i] == 1) {
                            capacidadCatedraticos++;
                            btn.setBackground(Color.RED);
                            btn.setToolTipText("Lugar CT " + (i + 1) + " — OCUPADO POR: " + placas[i]);
                        } else {
                            btn.setBackground(Color.GREEN);
                            btn.setToolTipText("Lugar CT " + (i + 1) + " — Libre");
                        }
                    }
                    double cap = ((double) capacidadCatedraticos / buttons.length) * 100;
                    txtCapacidadCatedraticos.setText(String.format("%.0f%%", cap));
                });
                
                Thread.sleep(2000);

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    });

    hilo.setDaemon(true);
    hilo.start();
}
private void iniciarVerificacionLugaresMotos() {
    JToggleButton[] buttons = {
        btnM1, btnM2, btnM3, btnM4, btnM5, btnM6,
        btnM7, btnM8, btnM9, btnM10, btnM11, btnM12,
        btnM13, btnM14, btnM15, btnM16, btnM17, btnM18
    };

    for (int i = 0; i < buttons.length; i++) {
        JToggleButton btn = buttons[i];
        btn.setText(String.valueOf(i + 1));
        btn.setEnabled(false);
        btn.setOpaque(true);
        btn.setContentAreaFilled(true);
        btn.setBorderPainted(true);
        btn.setBackground(new Color(0, 128, 0));
        btn.setForeground(Color.WHITE);
        btn.setToolTipText("Lugar M " + (i + 1) + " — Libre");
    }

    Thread hilo = new Thread(() -> {
        while (true) {
            try (Connection con = ConexionSQL.conectar();
                 Statement st = con.createStatement();
                 ResultSet rs = st.executeQuery("SELECT numero, ocupado, placa FROM lugaresMotos")) {

                int[] ocupados = new int[buttons.length];
                String[] placas = new String[buttons.length];

                while (rs.next()) {
                    int numero = rs.getInt("numero");
                    int ocupado = rs.getInt("ocupado");
                    String placaActual = rs.getString("placa");
                    if (numero >= 1 && numero <= buttons.length) {
                        ocupados[numero - 1] = ocupado;
                        placas[numero - 1] = placaActual;
                    }
                }

                SwingUtilities.invokeLater(() -> {
                    int capacidadMotos = 0;
                    for (int i = 0; i < buttons.length; i++) {
                        JToggleButton btn = buttons[i];
                        if (ocupados[i] == 1) {
                            capacidadMotos++;
                            btn.setBackground(Color.RED);
                            btn.setToolTipText("Lugar M " + (i + 1) + " — OCUPADO POR: " + placas[i]);
                        } else {
                            btn.setBackground(Color.GREEN);
                            btn.setToolTipText("Lugar M " + (i + 1) + " — Libre");
                        }
                    }
                    double cap = ((double) capacidadMotos / buttons.length) * 100;
                    txtCapacidadMotos.setText(String.format("%.0f%%", cap));
                });
                Thread.sleep(2000);

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    });

    hilo.setDaemon(true);
    hilo.start();
}


}


