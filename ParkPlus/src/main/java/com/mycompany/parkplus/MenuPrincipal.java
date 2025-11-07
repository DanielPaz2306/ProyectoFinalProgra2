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
    private JLabel[] labels;
   
    public MenuPrincipal() {
        
        initComponents();
        iniciarVerificacionLugaresCarros();
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
        panelTxtLugares = new javax.swing.JPanel();
        txtC1 = new javax.swing.JLabel();
        txtC2 = new javax.swing.JLabel();
        txtC3 = new javax.swing.JLabel();
        txtC4 = new javax.swing.JLabel();
        txtC5 = new javax.swing.JLabel();
        txtC6 = new javax.swing.JLabel();
        txtC7 = new javax.swing.JLabel();
        txtC8 = new javax.swing.JLabel();
        txtC9 = new javax.swing.JLabel();
        txtC10 = new javax.swing.JLabel();
        txtC11 = new javax.swing.JLabel();
        txtC12 = new javax.swing.JLabel();
        txtC13 = new javax.swing.JLabel();
        txtC14 = new javax.swing.JLabel();
        txtC15 = new javax.swing.JLabel();
        txtC16 = new javax.swing.JLabel();
        txtC17 = new javax.swing.JLabel();
        txtC18 = new javax.swing.JLabel();
        txtC19 = new javax.swing.JLabel();
        txtC20 = new javax.swing.JLabel();
        txtC21 = new javax.swing.JLabel();
        txtC22 = new javax.swing.JLabel();
        txtC23 = new javax.swing.JLabel();
        txtC24 = new javax.swing.JLabel();
        txtC25 = new javax.swing.JLabel();
        txtC26 = new javax.swing.JLabel();
        txtC27 = new javax.swing.JLabel();
        txtC28 = new javax.swing.JLabel();
        txtC30 = new javax.swing.JLabel();
        txtC29 = new javax.swing.JLabel();
        txtC31 = new javax.swing.JLabel();
        txtC32 = new javax.swing.JLabel();
        txtC33 = new javax.swing.JLabel();
        txtC34 = new javax.swing.JLabel();
        txtC35 = new javax.swing.JLabel();
        txtC36 = new javax.swing.JLabel();
        txtC37 = new javax.swing.JLabel();
        txtC38 = new javax.swing.JLabel();
        txtC39 = new javax.swing.JLabel();
        txtC40 = new javax.swing.JLabel();
        txtC41 = new javax.swing.JLabel();
        txtC42 = new javax.swing.JLabel();
        txtC43 = new javax.swing.JLabel();
        txtC44 = new javax.swing.JLabel();
        txtC45 = new javax.swing.JLabel();
        txtC46 = new javax.swing.JLabel();
        txtC47 = new javax.swing.JLabel();
        txtC48 = new javax.swing.JLabel();
        txtC49 = new javax.swing.JLabel();
        txtC50 = new javax.swing.JLabel();
        txtC51 = new javax.swing.JLabel();
        txtC52 = new javax.swing.JLabel();
        txtC53 = new javax.swing.JLabel();
        txtC54 = new javax.swing.JLabel();
        txtC55 = new javax.swing.JLabel();
        txtC56 = new javax.swing.JLabel();
        txtC57 = new javax.swing.JLabel();
        txtC58 = new javax.swing.JLabel();
        txtC59 = new javax.swing.JLabel();
        txtC60 = new javax.swing.JLabel();
        txtC61 = new javax.swing.JLabel();
        txtC62 = new javax.swing.JLabel();
        txtC63 = new javax.swing.JLabel();
        txtC64 = new javax.swing.JLabel();
        txtC65 = new javax.swing.JLabel();
        txtC66 = new javax.swing.JLabel();
        txtC67 = new javax.swing.JLabel();
        txtC68 = new javax.swing.JLabel();
        txtC69 = new javax.swing.JLabel();
        txtC70 = new javax.swing.JLabel();
        txtC71 = new javax.swing.JLabel();
        txtC72 = new javax.swing.JLabel();
        txtC73 = new javax.swing.JLabel();
        txtC74 = new javax.swing.JLabel();
        txtC75 = new javax.swing.JLabel();
        txtC76 = new javax.swing.JLabel();
        txtC77 = new javax.swing.JLabel();
        txtC78 = new javax.swing.JLabel();
        txtC79 = new javax.swing.JLabel();
        txtC80 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
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

        jButton6.setFont(new java.awt.Font("Poppins SemiBold", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 0, 0));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salida.png"))); // NOI18N
        jButton6.setText("Salida");

        panelMapa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTxtLugares.setOpaque(false);

        txtC1.setText("C-1");
        txtC1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtC2.setText("C-2");

        txtC3.setText("C-3");

        txtC4.setText("C-4");

        txtC5.setText("C-5");

        txtC6.setText("C-6");

        txtC7.setText("C-7");

        txtC8.setText("C-8");

        txtC9.setText("C-9");

        txtC10.setText("C-10");

        txtC11.setText("C-11");

        txtC12.setText("C-12");

        txtC13.setText("C-13");

        txtC14.setText("C-14");

        txtC15.setText("C-15");

        txtC16.setText("C-16");

        txtC17.setText("C-17");

        txtC18.setText("C-18");

        txtC19.setText("C-19");

        txtC20.setText("C-20");

        txtC21.setText("C-21");

        txtC22.setText("C-22");

        txtC23.setText("C-23");

        txtC24.setText("C-24");

        txtC25.setText("C-25");

        txtC26.setText("C-26");

        txtC27.setText("C-27");

        txtC28.setText("C-28");

        txtC30.setText("C-30");

        txtC29.setText("C-29");

        txtC31.setText("C-31");

        txtC32.setText("C-32");

        txtC33.setText("C-33");

        txtC34.setText("C-34");

        txtC35.setText("C-35");

        txtC36.setText("C-36");

        txtC37.setText("C-37");

        txtC38.setText("C-38");

        txtC39.setText("C-39");

        txtC40.setText("C-40");

        txtC41.setText("C-41");

        txtC42.setText("C-42");

        txtC43.setText("C-43");

        txtC44.setText("C-44");

        txtC45.setText("C-45");

        txtC46.setText("C-46");

        txtC47.setText("C-47");

        txtC48.setText("C-48");

        txtC49.setText("C-49");

        txtC50.setText("C-50");

        txtC51.setText("C-51");

        txtC52.setText("C-52");

        txtC53.setText("C-53");

        txtC54.setText("C-54");

        txtC55.setText("C-55");

        txtC56.setText("C-56");

        txtC57.setText("C-57");

        txtC58.setText("C-58");

        txtC59.setText("C-59");

        txtC60.setText("C-60");

        txtC61.setText("C-61");

        txtC62.setText("C-62");

        txtC63.setText("C-63");

        txtC64.setText("C-64");

        txtC65.setText("C-65");

        txtC66.setText("C-66");

        txtC67.setText("C-67");

        txtC68.setText("C-68");

        txtC69.setText("C-69");

        txtC70.setText("C-70");

        txtC71.setText("C-71");

        txtC72.setText("C-72");

        txtC73.setText("C-73");

        txtC74.setText("C-74");

        txtC75.setText("C-75");

        txtC76.setText("C-76");

        txtC77.setText("C-77");

        txtC78.setText("C-78");

        txtC79.setText("C-79");

        txtC80.setText("C-80");

        javax.swing.GroupLayout panelTxtLugaresLayout = new javax.swing.GroupLayout(panelTxtLugares);
        panelTxtLugares.setLayout(panelTxtLugaresLayout);
        panelTxtLugaresLayout.setHorizontalGroup(
            panelTxtLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTxtLugaresLayout.createSequentialGroup()
                .addGap(291, 291, 291)
                .addGroup(panelTxtLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTxtLugaresLayout.createSequentialGroup()
                        .addGroup(panelTxtLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelTxtLugaresLayout.createSequentialGroup()
                                .addComponent(txtC10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtC20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelTxtLugaresLayout.createSequentialGroup()
                                .addComponent(txtC9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtC19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelTxtLugaresLayout.createSequentialGroup()
                                .addComponent(txtC8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtC18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelTxtLugaresLayout.createSequentialGroup()
                                .addComponent(txtC7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtC17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(panelTxtLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtC29, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtC27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtC30, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtC28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(panelTxtLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelTxtLugaresLayout.createSequentialGroup()
                                .addComponent(txtC37)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtC47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTxtLugaresLayout.createSequentialGroup()
                                .addComponent(txtC38)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtC48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelTxtLugaresLayout.createSequentialGroup()
                                .addComponent(txtC39)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtC49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTxtLugaresLayout.createSequentialGroup()
                                .addComponent(txtC40)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtC50)))
                        .addGroup(panelTxtLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTxtLugaresLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtC57, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelTxtLugaresLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(panelTxtLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtC60)
                                    .addGroup(panelTxtLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtC58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtC59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(12, 12, 12)
                        .addGroup(panelTxtLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtC69, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtC68, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtC67, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtC70, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(panelTxtLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtC77, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtC78, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtC79, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtC80, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTxtLugaresLayout.createSequentialGroup()
                        .addGroup(panelTxtLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelTxtLugaresLayout.createSequentialGroup()
                                .addComponent(txtC3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtC13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtC23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtC33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtC43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelTxtLugaresLayout.createSequentialGroup()
                                .addGroup(panelTxtLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelTxtLugaresLayout.createSequentialGroup()
                                        .addComponent(txtC4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtC14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtC24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(panelTxtLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtC36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtC35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtC34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(panelTxtLugaresLayout.createSequentialGroup()
                                        .addGroup(panelTxtLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(panelTxtLugaresLayout.createSequentialGroup()
                                                .addComponent(txtC5)
                                                .addGap(25, 25, 25)
                                                .addComponent(txtC15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(panelTxtLugaresLayout.createSequentialGroup()
                                                .addComponent(txtC6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtC16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(panelTxtLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panelTxtLugaresLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(txtC26))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTxtLugaresLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(txtC25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelTxtLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtC45, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtC46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtC44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(panelTxtLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelTxtLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtC54, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                                .addComponent(txtC53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtC55, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(panelTxtLugaresLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtC56)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelTxtLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtC64, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtC63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtC66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtC65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelTxtLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtC73, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtC74, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtC75, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtC76, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTxtLugaresLayout.createSequentialGroup()
                        .addGroup(panelTxtLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelTxtLugaresLayout.createSequentialGroup()
                                .addComponent(txtC2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtC12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelTxtLugaresLayout.createSequentialGroup()
                                .addComponent(txtC1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtC11)))
                        .addGap(18, 18, 18)
                        .addGroup(panelTxtLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtC22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtC21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(panelTxtLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelTxtLugaresLayout.createSequentialGroup()
                                .addComponent(txtC31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtC41))
                            .addGroup(panelTxtLugaresLayout.createSequentialGroup()
                                .addComponent(txtC32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtC42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(panelTxtLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtC51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtC52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelTxtLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtC61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtC62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelTxtLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtC71, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtC72, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(24, 24, 24))
        );
        panelTxtLugaresLayout.setVerticalGroup(
            panelTxtLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTxtLugaresLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(panelTxtLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtC1)
                    .addComponent(txtC11)
                    .addComponent(txtC21)
                    .addComponent(txtC31)
                    .addComponent(txtC41)
                    .addComponent(txtC51)
                    .addComponent(txtC61)
                    .addComponent(txtC71))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTxtLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtC2)
                    .addComponent(txtC12)
                    .addComponent(txtC22)
                    .addComponent(txtC32)
                    .addComponent(txtC42)
                    .addComponent(txtC52)
                    .addComponent(txtC62)
                    .addComponent(txtC72))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTxtLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtC3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC13)
                    .addComponent(txtC23)
                    .addComponent(txtC33)
                    .addComponent(txtC43)
                    .addComponent(txtC53)
                    .addComponent(txtC63)
                    .addComponent(txtC73))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTxtLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtC4)
                    .addComponent(txtC14)
                    .addComponent(txtC24)
                    .addComponent(txtC34)
                    .addComponent(txtC44)
                    .addComponent(txtC54)
                    .addComponent(txtC64)
                    .addComponent(txtC74))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTxtLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtC5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC15)
                    .addComponent(txtC25)
                    .addComponent(txtC35)
                    .addComponent(txtC45)
                    .addComponent(txtC55)
                    .addComponent(txtC65)
                    .addComponent(txtC75))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTxtLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtC6)
                    .addComponent(txtC16)
                    .addComponent(txtC26)
                    .addComponent(txtC36)
                    .addComponent(txtC46)
                    .addComponent(txtC56)
                    .addComponent(txtC66)
                    .addComponent(txtC76))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTxtLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtC7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC17)
                    .addComponent(txtC27)
                    .addComponent(txtC37)
                    .addComponent(txtC47)
                    .addComponent(txtC57)
                    .addComponent(txtC67)
                    .addComponent(txtC77))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTxtLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtC8)
                    .addComponent(txtC18)
                    .addComponent(txtC28)
                    .addComponent(txtC38)
                    .addComponent(txtC48)
                    .addComponent(txtC58)
                    .addComponent(txtC68)
                    .addComponent(txtC78))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTxtLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtC9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC19)
                    .addComponent(txtC29)
                    .addComponent(txtC39)
                    .addComponent(txtC49)
                    .addComponent(txtC59)
                    .addComponent(txtC69)
                    .addComponent(txtC79))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTxtLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtC10)
                    .addComponent(txtC20)
                    .addComponent(txtC30)
                    .addComponent(txtC40)
                    .addComponent(txtC50)
                    .addComponent(txtC60)
                    .addComponent(txtC70)
                    .addComponent(txtC80))
                .addContainerGap(254, Short.MAX_VALUE))
        );

        panelMapa.add(panelTxtLugares, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 580));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ParqueoCroquis.png"))); // NOI18N
        panelMapa.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 660, 580));

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
                .addComponent(panelMapa, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
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
        IngresoSalida ingresosalida = new IngresoSalida();
        ingresosalida.setAlwaysOnTop(true);
        ingresosalida.setVisible(true);
    }//GEN-LAST:event_btnNuevoTicketActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new MenuPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JPanel panelDatosUser;
    private javax.swing.JPanel panelMapa;
    private javax.swing.JPanel panelTxtLugares;
    private javax.swing.JLabel txtC1;
    private javax.swing.JLabel txtC10;
    private javax.swing.JLabel txtC11;
    private javax.swing.JLabel txtC12;
    private javax.swing.JLabel txtC13;
    private javax.swing.JLabel txtC14;
    private javax.swing.JLabel txtC15;
    private javax.swing.JLabel txtC16;
    private javax.swing.JLabel txtC17;
    private javax.swing.JLabel txtC18;
    private javax.swing.JLabel txtC19;
    private javax.swing.JLabel txtC2;
    private javax.swing.JLabel txtC20;
    private javax.swing.JLabel txtC21;
    private javax.swing.JLabel txtC22;
    private javax.swing.JLabel txtC23;
    private javax.swing.JLabel txtC24;
    private javax.swing.JLabel txtC25;
    private javax.swing.JLabel txtC26;
    private javax.swing.JLabel txtC27;
    private javax.swing.JLabel txtC28;
    private javax.swing.JLabel txtC29;
    private javax.swing.JLabel txtC3;
    private javax.swing.JLabel txtC30;
    private javax.swing.JLabel txtC31;
    private javax.swing.JLabel txtC32;
    private javax.swing.JLabel txtC33;
    private javax.swing.JLabel txtC34;
    private javax.swing.JLabel txtC35;
    private javax.swing.JLabel txtC36;
    private javax.swing.JLabel txtC37;
    private javax.swing.JLabel txtC38;
    private javax.swing.JLabel txtC39;
    private javax.swing.JLabel txtC4;
    private javax.swing.JLabel txtC40;
    private javax.swing.JLabel txtC41;
    private javax.swing.JLabel txtC42;
    private javax.swing.JLabel txtC43;
    private javax.swing.JLabel txtC44;
    private javax.swing.JLabel txtC45;
    private javax.swing.JLabel txtC46;
    private javax.swing.JLabel txtC47;
    private javax.swing.JLabel txtC48;
    private javax.swing.JLabel txtC49;
    private javax.swing.JLabel txtC5;
    private javax.swing.JLabel txtC50;
    private javax.swing.JLabel txtC51;
    private javax.swing.JLabel txtC52;
    private javax.swing.JLabel txtC53;
    private javax.swing.JLabel txtC54;
    private javax.swing.JLabel txtC55;
    private javax.swing.JLabel txtC56;
    private javax.swing.JLabel txtC57;
    private javax.swing.JLabel txtC58;
    private javax.swing.JLabel txtC59;
    private javax.swing.JLabel txtC6;
    private javax.swing.JLabel txtC60;
    private javax.swing.JLabel txtC61;
    private javax.swing.JLabel txtC62;
    private javax.swing.JLabel txtC63;
    private javax.swing.JLabel txtC64;
    private javax.swing.JLabel txtC65;
    private javax.swing.JLabel txtC66;
    private javax.swing.JLabel txtC67;
    private javax.swing.JLabel txtC68;
    private javax.swing.JLabel txtC69;
    private javax.swing.JLabel txtC7;
    private javax.swing.JLabel txtC70;
    private javax.swing.JLabel txtC71;
    private javax.swing.JLabel txtC72;
    private javax.swing.JLabel txtC73;
    private javax.swing.JLabel txtC74;
    private javax.swing.JLabel txtC75;
    private javax.swing.JLabel txtC76;
    private javax.swing.JLabel txtC77;
    private javax.swing.JLabel txtC78;
    private javax.swing.JLabel txtC79;
    private javax.swing.JLabel txtC8;
    private javax.swing.JLabel txtC80;
    private javax.swing.JLabel txtC9;
    // End of variables declaration//GEN-END:variables

    private void iniciarVerificacionLugaresCarros() {
    JLabel[] labels = {
        txtC1, txtC2, txtC3, txtC4, txtC5, txtC6, txtC7, txtC8, txtC9, txtC10,
        txtC11, txtC12, txtC13, txtC14, txtC15, txtC16, txtC17, txtC18, txtC19, txtC20,
        txtC21, txtC22, txtC23, txtC24, txtC25, txtC26, txtC27, txtC28, txtC29, txtC30,
        txtC31, txtC32, txtC33, txtC34, txtC35, txtC36, txtC37, txtC38, txtC39, txtC40,
        txtC41, txtC42, txtC43, txtC44, txtC45, txtC46, txtC47, txtC48, txtC49, txtC50,
        txtC51, txtC52, txtC53, txtC54, txtC55, txtC56, txtC57, txtC58, txtC59, txtC60,
        txtC61, txtC62, txtC63, txtC64, txtC65, txtC66, txtC67, txtC68, txtC69, txtC70,
        txtC71, txtC72, txtC73, txtC74, txtC75, txtC76, txtC77, txtC78, txtC79, txtC80
    };

    Thread hilo = new Thread(() -> {
        while (true) {
            try (Connection con = ConexionSQL.conectar();
                 Statement st = con.createStatement();
                 ResultSet rs = st.executeQuery("SELECT numero, ocupado FROM lugaresCarros")) {

                while (rs.next()) {
                    int id = rs.getInt("numero");
                    int ocupado = rs.getInt("ocupado");

                    if (id >= 1 && id <= labels.length) {
                        JLabel label = labels[id - 1];
                        SwingUtilities.invokeLater(() -> {
                            if (ocupado == 1) {
                                label.setBackground(Color.RED);   // lugar ocupado
                            } else {
                                label.setBackground(Color.GREEN); // lugar libre
                            }
                        });
                    }
                }

                Thread.sleep(2000); // actualiza cada 2 segundos
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    });

    hilo.start();
}

}


