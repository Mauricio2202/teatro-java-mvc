
package view;

import controller.Functions;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class UserSesion extends javax.swing.JFrame {

    Image teatroWall = Toolkit.getDefaultToolkit().createImage("D:\\Java\\NetbeansLogic\\Teatro\\src\\main\\java\\view\\teatro_wallpaper.png");
    
    public UserSesion() {
        initComponents();
        this.setLocationRelativeTo(this);
        
        teatroWall = teatroWall.getScaledInstance(1069, 474, 1);
        this.lblWallpaper.setIcon(new ImageIcon(teatroWall));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblWallpaper = new javax.swing.JLabel();
        btnViewFunctions = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblWallpaper.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnViewFunctions.setBackground(new java.awt.Color(51, 51, 51));
        btnViewFunctions.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnViewFunctions.setForeground(new java.awt.Color(231, 130, 39));
        btnViewFunctions.setText("Ver Funciones");
        btnViewFunctions.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewFunctions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnViewFunctionsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblWallpaper, javax.swing.GroupLayout.DEFAULT_SIZE, 1069, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(435, 435, 435)
                .addComponent(btnViewFunctions, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblWallpaper, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnViewFunctions, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewFunctionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewFunctionsMouseClicked
        Functions viewFunctions = new Functions();
        viewFunctions.setVisible(true);
    }//GEN-LAST:event_btnViewFunctionsMouseClicked

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
            java.util.logging.Logger.getLogger(UserSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnViewFunctions;
    private javax.swing.JLabel lblWallpaper;
    // End of variables declaration//GEN-END:variables
}
