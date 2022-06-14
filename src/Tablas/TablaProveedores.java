
package Tablas;

import Conexion.Conectar;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class TablaProveedores {
    
    
    Conectar cc = new Conectar();
    Connection cn = cc.conexion();

    public DefaultTableModel tabla(String valor) {

        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Proveedor");
        modelo.addColumn("Nombre");
        modelo.addColumn("Telefono");
        modelo.addColumn("Email");
        modelo.addColumn("Ciudad");

        String sql = "'";
        if (valor.equals("")) {
            sql = "SELECT * FROM provedor";
        } else {
            sql = "SELECT * FROM provedor WHERE idProvedor='" + valor + "'";
        }
        Object[] datos = new Object[5];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {

                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                
                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
        return modelo;
    }
}
