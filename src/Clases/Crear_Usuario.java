/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author jasam
 */
public class Crear_Usuario extends javax.swing.JFrame {

    /**
     * Creates new form Crear_Usuario
     */
    public Crear_Usuario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        B_volver = new javax.swing.JLabel();
        Nombre_u = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Contra_u = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        V_contra_u = new javax.swing.JTextField();
        PalabraS_u = new javax.swing.JTextField();
        B_Sig = new javax.swing.JLabel();
        B_Cancel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_user_100px_1.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(210, 110, 100, 110);

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Elige una contraseña que sea facil de recordar para ti pero dificil ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 80, 470, 20);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Gotham Thin", 0, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Agregar Usuario");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 10, 310, 60);

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("de adivinar para otros.");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 100, 190, 21);

        B_volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_go_back_60px_1.png"))); // NOI18N
        B_volver.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        B_volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_volverMouseClicked(evt);
            }
        });
        getContentPane().add(B_volver);
        B_volver.setBounds(10, 10, 60, 60);

        Nombre_u.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nombre_uActionPerformed(evt);
            }
        });
        getContentPane().add(Nombre_u);
        Nombre_u.setBounds(170, 240, 190, 30);

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nombre de usuario");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 240, 160, 30);

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Contraseña");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 310, 90, 30);
        getContentPane().add(Contra_u);
        Contra_u.setBounds(170, 310, 190, 30);

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Vuelve a escribir la");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 370, 150, 30);

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("contraseña");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(20, 400, 80, 22);

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Palabra de seguridad");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(20, 450, 150, 30);

        V_contra_u.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                V_contra_uActionPerformed(evt);
            }
        });
        getContentPane().add(V_contra_u);
        V_contra_u.setBounds(170, 380, 190, 30);
        getContentPane().add(PalabraS_u);
        PalabraS_u.setBounds(170, 450, 190, 30);

        B_Sig.setBackground(new java.awt.Color(0, 0, 0));
        B_Sig.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        B_Sig.setForeground(new java.awt.Color(255, 255, 255));
        B_Sig.setText("   Siguiente");
        B_Sig.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B_Sig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_SigMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                B_SigMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                B_SigMouseExited(evt);
            }
        });
        getContentPane().add(B_Sig);
        B_Sig.setBounds(360, 540, 100, 40);

        B_Cancel.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        B_Cancel.setForeground(new java.awt.Color(255, 255, 255));
        B_Cancel.setText("     Cancelar");
        B_Cancel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B_Cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_CancelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                B_CancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                B_CancelMouseExited(evt);
            }
        });
        getContentPane().add(B_Cancel);
        B_Cancel.setBounds(240, 540, 100, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/f.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 530, 610);

        setSize(new java.awt.Dimension(482, 610));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void B_volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_volverMouseClicked
        // TODO add your handling code here:
        Punto_de_venta p= new Punto_de_venta();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_B_volverMouseClicked

    private void Nombre_uActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nombre_uActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nombre_uActionPerformed

    private void V_contra_uActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_V_contra_uActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_V_contra_uActionPerformed

    private void B_SigMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_SigMouseClicked
        // TODO add your handling code here:
         Punto_de_venta p= new Punto_de_venta();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_B_SigMouseClicked

    private void B_SigMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_SigMouseEntered
        // TODO add your handling code here:
        B_Sig.setForeground(new java.awt.Color(255, 0, 51));
        B_Sig.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        B_Sig.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_B_SigMouseEntered

    private void B_SigMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_SigMouseExited
        // TODO add your handling code here:
        B_Sig.setForeground(new java.awt.Color(255, 255, 255));
        B_Sig.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_B_SigMouseExited

    private void B_CancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_CancelMouseClicked
        // TODO add your handling code here:
        Punto_de_venta p= new Punto_de_venta();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_B_CancelMouseClicked

    private void B_CancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_CancelMouseEntered
        // TODO add your handling code here:
        B_Cancel.setForeground(new java.awt.Color(255, 0, 51));
        B_Cancel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        B_Cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_B_CancelMouseEntered

    private void B_CancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_CancelMouseExited
        // TODO add your handling code here:
        B_Cancel.setForeground(new java.awt.Color(255, 255, 255));
        B_Cancel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_B_CancelMouseExited

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
            java.util.logging.Logger.getLogger(Crear_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crear_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crear_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crear_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crear_Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel B_Cancel;
    private javax.swing.JLabel B_Sig;
    private javax.swing.JLabel B_volver;
    private javax.swing.JTextField Contra_u;
    private javax.swing.JTextField Nombre_u;
    private javax.swing.JTextField PalabraS_u;
    private javax.swing.JTextField V_contra_u;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}