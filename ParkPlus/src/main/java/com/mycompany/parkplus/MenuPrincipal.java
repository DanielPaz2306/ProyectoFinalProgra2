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
    
    public MenuPrincipal() {
        
        initComponents();
        iniciarVerificacionLugaresCarros();
        iniciarVerificacionLugaresCatedraticos();
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
        btnC21 = new javax.swing.JToggleButton();
        btnC22 = new javax.swing.JToggleButton();
        btnC23 = new javax.swing.JToggleButton();
        btnC24 = new javax.swing.JToggleButton();
        btnC25 = new javax.swing.JToggleButton();
        btnC26 = new javax.swing.JToggleButton();
        btnC27 = new javax.swing.JToggleButton();
        btnC28 = new javax.swing.JToggleButton();
        btnC29 = new javax.swing.JToggleButton();
        btnC30 = new javax.swing.JToggleButton();
        btnC31 = new javax.swing.JToggleButton();
        btnC32 = new javax.swing.JToggleButton();
        btnC33 = new javax.swing.JToggleButton();
        btnC34 = new javax.swing.JToggleButton();
        btnC35 = new javax.swing.JToggleButton();
        btnC36 = new javax.swing.JToggleButton();
        btnC37 = new javax.swing.JToggleButton();
        btnC38 = new javax.swing.JToggleButton();
        btnC39 = new javax.swing.JToggleButton();
        btnC40 = new javax.swing.JToggleButton();
        btnC41 = new javax.swing.JToggleButton();
        btnC42 = new javax.swing.JToggleButton();
        btnC43 = new javax.swing.JToggleButton();
        btnC44 = new javax.swing.JToggleButton();
        btnC45 = new javax.swing.JToggleButton();
        btnC46 = new javax.swing.JToggleButton();
        btnC47 = new javax.swing.JToggleButton();
        btnC48 = new javax.swing.JToggleButton();
        btnC49 = new javax.swing.JToggleButton();
        btnC50 = new javax.swing.JToggleButton();
        btnC51 = new javax.swing.JToggleButton();
        btnC52 = new javax.swing.JToggleButton();
        btnC53 = new javax.swing.JToggleButton();
        btnC54 = new javax.swing.JToggleButton();
        btnC55 = new javax.swing.JToggleButton();
        btnC56 = new javax.swing.JToggleButton();
        btnC57 = new javax.swing.JToggleButton();
        btnC58 = new javax.swing.JToggleButton();
        btnC59 = new javax.swing.JToggleButton();
        btnC60 = new javax.swing.JToggleButton();
        btnC61 = new javax.swing.JToggleButton();
        btnC62 = new javax.swing.JToggleButton();
        btnC63 = new javax.swing.JToggleButton();
        btnC64 = new javax.swing.JToggleButton();
        btnC65 = new javax.swing.JToggleButton();
        btnC66 = new javax.swing.JToggleButton();
        btnC67 = new javax.swing.JToggleButton();
        btnC68 = new javax.swing.JToggleButton();
        btnC69 = new javax.swing.JToggleButton();
        btnC70 = new javax.swing.JToggleButton();
        btnC71 = new javax.swing.JToggleButton();
        btnC72 = new javax.swing.JToggleButton();
        btnC73 = new javax.swing.JToggleButton();
        btnC74 = new javax.swing.JToggleButton();
        btnC75 = new javax.swing.JToggleButton();
        btnC76 = new javax.swing.JToggleButton();
        btnC77 = new javax.swing.JToggleButton();
        btnC78 = new javax.swing.JToggleButton();
        btnC79 = new javax.swing.JToggleButton();
        btnC80 = new javax.swing.JToggleButton();
        btnC81 = new javax.swing.JToggleButton();
        btnC82 = new javax.swing.JToggleButton();
        btnC83 = new javax.swing.JToggleButton();
        btnC84 = new javax.swing.JToggleButton();
        btnC85 = new javax.swing.JToggleButton();
        btnC86 = new javax.swing.JToggleButton();
        btnC87 = new javax.swing.JToggleButton();
        btnC88 = new javax.swing.JToggleButton();
        btnC89 = new javax.swing.JToggleButton();
        btnC90 = new javax.swing.JToggleButton();
        btnC91 = new javax.swing.JToggleButton();
        btnC92 = new javax.swing.JToggleButton();
        btnC93 = new javax.swing.JToggleButton();
        btnC94 = new javax.swing.JToggleButton();
        btnC95 = new javax.swing.JToggleButton();
        btnC96 = new javax.swing.JToggleButton();
        btnC97 = new javax.swing.JToggleButton();
        btnC98 = new javax.swing.JToggleButton();
        btnC99 = new javax.swing.JToggleButton();
        btnC100 = new javax.swing.JToggleButton();
        btnC101 = new javax.swing.JToggleButton();
        btnC102 = new javax.swing.JToggleButton();
        btnC103 = new javax.swing.JToggleButton();
        btnC104 = new javax.swing.JToggleButton();
        btnC105 = new javax.swing.JToggleButton();
        btnC106 = new javax.swing.JToggleButton();
        btnC107 = new javax.swing.JToggleButton();
        btnC108 = new javax.swing.JToggleButton();
        btnC109 = new javax.swing.JToggleButton();
        btnC110 = new javax.swing.JToggleButton();
        btnC111 = new javax.swing.JToggleButton();
        btnC112 = new javax.swing.JToggleButton();
        btnC113 = new javax.swing.JToggleButton();
        btnC114 = new javax.swing.JToggleButton();
        btnC115 = new javax.swing.JToggleButton();
        btnC116 = new javax.swing.JToggleButton();
        btnC117 = new javax.swing.JToggleButton();
        btnC118 = new javax.swing.JToggleButton();
        btnC119 = new javax.swing.JToggleButton();
        btnC120 = new javax.swing.JToggleButton();
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
        panelDatosUser = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

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

        btnC1.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC1.setText("jToggleButton4");
        btnC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC1ActionPerformed(evt);
            }
        });
        panelMapa.add(btnC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 40, -1));

        btnC2.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC2.setText("jToggleButton120");
        panelMapa.add(btnC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 40, -1));

        btnC3.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC3.setText("jToggleButton1");
        panelMapa.add(btnC3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 40, -1));

        btnC4.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC4.setText("jToggleButton2");
        panelMapa.add(btnC4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 40, -1));

        btnC5.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC5.setText("jToggleButton3");
        panelMapa.add(btnC5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 40, -1));

        btnC6.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC6.setText("jToggleButton5");
        panelMapa.add(btnC6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 40, -1));

        btnC7.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC7.setText("jToggleButton6");
        panelMapa.add(btnC7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 40, -1));

        btnC8.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC8.setText("jToggleButton7");
        panelMapa.add(btnC8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 40, -1));

        btnC9.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC9.setText("jToggleButton8");
        panelMapa.add(btnC9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 40, -1));

        btnC10.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC10.setText("jToggleButton9");
        panelMapa.add(btnC10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 40, -1));

        btnC11.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC11.setText("jToggleButton10");
        panelMapa.add(btnC11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 40, -1));

        btnC12.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC12.setText("jToggleButton11");
        panelMapa.add(btnC12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 40, -1));

        btnC13.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC13.setText("jToggleButton12");
        panelMapa.add(btnC13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 40, -1));

        btnC14.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC14.setText("jToggleButton13");
        panelMapa.add(btnC14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 40, -1));

        btnC15.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC15.setText("jToggleButton14");
        panelMapa.add(btnC15, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 40, -1));

        btnC16.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC16.setText("jToggleButton15");
        panelMapa.add(btnC16, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 40, -1));

        btnC17.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC17.setText("jToggleButton16");
        panelMapa.add(btnC17, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 40, -1));

        btnC18.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC18.setText("jToggleButton17");
        panelMapa.add(btnC18, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 40, -1));

        btnC19.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC19.setText("jToggleButton18");
        panelMapa.add(btnC19, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 40, -1));

        btnC20.setFont(new java.awt.Font("Bahnschrift", 0, 8)); // NOI18N
        btnC20.setText("C20");
        panelMapa.add(btnC20, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 40, -1));

        btnC21.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC21.setText("jToggleButton20");
        panelMapa.add(btnC21, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 40, -1));

        btnC22.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC22.setText("jToggleButton21");
        panelMapa.add(btnC22, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 40, -1));

        btnC23.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC23.setText("jToggleButton22");
        panelMapa.add(btnC23, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 40, -1));

        btnC24.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC24.setText("jToggleButton23");
        panelMapa.add(btnC24, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 40, -1));

        btnC25.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC25.setText("jToggleButton24");
        panelMapa.add(btnC25, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 40, -1));

        btnC26.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC26.setText("jToggleButton25");
        panelMapa.add(btnC26, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 40, -1));

        btnC27.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC27.setText("jToggleButton26");
        panelMapa.add(btnC27, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 40, -1));

        btnC28.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC28.setText("jToggleButton27");
        panelMapa.add(btnC28, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 40, -1));

        btnC29.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC29.setText("jToggleButton28");
        panelMapa.add(btnC29, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 40, -1));

        btnC30.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC30.setText("jToggleButton29");
        panelMapa.add(btnC30, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 40, -1));

        btnC31.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC31.setText("jToggleButton30");
        panelMapa.add(btnC31, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 40, -1));

        btnC32.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC32.setText("jToggleButton31");
        panelMapa.add(btnC32, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 40, -1));

        btnC33.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC33.setText("jToggleButton32");
        panelMapa.add(btnC33, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 40, -1));

        btnC34.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC34.setText("jToggleButton33");
        panelMapa.add(btnC34, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 40, -1));

        btnC35.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC35.setText("jToggleButton34");
        panelMapa.add(btnC35, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 40, -1));

        btnC36.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC36.setText("jToggleButton35");
        panelMapa.add(btnC36, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 40, -1));

        btnC37.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC37.setText("jToggleButton36");
        panelMapa.add(btnC37, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 40, -1));

        btnC38.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC38.setText("jToggleButton37");
        panelMapa.add(btnC38, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 40, -1));

        btnC39.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC39.setText("jToggleButton38");
        panelMapa.add(btnC39, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 40, -1));

        btnC40.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC40.setText("jToggleButton39");
        panelMapa.add(btnC40, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 40, -1));

        btnC41.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC41.setText("jToggleButton40");
        panelMapa.add(btnC41, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 40, -1));

        btnC42.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC42.setText("jToggleButton41");
        panelMapa.add(btnC42, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 40, -1));

        btnC43.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC43.setText("jToggleButton42");
        panelMapa.add(btnC43, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 40, -1));

        btnC44.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC44.setText("jToggleButton43");
        panelMapa.add(btnC44, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 40, -1));

        btnC45.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC45.setText("jToggleButton44");
        panelMapa.add(btnC45, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 40, -1));

        btnC46.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC46.setText("jToggleButton45");
        panelMapa.add(btnC46, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 40, -1));

        btnC47.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC47.setText("jToggleButton46");
        panelMapa.add(btnC47, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 40, -1));

        btnC48.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC48.setText("jToggleButton47");
        panelMapa.add(btnC48, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 40, -1));

        btnC49.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC49.setText("jToggleButton48");
        panelMapa.add(btnC49, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 40, -1));

        btnC50.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC50.setText("jToggleButton49");
        panelMapa.add(btnC50, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 40, -1));

        btnC51.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC51.setText("jToggleButton50");
        panelMapa.add(btnC51, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 40, -1));

        btnC52.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC52.setText("jToggleButton51");
        panelMapa.add(btnC52, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 40, -1));

        btnC53.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC53.setText("jToggleButton52");
        panelMapa.add(btnC53, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 40, -1));

        btnC54.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC54.setText("jToggleButton53");
        panelMapa.add(btnC54, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 40, -1));

        btnC55.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC55.setText("jToggleButton54");
        panelMapa.add(btnC55, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 40, -1));

        btnC56.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC56.setText("jToggleButton55");
        panelMapa.add(btnC56, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 40, -1));

        btnC57.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC57.setText("jToggleButton56");
        panelMapa.add(btnC57, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 40, -1));

        btnC58.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC58.setText("jToggleButton57");
        panelMapa.add(btnC58, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 40, -1));

        btnC59.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC59.setText("jToggleButton58");
        panelMapa.add(btnC59, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 40, -1));

        btnC60.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC60.setText("jToggleButton59");
        panelMapa.add(btnC60, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 40, -1));

        btnC61.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC61.setText("jToggleButton60");
        panelMapa.add(btnC61, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 40, -1));

        btnC62.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC62.setText("jToggleButton61");
        panelMapa.add(btnC62, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 40, -1));

        btnC63.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC63.setText("jToggleButton62");
        panelMapa.add(btnC63, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 40, -1));

        btnC64.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC64.setText("jToggleButton63");
        panelMapa.add(btnC64, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 40, -1));

        btnC65.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC65.setText("jToggleButton64");
        panelMapa.add(btnC65, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 40, -1));

        btnC66.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC66.setText("jToggleButton65");
        panelMapa.add(btnC66, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 40, -1));

        btnC67.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC67.setText("jToggleButton66");
        panelMapa.add(btnC67, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 40, -1));

        btnC68.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC68.setText("jToggleButton67");
        panelMapa.add(btnC68, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 40, 20));

        btnC69.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC69.setText("jToggleButton68");
        panelMapa.add(btnC69, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 40, -1));

        btnC70.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC70.setText("jToggleButton69");
        panelMapa.add(btnC70, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 40, 20));

        btnC71.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC71.setText("jToggleButton70");
        panelMapa.add(btnC71, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 40, -1));

        btnC72.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC72.setText("jToggleButton71");
        panelMapa.add(btnC72, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 40, -1));

        btnC73.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC73.setText("jToggleButton72");
        panelMapa.add(btnC73, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 40, -1));

        btnC74.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC74.setText("jToggleButton73");
        panelMapa.add(btnC74, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 40, -1));

        btnC75.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC75.setText("jToggleButton74");
        panelMapa.add(btnC75, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 40, -1));

        btnC76.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC76.setText("jToggleButton75");
        panelMapa.add(btnC76, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 40, -1));

        btnC77.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC77.setText("jToggleButton76");
        panelMapa.add(btnC77, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 40, -1));

        btnC78.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC78.setText("jToggleButton77");
        panelMapa.add(btnC78, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 40, -1));

        btnC79.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC79.setText("jToggleButton78");
        panelMapa.add(btnC79, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 40, -1));

        btnC80.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC80.setText("jToggleButton79");
        panelMapa.add(btnC80, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 40, -1));

        btnC81.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC81.setText("jToggleButton80");
        panelMapa.add(btnC81, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 40, -1));

        btnC82.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC82.setText("jToggleButton81");
        panelMapa.add(btnC82, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 40, -1));

        btnC83.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC83.setText("jToggleButton82");
        panelMapa.add(btnC83, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 40, -1));

        btnC84.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC84.setText("jToggleButton83");
        panelMapa.add(btnC84, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 40, -1));

        btnC85.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC85.setText("jToggleButton84");
        panelMapa.add(btnC85, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 40, -1));

        btnC86.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC86.setText("jToggleButton85");
        panelMapa.add(btnC86, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 40, -1));

        btnC87.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC87.setText("jToggleButton86");
        panelMapa.add(btnC87, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 40, -1));

        btnC88.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC88.setText("jToggleButton87");
        panelMapa.add(btnC88, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 40, -1));

        btnC89.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC89.setText("jToggleButton88");
        panelMapa.add(btnC89, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 40, -1));

        btnC90.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC90.setText("jToggleButton89");
        panelMapa.add(btnC90, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 40, -1));

        btnC91.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC91.setText("jToggleButton90");
        panelMapa.add(btnC91, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 40, -1));

        btnC92.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC92.setText("jToggleButton91");
        panelMapa.add(btnC92, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 40, -1));

        btnC93.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC93.setText("jToggleButton92");
        panelMapa.add(btnC93, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, 40, -1));

        btnC94.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC94.setText("jToggleButton93");
        panelMapa.add(btnC94, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, 40, -1));

        btnC95.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC95.setText("jToggleButton94");
        panelMapa.add(btnC95, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 40, -1));

        btnC96.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC96.setText("jToggleButton95");
        panelMapa.add(btnC96, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 40, -1));

        btnC97.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC97.setText("jToggleButton96");
        panelMapa.add(btnC97, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, 40, -1));

        btnC98.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC98.setText("jToggleButton97");
        panelMapa.add(btnC98, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, 40, -1));

        btnC99.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC99.setText("jToggleButton98");
        panelMapa.add(btnC99, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, 40, -1));

        btnC100.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC100.setText("jToggleButton99");
        panelMapa.add(btnC100, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 40, -1));

        btnC101.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC101.setText("jToggleButton100");
        panelMapa.add(btnC101, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, 40, -1));

        btnC102.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC102.setText("jToggleButton101");
        panelMapa.add(btnC102, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 50, 40, -1));

        btnC103.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC103.setText("jToggleButton102");
        panelMapa.add(btnC103, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, 40, -1));

        btnC104.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC104.setText("jToggleButton103");
        panelMapa.add(btnC104, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, 40, -1));

        btnC105.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC105.setText("jToggleButton104");
        panelMapa.add(btnC105, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, 40, -1));

        btnC106.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC106.setText("jToggleButton105");
        panelMapa.add(btnC106, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, 40, -1));

        btnC107.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC107.setText("jToggleButton106");
        panelMapa.add(btnC107, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, 40, -1));

        btnC108.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC108.setText("jToggleButton107");
        panelMapa.add(btnC108, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, 40, -1));

        btnC109.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC109.setText("jToggleButton108");
        panelMapa.add(btnC109, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, 40, -1));

        btnC110.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC110.setText("jToggleButton109");
        panelMapa.add(btnC110, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, 40, -1));

        btnC111.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC111.setText("jToggleButton110");
        panelMapa.add(btnC111, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, 40, -1));

        btnC112.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC112.setText("jToggleButton111");
        panelMapa.add(btnC112, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, 40, -1));

        btnC113.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC113.setText("jToggleButton112");
        panelMapa.add(btnC113, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 70, 40, -1));

        btnC114.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC114.setText("jToggleButton113");
        panelMapa.add(btnC114, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, 40, -1));

        btnC115.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC115.setText("jToggleButton114");
        panelMapa.add(btnC115, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 110, 40, -1));

        btnC116.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC116.setText("jToggleButton115");
        panelMapa.add(btnC116, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, 40, -1));

        btnC117.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC117.setText("jToggleButton116");
        panelMapa.add(btnC117, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, 40, -1));

        btnC118.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC118.setText("jToggleButton117");
        panelMapa.add(btnC118, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, 40, -1));

        btnC119.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC119.setText("jToggleButton118");
        panelMapa.add(btnC119, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 190, 40, -1));

        btnC120.setFont(new java.awt.Font("Poppins", 0, 8)); // NOI18N
        btnC120.setText("jToggleButton119");
        panelMapa.add(btnC120, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 210, 40, -1));

        btnCT10.setText("jToggleButton1");
        panelMapa.add(btnCT10, new org.netbeans.lib.awtextra.AbsoluteConstraints(672, 330, 50, -1));

        btnCT11.setText("jToggleButton2");
        panelMapa.add(btnCT11, new org.netbeans.lib.awtextra.AbsoluteConstraints(672, 350, 50, -1));

        btnCT12.setText("jToggleButton3");
        panelMapa.add(btnCT12, new org.netbeans.lib.awtextra.AbsoluteConstraints(672, 370, 50, -1));

        btnCT13.setText("jToggleButton4");
        panelMapa.add(btnCT13, new org.netbeans.lib.awtextra.AbsoluteConstraints(672, 390, 50, -1));

        btnCT14.setText("jToggleButton5");
        panelMapa.add(btnCT14, new org.netbeans.lib.awtextra.AbsoluteConstraints(672, 410, 50, -1));

        btnCT15.setText("jToggleButton6");
        panelMapa.add(btnCT15, new org.netbeans.lib.awtextra.AbsoluteConstraints(672, 430, 50, -1));

        btnCT16.setText("jToggleButton7");
        panelMapa.add(btnCT16, new org.netbeans.lib.awtextra.AbsoluteConstraints(672, 450, 50, -1));

        btnCT17.setText("jToggleButton8");
        panelMapa.add(btnCT17, new org.netbeans.lib.awtextra.AbsoluteConstraints(672, 470, 50, -1));

        btnCT18.setText("jToggleButton9");
        panelMapa.add(btnCT18, new org.netbeans.lib.awtextra.AbsoluteConstraints(672, 490, 50, -1));

        btnCT9.setText("jToggleButton10");
        panelMapa.add(btnCT9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 490, 50, -1));

        btnCT8.setText("jToggleButton11");
        panelMapa.add(btnCT8, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 470, 50, -1));

        btnCT7.setText("jToggleButton12");
        panelMapa.add(btnCT7, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 450, 50, -1));

        btnCT6.setText("jToggleButton13");
        panelMapa.add(btnCT6, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 430, 50, -1));

        btnCT5.setText("jToggleButton14");
        panelMapa.add(btnCT5, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 410, 50, -1));

        btnCT4.setText("jToggleButton15");
        panelMapa.add(btnCT4, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 390, 50, -1));

        btnCT3.setText("jToggleButton16");
        panelMapa.add(btnCT3, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 370, 50, -1));

        btnCT2.setText("jToggleButton17");
        panelMapa.add(btnCT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 350, 50, -1));

        btnCT1.setText("jToggleButton18");
        panelMapa.add(btnCT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 330, 50, -1));

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
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        panelDatosUser.setBackground(new java.awt.Color(204, 204, 255));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.setPreferredSize(new java.awt.Dimension(80, 80));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Usuario:");

        jLabel2.setText("jLabel2");

        jLabel3.setText("Cargo");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoInicio.png"))); // NOI18N
        jButton4.setContentAreaFilled(false);

        jButton5.setText("jButton5");

        javax.swing.GroupLayout panelDatosUserLayout = new javax.swing.GroupLayout(panelDatosUser);
        panelDatosUser.setLayout(panelDatosUserLayout);
        panelDatosUserLayout.setHorizontalGroup(
            panelDatosUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelDatosUserLayout.createSequentialGroup()
                .addGroup(panelDatosUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosUserLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDatosUserLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelDatosUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelDatosUserLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jButton5)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelDatosUserLayout.setVerticalGroup(
            panelDatosUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosUserLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        entrada.setAlwaysOnTop(true);
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
    private javax.swing.JToggleButton btnC100;
    private javax.swing.JToggleButton btnC101;
    private javax.swing.JToggleButton btnC102;
    private javax.swing.JToggleButton btnC103;
    private javax.swing.JToggleButton btnC104;
    private javax.swing.JToggleButton btnC105;
    private javax.swing.JToggleButton btnC106;
    private javax.swing.JToggleButton btnC107;
    private javax.swing.JToggleButton btnC108;
    private javax.swing.JToggleButton btnC109;
    private javax.swing.JToggleButton btnC11;
    private javax.swing.JToggleButton btnC110;
    private javax.swing.JToggleButton btnC111;
    private javax.swing.JToggleButton btnC112;
    private javax.swing.JToggleButton btnC113;
    private javax.swing.JToggleButton btnC114;
    private javax.swing.JToggleButton btnC115;
    private javax.swing.JToggleButton btnC116;
    private javax.swing.JToggleButton btnC117;
    private javax.swing.JToggleButton btnC118;
    private javax.swing.JToggleButton btnC119;
    private javax.swing.JToggleButton btnC12;
    private javax.swing.JToggleButton btnC120;
    private javax.swing.JToggleButton btnC13;
    private javax.swing.JToggleButton btnC14;
    private javax.swing.JToggleButton btnC15;
    private javax.swing.JToggleButton btnC16;
    private javax.swing.JToggleButton btnC17;
    private javax.swing.JToggleButton btnC18;
    private javax.swing.JToggleButton btnC19;
    private javax.swing.JToggleButton btnC2;
    private javax.swing.JToggleButton btnC20;
    private javax.swing.JToggleButton btnC21;
    private javax.swing.JToggleButton btnC22;
    private javax.swing.JToggleButton btnC23;
    private javax.swing.JToggleButton btnC24;
    private javax.swing.JToggleButton btnC25;
    private javax.swing.JToggleButton btnC26;
    private javax.swing.JToggleButton btnC27;
    private javax.swing.JToggleButton btnC28;
    private javax.swing.JToggleButton btnC29;
    private javax.swing.JToggleButton btnC3;
    private javax.swing.JToggleButton btnC30;
    private javax.swing.JToggleButton btnC31;
    private javax.swing.JToggleButton btnC32;
    private javax.swing.JToggleButton btnC33;
    private javax.swing.JToggleButton btnC34;
    private javax.swing.JToggleButton btnC35;
    private javax.swing.JToggleButton btnC36;
    private javax.swing.JToggleButton btnC37;
    private javax.swing.JToggleButton btnC38;
    private javax.swing.JToggleButton btnC39;
    private javax.swing.JToggleButton btnC4;
    private javax.swing.JToggleButton btnC40;
    private javax.swing.JToggleButton btnC41;
    private javax.swing.JToggleButton btnC42;
    private javax.swing.JToggleButton btnC43;
    private javax.swing.JToggleButton btnC44;
    private javax.swing.JToggleButton btnC45;
    private javax.swing.JToggleButton btnC46;
    private javax.swing.JToggleButton btnC47;
    private javax.swing.JToggleButton btnC48;
    private javax.swing.JToggleButton btnC49;
    private javax.swing.JToggleButton btnC5;
    private javax.swing.JToggleButton btnC50;
    private javax.swing.JToggleButton btnC51;
    private javax.swing.JToggleButton btnC52;
    private javax.swing.JToggleButton btnC53;
    private javax.swing.JToggleButton btnC54;
    private javax.swing.JToggleButton btnC55;
    private javax.swing.JToggleButton btnC56;
    private javax.swing.JToggleButton btnC57;
    private javax.swing.JToggleButton btnC58;
    private javax.swing.JToggleButton btnC59;
    private javax.swing.JToggleButton btnC6;
    private javax.swing.JToggleButton btnC60;
    private javax.swing.JToggleButton btnC61;
    private javax.swing.JToggleButton btnC62;
    private javax.swing.JToggleButton btnC63;
    private javax.swing.JToggleButton btnC64;
    private javax.swing.JToggleButton btnC65;
    private javax.swing.JToggleButton btnC66;
    private javax.swing.JToggleButton btnC67;
    private javax.swing.JToggleButton btnC68;
    private javax.swing.JToggleButton btnC69;
    private javax.swing.JToggleButton btnC7;
    private javax.swing.JToggleButton btnC70;
    private javax.swing.JToggleButton btnC71;
    private javax.swing.JToggleButton btnC72;
    private javax.swing.JToggleButton btnC73;
    private javax.swing.JToggleButton btnC74;
    private javax.swing.JToggleButton btnC75;
    private javax.swing.JToggleButton btnC76;
    private javax.swing.JToggleButton btnC77;
    private javax.swing.JToggleButton btnC78;
    private javax.swing.JToggleButton btnC79;
    private javax.swing.JToggleButton btnC8;
    private javax.swing.JToggleButton btnC80;
    private javax.swing.JToggleButton btnC81;
    private javax.swing.JToggleButton btnC82;
    private javax.swing.JToggleButton btnC83;
    private javax.swing.JToggleButton btnC84;
    private javax.swing.JToggleButton btnC85;
    private javax.swing.JToggleButton btnC86;
    private javax.swing.JToggleButton btnC87;
    private javax.swing.JToggleButton btnC88;
    private javax.swing.JToggleButton btnC89;
    private javax.swing.JToggleButton btnC9;
    private javax.swing.JToggleButton btnC90;
    private javax.swing.JToggleButton btnC91;
    private javax.swing.JToggleButton btnC92;
    private javax.swing.JToggleButton btnC93;
    private javax.swing.JToggleButton btnC94;
    private javax.swing.JToggleButton btnC95;
    private javax.swing.JToggleButton btnC96;
    private javax.swing.JToggleButton btnC97;
    private javax.swing.JToggleButton btnC98;
    private javax.swing.JToggleButton btnC99;
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
    private javax.swing.JButton btnNuevoTicket;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JPanel panelDatosUser;
    private javax.swing.JPanel panelMapa;
    // End of variables declaration//GEN-END:variables

private void iniciarVerificacionLugaresCarros() {

    JToggleButton[] buttons = {
        btnC1, btnC2, btnC3, btnC4, btnC5, btnC6, btnC7, btnC8, btnC9, btnC10,
        btnC11, btnC12, btnC13, btnC14, btnC15, btnC16, btnC17, btnC18, btnC19, btnC20,
        btnC21, btnC22, btnC23, btnC24, btnC25, btnC26, btnC27, btnC28, btnC29, btnC30,
        btnC31, btnC32, btnC33, btnC34, btnC35, btnC36, btnC37, btnC38, btnC39, btnC40,
        btnC41, btnC42, btnC43, btnC44, btnC45, btnC46, btnC47, btnC48, btnC49, btnC50,
        btnC51, btnC52, btnC53, btnC54, btnC55, btnC56, btnC57, btnC58, btnC59, btnC60,
        btnC61, btnC62, btnC63, btnC64, btnC65, btnC66, btnC67, btnC68, btnC69, btnC70,
        btnC71, btnC72, btnC73, btnC74, btnC75, btnC76, btnC77, btnC78, btnC79, btnC80,
        btnC81, btnC82, btnC83, btnC84, btnC85, btnC86, btnC87, btnC88, btnC89, btnC90,
        btnC91, btnC92, btnC93, btnC94, btnC95, btnC96, btnC97, btnC98, btnC99, btnC100,
        btnC101, btnC102, btnC103, btnC104, btnC105, btnC106, btnC107, btnC108, btnC109, btnC110,
        btnC111, btnC112, btnC113, btnC114, btnC115, btnC116, btnC117, btnC118, btnC119, btnC120
    };

  
    for (int i = 0; i < buttons.length; i++) {

        JToggleButton btn = buttons[i];

        btn.setText(String.valueOf(i + 1)); 

        btn.setOpaque(true); // permite ver color
        btn.setContentAreaFilled(true);
        btn.setBorderPainted(true);
        btn.putClientProperty("JButton.buttonType", "square"); 


    }


    Thread hilo = new Thread(() -> {
        while (true) {
            try (Connection con = ConexionSQL.conectar();
                 Statement st = con.createStatement();
                 ResultSet rs = st.executeQuery("SELECT numero, ocupado FROM lugaresCarros")) {

                int[] ocupados = new int[buttons.length];

                while (rs.next()) {
                    int id = rs.getInt("numero");
                    int ocupado = rs.getInt("ocupado");

                    if (id >= 1 && id <= buttons.length) {
                        ocupados[id - 1] = ocupado;
                    }
                }

      
                SwingUtilities.invokeLater(() -> {
                    for (int i = 0; i < buttons.length; i++) {
                        JToggleButton btn = buttons[i];

                        if (ocupados[i] == 1) {
                            btn.setBackground(Color.RED); // ocupado
                            btn.setForeground(Color.WHITE);
                            btn.setToolTipText("Lugar " + (i + 1) + " — Ocupado");
                            btn.setEnabled(false);
                        } else {
                            btn.setBackground(Color.GREEN); // libre (verde)
                            btn.setForeground(Color.BLACK);
                            btn.setToolTipText("Lugar " + (i + 1) + " — Libre");
                            btn.setEnabled(false);
                        }
                    }
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
                 ResultSet rs = st.executeQuery("SELECT numero, ocupado FROM lugaresCatedraticos")) {

                int[] ocupados = new int[buttons.length];

                while (rs.next()) {
                    int numero = rs.getInt("numero");
                    int ocupado = rs.getInt("ocupado");
                    if (numero >= 1 && numero <= buttons.length) {
                        ocupados[numero - 1] = ocupado;
                    }
                }

                SwingUtilities.invokeLater(() -> {
                    for (int i = 0; i < buttons.length; i++) {
                        JToggleButton btn = buttons[i];
                        if (ocupados[i] == 1) {
                            btn.setBackground(Color.RED);
                            btn.setToolTipText("Lugar CT " + (i + 1) + " — OCUPADO");
                        } else {
                            btn.setBackground(Color.GREEN);
                            btn.setToolTipText("Lugar CT " + (i + 1) + " — Libre");
                        }
                    }
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


