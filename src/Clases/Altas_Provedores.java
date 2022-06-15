/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Conexion.Conectar;
import Conexion.Conexion;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jasam
 */
public class Altas_Provedores extends javax.swing.JFrame {

     Conexion cc = new Conexion();
    Connection cin = cc.getConexion();
    PreparedStatement ps;
    static ResultSet rs;
    String nomTabla, sql;
    String mensaje, respuesta;
    boolean proveedor, existencia;

    String HOST = "5000";
    int PUERTO = 5000;

    String IP1 = "192.168.1.88"; //Tabla Inventario
    String IP2 = "192.168.1.204"; //Tabla Pedido
    String IP3 = "10.10.4.218";  // Servidor 3  Tabla:Libros 
    
    
    public Altas_Provedores() {
        initComponents();
        vertodo();
    }
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        B_volver1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProveedores = 
        tablaProveedores = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JTextField();
        btnAlta = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Altas del Provedor");

        B_volver1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_go_back_60px_1.png"))); // NOI18N
        B_volver1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        B_volver1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_volver1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(B_volver1)
                .addGap(300, 300, 300)
                .addComponent(jLabel1)
                .addContainerGap(425, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(B_volver1)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1240, 82);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_search_24px.png"))); // NOI18N
        btnBuscar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 204, 255)));
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setFocusPainted(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscar);
        btnBuscar.setBounds(220, 140, 40, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Telefono");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(250, 350, 130, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Email");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 260, 150, 30);
        jPanel2.add(txtTelefono);
        txtTelefono.setBounds(250, 390, 200, 30);

        tablaProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaProveedores);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(460, 10, 770, 550);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_company_127px_1.png"))); // NOI18N
        jPanel2.add(jLabel6);
        jLabel6.setBounds(160, 10, 130, 110);
        jPanel2.add(txtEmail);
        txtEmail.setBounds(10, 300, 430, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Direccion");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(20, 440, 130, 30);
        jPanel2.add(txtDireccion);
        txtDireccion.setBounds(10, 480, 440, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Ciudad");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(20, 350, 130, 30);
        jPanel2.add(txtCiudad);
        txtCiudad.setBounds(10, 390, 200, 30);

        btnAlta.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAlta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_sell_50px.png"))); // NOI18N
        btnAlta.setText("Alta del Provedor");
        btnAlta.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 204)));
        btnAlta.setContentAreaFilled(false);
        btnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaActionPerformed(evt);
            }
        });
        jPanel2.add(btnAlta);
        btnAlta.setBounds(110, 540, 230, 40);
        jPanel2.add(txtNombre);
        txtNombre.setBounds(10, 220, 430, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Nombre del Provedor");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 170, 150, 40);
        jPanel2.add(txtCodigo);
        txtCodigo.setBounds(10, 140, 200, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Id del Provedor");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 100, 150, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 90, 1250, 690);

        setSize(new java.awt.Dimension(1260, 741));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaActionPerformed
         int telefono;
        nomTabla = "proveedor";
        comprobarExistencia("SELECT * FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA='dbo' AND TABLE_NAME = '" + nomTabla + "'");

        if (existencia) {

            try {
                // Armamos la sentencia SQL que utilizaremos
                PreparedStatement pst = cin.prepareStatement("INSERT INTO " + nomTabla
                        + " (id_proveedor, nombre, telefono, email, ciudad, direccion) "
                        + "VALUES (?,?,?,?,?,?)");
                // Obtenemos los valores a insertar de los campos de texto de la interfaz gráfica
                pst.setString(1, txtCodigo.getText());
                pst.setString(2, txtNombre.getText());
                pst.setString(3, txtTelefono.getText());
                pst.setString(4, txtEmail.getText());
                pst.setString(5, txtCiudad.getText());
                pst.setString(6, txtDireccion.getText());  

                  int x = pst.executeUpdate(); // Validamos el estado de la consulta
                if (x > 0) {  // Si la inserción se llevo a cabo, mostramos un mensaje en un cuadro de dialogo
                    JOptionPane.showMessageDialog(null, "Se guardó correctarmente");

                    // Si el registro se hizo correctamente, mostramos todo el contenido de la BDD
                    sql = "SELECT * FROM " + nomTabla + ";";

                    limpiar();

                    visualizar(); // Mostramos los datos
                }
            } catch (Exception we) { // Cualquier error arrojado por la BDD será contenido aqui
                // Mostramos de manera gráfica dicho error
                JOptionPane.showMessageDialog(null, we, "Error", JOptionPane.WARNING_MESSAGE);
            }
        } else {

            HOST = IP2;
            // Armamos la sentencia SQL de tipo inserción y se la pasamos al metodo
            mensaje = "INSERT INTO " + nomTabla
                        + " (id_provedor, nombre, telefono, email, ciudad, direccion) VALUES ('"
                    + txtCodigo.getText() + "','" + txtNombre.getText() + "','" + txtTelefono.getText() + "','"
                    + txtEmail.getText() + "','" + txtCiudad.getText() + "','" + txtDireccion.getText() + "');";
            sockerCliente();
            limpiar();
        }
    }//GEN-LAST:event_btnAltaActionPerformed

    private void B_volver1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_volver1MouseClicked
        // TODO add your handling code here:
     Provedores p= new Provedores();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_B_volver1MouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        boolean codigo = consultar(txtCodigo.getText());

        if(codigo == true){
            JOptionPane.showMessageDialog(rootPane, "Codigo No Disponible");

        }else{
            JOptionPane.showMessageDialog(rootPane, "Codigo Disponible");

        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    
      public boolean consultar(String codigo) {

        boolean cod = false;
        String sql = "SELECT * FROM " + proveedor + " WHERE id_proveedor='" + codigo + "'";

        try {
            Statement st = cin.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                cod = true;
            } else {
                cod = false;
            }

        } catch (Exception ex) {
            System.out.print("Error" + ex);
        }
        return cod;
    }

    public void visualizar() {

        ResultSet rs = null;
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("ID Proveedor");
        dt.addColumn("Nombre");
        dt.addColumn("Telefono");
        dt.addColumn("Email");
        dt.addColumn("Ciudad");
        dt.addColumn("Dirección");
      
        tablaProveedores.setModel(dt);

        try {
            Object[] fila = new Object[6];
            Statement st = cin.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                fila[0] = rs.getString(1);
                fila[1] = rs.getString(2);
                fila[2] = rs.getString(3);
                fila[3] = rs.getString(4);
                fila[4] = rs.getString(5);
                fila[5] = rs.getString(6);
                dt.addRow(fila);
            }
            tablaProveedores.setModel(dt);
        } catch (Exception e) {
            System.out.println("*** Error al visualizar la tabla *** ");

        }

    }

    public void vertodo() {
        proveedor = true; // Habilitamos una bandera
        nomTabla = "proveedor"; // Especificacmos el nombre de la tabla de la cual se requieren los datos

        comprobarExistencia("SELECT * FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA='dbo' AND TABLE_NAME = '" + nomTabla + "'");
        if (existencia) {

            sql = "SELECT * FROM " + nomTabla + ";";  // Armamos la sentencia SQL

            visualizar(); // Método que muestra gráficammente la consulta

        } else {

            HOST = IP1; // Le pasamoa la IP al HOST con el cual se conectará el cliente
            mensaje = "SELECT * FROM " + nomTabla + ";"; // Armamos la sentencia SQL
            sockerCliente(); // Llamamos el método que se encargará de la comunicación entre el cliente y el servidor
        }
    }

    public void sockerCliente() {

        DefaultTableModel dt = new DefaultTableModel(); // Definimos una tabla temporal para guardar los datos

        dt.addColumn("ID Proveedor");
        dt.addColumn("Nombre");
        dt.addColumn("Telefono");
        dt.addColumn("Email");
        dt.addColumn("Ciudad");
        dt.addColumn("Dirección");

        String[] datos = new String[6]; // Declaramos un vector para guardar los datos

        // Creamos unas variables que nos ayudarán posteriormente
        int cont = 0, fin = 0;
        String aux = "";

        //Declaramos una variables especiales para los mensajes de entrada y salida
        DataInputStream in;  // para las instrucciones de entrada (seridor-cliente
        DataOutputStream out;   // para las instrucciones de salida (cliente-servidor)

        try {
            //Instacioamos la clase Socket, creamos un cliente que apunta a la IP y puerto del servidor
            Socket sc = new Socket(HOST, PUERTO); // dichos parámetros han sido especificados anteriormente

            in = new DataInputStream(sc.getInputStream()); // variable que guarda los mensajes que manda el servidor (recibe)(respuesta)
            out = new DataOutputStream(sc.getOutputStream()); // variableque guarda los mensajes que le manda al servidor (manda)(peticion)

            out.writeUTF(mensaje); // manda mensaje al servidor (peticion)

            System.out.println("Mensaje del cliente: " + mensaje); // Muestro el mensaje enviado en la ventana de Output

            respuesta = in.readUTF(); // recibe el mensaje del servidor (respuesta)
            System.out.println("Respuesta del servidor: " + respuesta); // Muestro el mensaje

            if ((respuesta.contains("Conectado")) || respuesta.contains("Desconectado") || respuesta.contains("Se") || respuesta.contains("Ha")) {
                if (respuesta.contains("insertó")) {
                    JOptionPane.showMessageDialog(null, "Registro Guardado");

                } else {
                    if (respuesta.contains("actualizó")) {
                        JOptionPane.showMessageDialog(null, "Registro Actualizado");

                    } else {
                        if (respuesta.contains("Elimino")) {
                            JOptionPane.showMessageDialog(null, "Registro Eliminado");
                        } else {

                        }
                    }
                }

            } else {
                if (respuesta.equals("(0)")) {

                } else {

                    fin = respuesta.lastIndexOf(",");
                    cont = Integer.parseInt(respuesta.substring(1, 2));
                    respuesta = respuesta.substring(3, fin + 1);
                }
            }

            if (respuesta.equals("")) {
                sc.close();
            }

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Servidor no encontrado - Verifique la dirección IP", "Error", JOptionPane.WARNING_MESSAGE);
        }

        proveedor = false;
    }

    public void comprobarExistencia(String sql) {
        try {
            Statement q = cin.createStatement();
            ResultSet w = q.executeQuery(sql);

            String[] consulta = new String[1];
            String aux = "";

            while (w.next()) {
                // codigo
                aux = consulta[0] = w.getString(1);
            }

            if (aux.isEmpty()) {
                existencia = false;
            } else {
                existencia = true;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
            System.out.println("aqui " + ex);
        }
    }

    
    public void limpiar(){
        txtCodigo.setText("");
        txtNombre.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
        txtEmail.setText("");
        txtCiudad.setText("");
    }
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Altas_Provedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Altas_Provedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Altas_Provedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Altas_Provedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Altas_Provedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel B_volver1;
    private javax.swing.JButton btnAlta;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProveedores;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
