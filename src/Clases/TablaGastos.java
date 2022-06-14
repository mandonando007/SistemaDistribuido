
package Clases;

import Conexion.Conectar;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TablaGastos {
    Conectar cc = new Conectar();
    Connection cn = cc.conexion();

    public DefaultTableModel tabla(String valor) {

        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Gasto");
        modelo.addColumn("Descripción");
        modelo.addColumn("Cantidad");

        String sql = "'";
        if (valor.equals("")) {
            sql = "SELECT * FROM gasto";
        } else {
            sql = "SELECT * FROM gasto WHERE idgasto='" + valor + "'";
        }
        Object[] datos = new Object[4];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {

                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
                   JOptionPane.showMessageDialog(null,"El registro no existe");
        }
        
        return modelo;
    }
}
