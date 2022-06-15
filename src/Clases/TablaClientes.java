
package Clases;

import Conexion.Conectar;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;


public class TablaClientes {
    
    
    Conectar cc = new Conectar();
    Connection cn = cc.conexion();

    public DefaultTableModel tabla(String valor) {

        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Cliente");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido Paterno");
        modelo.addColumn("Apellido Materno");
        modelo.addColumn("Dirección");
        modelo.addColumn("Telefono");
        modelo.addColumn("Edad");

        String sql = "'";
        if (valor.equals("")) {
            sql = "SELECT * FROM cliente";
        } else {
            sql = "SELECT * FROM cliente WHERE idcliente='" + valor + "'";
        }
        Object[] datos = new Object[7];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {

                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
        return modelo;
    }
}
