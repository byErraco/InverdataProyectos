/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PuntoVenta.Ventanas;

import PuntoVenta.Modelos.ModeloCliente;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;

/**
 * Los campos de telefono y redes sociales aun no se guardan. Nota: El telefono
 * se debe guardar en la tabla de telefonos y relacionarlo al cliente.
 *
 * @author Programador01
 */
public class RegistroCliente extends javax.swing.JInternalFrame {

    private Venta venta;

    /**
     * Creates new form RegistroSimpleCliente
     *
     * @param venta
     */
    public RegistroCliente(Venta venta) {
        this.venta = venta;
        initComponents();
        crearHotKeys();
    }

    /**
     * Creates new form RegistroSimpleCliente
     *
     * @param venta Ventana de venta.
     * @param identificador Indicador del combobox. J,V,E,P.
     * @param documento Cedula, RIF o número de pasaporte de la persona
     */
    public RegistroCliente(Venta venta, char identificador, String documento) {
        this.venta = venta;
        initComponents();
        crearHotKeys();
        cmbTipoDocumento.setSelectedItem(identificador);
        txtDocumento.setText(documento);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContenedor = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblDocumento = new javax.swing.JLabel();
        cmbTipoDocumento = new javax.swing.JComboBox();
        txtDocumento = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        lblApellido = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaDireccion = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        lblTelefono = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        lblTwitter = new javax.swing.JLabel();
        lblFacebook = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtTwitter = new javax.swing.JTextField();
        txtFacebook = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Saphiro - Registro Cliente");

        pnlContenedor.setBackground(new java.awt.Color(32, 182, 155));

        btnRegistrar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnRegistrar.setText("<html><center>Registrar<br>F2</center></html>");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(32, 182, 155));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Obligatorios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 18), java.awt.Color.white)); // NOI18N

        lblDocumento.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblDocumento.setForeground(new java.awt.Color(255, 255, 255));
        lblDocumento.setText("CI / RIF:");

        cmbTipoDocumento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "V", "J", "E", "P" }));

        txtDocumento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocumentoActionPerformed(evt);
            }
        });
        txtDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDocumentoKeyTyped(evt);
            }
        });

        lblNombre.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre:");

        txtNombres.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresActionPerformed(evt);
            }
        });
        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresKeyTyped(evt);
            }
        });

        txtApellido.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });

        lblApellido.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblApellido.setForeground(new java.awt.Color(255, 255, 255));
        lblApellido.setText("Apellido:");

        lblDireccion.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblDireccion.setForeground(new java.awt.Color(255, 255, 255));
        lblDireccion.setText("Dirección:");

        txaDireccion.setColumns(20);
        txaDireccion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txaDireccion.setRows(5);
        jScrollPane1.setViewportView(txaDireccion);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblNombre)
                        .addComponent(lblDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtApellido, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(cmbTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNombres, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDocumento)
                    .addComponent(cmbTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblApellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(32, 182, 155));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Opcionales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 18), java.awt.Color.white)); // NOI18N

        lblTelefono.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblTelefono.setForeground(new java.awt.Color(255, 255, 255));
        lblTelefono.setText("Telefono:");

        lblCorreo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreo.setText("Correo:");

        lblTwitter.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblTwitter.setForeground(new java.awt.Color(255, 255, 255));
        lblTwitter.setText("Twitter:");

        lblFacebook.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblFacebook.setForeground(new java.awt.Color(255, 255, 255));
        lblFacebook.setText("Facebook:");
        lblFacebook.setToolTipText("");

        txtTelefono.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        txtCorreo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtTwitter.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtFacebook.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFacebook)
                    .addComponent(lblTwitter)
                    .addComponent(lblCorreo)
                    .addComponent(lblTelefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTelefono)
                    .addComponent(txtCorreo)
                    .addComponent(txtTwitter)
                    .addComponent(txtFacebook, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefono)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCorreo)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTwitter)
                    .addComponent(txtTwitter, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFacebook)
                    .addComponent(txtFacebook, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlContenedorLayout = new javax.swing.GroupLayout(pnlContenedor);
        pnlContenedor.setLayout(pnlContenedorLayout);
        pnlContenedorLayout.setHorizontalGroup(
            pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlContenedorLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlContenedorLayout.setVerticalGroup(
            pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        registrarCliente();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocumentoActionPerformed

    private void txtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresActionPerformed

    private void txtDocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDocumentoKeyTyped
        char aux = evt.getKeyChar();

        if (!Character.isDigit(aux)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDocumentoKeyTyped

    private void txtNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyTyped
        char aux = evt.getKeyChar();

        if (Character.isDigit(aux)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombresKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        char aux = evt.getKeyChar();

        if (Character.isDigit(aux)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        boolean valido = true;
        if ((!Character.isDigit(evt.getKeyChar()) && (evt.getKeyChar() != KeyEvent.VK_MINUS))) {
            evt.consume();
        } else if ((Character.isDigit(evt.getKeyChar())) && txtTelefono.getText().length() == 4) {
            evt.consume();
        } else if (txtTelefono.getText().length() != 4 && (evt.getKeyChar() == KeyEvent.VK_MINUS)) {
            evt.consume();
        } else if (txtTelefono.getText().length() > 11) {
            evt.consume();
        } else {
            valido = false;
        }
        if (evt.getKeyChar() == KeyEvent.VK_BACK_SPACE) {
            valido = false;
        }
        //Alerta.setVisible(valido);
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void crearHotKeys() {
        Action actCerrarVentana = new AbstractAction("actionCerrarVentanaCaja") {
            @Override
            public void actionPerformed(ActionEvent e) {
                cerrarVentana();
            }
        };
        Action actRegistrar = new AbstractAction("actionRegistrar") {
            @Override
            public void actionPerformed(ActionEvent e) {
                registrarCliente();
            }
        };

        actCerrarVentana.putValue(Action.ACTION_COMMAND_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_Q, ActionEvent.ALT_MASK));
        actRegistrar.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_F2, 0));

        pnlContenedor.getActionMap().put("actionCerrarVentanaCaja", actCerrarVentana);
        pnlContenedor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put((KeyStroke) actCerrarVentana.getValue(Action.ACTION_COMMAND_KEY), "actionCerrarVentanaCaja");

        pnlContenedor.getActionMap().put("actionRegistrar", actRegistrar);
        pnlContenedor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put((KeyStroke) actRegistrar.getValue(Action.ACCELERATOR_KEY), "actionRegistrar");

        InternalFrameAdapter listener = new InternalFrameAdapter() {
            @Override
            public void internalFrameClosed(InternalFrameEvent e) {
                venta.getTxtDocumento().requestFocus();
            }
        };
        this.addInternalFrameListener(listener);
    }

    private void cerrarVentana() {
        this.dispose();
    }

    private void registrarCliente() {
        String documento, nombre, apellido, direccion;
        char nacionalidad;
        int idCliente;

        boolean registrado;

        nacionalidad = cmbTipoDocumento.getSelectedItem().toString().charAt(0);
        documento = txtDocumento.getText();
        nombre = txtNombres.getText();
        apellido = txtApellido.getText();
        direccion = txaDireccion.getText();
        if (documento.isEmpty()) {
            Utilidades.Sonidos.beep();
            JOptionPane.showMessageDialog(null, "Documentos obligatorio", "Error", JOptionPane.ERROR_MESSAGE);
            txtDocumento.requestFocus();
            return;
        }
        if (nombre.isEmpty()) {
            Utilidades.Sonidos.beep();
            JOptionPane.showMessageDialog(null, "Nombre obligatorio", "Error", JOptionPane.ERROR_MESSAGE);
            txtNombres.requestFocus();
            return;
        }
        if (apellido.isEmpty() && !cmbTipoDocumento.getSelectedItem().toString().equalsIgnoreCase("J")) {
            Utilidades.Sonidos.beep();
            JOptionPane.showMessageDialog(null, "Apellido obligatorio", "Error", JOptionPane.ERROR_MESSAGE);
            txaDireccion.requestFocus();
            return;
        }
        if (direccion.isEmpty()) {
            Utilidades.Sonidos.beep();
            JOptionPane.showMessageDialog(null, "Direccion obligatoria", "Error", JOptionPane.ERROR_MESSAGE);
            txaDireccion.requestFocus();
            return;
        }
        idCliente = venta.menuPrincipal.getOBD().crearCliente(nombre, apellido, nacionalidad, documento, direccion);
        JOptionPane.showMessageDialog(null, "Usuario registrado correctamente", "Exito", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();

        if (idCliente > 0) {
            HashMap<String, String> mapCliente = venta.menuPrincipal.getOBD().getMapCliente(idCliente);

            ModeloCliente cliente = new ModeloCliente(mapCliente);

            String correo = txtCorreo.getText();
            if (!correo.isEmpty()) {
                cliente.setCorreo(correo);
            }
            String twitter = txtTwitter.getText();
            if (!twitter.isEmpty()) {
                cliente.setTwitter(twitter);
            }
            String facebook = txtFacebook.getText();
            if (!facebook.isEmpty()) {
                cliente.setFacebook(facebook);
            }
            String telefono = txtTelefono.getText();
            if (!telefono.isEmpty()) {
                List<String> listaTelefonos = new ArrayList<String>();
                listaTelefonos.add(telefono);
                cliente.setListaTelefonos(listaTelefonos);
            }
            int check = venta.menuPrincipal.getOBD().actualizarCliente(cliente);
            if (check != idCliente) {
//                System.err.println("ERROR GRAVE");
            }

            venta.crearVenta(nacionalidad, documento);
            venta.getCmbTipoDocumento().setSelectedItem(nacionalidad);
            venta.getTxtDocumento().setText(documento);

            //this.cerrarVentana();
            //JOptionPane.showMessageDialog(null, "Usuario registrado correctamente", "Exito", JOptionPane.ERROR_MESSAGE);
            //this.dispose();
        } else {
            Utilidades.Sonidos.beep();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox cmbTipoDocumento;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblDocumento;
    private javax.swing.JLabel lblFacebook;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTwitter;
    private javax.swing.JPanel pnlContenedor;
    private javax.swing.JTextArea txaDireccion;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtFacebook;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTwitter;
    // End of variables declaration//GEN-END:variables
}