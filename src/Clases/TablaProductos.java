package Clases;

import Conexion.Conectar;
import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class TablaProductos {

    Conexion cc = new Conexion();
    Connection cin = cc.getConexion();
    PreparedStatement ps;
    final String inventario = "inventario";


    public DefaultTableModel tabla(String valor) {

        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Producto");
        modelo.addColumn("Descripción");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio Unitario");

        String sql = "'";
        if (valor.equals("")) {
            sql = "SELECT * FROM "+inventario;
        } else {
            sql = "SELECT * FROM "+inventario+" WHERE idProducto='" + valor + "'";
        }
        Object[] datos = new Object[5];
        try {
            Statement st = cin.createStatement();
            ResultSet rs;
            rs = Conexion.Consulta(sql);
                  //  Consulta(sql);
            while (rs.next()) {

                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
        return modelo;
    }
    
    

}