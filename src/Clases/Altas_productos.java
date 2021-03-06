/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Conexion.Conectar;
import Conexion.Conexion;
import Conexion.Server;
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
public class Altas_productos extends javax.swing.JFrame {

    Conexion cc = new Conexion();
    Connection cin = cc.getConexion();
    PreparedStatement ps;
    static ResultSet rs;
    String nomTabla, sql;
    String mensaje, respuesta;
    boolean inventario, existencia;

    String HOST = "5000";
    int PUERTO = 5000;

    String IP1 = "192.168.0.102"; //Tabla provedores
    String IP2 = "192.168.0.103"; //Tabla Clientes
    String IP3 = "192.168.0.105";  // Tabla Inventario

    /**
     * Creates new form Altas_productos
     */
    public Altas_productos() {
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
        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtExistencia = new javax.swing.JTextField();
        btnAlta = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = 
        tablaProductos = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Altas de productos");

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
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(428, Short.MAX_VALUE))
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
        jPanel1.setBounds(0, 0, 1170, 89);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Codigo del Producto");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 170, 150, 30);
        getContentPane().add(txtCodigo);
        txtCodigo.setBounds(10, 210, 200, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Nombre del Producto");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 250, 150, 40);
        getContentPane().add(txtNombre);
        txtNombre.setBounds(10, 300, 200, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Precio del producto");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 350, 150, 30);
        getContentPane().add(txtPrecio);
        txtPrecio.setBounds(10, 400, 200, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Numero de Piezas");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 450, 130, 30);
        getContentPane().add(txtExistencia);
        txtExistencia.setBounds(10, 500, 200, 30);

        btnAlta.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAlta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_plus_24px.png"))); // NOI18N
        btnAlta.setText("Alta de producto");
        btnAlta.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 204)));
        btnAlta.setContentAreaFilled(false);
        btnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlta);
        btnAlta.setBounds(20, 580, 230, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_product_documents_60px.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(100, 90, 60, 70);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_search_24px.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscar);
        btnBuscar.setBounds(224, 117, 57, 33);

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaProductos);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(300, 10, 770, 550);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 90, 1070, 580);

        setSize(new java.awt.Dimension(1089, 712));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaActionPerformed

        nomTabla = "inventario";
        double precio;
        comprobarExistencia("SELECT * FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA='dbo' AND TABLE_NAME = '" + nomTabla + "'");

        if (existencia) {
            try {
                // Armamos la sentencia SQL que utilizaremos
                PreparedStatement pst = cin.prepareStatement("INSERT INTO " + nomTabla
                        + " (idProducto, descripcionproducto, cantidad, preciounidad) VALUES (?,?,?,?)");
                // Obtenemos los valores a insertar de los campos de texto de la interfaz gr??fica
                pst.setString(1, txtCodigo.getText());
                pst.setString(2, txtNombre.getText());
                pst.setString(3, txtExistencia.getText());
                pst.setDouble(4, precio = Double.parseDouble(txtPrecio.getText()));

                int x = pst.executeUpdate(); // Validamos el estado de la consulta
                if (x > 0) {  // Si la inserci??n se llevo a cabo, mostramos un mensaje en un cuadro de dialogo
                    JOptionPane.showMessageDialog(null, "Se guard?? correctarmente");

                    // Si el registro se hizo correctamente, mostramos todo el contenido de la BDD
                    sql = "SELECT * FROM " + nomTabla + ";";

                    limpiar();

                    visualizar(); // Mostramos los datos
                }
            } catch (Exception we) { // Cualquier error arrojado por la BDD ser?? contenido aqui
                // Mostramos de manera gr??fica dicho error
                JOptionPane.showMessageDialog(null, we, "Error", JOptionPane.WARNING_MESSAGE);
            }
        } else {

            HOST = IP3;
            // Armamos la sentencia SQL de tipo inserci??n y se la pasamos al metodo
            mensaje = "INSERT INTO " + nomTabla
                    + "(idProducto, descripcionproducto, cantidad, preciounidad) VALUES ('"
                    + txtCodigo.getText() + "','" + txtNombre.getText() + "','" + txtPrecio.getText() + "','"
                    + txtExistencia.getText() + "');";
            sockerCliente();
            limpiar();
        }

    }//GEN-LAST:event_btnAltaActionPerformed

    private void B_volver1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_volver1MouseClicked
        // TODO add your handling code here:
        Almacen p = new Almacen();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_B_volver1MouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        boolean codigo = consultar(txtCodigo.getText());

        if (codigo == true) {
            JOptionPane.showMessageDialog(rootPane, "Codigo No Disponible");

        } else {
            JOptionPane.showMessageDialog(rootPane, "Codigo Disponible");

        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    public boolean consultar(String codigo) {

        boolean cod = false;
        String sql = "SELECT * FROM " + inventario + " WHERE idproducto='" + codigo + "'";

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
        dt.addColumn("Codigo");
        dt.addColumn("Descripcion");
        dt.addColumn("Piezas");
        dt.addColumn("Precio");
        tablaProductos.setModel(dt);

        try {
            Object[] fila = new Object[5];
            Statement st = cin.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                fila[0] = rs.getString(1);
                fila[1] = rs.getString(2);
                fila[2] = rs.getString(3);
                fila[3] = rs.getString(4);
                dt.addRow(fila);
            }
            tablaProductos.setModel(dt);
        } catch (Exception e) {
            System.out.println("*** Error al visualizar la tabla *** ");

        }

    }

    public void vertodo() {
        inventario = true; // Habilitamos una bandera
        nomTabla = "inventario"; // Especificacmos el nombre de la tabla de la cual se requieren los datos

        comprobarExistencia("SELECT * FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA='dbo' AND TABLE_NAME = '" + nomTabla + "'");
        if (existencia) {

            sql = "SELECT * FROM " + nomTabla + ";";  // Armamos la sentencia SQL

            visualizar(); // M??todo que muestra gr??ficammente la consulta

        } else {

            HOST = IP3; // Le pasamoa la IP al HOST con el cual se conectar?? el cliente
            mensaje = "SELECT * FROM " + nomTabla + ";"; // Armamos la sentencia SQL
            sockerCliente(); // Llamamos el m??todo que se encargar?? de la comunicaci??n entre el cliente y el servidor
        }
    }

    public void sockerCliente() {

        DefaultTableModel modelo = new DefaultTableModel(); // Definimos una tabla temporal para guardar los datos

        modelo.addColumn("Codigo"); // Declaramos cada una de las columnas que tendr?? dicha tabla
        modelo.addColumn("Descripci??n");
        modelo.addColumn("Piezas");
        modelo.addColumn("Precio");

        String[] datos = new String[5]; // Declaramos un vector para guardar los datos

        // Creamos unas variables que nos ayudar??n posteriormente
        int cont = 0, fin = 0;
        String aux = "";

        //Declaramos una variables especiales para los mensajes de entrada y salida
        DataInputStream in;  // para las instrucciones de entrada (seridor-cliente
        DataOutputStream out;   // para las instrucciones de salida (cliente-servidor)

        try {
            //Instacioamos la clase Socket, creamos un cliente que apunta a la IP y puerto del servidor
            Socket sc = new Socket(HOST, PUERTO); // dichos par??metros han sido espesificados anteriormente

            in = new DataInputStream(sc.getInputStream()); // variable que guarda los mensajes que manda el servidor (recibe)(respuesta)
            out = new DataOutputStream(sc.getOutputStream()); // variableque guarda los mensajes que le manda al servidor (manda)(peticion)

            out.writeUTF(mensaje); // manda mensaje al servidor (peticion)

            System.out.println("Mensaje del cliente: " + mensaje); // Muestro el mensaje enviado en la ventana de Output

            respuesta = in.readUTF(); // recibe el mensaje del servidor (respuesta)
            System.out.println("Respuesta del servidor: " + respuesta); // Muestro el mensaje

            if ((respuesta.contains("Conectado")) || respuesta.contains("Desconectado") || respuesta.contains("Se") || respuesta.contains("Ha")) {
                if (respuesta.contains("insert??")) {
                    JOptionPane.showMessageDialog(null, "Registro Guardado");

                } else {
                    if (respuesta.contains("actualiz??")) {
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
                    for (int x = 1; x <= cont; x++) {
                        separarRegistros(modelo, datos);
                    }

                }
            }

            if (respuesta.equals("")) {
                sc.close();
            }

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Servidor no encontrado - Verifique la direcci??n IP", "Error", JOptionPane.WARNING_MESSAGE);
        }

        inventario = false;
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

    public void limpiar() {
        txtCodigo.setText("");
        txtNombre.setText("");
        txtPrecio.setText("");
        txtExistencia.setText("");
    }

    public String segmentar(String aux, DefaultTableModel modelo, String[] datos) {
        int columna = 0, registro = 0, ultimo;
        String col = "", col2 = "";

        try {
            columna = aux.indexOf(" ");
            registro = aux.indexOf(",");
            ultimo = aux.lastIndexOf(",");
            //   System.out.println("ultimo: " +ultimo);
            //   System.out.println("tama??o: " +aux.length());

            //   System.out.println("registro: " +registro);
            col = aux.substring(0, columna);
            col2 = aux.substring(columna + 1, registro);

            //  System.out.println("Columna 1: " + col);
            //  System.out.println("Columna 2: " + col2);
            //   MostrarTabla2(col, col2);
            datos[0] = col;
            //   System.out.println("columna1: " + col);
            datos[1] = col2;
            //   System.out.println("columna2: " + col2);
            modelo.addRow(datos);

            aux = aux.substring(registro + 1, aux.length());

            //segmentar(aux);
        } catch (Exception e) {

        }
        return aux;
    }

    public void separarRegistros(DefaultTableModel modelo, String[] datos) {
        String registro = "";
        int inicio = respuesta.indexOf(",");
        int fin = respuesta.lastIndexOf(",");
        registro = respuesta.substring(0, inicio);
        respuesta = respuesta.substring(inicio + 1, respuesta.length());

        separarColumnas(registro, modelo, datos);

    }

    public void separarColumnas(String registro, DefaultTableModel modelo, String[] datos) {
        char[] vector = new char[registro.length()];
        String aux, col;
        int cont = 0;

        //  System.out.println("repuesta " + registro);
        for (int x = 0; x < registro.length(); x++) {
            aux = String.valueOf(vector[x] = registro.charAt(x));
            if (aux.equals("*")) {
                cont++;
            }
        }

        int[] vector2 = new int[cont];
        String[] valores = new String[cont];

        int c = 0;
        for (int x = 0; x < registro.length(); x++) {
            aux = String.valueOf(vector[x] = registro.charAt(x));
            if (aux.equals("*")) {

                vector2[c] = x;

            }
        }
        String aux2;
        for (int y = 0; y < cont; y++) {
            int inicio = registro.indexOf("*");
            aux2 = registro.substring(0, inicio);
            registro = registro.substring(inicio + 1, registro.length());

            // System.out.println("aux2: " +aux2);
            datos[y] = aux2;

            if (y == (cont - 1)) {
                //        System.out.println("a: " +registro);
                datos[y + 1] = registro;
            }

        }

        modelo.addRow(datos);
        tablaProductos.setModel(modelo);

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
            java.util.logging.Logger.getLogger(Altas_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Altas_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Altas_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Altas_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Altas_productos().setVisible(true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtExistencia;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
