package Conexion;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
    
public class Server implements Runnable {
    

    
    Conectar conexion = new Conectar();
    Connection cn = conexion.conexion();
    boolean Conexion;
    boolean validacion = true;
    
   
    ServerSocket server = null;
    Socket sc = null;
    String mensaje;
    String respuesta;
    String resul;
    String datos;
    DefaultTableModel modelo;
    
   
    @Override
    public void run() {


            ServerSocket servidor = null;
            Socket sc = null;   // socket del cliente
            DataInputStream in;  // para las instrucciones de entrada cliente-seridor
            DataOutputStream out;   // para las instrucciones de salida servidor-cliente
            final int PUERTO = 5000;

            try {
                servidor = new ServerSocket(PUERTO);
                System.out.println("Servidor Iniciado");

                // servidor siempre escuchando
                while (true) {
                    // se queda esperando, no continua si no tiene respuesta del cliente
                    sc = servidor.accept();

                    in = new DataInputStream(sc.getInputStream()); //recibe/lee mensajes del cliente
                    out = new DataOutputStream(sc.getOutputStream());

                    mensaje = in.readUTF();  //lee el mensaje

                    if (mensaje.contains("Cerrar")) {
                        out.writeUTF("Desconectado de Servidor");
                        sc.close(); //cerramos/desconectamos el cliente
                        System.out.println("Mensaje del cliente: " + mensaje);
                        System.out.println("Servidor: Desconectado");
                        break;

                    } else {
                        System.out.println(respuesta);
                        System.out.println("Mensaje del cliente: " + mensaje); //imprim el mensaje
                        validacion();

                        out.writeUTF(respuesta); // manda/escribe un mensaje al cliente
                        //System.out.println(respuesta);

                    }
                }

            } catch (IOException ex) {
                //   Logger.getLogger(SocketServidor.class.getName()).log(Level.SEVERE, null, ex);
            }

    }
    
    public void conectar() {
        if (cn == null) {
            JOptionPane.showMessageDialog(null, "No conectado");
            Conexion = false;
        } else {
            //JOptionPane.showMessageDialog(null, "Conectado");
            Conexion = true;
        }
    }    
     
    public void Insertar() {
        respuesta = "";
        try {
            PreparedStatement pst = cn.prepareStatement(mensaje);
            int x = pst.executeUpdate();
            if (x > 0) {
                System.out.println("Se insertó correctamente");
                respuesta = "Se ejecuto INSERT";
            }
        } catch (Exception we) {

            System.out.println(we);
            JOptionPane.showMessageDialog(null, we, "Error", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void Actualizar() {
        respuesta = "";
        try {
            PreparedStatement pst = cn.prepareStatement(mensaje);
            int x = pst.executeUpdate();
            if (x > 0) {

                System.out.println("Se actualizó correctamente");
                respuesta = "Se actualizó correctarmente";
            }
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.WARNING_MESSAGE);
            System.out.print(e.getMessage());

        }

    }

    public void Eliminar() {
        respuesta = "";
        try {
            PreparedStatement pst = cn.prepareStatement(mensaje);
            int x = pst.executeUpdate();
            if (x > 0) {

                System.out.println("Se Elimino");
                respuesta = "Sentencia DELETE ejecutada";
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void validacion() {
        validacion = mensaje.matches("SELECT.*");

        if (validacion) {

            if (mensaje.contains("inventario")) {
                Inventario();
            } else {
                if (mensaje.contains("cliente")) {
                    Cliente();
                } else {
                    if (mensaje.contains("proveedor")) {
                        Proveedor();
                    } else {
                        System.out.print("No definido");

                    }
                }
            }
        } else {
            validacion = mensaje.matches("UPDATE.*");
            if (validacion) {

                Actualizar();

            } else {
                validacion = mensaje.matches("INSERT.*");
                if (validacion) {
                    Insertar();

                } else {
                    validacion = mensaje.matches("DELETE.*");
                    if (validacion) {
                        Eliminar();
                    } else {
                        respuesta = "Conectado a Servidor";
                        System.out.println(respuesta);
                    }
                }
            }
        }
    }
    
    public void Inventario() {

        int cont = 0;
        respuesta = "";
        //   String sql = buscar;
        String[] datos = new String[4];

        try {
            Statement q = cn.createStatement();
            ResultSet w = q.executeQuery(mensaje);

            while (w.next()) {

                respuesta += datos[0] = w.getString(1) + "*";
                respuesta += datos[1] = w.getString(2) + "*";
                respuesta += datos[2] = w.getString(3) + "*";
                respuesta += (datos[3] = w.getString(4)) + ",";

                cont++;

            }
           System.out.println("rer " + respuesta);
           respuesta = "(" + cont + ")" + respuesta;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
        }
        System.out.println(respuesta);

    }
    
    public void Cliente() {

        int cont = 0;
        respuesta = "";
        //   String sql = buscar;
        Object[] datos = new Object[6];

        try {
            Statement q = cn.createStatement();
            ResultSet w = q.executeQuery(mensaje);

            while (w.next()) {

                respuesta += datos[0] = w.getString(1) + "*";
                respuesta += datos[1] = w.getString(2) + "*";
                respuesta += datos[2] = w.getString(3) + "*";
                respuesta += datos[3] = w.getString(4) + "*";
                respuesta += datos[4] = w.getString(5) + "*";
                respuesta += (datos[5] = w.getString(6)) + ",";


                cont++;
            }
           System.out.println("rer " + respuesta);
           respuesta = "(" + cont + ")" + respuesta;
        } catch (SQLException ex) {
            //   Logger.getLogger(SocketServidor.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
        }
        System.out.println(respuesta);
        // return respuesta;

    }
    
    public void Proveedor() {

        int cont = 0;
        respuesta = "";
        //   String sql = buscar;
        Object[] datos = new Object[5];

        try {
            Statement q = cn.createStatement();
            ResultSet w = q.executeQuery(mensaje);

            while (w.next()) {

                respuesta += datos[0] = w.getString(1) + "*";
                respuesta += datos[1] = w.getString(2) + "*";
                respuesta += datos[2] = w.getString(3) + "*";
                respuesta += datos[3] = w.getString(4) + "*";
                respuesta += (datos[4] = w.getString(5)) + ",";

                cont++;
            }
           System.out.println("rer " + respuesta);
           respuesta = "(" + cont + ")" + respuesta;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
        }
        System.out.println(respuesta);

    }
}

