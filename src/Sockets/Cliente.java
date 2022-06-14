 package Sockets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente implements Runnable {
    
    //private String host ;
    private int puerto;
    private String mensaje;

    public Cliente(int puerto, String mensaje) {
        //this.host = host;
        this.puerto = puerto;
        this.mensaje = mensaje;
    }

    @Override
    public void run() {

        final String host = "127.0.0.1";
        //Puerto del servidor
        DataOutputStream out;

        try {
            //Creo el socket para conectarme con el cliente
            Socket sc = new Socket(host, puerto);

            out = new DataOutputStream(sc.getOutputStream());

            //Envio un mensaje al cliente
            out.writeUTF(mensaje);

            sc.close();

        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
