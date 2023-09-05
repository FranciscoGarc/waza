/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import Controlador.cRecep;
import Controlador.cUsuarioRe;
import Modelo.mRecep;
import Modelo.mUsuario;

/**
 *
 * @author hwrna
 */
public class ControlRecepcionista extends javax.swing.JPanel {

    /**
     * Creates new form ControlRecepcionista
     */
    private mRecep modeloRecep;
    private cRecep controlRecep;
    private mUsuario modeloUsuario;
    private cUsuarioRe controlUserco;

    public ControlRecepcionista() {
        initComponents();
        modeloUsuario = new mUsuario();
        controlUserco = new cUsuarioRe(this, modeloUsuario);
        modeloRecep = new mRecep();
        controlRecep = new cRecep(this, modeloRecep);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PPrincipal = new com.k33ptoo.components.KGradientPanel();
        jLabel9 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnRegistrar = new com.k33ptoo.components.KButton();
        btnEliminar = new com.k33ptoo.components.KButton();
        btnActualizar = new com.k33ptoo.components.KButton();
        btnAgregarUsuario = new com.k33ptoo.components.KButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDatosCl = new javax.swing.JTable();
        pLogin = new com.k33ptoo.components.KGradientPanel();
        txtApe = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        txtContra = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        txtDui = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtDirec = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        imgBgP = new javax.swing.JLabel();

        PPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Buscar:");
        PPrincipal.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));
        PPrincipal.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 440, 39));

        btnRegistrar.setText("Registrar recepcionista");
        btnRegistrar.setkBorderRadius(20);
        btnRegistrar.setkEndColor(new java.awt.Color(153, 153, 153));
        btnRegistrar.setkHoverForeGround(new java.awt.Color(51, 153, 0));
        btnRegistrar.setkHoverStartColor(new java.awt.Color(51, 255, 51));
        btnRegistrar.setkStartColor(new java.awt.Color(153, 153, 153));
        PPrincipal.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 190, 170, 50));

        btnEliminar.setText("Despedir recepcionista");
        btnEliminar.setkBorderRadius(20);
        btnEliminar.setkEndColor(new java.awt.Color(153, 153, 153));
        btnEliminar.setkHoverForeGround(new java.awt.Color(51, 153, 0));
        btnEliminar.setkHoverStartColor(new java.awt.Color(51, 255, 51));
        btnEliminar.setkStartColor(new java.awt.Color(153, 153, 153));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        PPrincipal.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 330, 170, 50));

        btnActualizar.setText("Actualizar recepcionista");
        btnActualizar.setkBorderRadius(20);
        btnActualizar.setkEndColor(new java.awt.Color(153, 153, 153));
        btnActualizar.setkHoverForeGround(new java.awt.Color(51, 153, 0));
        btnActualizar.setkHoverStartColor(new java.awt.Color(51, 255, 51));
        btnActualizar.setkStartColor(new java.awt.Color(153, 153, 153));
        PPrincipal.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 260, 170, 50));

        btnAgregarUsuario.setText("Agregar Usuario");
        btnAgregarUsuario.setkBorderRadius(20);
        btnAgregarUsuario.setkEndColor(new java.awt.Color(153, 153, 153));
        btnAgregarUsuario.setkHoverForeGround(new java.awt.Color(51, 153, 0));
        btnAgregarUsuario.setkHoverStartColor(new java.awt.Color(51, 255, 51));
        btnAgregarUsuario.setkStartColor(new java.awt.Color(153, 153, 153));
        btnAgregarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarUsuarioMouseClicked(evt);
            }
        });
        btnAgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarUsuarioActionPerformed(evt);
            }
        });
        PPrincipal.add(btnAgregarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 120, 170, 50));

        tbDatosCl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "idUsuario", "Usuario", "Contraseña", "Correo", "idCliente", "Nombre", "Apellido", "Telefono", "Direccion", "DUI"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbDatosCl);

        PPrincipal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, 730, 180));

        pLogin.setkEndColor(new java.awt.Color(0, 0, 0));
        pLogin.setkStartColor(new java.awt.Color(0, 0, 0));

        txtTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Apellidos:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Correo electronico:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Usuario:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Contraseña:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DUI:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Dirección:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Telefono:");

        javax.swing.GroupLayout pLoginLayout = new javax.swing.GroupLayout(pLogin);
        pLogin.setLayout(pLoginLayout);
        pLoginLayout.setHorizontalGroup(
            pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLoginLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pLoginLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap(671, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pLoginLayout.createSequentialGroup()
                        .addGroup(pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDirec)
                            .addGroup(pLoginLayout.createSequentialGroup()
                                .addGroup(pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(txtApe, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtCorreo)
                            .addComponent(txtContra)
                            .addComponent(txtUser)
                            .addGroup(pLoginLayout.createSequentialGroup()
                                .addGroup(pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pLoginLayout.createSequentialGroup()
                                .addGroup(pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 96, Short.MAX_VALUE)
                                .addGroup(pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pLoginLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(277, 277, 277))
                                    .addComponent(txtDui))))
                        .addGap(50, 50, 50))))
        );
        pLoginLayout.setVerticalGroup(
            pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLoginLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel4)
                .addGap(12, 12, 12)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContra, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApe, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDirec, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDui, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PPrincipal.add(pLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 820, 480));

        imgBgP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bg1.png"))); // NOI18N
        PPrincipal.add(imgBgP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 890));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1070, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked

    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarUsuarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarUsuarioMouseClicked

    private void btnAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarUsuarioActionPerformed

    private void txtTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KGradientPanel PPrincipal;
    public com.k33ptoo.components.KButton btnActualizar;
    public com.k33ptoo.components.KButton btnAgregarUsuario;
    public com.k33ptoo.components.KButton btnEliminar;
    public com.k33ptoo.components.KButton btnRegistrar;
    private javax.swing.JLabel imgBgP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private com.k33ptoo.components.KGradientPanel pLogin;
    public javax.swing.JTable tbDatosCl;
    public javax.swing.JTextField txtApe;
    public javax.swing.JTextField txtContra;
    public javax.swing.JTextField txtCorreo;
    public javax.swing.JTextField txtDirec;
    public javax.swing.JTextField txtDui;
    public javax.swing.JTextField txtName;
    public javax.swing.JTextField txtSearch;
    public javax.swing.JTextField txtTel;
    public javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
