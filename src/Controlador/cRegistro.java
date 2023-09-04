/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;


import Modelo.MostrarDatosTabla;
import Modelo.NivelesUsuario;
import Modelo.mCliente;
import Modelo.conx;
import Modelo.mUsuario;

import Vista.pnlRegistroGen;
import Vista.vRegistro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import Modelo.crypt;
import Modelo.mRegistro;
import java.sql.SQLException;
/**
 *
 * @author Fran
 */
public class cRegistro implements ActionListener{
    private mRegistro modeloUsuario;
    private pnlRegistroGen vistaRegistro;
        private NivelesUsuario modelNivelesUsuario;
    
        public cRegistro(pnlRegistroGen vistaRegistro, mRegistro modeloUsuario, NivelesUsuario modeloNivelesUsuario) {
        this.modeloUsuario = modeloUsuario;
        this.vistaRegistro = vistaRegistro;
        this.modelNivelesUsuario = modeloNivelesUsuario;
        this.vistaRegistro.btnUser.addActionListener(this);

    }
        
        private void limpiarCamposTextoUsuario() {

         vistaRegistro.txtCorre.setText("");
         vistaRegistro.txtContras.setText("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            String idTipoUsuario = vistaRegistro.cbLista.getSelectedItem().toString(); 
            String usuario = vistaRegistro.txtUs.getText();
            String contra = vistaRegistro.txtContras.getText();
            String correo = vistaRegistro.txtCorre.getText();

            if (usuario.isEmpty() || contra.isEmpty() || correo.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Llene todos los campos.");
            } else {
                String encryptedPassword = crypt.encryptPassword(contra);
                modelNivelesUsuario.setTipo(idTipoUsuario);
                modeloUsuario.setUsuario(usuario);
                modeloUsuario.setContra(encryptedPassword);
                modeloUsuario.setCorreo(correo);
                
                // Aquí puedes llamar a la función que genera el error
                modelNivelesUsuario.traerIdDeTbTipo(modeloUsuario, modelNivelesUsuario);
                
                modeloUsuario.AgregarUsuarioR(modeloUsuario, modelNivelesUsuario);
                
                JOptionPane.showMessageDialog(vistaRegistro, "Usuario registrado");
                limpiarCamposTextoUsuario();
            }
        } catch (Exception ex) {
            // Captura cualquier excepción que ocurra durante la ejecución del bloque try
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error: " + ex.getMessage());
        }
    }
}
       
