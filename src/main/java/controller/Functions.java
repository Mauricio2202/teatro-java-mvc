
package controller;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Functions extends javax.swing.JFrame {

    Image func1 = Toolkit.getDefaultToolkit().createImage("D:\\Java\\NetbeansLogic\\Teatro\\src\\func1.png");
    Image func2 = Toolkit.getDefaultToolkit().createImage("D:\\Java\\NetbeansLogic\\Teatro\\src\\func2.png");
    Image func3 = Toolkit.getDefaultToolkit().createImage("D:\\Java\\NetbeansLogic\\Teatro\\src\\func3.png");
    Image func4 = Toolkit.getDefaultToolkit().createImage("D:\\Java\\NetbeansLogic\\Teatro\\src\\func4.png");
    

    public Functions() {
        initComponents();
        this.setLocationRelativeTo(this);
        
        func1 = func1.getScaledInstance(172, 251, 1);
        func2 = func2.getScaledInstance(172, 251, 1);
        func3 = func3.getScaledInstance(172, 251, 1);
        func4 = func4.getScaledInstance(172, 251, 1);
        
        
        this.lblFunc1.setIcon(new ImageIcon(func1));
        this.lblFunc2.setIcon(new ImageIcon(func2));
        this.lblFunc3.setIcon(new ImageIcon(func3));
        this.lblFunc4.setIcon(new ImageIcon(func4));
        
        this.jBackground.setBackground(Color.black);
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBackground = new javax.swing.JPanel();
        lblFunc1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnSelect = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblFunc2 = new javax.swing.JLabel();
        btnSelect2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblFunc3 = new javax.swing.JLabel();
        btnSelect3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblFunc4 = new javax.swing.JLabel();
        btnSelect4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblFunc1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(231, 130, 39));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("La Dama de Negro");

        btnSelect.setBackground(new java.awt.Color(50, 0, 0));
        btnSelect.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnSelect.setForeground(new java.awt.Color(255, 255, 255));
        btnSelect.setText("Seleccionar");
        btnSelect.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSelect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSelectMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSelectMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSelectMouseExited(evt);
            }
        });
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(231, 130, 39));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("El sótano");

        lblFunc2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnSelect2.setBackground(new java.awt.Color(50, 0, 0));
        btnSelect2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnSelect2.setForeground(new java.awt.Color(255, 255, 255));
        btnSelect2.setText("Seleccionar");
        btnSelect2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSelect2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSelect2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSelect2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSelect2MouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(231, 130, 39));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Una Historia Paranormal");

        lblFunc3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnSelect3.setBackground(new java.awt.Color(50, 0, 0));
        btnSelect3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnSelect3.setForeground(new java.awt.Color(255, 255, 255));
        btnSelect3.setText("Seleccionar");
        btnSelect3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSelect3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSelect3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSelect3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSelect3MouseExited(evt);
            }
        });
        btnSelect3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelect3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(231, 130, 39));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Apariciones");

        lblFunc4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnSelect4.setBackground(new java.awt.Color(50, 0, 0));
        btnSelect4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnSelect4.setForeground(new java.awt.Color(255, 255, 255));
        btnSelect4.setText("Seleccionar");
        btnSelect4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSelect4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSelect4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSelect4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSelect4MouseExited(evt);
            }
        });
        btnSelect4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelect4ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(231, 130, 39));
        jButton1.setText("Siguiente");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jBackgroundLayout = new javax.swing.GroupLayout(jBackground);
        jBackground.setLayout(jBackgroundLayout);
        jBackgroundLayout.setHorizontalGroup(
            jBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jBackgroundLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(jBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblFunc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(btnSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(jBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblFunc2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSelect2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(jBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                    .addComponent(lblFunc3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSelect3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(66, 66, 66)
                .addGroup(jBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addComponent(lblFunc4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSelect4, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                .addGap(106, 106, 106))
        );
        jBackgroundLayout.setVerticalGroup(
            jBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jBackgroundLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jBackgroundLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblFunc2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jBackgroundLayout.createSequentialGroup()
                        .addGroup(jBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblFunc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblFunc3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblFunc4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSelect3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSelect4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSelect2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelect2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelect2MouseExited
        this.btnSelect2.setBackground(new Color(50,0,0));
    }//GEN-LAST:event_btnSelect2MouseExited

    private void btnSelect2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelect2MouseEntered
        this.btnSelect2.setBackground(new Color(76, 11, 11));
    }//GEN-LAST:event_btnSelect2MouseEntered

    private void btnSelectMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelectMouseExited
        this.btnSelect.setBackground(new Color(50,0,0));
    }//GEN-LAST:event_btnSelectMouseExited

    private void btnSelectMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelectMouseEntered
        this.btnSelect.setBackground(new Color(76, 11, 11));
    }//GEN-LAST:event_btnSelectMouseEntered

    private void btnSelect3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelect3MouseEntered
         this.btnSelect3.setBackground(new Color(76, 11, 11));
    }//GEN-LAST:event_btnSelect3MouseEntered

    private void btnSelect3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelect3MouseExited
        this.btnSelect3.setBackground(new Color(50,0,0));
    }//GEN-LAST:event_btnSelect3MouseExited

    private void btnSelect3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelect3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSelect3ActionPerformed

    private void btnSelect4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelect4MouseEntered
       this.btnSelect4.setBackground(new Color(76, 11, 11));
    }//GEN-LAST:event_btnSelect4MouseEntered

    private void btnSelect4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelect4MouseExited
        this.btnSelect4.setBackground(new Color(50,0,0));
    }//GEN-LAST:event_btnSelect4MouseExited

    private void btnSelect4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelect4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSelect4ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void btnSelectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelectMouseClicked
        this.btnSelect.setText("Seleccionado");
        SelectChairs seleccionSilla = new SelectChairs();
        
        ImageIcon icon = new ImageIcon(func1);
        seleccionSilla.lblfuncionVista.setIcon(new ImageIcon(func1));
        seleccionSilla.setVisible(true);
    }//GEN-LAST:event_btnSelectMouseClicked

    
    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSelectActionPerformed

    private void btnSelect2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelect2MouseClicked
        this.btnSelect2.setText("Seleccionado");
        SelectChairs seleccionSilla = new SelectChairs();
        
        ImageIcon icon = new ImageIcon(func2);
        seleccionSilla.lblfuncionVista.setIcon(new ImageIcon(func2));
        seleccionSilla.setVisible(true); 
    }//GEN-LAST:event_btnSelect2MouseClicked

    private void btnSelect3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelect3MouseClicked
        this.btnSelect3.setText("Seleccionado");
        SelectChairs seleccionSilla = new SelectChairs();
        
        ImageIcon icon = new ImageIcon(func3);
        seleccionSilla.lblfuncionVista.setIcon(new ImageIcon(func3));
        seleccionSilla.setVisible(true); 
    }//GEN-LAST:event_btnSelect3MouseClicked

    private void btnSelect4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelect4MouseClicked
        this.btnSelect4.setText("Seleccionado");
        SelectChairs seleccionSilla = new SelectChairs();
        
        ImageIcon icon = new ImageIcon(func4);
        seleccionSilla.lblfuncionVista.setIcon(new ImageIcon(func4));
        seleccionSilla.setVisible(true); 
    }//GEN-LAST:event_btnSelect4MouseClicked

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
            java.util.logging.Logger.getLogger(Functions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Functions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Functions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Functions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Functions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnSelect;
    public javax.swing.JButton btnSelect2;
    public javax.swing.JButton btnSelect3;
    public javax.swing.JButton btnSelect4;
    private javax.swing.JPanel jBackground;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblFunc1;
    private javax.swing.JLabel lblFunc2;
    private javax.swing.JLabel lblFunc3;
    private javax.swing.JLabel lblFunc4;
    // End of variables declaration//GEN-END:variables
}
