package Conexion;
package sockets.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexion
{
    static Connection con = null;
    
    public static Connection getConexion(){
    
        String url = "jdbc:sqlserver://localhost:1433;database=purificadora";
        try {
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        }catch(ClassNotFoundException e){
            JOptionPane.showConfirmDialog(null, "Error al establecer la conexión" + e.getMessage(),
                    "error de conexion",JOptionPane.ERROR_MESSAGE);
        }try{                                       //usuario , Contraseña   
            con = DriverManager.getConnection(url,"sa","19940709"); // Aqui colocar el usuario y la contraseña de su base de datos
        }catch(SQLException e){
            JOptionPane.showConfirmDialog(null, "error" + e.getMessage(),
                    "Error de Conexión",JOptionPane.ERROR_MESSAGE);
        }
        return con;    
    }
    
    
    public static ResultSet Consulta(String consulta){
        Connection con = getConexion();
        Statement declara;
    try{
    declara=con.createStatement();
    ResultSet respuesta = declara.executeQuery(consulta);
    return respuesta;
} catch (SQLException e) {
        JOptionPane.showConfirmDialog(null, "error" + e.getMessage(),
                    "Error de Conexión",JOptionPane.ERROR_MESSAGE);
   }
    return null;
    }
}