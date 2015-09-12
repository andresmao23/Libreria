/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JOptionPane;
import modelo.Editorial;
import modelo.Libreria;

/**
 *
 * @author Mao
 */
public class InterfazAgregarEditorial extends javax.swing.JFrame {

    InterfazLibreria interfazLibreria;
    Libreria libreria;
    
    String nombre;
    
    /**
     * Creates new form InterfazAgregarEditorial
     */
    public InterfazAgregarEditorial(InterfazLibreria win) {
        interfazLibreria = win;
        libreria = new Libreria();
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

        lblNombreEditorial = new javax.swing.JLabel();
        txtNombreEditorial = new javax.swing.JTextField();
        btnGuardarEditorial = new javax.swing.JButton();
        btnCancelarEditorial = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar editorial");
        setResizable(false);

        lblNombreEditorial.setText("Nombre de la editorial:");

        btnGuardarEditorial.setText("Guardar");
        btnGuardarEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarEditorialActionPerformed(evt);
            }
        });

        btnCancelarEditorial.setText("Cancelar");
        btnCancelarEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarEditorialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNombreEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtNombreEditorial)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(btnGuardarEditorial)
                .addGap(46, 46, 46)
                .addComponent(btnCancelarEditorial)
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreEditorial)
                    .addComponent(txtNombreEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarEditorial)
                    .addComponent(btnCancelarEditorial))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEditorialActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarEditorialActionPerformed

    private void btnGuardarEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarEditorialActionPerformed
        Editorial editorial = new Editorial();
        nombre = txtNombreEditorial.getText();
        editorial.cmabiarNombre(nombre);
        interfazLibreria.agregarEditorial(editorial);
        interfazLibreria.modelEditorial.addRow(new Object[]{editorial.darNombre()});
        JOptionPane.showMessageDialog(null, "Editorial agregada!!!", "Editorial", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnGuardarEditorialActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarEditorial;
    private javax.swing.JButton btnGuardarEditorial;
    private javax.swing.JLabel lblNombreEditorial;
    private javax.swing.JTextField txtNombreEditorial;
    // End of variables declaration//GEN-END:variables
}
