/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.empresaProyectoFinal.ui;


public class JMenuPrincipal extends javax.swing.JFrame {

    public JMenuPrincipal() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/empresaProyectoFinal/ui/Imagenes/logo xd.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(469, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(442, 442, 442))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(jLabel1)
                .addContainerGap(252, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenuBar1.setPreferredSize(new java.awt.Dimension(125, 50));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/empresaProyectoFinal/ui/Imagenes/usuario.png"))); // NOI18N
        jMenu1.setText("USUARIO");
        jMenu1.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jMenu1.setPreferredSize(new java.awt.Dimension(130, 50));

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/empresaProyectoFinal/ui/Imagenes/nuevo.png"))); // NOI18N
        jMenuItem1.setText("Gestionar Usuarios");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/empresaProyectoFinal/ui/Imagenes/producto.png"))); // NOI18N
        jMenu2.setText("ALMACEN");
        jMenu2.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jMenu2.setPreferredSize(new java.awt.Dimension(130, 50));

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/empresaProyectoFinal/ui/Imagenes/nuevo-producto.png"))); // NOI18N
        jMenuItem3.setText("Gestionar Productos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/empresaProyectoFinal/ui/Imagenes/cliente.png"))); // NOI18N
        jMenu3.setText("CLIENTE");
        jMenu3.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jMenu3.setPreferredSize(new java.awt.Dimension(130, 50));

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/empresaProyectoFinal/ui/Imagenes/cliente.png"))); // NOI18N
        jMenuItem7.setText("Gestionar clientes");
        jMenu3.add(jMenuItem7);

        jMenuBar1.add(jMenu3);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/empresaProyectoFinal/ui/Imagenes/carrito.png"))); // NOI18N
        jMenu6.setText("VENTA");
        jMenu6.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jMenu6.setPreferredSize(new java.awt.Dimension(130, 50));

        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/empresaProyectoFinal/ui/Imagenes/anadir.png"))); // NOI18N
        jMenuItem10.setText("Nueva Venta");
        jMenu6.add(jMenuItem10);

        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/empresaProyectoFinal/ui/Imagenes/configuraciones.png"))); // NOI18N
        jMenuItem11.setText("Gestionar Ventas");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem11);

        jMenuBar1.add(jMenu6);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/empresaProyectoFinal/ui/Imagenes/reportes.png"))); // NOI18N
        jMenu5.setText("REPORTES");
        jMenu5.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jMenu5.setPreferredSize(new java.awt.Dimension(130, 50));

        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/empresaProyectoFinal/ui/Imagenes/reporte1.png"))); // NOI18N
        jMenuItem12.setText("Reportes Clientes");
        jMenu5.add(jMenuItem12);

        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/empresaProyectoFinal/ui/Imagenes/reporte1.png"))); // NOI18N
        jMenuItem14.setText("Reportes Productos");
        jMenu5.add(jMenuItem14);

        jMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/empresaProyectoFinal/ui/Imagenes/reporte1.png"))); // NOI18N
        jMenuItem15.setText("Reportes Ventas");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem15);

        jMenuBar1.add(jMenu5);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/empresaProyectoFinal/ui/Imagenes/cerrar-sesion.png"))); // NOI18N
        jMenu8.setText("CERRAR SESION");
        jMenu8.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jMenu8.setMaximumSize(new java.awt.Dimension(130, 32767));
        jMenu8.setMinimumSize(new java.awt.Dimension(130, 50));
        jMenu8.setPreferredSize(new java.awt.Dimension(130, 50));

        jMenuItem17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/empresaProyectoFinal/ui/Imagenes/cerrar-sesion.png"))); // NOI18N
        jMenuItem17.setText("Cerrar Sesion");
        jMenu8.add(jMenuItem17);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        JUsuarios usuario = new JUsuarios();
        usuario.setVisible(true);
             
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        JProductos products = new JProductos();
        products.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
