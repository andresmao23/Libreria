/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JOptionPane;
import modelo.Editorial;

/**
 *
 * @author Mao
 */
public class InterfazEditarEditorial extends javax.swing.JFrame {

    private static InterfazLibreria interfazLibreria;
    
    private  int indice;
    private String nombre;
    
    /**
     * Creates new form InterfazEditarEditorial
     */
    public InterfazEditarEditorial(InterfazLibreria win) {
        interfazLibreria = win;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEditarNombreEditorial = new javax.swing.JLabel();
        txtEditarNombreEditorial = new javax.swing.JTextField();
        btnGuardarNuevaEditorial = new javax.swing.JButton();
        btnCancelarNuevaEditorial = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar Editorial");

        lblEditarNombreEditorial.setText("Nombre editorial:");

        btnGuardarNuevaEditorial.setText("Guardar");
        btnGuardarNuevaEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarNuevaEditorialActionPerformed(evt);
            }
        });

        btnCancelarNuevaEditorial.setText("Cancelar");
        btnCancelarNuevaEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarNuevaEditorialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEditarNombreEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtEditarNombreEditorial)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(btnGuardarNuevaEditorial)
                .addGap(61, 61, 61)
                .addComponent(btnCancelarNuevaEditorial)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEditarNombreEditorial)
                    .addComponent(txtEditarNombreEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarNuevaEditorial)
                    .addComponent(btnCancelarNuevaEditorial))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarNuevaEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarNuevaEditorialActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarNuevaEditorialActionPerformed

    private void btnGuardarNuevaEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarNuevaEditorialActionPerformed
        
        if (txtEditarNombreEditorial.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "No se aceptan campos nulos", "Editorial", JOptionPane.ERROR_MESSAGE);
        }else{
        
            Editorial editorial = new Editorial();
            nombre = txtEditarNombreEditorial.getText();
            editorial.cmabiarNombre(nombre);
            interfazLibreria.modificarEditorial(indice, editorial);
            interfazLibreria.modelEditorial.setValueAt(editorial.darNombre(), interfazLibreria.jtDatosEditorial.getSelectedRow(), 0);
            JOptionPane.showMessageDialog(this, "Edición exitosa!!!", "Seleccionar elemento", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarNuevaEditorialActionPerformed

    
    public void datosEditorial(int i, Editorial editorial){
        indice= i;
        txtEditarNombreEditorial.setText(editorial.darNombre());
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarNuevaEditorial;
    private javax.swing.JButton btnGuardarNuevaEditorial;
    private javax.swing.JLabel lblEditarNombreEditorial;
    private javax.swing.JTextField txtEditarNombreEditorial;
    // End of variables declaration//GEN-END:variables
}
