/*U
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Conexion.Server;
import Sockets.ChatBot;
import Sockets.ChatBot2;


/**
 *
 * @author jasam
 */
public class Punto_de_venta extends javax.swing.JFrame {

    /**
     * Creates new form Punto_de_venta
     */
    public Punto_de_venta() {
        initComponents();
        Server s = new Server();
        Thread t = new Thread(s);
        t.start();
          Menu_user.setVisible(false);
    }

void ob_user(String user){
  
     User.setText(user);
    
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblChat = new javax.swing.JLabel();
        Clientes_c = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        clientes_c = new javax.swing.JLabel();
        B_Prov = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        B_Prove = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        Ventas_b = new javax.swing.JLabel();
        Menu_user = new javax.swing.JPanel();
        Cerrar_u = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        Cambiar_u = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        Agregar_user = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        User = new javax.swing.JLabel();
        u = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Purificadora Agua Inmaculada [Punto de Venta]");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel23.setFont(new java.awt.Font("Gotham Thin", 0, 40)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("0");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(360, 110, 150, 52);

        jLabel24.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Ventas registradas el dia de hoy");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(340, 180, 300, 24);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_total_sales_50px.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(520, 80, 100, 120);

        jLabel7.setFont(new java.awt.Font("Gotham Thin", 0, 40)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("______________");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(-10, 90, 400, 52);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_edit_graph_report_50px_1.png"))); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(10, 520, 70, 60);

        lblChat.setFont(new java.awt.Font("Gotham Thin", 0, 40)); // NOI18N
        lblChat.setForeground(new java.awt.Color(255, 255, 255));
        lblChat.setText("Chat");
        lblChat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblChatMouseClicked(evt);
            }
        });
        getContentPane().add(lblChat);
        lblChat.setBounds(80, 530, 232, 50);

        Clientes_c.setFont(new java.awt.Font("Gotham Thin", 0, 40)); // NOI18N
        Clientes_c.setForeground(new java.awt.Color(255, 255, 255));
        Clientes_c.setText("Clientes");
        Clientes_c.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Clientes_cMouseClicked(evt);
            }
        });
        getContentPane().add(Clientes_c);
        Clientes_c.setBounds(80, 450, 170, 52);

        jLabel33.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Ver otros registros");
        getContentPane().add(jLabel33);
        jLabel33.setBounds(390, 210, 150, 52);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_money_bag_50px.png"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 280, 70, 80);

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_next_page_24px.png"))); // NOI18N
        getContentPane().add(jLabel34);
        jLabel34.setBounds(540, 210, 30, 60);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_warehouse_50px.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 200, 100, 100);

        jLabel10.setFont(new java.awt.Font("Gotham Thin", 0, 40)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Gastos");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(80, 300, 127, 52);

        clientes_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_user_male_52px_3.png"))); // NOI18N
        clientes_c.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientes_cMouseClicked(evt);
            }
        });
        getContentPane().add(clientes_c);
        clientes_c.setBounds(10, 440, 60, 60);

        B_Prov.setFont(new java.awt.Font("Gotham Thin", 0, 40)); // NOI18N
        B_Prov.setForeground(new java.awt.Color(255, 255, 255));
        B_Prov.setText("Provedores");
        B_Prov.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_ProvMouseClicked(evt);
            }
        });
        getContentPane().add(B_Prov);
        B_Prov.setBounds(80, 370, 220, 52);

        jLabel8.setFont(new java.awt.Font("Gotham Thin", 0, 40)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Almacen");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8);
        jLabel8.setBounds(80, 220, 232, 52);

        B_Prove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_supplier_50px_1.png"))); // NOI18N
        B_Prove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_ProveMouseClicked(evt);
            }
        });
        getContentPane().add(B_Prove);
        B_Prove.setBounds(10, 360, 60, 60);

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_total_sales_50px.png"))); // NOI18N
        getContentPane().add(jLabel28);
        jLabel28.setBounds(10, 120, 100, 120);

        Ventas_b.setFont(new java.awt.Font("Gotham Thin", 0, 40)); // NOI18N
        Ventas_b.setForeground(new java.awt.Color(255, 255, 255));
        Ventas_b.setText("Ventas");
        Ventas_b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ventas_bMouseClicked(evt);
            }
        });
        getContentPane().add(Ventas_b);
        Ventas_b.setBounds(80, 150, 232, 52);

        Menu_user.setBorder(new javax.swing.border.MatteBorder(null));
        Menu_user.setLayout(null);

        Cerrar_u.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        Cerrar_u.setText("              Cerrar Sesion");
        Cerrar_u.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cerrar_uMouseClicked(evt);
            }
        });
        Menu_user.add(Cerrar_u);
        Cerrar_u.setBounds(10, 286, 190, 50);

        jLabel38.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel38.setText("             Administrar Usuario");
        Menu_user.add(jLabel38);
        jLabel38.setBounds(0, 0, 270, 50);

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_lock_26px.png"))); // NOI18N
        Menu_user.add(jLabel39);
        jLabel39.setBounds(10, 0, 30, 60);

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_user_male_26px.png"))); // NOI18N
        Menu_user.add(jLabel40);
        jLabel40.setBounds(10, 60, 50, 40);

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_close_pane_50px.png"))); // NOI18N
        Menu_user.add(jLabel36);
        jLabel36.setBounds(10, 290, 50, 40);

        jLabel41.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel41.setText("             Administrar Usuarios");
        Menu_user.add(jLabel41);
        jLabel41.setBounds(0, 170, 240, 40);

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_people_50px_1.png"))); // NOI18N
        Menu_user.add(jLabel42);
        jLabel42.setBounds(0, 170, 50, 40);

        Cambiar_u.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        Cambiar_u.setText("           Cambiar Usuario");
        Cambiar_u.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cambiar_uMouseClicked(evt);
            }
        });
        Menu_user.add(Cambiar_u);
        Cambiar_u.setBounds(10, 60, 230, 40);

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_people_50px_1.png"))); // NOI18N
        Menu_user.add(jLabel44);
        jLabel44.setBounds(0, 110, 50, 40);

        Agregar_user.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        Agregar_user.setText("             Agregar Usuario");
        Agregar_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Agregar_userMouseClicked(evt);
            }
        });
        Menu_user.add(Agregar_user);
        Agregar_user.setBounds(0, 110, 240, 40);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo-blanco-0000.jpg"))); // NOI18N
        jLabel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Menu_user.add(jLabel21);
        jLabel21.setBounds(0, 0, 250, 340);

        getContentPane().add(Menu_user);
        Menu_user.setBounds(990, 60, 250, 340);

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/f_na.jpg"))); // NOI18N
        getContentPane().add(jLabel32);
        jLabel32.setBounds(320, 210, 300, 50);

        jLabel31.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Gastos registrados el dia de hoy");
        getContentPane().add(jLabel31);
        jLabel31.setBounds(680, 180, 300, 24);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 310, 120);

        jLabel26.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Ver otros registros");
        getContentPane().add(jLabel26);
        jLabel26.setBounds(720, 210, 150, 52);

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_next_page_24px.png"))); // NOI18N
        getContentPane().add(jLabel27);
        jLabel27.setBounds(870, 210, 30, 60);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/f_r.png"))); // NOI18N
        jLabel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0)));
        getContentPane().add(jLabel25);
        jLabel25.setBounds(670, 210, 300, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/f.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 310, 860);

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_money_bag_50px.png"))); // NOI18N
        getContentPane().add(jLabel35);
        jLabel35.setBounds(880, 80, 70, 90);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/f_na.jpg"))); // NOI18N
        getContentPane().add(jLabel22);
        jLabel22.setBounds(320, 80, 300, 180);

        jLabel30.setFont(new java.awt.Font("Gotham Thin", 0, 40)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("$0.0");
        getContentPane().add(jLabel30);
        jLabel30.setBounds(700, 100, 160, 52);

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/f_r.png"))); // NOI18N
        getContentPane().add(jLabel29);
        jLabel29.setBounds(670, 80, 300, 180);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo-blanco-0000.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(460, 400, 850, 460);

        User.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        User.setForeground(new java.awt.Color(255, 255, 255));
        User.setText("Usuario");
        User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserMouseClicked(evt);
            }
        });
        getContentPane().add(User);
        User.setBounds(1070, 0, 130, 60);

        u.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_user_male_52px_3.png"))); // NOI18N
        u.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uMouseClicked(evt);
            }
        });
        getContentPane().add(u);
        u.setBounds(1010, 0, 60, 60);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/f.jpg"))); // NOI18N
        getContentPane().add(jLabel18);
        jLabel18.setBounds(310, 0, 940, 60);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo-blanco-0000.jpg"))); // NOI18N
        getContentPane().add(jLabel15);
        jLabel15.setBounds(450, -10, 800, 440);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo-blanco-0000.jpg"))); // NOI18N
        getContentPane().add(jLabel17);
        jLabel17.setBounds(310, 0, 800, 440);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo-blanco-0000.jpg"))); // NOI18N
        getContentPane().add(jLabel16);
        jLabel16.setBounds(310, 380, 800, 460);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.png"))); // NOI18N
        getContentPane().add(jLabel19);
        jLabel19.setBounds(0, 0, 310, 120);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_supplier_50px_1.png"))); // NOI18N
        getContentPane().add(jLabel20);
        jLabel20.setBounds(10, 360, 60, 60);

        jLabel37.setFont(new java.awt.Font("Gotham Thin", 0, 40)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Reporte");
        getContentPane().add(jLabel37);
        jLabel37.setBounds(80, 530, 232, 50);

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_edit_graph_report_50px_1.png"))); // NOI18N
        getContentPane().add(jLabel43);
        jLabel43.setBounds(10, 590, 70, 60);

        setSize(new java.awt.Dimension(1253, 868));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
private int click=0;
    private void UserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserMouseClicked
      
        click++;
        if (click==1){
       Menu_user.setVisible(true);
    
        }else{
              Menu_user.setVisible(false);
              click=0;
        }
    }//GEN-LAST:event_UserMouseClicked

    private void Agregar_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Agregar_userMouseClicked
        // TODO add your handling code here:
         Crear_Usuario p= new Crear_Usuario();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_Agregar_userMouseClicked

    private void Cambiar_uMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cambiar_uMouseClicked
        // TODO add your handling code here:
        Inicio_de_sesion p= new Inicio_de_sesion();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_Cambiar_uMouseClicked

    private void Cerrar_uMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cerrar_uMouseClicked
        // TODO add your handling code here:
               Inicio_de_sesion p= new Inicio_de_sesion();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_Cerrar_uMouseClicked

    private void uMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uMouseClicked
        // TODO add your handling code here:
          click++;
        if (click==1){
       Menu_user.setVisible(true);
    
        }else{
              Menu_user.setVisible(false);
              click=0;
        }
    }//GEN-LAST:event_uMouseClicked

    private void Ventas_bMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ventas_bMouseClicked
        // TODO add your handling code here:
        Ventas p= new Ventas();
        p.setVisible(true);
      
    }//GEN-LAST:event_Ventas_bMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        Almacen p= new Almacen();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void Clientes_cMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Clientes_cMouseClicked
        // TODO add your handling code here:
         Clientes p= new Clientes();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_Clientes_cMouseClicked

    private void clientes_cMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientes_cMouseClicked
        // TODO add your handling code here:
         Clientes p= new Clientes();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_clientes_cMouseClicked

    private void B_ProvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_ProvMouseClicked
        // TODO add your handling code here:
        Provedores p= new Provedores();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_B_ProvMouseClicked

    private void B_ProveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_ProveMouseClicked
        // TODO add your handling code here:
         Provedores p= new Provedores();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_B_ProveMouseClicked

    private void lblChatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblChatMouseClicked
        ChatBot chat = new ChatBot();
        ChatBot2 chat2 = new ChatBot2();
        chat.setVisible(true);
        chat2.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblChatMouseClicked

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
            java.util.logging.Logger.getLogger(Punto_de_venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Punto_de_venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Punto_de_venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Punto_de_venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Punto_de_venta().setVisible(true);
              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Agregar_user;
    private javax.swing.JLabel B_Prov;
    private javax.swing.JLabel B_Prove;
    private javax.swing.JLabel Cambiar_u;
    private javax.swing.JLabel Cerrar_u;
    private javax.swing.JLabel Clientes_c;
    private javax.swing.JPanel Menu_user;
    private javax.swing.JLabel User;
    private javax.swing.JLabel Ventas_b;
    private javax.swing.JLabel clientes_c;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JLabel lblChat;
    private javax.swing.JLabel u;
    // End of variables declaration//GEN-END:variables
}
