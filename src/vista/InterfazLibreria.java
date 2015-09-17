/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.Autor;
import modelo.Cliente;
import modelo.Editorial;
import modelo.Fecha;
import modelo.Libreria;
import modelo.Libro;
import modelo.Venta;

/**
 *
 * @author Mao
 */
public class InterfazLibreria extends javax.swing.JFrame {

    private TableRowSorter tr; //creamos el filtro

    private Libreria libreria;
    DefaultTableModel model, modelEditorial, modelLibro, modelCompra;

    /**
     * Creates new form InterfazLibreria
     */
    public InterfazLibreria() {
        libreria = new Libreria();
        initComponents();

        model = (DefaultTableModel) jtDatosAutor.getModel();
        modelEditorial = (DefaultTableModel) jtDatosEditorial.getModel();
        modelLibro = (DefaultTableModel) jtDatosLibro.getModel();
        modelCompra = (DefaultTableModel) jtDetalleCopra.getModel();
        setLocationRelativeTo(null);
    }

    public void mostrarTablaLibros() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Idioma");
        modelo.addColumn("Autor");
        modelo.addColumn("Editorial");
        modelo.addColumn("Precio");
        jtDatosLibro.setModel(modelo);

        String[] datos = new String[5];
        datos[0] = "Cien años de soledad";
        datos[1] = "Español";
        datos[2] = "Gabriel Garcia M.";
        datos[3] = "McGraw-Hill";
        datos[4] = "$" + String.valueOf(25000);
        modelo.addRow(datos);
    }

    public void mostrarTablaDetalleCompra() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Autor");
        modelo.addColumn("Editorial");
        modelo.addColumn("Subtotal");
        jtDetalleCopra.setModel(modelo);
    }

    public ArrayList<Editorial> darListaEditorial() {
        return libreria.darListaEditorial();
    }

    public void agregarEditorial(Editorial editorial) {
        libreria.agregarEditorial(editorial);
    }

    public Editorial darEditorial(int indice) {
        return libreria.buscarEditorial(indice);
    }

    void modificarEditorial(int indice, Editorial editorial) {
        libreria.modificarEditorial(indice, editorial);
    }

    public void eliminarEditorial(int indice) {
        libreria.eliminarEditorial(indice);
    }

    public ArrayList<Autor> darListaAutor() {
        return libreria.darListaAutor();
    }

    public void modificarAutor(int i, Autor unAutor) {
        libreria.modificarAutor(i, unAutor);
    }

    public Autor darAutor(int indice) {
        return libreria.buscarAutor(indice);
    }

    public void agregarAutor(Autor autor) {
        libreria.agregarAutor(autor);
    }

    public void eliminarAutor(int indice) {
        libreria.eliminarAutor(indice);
    }

    public void agregarLibro(Libro unLibro) {
        libreria.agregarLibro(unLibro);
    }

    public ArrayList<Libro> darListaLibro() {
        return libreria.darListaLibro();
    }

    public void modificarLibro(int indice, Libro unLibro) {
        libreria.modificarLibro(indice, unLibro);
    }

    public void eliminarLibro(int indice) {
//       libreria.eliminarLibro(null)
    }

    public void agregarVenta(Venta unaVenta) {
        libreria.agregarVenta(unaVenta);
    }

//    public void mostrarTablaAutores() {
//        ArrayList<Autor> listaAutor = libreria.darListaAutor();
//        Iterator it = listaAutor.iterator();
//        while (it.hasNext()) {
//            Autor a = (Autor) it.next();
//            model.addRow(new Object[]{a.darNombre(), a.darApellido(), a.darIdentificacion(), a.darNacionalidad(), a.darFecha().darFechaCompleta()});
//        
//        }
//        
////        for (int i = 0; i < listaAutor.size(); i++) {
////            Autor a = (Autor) listaAutor.get(i);
////            model.addRow(new Object[]{a.darNombre(), a.darApellido(), a.darIdentificacion(), a.darNacionalidad(), a.darFecha().darFechaCompleta()});
////        }
//        
////        Object[] columns = {"Nombre", "Apellido", "Identificacion", "Nacionalidad", "Fecha nacimiento"};
////        modelo = new DefaultTableModel(null, columns);
////
////        for (int i = 0; i < listaAutor.size(); i++) {
////            Autor a = (Autor) listaAutor.get(i);
////            modelo.addRow(new Object[]{a.darNombre(), a.darApellido(), a.darIdentificacion(), a.darNacionalidad(), a.darFecha().darFechaCompleta()});
////        }
////        jtDatosAutor.setModel(modelo);
////        System.out.println("Tamaño de la lista: " + listaAutor.size());
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPanen = new javax.swing.JTabbedPane();
        jpLibro = new javax.swing.JPanel();
        pnlListaLibros = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDatosLibro = new javax.swing.JTable();
        btnAgregarLibro = new javax.swing.JButton();
        btnEditarLibro = new javax.swing.JButton();
        btnEliminarLibro = new javax.swing.JButton();
        btnComprarLibro = new javax.swing.JButton();
        pnlDetalleCompra = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtDetalleCopra = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        jpEditorial = new javax.swing.JPanel();
        pnlDatosEditorial = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtDatosEditorial = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnAgregarEditorial = new javax.swing.JButton();
        btnEditarEditorial = new javax.swing.JButton();
        btnEliminarEditorial = new javax.swing.JButton();
        lblBuscarEditorial = new javax.swing.JLabel();
        txtBuscarEditorial = new javax.swing.JTextField();
        jpAutor = new javax.swing.JPanel();
        pnlListaAutores = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtDatosAutor = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnAgregarAutor = new javax.swing.JButton();
        btnEditarAutor = new javax.swing.JButton();
        btnEliminarAutor = new javax.swing.JButton();
        txtBuscarAutor = new javax.swing.JTextField();
        lblBuscarAutor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Book Store");
        setResizable(false);

        pnlListaLibros.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle del catálogo"));

        jtDatosLibro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre del libro", "Nombre del Autor", "Editorial", "Precio", "Cantidad", "Fecha de publicación"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtDatosLibro);

        btnAgregarLibro.setText("Agregar Libro");
        btnAgregarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarLibroActionPerformed(evt);
            }
        });

        btnEditarLibro.setText("Editar Libro");
        btnEditarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarLibroActionPerformed(evt);
            }
        });

        btnEliminarLibro.setText("Eliminar Libro");

        btnComprarLibro.setText("Comprar Libro");
        btnComprarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarLibroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlListaLibrosLayout = new javax.swing.GroupLayout(pnlListaLibros);
        pnlListaLibros.setLayout(pnlListaLibrosLayout);
        pnlListaLibrosLayout.setHorizontalGroup(
            pnlListaLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListaLibrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlListaLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(pnlListaLibrosLayout.createSequentialGroup()
                        .addComponent(btnAgregarLibro)
                        .addGap(60, 60, 60)
                        .addComponent(btnEditarLibro)
                        .addGap(77, 77, 77)
                        .addComponent(btnEliminarLibro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 204, Short.MAX_VALUE)
                        .addComponent(btnComprarLibro)))
                .addContainerGap())
        );
        pnlListaLibrosLayout.setVerticalGroup(
            pnlListaLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListaLibrosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlListaLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarLibro)
                    .addComponent(btnEditarLibro)
                    .addComponent(btnEliminarLibro)
                    .addComponent(btnComprarLibro))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pnlDetalleCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle del carrito de compras"));

        jtDetalleCopra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre del libro", "Datos del cliente", "Cantidad", "Fecha de compra"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtDetalleCopra.setEnabled(false);
        jScrollPane2.setViewportView(jtDetalleCopra);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDetalleCompraLayout = new javax.swing.GroupLayout(pnlDetalleCompra);
        pnlDetalleCompra.setLayout(pnlDetalleCompraLayout);
        pnlDetalleCompraLayout.setHorizontalGroup(
            pnlDetalleCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetalleCompraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDetalleCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE)
                    .addGroup(pnlDetalleCompraLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlDetalleCompraLayout.setVerticalGroup(
            pnlDetalleCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetalleCompraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpLibroLayout = new javax.swing.GroupLayout(jpLibro);
        jpLibro.setLayout(jpLibroLayout);
        jpLibroLayout.setHorizontalGroup(
            jpLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpLibroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlDetalleCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlListaLibros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpLibroLayout.setVerticalGroup(
            jpLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpLibroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlListaLibros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlDetalleCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPanen.addTab("Libros", jpLibro);

        pnlDatosEditorial.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de la editorial"));

        jtDatosEditorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jtDatosEditorial);

        btnAgregarEditorial.setText("Agregar Editorial");
        btnAgregarEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEditorialActionPerformed(evt);
            }
        });

        btnEditarEditorial.setText("Editar Editorial");
        btnEditarEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarEditorialActionPerformed(evt);
            }
        });

        btnEliminarEditorial.setText("Eliminar Editorial");
        btnEliminarEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEditorialActionPerformed(evt);
            }
        });

        lblBuscarEditorial.setText("Buscar Editorial:");

        txtBuscarEditorial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarEditorialKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAgregarEditorial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(btnEditarEditorial)
                .addGap(35, 35, 35)
                .addComponent(btnEliminarEditorial)
                .addGap(21, 21, 21))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(lblBuscarEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtBuscarEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarEditorial)
                    .addComponent(btnEditarEditorial)
                    .addComponent(btnEliminarEditorial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuscarEditorial)
                    .addComponent(txtBuscarEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout pnlDatosEditorialLayout = new javax.swing.GroupLayout(pnlDatosEditorial);
        pnlDatosEditorial.setLayout(pnlDatosEditorialLayout);
        pnlDatosEditorialLayout.setHorizontalGroup(
            pnlDatosEditorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosEditorialLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(pnlDatosEditorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(177, Short.MAX_VALUE))
        );
        pnlDatosEditorialLayout.setVerticalGroup(
            pnlDatosEditorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosEditorialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(159, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpEditorialLayout = new javax.swing.GroupLayout(jpEditorial);
        jpEditorial.setLayout(jpEditorialLayout);
        jpEditorialLayout.setHorizontalGroup(
            jpEditorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEditorialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDatosEditorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpEditorialLayout.setVerticalGroup(
            jpEditorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEditorialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDatosEditorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPanen.addTab("Editoriales", jpEditorial);

        pnlListaAutores.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del autor"));

        jtDatosAutor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Identificacion", "Nacionalidad", "Fecha Nacimiento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jtDatosAutor);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnAgregarAutor.setText("Agregar Autor");
        btnAgregarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAutorActionPerformed(evt);
            }
        });

        btnEditarAutor.setText("Editar Autor");
        btnEditarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarAutorActionPerformed(evt);
            }
        });

        btnEliminarAutor.setText("Eliminar Autor");
        btnEliminarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAutorActionPerformed(evt);
            }
        });

        txtBuscarAutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarAutorKeyTyped(evt);
            }
        });

        lblBuscarAutor.setText("Buscar Autor:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblBuscarAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(btnAgregarAutor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEditarAutor)
                        .addGap(93, 93, 93)
                        .addComponent(btnEliminarAutor))
                    .addComponent(txtBuscarAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(124, 124, 124))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarAutor)
                    .addComponent(btnEditarAutor)
                    .addComponent(btnEliminarAutor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBuscarAutor))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout pnlListaAutoresLayout = new javax.swing.GroupLayout(pnlListaAutores);
        pnlListaAutores.setLayout(pnlListaAutoresLayout);
        pnlListaAutoresLayout.setHorizontalGroup(
            pnlListaAutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListaAutoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlListaAutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlListaAutoresLayout.setVerticalGroup(
            pnlListaAutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListaAutoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpAutorLayout = new javax.swing.GroupLayout(jpAutor);
        jpAutor.setLayout(jpAutorLayout);
        jpAutorLayout.setHorizontalGroup(
            jpAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAutorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlListaAutores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpAutorLayout.setVerticalGroup(
            jpAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAutorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlListaAutores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPanen.addTab("Autores", jpAutor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPanen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPanen, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarLibroActionPerformed

        InterfazEditarLibro edit = new InterfazEditarLibro();
        edit.setEnabled(true);
        edit.setLocationRelativeTo(this);
        edit.setVisible(true);
    }//GEN-LAST:event_btnEditarLibroActionPerformed

    private void btnAgregarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarLibroActionPerformed

        InterfazAgregarLibro win = new InterfazAgregarLibro(this);
        win.setEnabled(true);
        win.setLocationRelativeTo(this);
//        win.setModal(true);
        win.setVisible(true);
    }//GEN-LAST:event_btnAgregarLibroActionPerformed

    private void btnAgregarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAutorActionPerformed
        InterfazAgegarAutor ia = new InterfazAgegarAutor(this);
        ia.setEnabled(true);
        ia.setLocationRelativeTo(this);
        ia.setVisible(true);

    }//GEN-LAST:event_btnAgregarAutorActionPerformed

    private void btnEditarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarAutorActionPerformed
        ArrayList<Autor> lista = libreria.darListaAutor();
        if (jtDatosAutor.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un elemento de la lista", "Seleccionar elemento", JOptionPane.ERROR_MESSAGE);
        } else {
            Autor a = (Autor) lista.get(jtDatosAutor.getSelectedRow());
            InterfazEditarAutor ed = new InterfazEditarAutor(this);
            ed.datosAutor(jtDatosAutor.getSelectedRow(), a);
            ed.setEnabled(true);
            ed.setLocationRelativeTo(this);
            ed.setVisible(true);
        }
    }//GEN-LAST:event_btnEditarAutorActionPerformed

    private void btnAgregarEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEditorialActionPerformed
        InterfazAgregarEditorial ia = new InterfazAgregarEditorial(this);
        ia.setEnabled(true);
        ia.setLocationRelativeTo(this);
        ia.setVisible(true);
    }//GEN-LAST:event_btnAgregarEditorialActionPerformed

    private void btnEditarEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarEditorialActionPerformed
        ArrayList<Editorial> lista = libreria.darListaEditorial();
        if (jtDatosEditorial.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un elemento de la lista", "Seleccionar elemento", JOptionPane.ERROR_MESSAGE);
        } else {
            Editorial e = (Editorial) lista.get(jtDatosEditorial.getSelectedRow());
            InterfazEditarEditorial ed = new InterfazEditarEditorial(this);
            ed.datosEditorial(jtDatosEditorial.getSelectedRow(), e);
            ed.setEnabled(true);
            ed.setLocationRelativeTo(this);
            ed.setVisible(true);
        }
    }//GEN-LAST:event_btnEditarEditorialActionPerformed

    private void btnEliminarEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEditorialActionPerformed
        if (jtDatosEditorial.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un elemento de la lista", "Eliminar elemento", JOptionPane.ERROR_MESSAGE);
        } else {
            int indice = jtDatosEditorial.getSelectedRow();
            eliminarEditorial(indice);
            modelEditorial.removeRow(indice);
            JOptionPane.showMessageDialog(this, "Eliminación exitosa!!!", "Eliminar elemento", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarEditorialActionPerformed

    private void btnEliminarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAutorActionPerformed
        if (jtDatosAutor.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un elemento de la lista", "Eliminar elemento", JOptionPane.ERROR_MESSAGE);
        } else {
            int indice = jtDatosAutor.getSelectedRow();
            eliminarAutor(indice);
            model.removeRow(indice);
            JOptionPane.showMessageDialog(this, "Eliminación exitosa!!!", "Eliminar elemento", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarAutorActionPerformed

//    public void filtro() {
//       tr.setRowFilter(RowFilter.regexFilter(txtBuscarAutor.getText(), 0));//el 0 es el numero de columna a filtrar
//    }

    private void txtBuscarAutorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarAutorKeyTyped
        txtBuscarAutor.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e) {
                String cadena = (txtBuscarAutor.getText()).trim();
                txtBuscarAutor.setText(cadena);
                repaint();
                tr.setRowFilter(RowFilter.regexFilter(txtBuscarAutor.getText(), 0));//Esta linea es practicamente el FILTRO, el 0 es el numero de columna a filtrar
                //filtro();
            }
        });
        tr = new TableRowSorter(jtDatosAutor.getModel());
        jtDatosAutor.setRowSorter(tr);
    }//GEN-LAST:event_txtBuscarAutorKeyTyped

    private void txtBuscarEditorialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarEditorialKeyTyped
        txtBuscarEditorial.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e) {
                String cadena = (txtBuscarEditorial.getText()).trim();
                txtBuscarEditorial.setText(cadena);
                repaint();
                tr.setRowFilter(RowFilter.regexFilter(txtBuscarEditorial.getText(), 0));//Esta linea es practicamente el FILTRO, el 0 es el numero de columna a filtrar
                //filtro();
            }
        });
        tr = new TableRowSorter(jtDatosEditorial.getModel());
        jtDatosEditorial.setRowSorter(tr);
    }//GEN-LAST:event_txtBuscarEditorialKeyTyped

    private void btnComprarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarLibroActionPerformed

        if (jtDatosLibro.getSelectedRow() != -1) {
            int indice = jtDatosLibro.getSelectedRow();
            Libro unLibro = libreria.buscarLibro(indice);
            JDialog win = new JDialog();
            win.setLayout(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            final JLabel lblNombre = new JLabel("Nombre del Cliente:");
            final JLabel lblApellido = new JLabel("Apellido(s):");
            final JLabel lblIdentificacion = new JLabel("Identificación");
            final JLabel lblCantidad = new JLabel("Cantidad:");
            final JLabel lblDatos = new JLabel("Nombre del libro: " + unLibro.darNombre());

            final JTextField txtNombre = new JTextField(20);
            final JTextField txtApellido = new JTextField(20);
            final JTextField txtIdentificacion = new JTextField(20);
            final JTextField txtCantidad = new JTextField(20);

            final JButton btnAceptar = new JButton("Aceptar");
            final JButton btnCancelar = new JButton("Cancelar");

            final JPanel panelSuperior = new JPanel();
            panelSuperior.setLayout(new GridBagLayout());
            gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.insets = new Insets(5, 5, 5, 5);
            panelSuperior.add(lblDatos, gbc);

            final JPanel panelCentro = new JPanel();
            panelCentro.setLayout(new GridBagLayout());
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.insets = new Insets(5, 5, 5, 5);
            panelCentro.add(lblNombre, gbc);

            gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 1;
            gbc.insets = new Insets(5, 5, 5, 5);
            panelCentro.add(lblApellido, gbc);

            gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 2;
            gbc.insets = new Insets(5, 5, 5, 5);
            panelCentro.add(lblIdentificacion, gbc);

            gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 3;
            gbc.insets = new Insets(5, 5, 5, 5);
            panelCentro.add(lblCantidad, gbc);

            gbc = new GridBagConstraints();
            gbc.gridx = 1;
            gbc.gridy = 0;
            gbc.insets = new Insets(5, 5, 5, 5);
            panelCentro.add(txtNombre, gbc);

            gbc = new GridBagConstraints();
            gbc.gridx = 1;
            gbc.gridy = 1;
            gbc.insets = new Insets(5, 5, 5, 5);
            panelCentro.add(txtApellido, gbc);

            gbc = new GridBagConstraints();
            gbc.gridx = 1;
            gbc.gridy = 2;
            gbc.insets = new Insets(5, 5, 5, 5);
            panelCentro.add(txtIdentificacion, gbc);

            gbc = new GridBagConstraints();
            gbc.gridx = 1;
            gbc.gridy = 3;
            gbc.insets = new Insets(5, 5, 5, 5);
            panelCentro.add(txtCantidad, gbc);

            final JPanel panelInferior = new JPanel();
            panelInferior.setLayout(new GridBagLayout());
            gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.insets = new Insets(5, 5, 5, 5);
            panelInferior.add(btnAceptar, gbc);

            gbc = new GridBagConstraints();
            gbc.gridx = 1;
            gbc.gridy = 0;
            gbc.insets = new Insets(5, 5, 5, 5);
            panelInferior.add(btnCancelar, gbc);

            gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.insets = new Insets(5, 5, 5, 5);
            win.add(panelSuperior, gbc);
            gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 1;
            gbc.insets = new Insets(5, 5, 5, 5);
            win.add(panelCentro, gbc);
            gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 2;
            gbc.insets = new Insets(5, 5, 5, 5);
            win.add(panelInferior, gbc);

            btnAceptar.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    try {

                        Fecha unaFecha = new Fecha();
                        unaFecha.fechaHoy();
                        int cantidad = Integer.parseInt(txtCantidad.getText());
                        Cliente unCliente = new Cliente(txtNombre.getText(), txtApellido.getText(), txtIdentificacion.getText());
                        Venta unaVenta = new Venta(unLibro, unaFecha, unCliente, cantidad);
                        if (unaVenta.realizarVenta() || cantidad < unLibro.darCantidad()) {
                            JOptionPane.showMessageDialog(win, "La venta se realizó con éxito", "Libreria", JOptionPane.INFORMATION_MESSAGE);
                            agregarVenta(unaVenta);
                            modificarLibro(indice, unaVenta.cambiarLibro());
                            modelLibro.setValueAt(unaVenta.cambiarLibro().darCantidad(), indice, 4);
                            modelCompra.addRow(new Object[]{unaVenta.cambiarLibro().darNombre(), unaVenta.darCliente().darNombre() + " " + unaVenta.darCliente().darApellido(), unaVenta.darCantidad(), unaVenta.darFecha().toString()});
                            win.dispose();
                        } else {
                            JOptionPane.showMessageDialog(win, "No se pudo reaizar la venta", "Libreria", JOptionPane.ERROR_MESSAGE);
                        }
                    } catch (NumberFormatException en) {
                        JOptionPane.showMessageDialog(win, "Error digite un número valido", "Libreria", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });

            btnCancelar.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    win.dispose();
                }
            });

            win.setLocationRelativeTo(this);
            win.setModal(true);
            win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            win.pack();
            win.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un libro", " Libreria", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnComprarLibroActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

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
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazLibreria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazLibreria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazLibreria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazLibreria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazLibreria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarAutor;
    private javax.swing.JButton btnAgregarEditorial;
    private javax.swing.JButton btnAgregarLibro;
    private javax.swing.JButton btnComprarLibro;
    private javax.swing.JButton btnEditarAutor;
    private javax.swing.JButton btnEditarEditorial;
    private javax.swing.JButton btnEditarLibro;
    private javax.swing.JButton btnEliminarAutor;
    private javax.swing.JButton btnEliminarEditorial;
    private javax.swing.JButton btnEliminarLibro;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPanen;
    private javax.swing.JPanel jpAutor;
    private javax.swing.JPanel jpEditorial;
    private javax.swing.JPanel jpLibro;
    public javax.swing.JTable jtDatosAutor;
    public javax.swing.JTable jtDatosEditorial;
    private javax.swing.JTable jtDatosLibro;
    private javax.swing.JTable jtDetalleCopra;
    private javax.swing.JLabel lblBuscarAutor;
    private javax.swing.JLabel lblBuscarEditorial;
    private javax.swing.JPanel pnlDatosEditorial;
    private javax.swing.JPanel pnlDetalleCompra;
    private javax.swing.JPanel pnlListaAutores;
    private javax.swing.JPanel pnlListaLibros;
    private javax.swing.JTextField txtBuscarAutor;
    private javax.swing.JTextField txtBuscarEditorial;
    // End of variables declaration//GEN-END:variables

}
