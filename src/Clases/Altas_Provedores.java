/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Conexion.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author jasam
 */
public class Altas_Provedores extends javax.swing.JFrame {

    /**
     * Creates new form Altas_productos
     */
    public Altas_Provedores() {
        initComponents();
      //  mostrardatos("");
    }
    Conectar cc = new Conectar();
    Connection cn = cc.conexion();
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
        txtPrecio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = 
        tablaProductos = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };
        jLabel6 = new javax.swing.JLabel();
        txtPrecio1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPrecio2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPrecio3 = new javax.swing.JTextField();
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
        jPanel1.setBounds(0, 0, 1240, 89);

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
        jPanel2.add(txtPrecio);
        txtPrecio.setBounds(250, 390, 200, 30);

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
        jScrollPane1.setBounds(460, 10, 770, 550);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_company_127px_1.png"))); // NOI18N
        jPanel2.add(jLabel6);
        jLabel6.setBounds(160, 10, 130, 110);
        jPanel2.add(txtPrecio1);
        txtPrecio1.setBounds(10, 300, 430, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Direccion");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(20, 440, 130, 30);
        jPanel2.add(txtPrecio2);
        txtPrecio2.setBounds(10, 480, 440, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Ciudad");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(20, 350, 130, 30);
        jPanel2.add(txtPrecio3);
        txtPrecio3.setBounds(10, 390, 200, 30);

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
  
        double precio;
        boolean codigo = consultar(txtCodigo.getText());
            String a;
            
            if(codigo == false){
        try {
            PreparedStatement pst = cn.prepareStatement
        ("INSERT INTO inventario (idproducto, descripcionproducto, cantidad, preciounidad) VALUES (?,?,?,?)");
            pst.setString(1, txtCodigo.getText());
            pst.setString(2, txtNombre.getText());
        
            pst.setDouble(4, precio=Double.parseDouble(txtPrecio.getText()));


            int i=pst.executeUpdate();
            if(i>0){
                JOptionPane.showMessageDialog(rootPane, "Se Guardo Correctamente");
                mostrardatos("");
                limpiar();
            }

            
        } catch (Exception ex) {
            System.out.print("No se guardo"+ex);
        }
            }else{
                JOptionPane.showMessageDialog(null,"Codigo No Disponible, No se Guardo", "Error", JOptionPane.ERROR_MESSAGE);
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


    public void mostrardatos(String valor) {        
    
            TablaProductos obj = new TablaProductos();
            tablaProductos.setModel(obj.tabla(valor));
    }
    
    public boolean consultar(String codigo){
        
        boolean cod = false;
        String sql = "SELECT * FROM inventario WHERE idproducto='" + codigo + "'";


        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            if(rs.next()){
                cod =  true;
            }else{
                cod = false;
            }

            
        } catch (Exception ex) {
            System.out.print("Error"+ex);
        }    
        return cod;
    }

    public void limpiar(){
        txtCodigo.setText("");
        txtNombre.setText("");
        txtPrecio.setText("");

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
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPrecio1;
    private javax.swing.JTextField txtPrecio2;
    private javax.swing.JTextField txtPrecio3;
    // End of variables declaration//GEN-END:variables
}
