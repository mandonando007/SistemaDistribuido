/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

import Conexion.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author lalo2
 */
public class Gastos_Modificar extends javax.swing.JFrame {

    /** Creates new form Modificar_Altas */
    public Gastos_Modificar() {
        initComponents();
        mostrardatos("");
        txtCodigo.setEnabled(false);
    }
        Conectar cc = new Conectar();
        Connection cn = cc.conexion();
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Modificar = new javax.swing.JPopupMenu();
        itemModificar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        B_volver1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaGastos = 
        tablaGastos = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();

        itemModificar.setText("Modificar");
        itemModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemModificarActionPerformed(evt);
            }
        });
        Modificar.add(itemModificar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Modificar Gastos");

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
                .addContainerGap(411, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(B_volver1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1086, 92);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_product_documents_60px.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(85, 101, 60, 70);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("ID Gasto");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(52, 178, 93, 30);
        getContentPane().add(txtCodigo);
        txtCodigo.setBounds(52, 221, 200, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Nombre del Gasto");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(52, 272, 124, 40);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setText("28/04/2021");
        jLabel20.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 204)));
        jPanel2.add(jLabel20);
        jLabel20.setBounds(730, 810, 170, 30);

        tablaGastos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaGastos.setComponentPopupMenu(Modificar);
        jScrollPane1.setViewportView(tablaGastos);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(330, 20, 725, 510);
        jPanel2.add(txtNombre);
        txtNombre.setBounds(50, 220, 200, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Cantidad Gastada");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(50, 270, 142, 41);
        jPanel2.add(txtCantidad);
        txtCantidad.setBounds(50, 320, 200, 30);

        btnModificar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_edit_property_24px_1.png"))); // NOI18N
        btnModificar.setText("Modificar Gastos");
        btnModificar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 204)));
        btnModificar.setContentAreaFilled(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel2.add(btnModificar);
        btnModificar.setBounds(50, 380, 230, 50);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 90, 1100, 610);

        setSize(new java.awt.Dimension(1090, 672));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void B_volver1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_volver1MouseClicked
        // TODO add your handling code here:
        Gastos p= new Gastos();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_B_volver1MouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
 try {
int codigo = Integer.parseInt(txtCodigo.getText());
            String sql = "UPDATE gasto SET idgasto=?,"
                    + "descripcion = ?,"
                    + "cantidad =?"
                    + "WHERE idgasto ='" +codigo+ "'";

            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, txtCodigo.getText());
            pst.setString(2, txtNombre.getText());
            pst.setString(3, txtCantidad.getText());

            int n = pst.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Datos Actualizados");
            } else {
                JOptionPane.showMessageDialog(null, "Error al Actualizar");
            }

        } catch (Exception ex) {
            System.out.println(ex);
        }
        mostrardatos("");

    }//GEN-LAST:event_btnModificarActionPerformed

    private void itemModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemModificarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro de modificar los datos?", 
                "Confirmar Modificación",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

            int fila = tablaGastos.getSelectedRow();
            if (fila >= 0) {
                txtCodigo.setText(tablaGastos.getValueAt(fila, 0).toString());
                txtNombre.setText(tablaGastos.getValueAt(fila, 1).toString());
                txtCantidad.setText(tablaGastos.getValueAt(fila, 2).toString());
            } else {
                JOptionPane.showMessageDialog(null, "No selecciono fila");
            }

        }
    }//GEN-LAST:event_itemModificarActionPerformed

    public void mostrardatos(String valor){
        TablaGastos tab  = new TablaGastos();
        tablaGastos.setModel(tab.tabla(valor));

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
            java.util.logging.Logger.getLogger(Gastos_Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gastos_Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gastos_Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gastos_Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gastos_Modificar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel B_volver1;
    private javax.swing.JPopupMenu Modificar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JMenuItem itemModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaGastos;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

}
