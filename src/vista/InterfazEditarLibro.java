package vista;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import modelo.Autor;
import modelo.Editorial;
import modelo.Fecha;
import modelo.Imagen;
import modelo.Libro;

/**
 *
 * @author Mao
 */
public class InterfazEditarLibro extends javax.swing.JFrame {
    
    private int indice;
    
    private InterfazLibreria interfazLibreria;

    private String nombre;

    private String idioma;

    private String fecha;

    private String imagen;

    private int cantidad;

    JFileChooser seleccionado;

    File archivo;

    byte[] bytesImg;

    /**
     * Creates new form InterfazAgregarLibro
     */
    public InterfazEditarLibro(InterfazLibreria win) {
        interfazLibreria = win;
        seleccionado = new JFileChooser();
        initComponents();
        llenarAutor();
        llenarEditorial();
        jDateChooser1.getDateEditor().setEnabled(false);
    }

    public void llenarAutor() {
        ArrayList<Autor> lista = interfazLibreria.darListaAutor();
        for (int i = 0; i < lista.size(); i++) {
            jcAutorNuevo.addItem(lista.get(i).darNombre());
        }
    }

    public void llenarEditorial() {
        ArrayList<Editorial> lista = interfazLibreria.darListaEditorial();
        for (int i = 0; i < lista.size(); i++) {
            jcEditorialNuevo.addItem(lista.get(i).darNombre());
        }
    }
    

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpEditarLibro = new javax.swing.JPanel();
        lblNombreNuevoLibro = new javax.swing.JLabel();
        txtNombreNuevoLibro = new javax.swing.JTextField();
        txtIdiomaNuevoLibro = new javax.swing.JTextField();
        lblIdiomaNuevoLibro = new javax.swing.JLabel();
        lblCantidadNuevoLibro = new javax.swing.JLabel();
        txtCantidadNuevoLibro = new javax.swing.JTextField();
        jcAutorNuevo = new javax.swing.JComboBox();
        lblAutorNuevoLibro = new javax.swing.JLabel();
        lblEditorialNuevoLibro = new javax.swing.JLabel();
        jcEditorialNuevo = new javax.swing.JComboBox();
        btnImagenNuevoLibro = new javax.swing.JButton();
        lblImagenNuevoLibro = new javax.swing.JLabel();
        lblFechaNuevo = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        btnGuardarNuevoLibro = new javax.swing.JButton();
        btnCancelarNuevoLibro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar Libro");
        setEnabled(false);
        setResizable(false);

        jpEditarLibro.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Llibro"));

        lblNombreNuevoLibro.setText("Nombre del libro:");

        lblIdiomaNuevoLibro.setText("Idioma del libro:");

        lblCantidadNuevoLibro.setText("Cantidad:");

        lblAutorNuevoLibro.setText("Autor:");

        lblEditorialNuevoLibro.setText("Editorial:");

        btnImagenNuevoLibro.setText("Seleccionar imagen");
        btnImagenNuevoLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImagenNuevoLibroActionPerformed(evt);
            }
        });

        lblImagenNuevoLibro.setText("Imagen:");

        lblFechaNuevo.setText("Fecha publicacion:");

        btnGuardarNuevoLibro.setText("Guardar");
        btnGuardarNuevoLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarNuevoLibroActionPerformed(evt);
            }
        });

        btnCancelarNuevoLibro.setText("Cancelar");
        btnCancelarNuevoLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarNuevoLibroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpEditarLibroLayout = new javax.swing.GroupLayout(jpEditarLibro);
        jpEditarLibro.setLayout(jpEditarLibroLayout);
        jpEditarLibroLayout.setHorizontalGroup(
            jpEditarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEditarLibroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpEditarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpEditarLibroLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btnGuardarNuevoLibro)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpEditarLibroLayout.createSequentialGroup()
                        .addGroup(jpEditarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpEditarLibroLayout.createSequentialGroup()
                                .addGroup(jpEditarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblFechaNuevo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEditorialNuevoLibro, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAutorNuevoLibro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpEditarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblCantidadNuevoLibro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblImagenNuevoLibro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jpEditarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCantidadNuevoLibro)
                                    .addComponent(jcAutorNuevo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcEditorialNuevo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jpEditarLibroLayout.createSequentialGroup()
                                        .addGap(68, 68, 68)
                                        .addComponent(btnCancelarNuevoLibro))
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnImagenNuevoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jpEditarLibroLayout.createSequentialGroup()
                                .addGroup(jpEditarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblIdiomaNuevoLibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblNombreNuevoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jpEditarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpEditarLibroLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNombreNuevoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpEditarLibroLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtIdiomaNuevoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jpEditarLibroLayout.setVerticalGroup(
            jpEditarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEditarLibroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpEditarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpEditarLibroLayout.createSequentialGroup()
                        .addGroup(jpEditarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombreNuevoLibro)
                            .addComponent(txtNombreNuevoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpEditarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIdiomaNuevoLibro)
                            .addComponent(txtIdiomaNuevoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpEditarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCantidadNuevoLibro)
                            .addComponent(txtCantidadNuevoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpEditarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAutorNuevoLibro)
                            .addComponent(jcAutorNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jpEditarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEditorialNuevoLibro)
                            .addComponent(jcEditorialNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpEditarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImagenNuevoLibro)
                    .addComponent(btnImagenNuevoLibro))
                .addGap(18, 18, 18)
                .addGroup(jpEditarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFechaNuevo)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(jpEditarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarNuevoLibro)
                    .addComponent(btnCancelarNuevoLibro))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpEditarLibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpEditarLibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnImagenNuevoLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImagenNuevoLibroActionPerformed
        Imagen i = new Imagen();

        if (seleccionado.showDialog(null, "Abrir Imagen") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionado.getSelectedFile();
            if (archivo.canRead()) {
                if (archivo.getName().endsWith("jpg") || archivo.getName().endsWith("png") || archivo.getName().endsWith("gif")) {
                    bytesImg = i.cargarImagen(archivo.getAbsolutePath());
                    ImageIcon icono = new ImageIcon(bytesImg);
                    Image imagen = icono.getImage().getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_SMOOTH);
                    icono = new ImageIcon(imagen);
                    jLabel2.setIcon(icono);
                    Path origen = Paths.get(archivo.getAbsolutePath());
                    Path destino = Paths.get("C:\\Users\\Mao\\Documents\\NetBeansProjects\\Libreria\\src\\img\\" + archivo.getName());
                        System.out.println("" + destino.toString());
                        try {
                            Files.copy(origen, destino, StandardCopyOption.REPLACE_EXISTING);
                        } catch (IOException ex) {
                            System.out.println(ex.getMessage());
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Por favor seleccione un archivo de texto o de imagen.");
                    }
                }

            }
    }//GEN-LAST:event_btnImagenNuevoLibroActionPerformed

    private void btnGuardarNuevoLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarNuevoLibroActionPerformed

        try {
            nombre = txtNombreNuevoLibro.getText();
            idioma = txtIdiomaNuevoLibro.getText();
            cantidad = Integer.parseInt(txtCantidadNuevoLibro.getText());
            int indiceAutor = jcAutorNuevo.getSelectedIndex();
            int indiceEditorial = jcEditorialNuevo.getSelectedIndex();
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
            fecha = formatoFecha.format(jDateChooser1.getDate());
            Fecha unaFecha = new Fecha();
            unaFecha.cambiarFecha(fecha);
            
            Imagen unaImagen = new Imagen(archivo.getName());
            Autor unAutor = interfazLibreria.darAutor(indiceAutor);
            Editorial unaEditorial = interfazLibreria.darEditorial(indiceEditorial);
            Libro unLibro = new Libro(nombre, idioma, cantidad, unAutor, unaEditorial, unaImagen, unaFecha);
            interfazLibreria.modificarLibro(indice, unLibro);
            
            interfazLibreria.modelLibro.setValueAt(unLibro.darNombre(), interfazLibreria.jtDatosLibro.getSelectedRow(), 0);
            interfazLibreria.modelLibro.setValueAt(unLibro.darAutor().darNombre()+" "+unLibro.darAutor().darApellido(), interfazLibreria.jtDatosLibro.getSelectedRow(), 1);
            interfazLibreria.modelLibro.setValueAt(unLibro.darEditorial().darNombre(), interfazLibreria.jtDatosLibro.getSelectedRow(), 2);
            interfazLibreria.modelLibro.setValueAt(unLibro.darCantidad(), interfazLibreria.jtDatosLibro.getSelectedRow(), 3);
            interfazLibreria.modelLibro.setValueAt(unLibro.darCantidad(), interfazLibreria.jtDatosLibro.getSelectedRow(), 4);
            interfazLibreria.modelLibro.setValueAt(unLibro.darFecha().darFechaCompleta(), interfazLibreria.jtDatosLibro.getSelectedRow(), 5);
            
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Existe un error", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error en la imagen", "Error", JOptionPane.ERROR_MESSAGE);
        }
        //        libreria.agregarLibro(unLibro);
    }//GEN-LAST:event_btnGuardarNuevoLibroActionPerformed

    
    public void datosLibro(int i, Libro l){
        indice=i;
        txtNombreNuevoLibro.setText(l.darNombre());
        txtIdiomaNuevoLibro.setText(l.darIdioma());
        txtCantidadNuevoLibro.setText(String.valueOf(l.darCantidad()));
        ImageIcon img = new ImageIcon(getClass().getResource("/img/"+l.darImagen().darArcivo()));
        ImageIcon imagen = new ImageIcon(img.getImage().getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_SMOOTH));
        jLabel2.setIcon(imagen);
        
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date f = formatoFecha.parse(l.darFecha().darFechaCompleta());
            jDateChooser1.setDate(f);
        } catch (ParseException ex) {
            Logger.getLogger(InterfazEditarAutor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    private void btnCancelarNuevoLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarNuevoLibroActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarNuevoLibroActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(InterfazEditarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(InterfazEditarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(InterfazEditarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(InterfazEditarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
////        java.awt.EventQueue.invokeLater(new Runnable() {
////            public void run() {
////                
////                new InterfazEditarLibro().setVisible(true);
////            }
////        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarNuevoLibro;
    private javax.swing.JButton btnGuardarNuevoLibro;
    private javax.swing.JButton btnImagenNuevoLibro;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox jcAutorNuevo;
    private javax.swing.JComboBox jcEditorialNuevo;
    private javax.swing.JPanel jpEditarLibro;
    private javax.swing.JLabel lblAutorNuevoLibro;
    private javax.swing.JLabel lblCantidadNuevoLibro;
    private javax.swing.JLabel lblEditorialNuevoLibro;
    private javax.swing.JLabel lblFechaNuevo;
    private javax.swing.JLabel lblIdiomaNuevoLibro;
    private javax.swing.JLabel lblImagenNuevoLibro;
    private javax.swing.JLabel lblNombreNuevoLibro;
    private javax.swing.JTextField txtCantidadNuevoLibro;
    private javax.swing.JTextField txtIdiomaNuevoLibro;
    private javax.swing.JTextField txtNombreNuevoLibro;
    // End of variables declaration//GEN-END:variables
}
