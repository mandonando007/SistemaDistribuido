/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Conexion.Conectar;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jasam
 */
public class Inicio_de_sesion extends javax.swing.JFrame {

    /**
     * Creates new form Inicio_de_secion
     */
    public Inicio_de_sesion() {
        initComponents();
    }
    Conectar cc = new Conectar();
    Connection cn = cc.conexion();
    ResultSet rs = null;
    private int in=4;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        minimizar_ven = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        txtusu = new javax.swing.JTextField();
        Exit = new javax.swing.JLabel();
        ing = new javax.swing.JButton();
        Olvi_Contra = new javax.swing.JLabel();
        minimizar_ven1 = new javax.swing.JLabel();
        txtcontra = new javax.swing.JPasswordField();
        mos = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        minimizar_ven.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 48)); // NOI18N
        minimizar_ven.setText(" -");
        minimizar_ven.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizar_venMouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        titulo.setFont(new java.awt.Font("Gotham Thin", 0, 40)); // NOI18N
        titulo.setText("Iniciar Sesi??n");
        getContentPane().add(titulo);
        titulo.setBounds(160, 70, 232, 52);

        txtusu.setForeground(new java.awt.Color(204, 204, 204));
        txtusu.setText("Usuario_1");
        txtusu.setBorder(null);
        txtusu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtusuMouseClicked(evt);
            }
        });
        txtusu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuActionPerformed(evt);
            }
        });
        getContentPane().add(txtusu);
        txtusu.setBounds(140, 230, 211, 30);

        Exit.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 13)); // NOI18N
        Exit.setText("   X");
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        getContentPane().add(Exit);
        Exit.setBounds(940, 0, 30, 30);

        ing.setBackground(new java.awt.Color(0, 153, 255));
        ing.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 13)); // NOI18N
        ing.setForeground(new java.awt.Color(255, 255, 255));
        ing.setText("INGRESAR");
        ing.setBorder(null);
        ing.setOpaque(false);
        ing.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ingMouseExited(evt);
            }
        });
        ing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingActionPerformed(evt);
            }
        });
        getContentPane().add(ing);
        ing.setBounds(170, 390, 176, 25);

        Olvi_Contra.setForeground(new java.awt.Color(0, 102, 204));
        Olvi_Contra.setText("??Olvidaste tu contrase??a?");
        Olvi_Contra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Olvi_ContraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Olvi_ContraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Olvi_ContraMouseExited(evt);
            }
        });
        getContentPane().add(Olvi_Contra);
        Olvi_Contra.setBounds(310, 440, 150, 14);

        minimizar_ven1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 48)); // NOI18N
        minimizar_ven1.setText(" -");
        minimizar_ven1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizar_ven1MouseClicked(evt);
            }
        });
        getContentPane().add(minimizar_ven1);
        minimizar_ven1.setBounds(890, 0, 30, 30);

        txtcontra.setForeground(new java.awt.Color(204, 204, 204));
        txtcontra.setText("pasworrddd");
        txtcontra.setBorder(null);
        txtcontra.setEchoChar('*');
        txtcontra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtcontraMouseClicked(evt);
            }
        });
        txtcontra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontraActionPerformed(evt);
            }
        });
        getContentPane().add(txtcontra);
        txtcontra.setBounds(140, 320, 210, 30);

        mos.setBackground(new java.awt.Color(255, 255, 255));
        mos.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 10)); // NOI18N
        mos.setText("Mostrar Contrase??a");
        mos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosActionPerformed(evt);
            }
        });
        getContentPane().add(mos);
        mos.setBounds(330, 360, 190, 21);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/companies.png"))); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(610, 170, 280, 220);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(510, 50, 340, 150);

        jLabel4.setForeground(new java.awt.Color(0, 102, 255));
        jLabel4.setText("______________________________________");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(110, 250, 270, 14);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_user_male_26px.png"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(110, 230, 26, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_lock_26px.png"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(110, 320, 26, 30);

        jLabel7.setForeground(new java.awt.Color(0, 51, 255));
        jLabel7.setText("______________________________________");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(110, 330, 270, 30);

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 13)); // NOI18N
        jLabel2.setText("Nombre de Usuario");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 210, 170, 15);

        jLabel8.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 13)); // NOI18N
        jLabel8.setText("Contrase??a");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(110, 290, 200, 20);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-user-96.png"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(220, 120, 96, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo-blanco-0000.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 60, 440, 430);

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/f.jpg"))); // NOI18N
        getContentPane().add(Fondo);
        Fondo.setBounds(-1010, -220, 2048, 2048);

        setSize(new java.awt.Dimension(967, 545));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
private int usuclick =0;
    private void txtusuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtusuMouseClicked
        // TODO add your handling code here:
        txtusu.setForeground(new java.awt.Color(0,0,0));

         usuclick++;
     
        if (usuclick==1){
           

            
        
            txtusu.setText(null);

      
        }

    }//GEN-LAST:event_txtusuMouseClicked

    private void txtusuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuActionPerformed
private int click=0;
    private void txtcontraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcontraMouseClicked
        // TODO add your handling code here:
        txtcontra.setForeground(new java.awt.Color(0,0,0));

    click++;
     
        if (click==1){
            txtcontra.setText(null);

            
        }
    }//GEN-LAST:event_txtcontraMouseClicked

    private void txtcontraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontraActionPerformed

    private void mosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mosActionPerformed
        // TODO add your handling code here:
        if(mos.isSelected()){
            char i=0;
            boolean a=true;
            if (a) {  // a es una variable boolean en true
                txtcontra.setEchoChar((char)0); // este m??todo es el que hace visible el texto del jPasswordField
                a = false;
            } else {
                txtcontra.setEchoChar(i); // i es el char
                a = true;
            }}else{
                txtcontra.setEchoChar('*');
            }

    }//GEN-LAST:event_mosActionPerformed

    private void ingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingMouseEntered
        // TODO add your handling code here:
        ing.setBackground(new java.awt.Color(255,0,51));
        ing.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_ingMouseEntered

    private void ingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingMouseExited
        // TODO add your handling code here:
        ing.setBackground(new java.awt.Color(0,153,255));
    }//GEN-LAST:event_ingMouseExited
    
    private void ingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingActionPerformed
        // TODO add your handling code here:
        if (txtusu.getText().equals("Admin") && txtcontra.getText().equals("admin")) {
            String us = txtusu.getText();
            insertar(us);

        } else {
            if (in > 0) {

                String user = "User1";
                String pass = "admin";

                if (txtusu.getText().equals(user) && txtcontra.getText().equals(pass)) {
                    insertar(user);

                } else {
                    in--;
                    if (in > 0) {
                        Intentos_1 p1 = new Intentos_1();
                        p1.in(in);
                        p1.setVisible(true);

                    } else {

                        JOptionPane.showMessageDialog(null, "Ya no tienes intentos disponibles contacta al administrador");
                    }
                }
            } else {

                JOptionPane.showMessageDialog(null, "Ya no tienes intentos disponibles contacta al administrador");
            }
        }

    }//GEN-LAST:event_ingActionPerformed

    public void insertar(String us){
       Punto_de_venta p = new Punto_de_venta();
       
       p.ob_user(us);
       p.setVisible(true);
       dispose();   
    }
    
  
    
    private void Olvi_ContraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Olvi_ContraMouseClicked
        // TODO add your handling code here:
          Olvidaste_contrase??a p= new  Olvidaste_contrase??a();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_Olvi_ContraMouseClicked

    private void Olvi_ContraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Olvi_ContraMouseEntered
        // TODO add your handling code here:
        Olvi_Contra.setForeground(new java.awt.Color(255, 0, 51));
        Olvi_Contra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

    }//GEN-LAST:event_Olvi_ContraMouseEntered

    private void Olvi_ContraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Olvi_ContraMouseExited
        // TODO add your handling code here:
        Olvi_Contra.setForeground(new java.awt.Color(0, 102, 204));
    }//GEN-LAST:event_Olvi_ContraMouseExited

    private void minimizar_venMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizar_venMouseClicked
        // TODO add your handling code here:
        this.setExtendedState(WIDTH);
    }//GEN-LAST:event_minimizar_venMouseClicked

    private void minimizar_ven1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizar_ven1MouseClicked
        // TODO add your handling code here:
        this.setExtendedState(WIDTH);
    }//GEN-LAST:event_minimizar_ven1MouseClicked

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitMouseClicked

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
            java.util.logging.Logger.getLogger(Inicio_de_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio_de_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio_de_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio_de_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio_de_sesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Exit;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Olvi_Contra;
    private javax.swing.JButton ing;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel minimizar_ven;
    private javax.swing.JLabel minimizar_ven1;
    private javax.swing.JCheckBox mos;
    private javax.swing.JLabel titulo;
    private javax.swing.JPasswordField txtcontra;
    private javax.swing.JTextField txtusu;
    // End of variables declaration//GEN-END:variables
}
