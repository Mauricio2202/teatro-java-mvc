
package controller;

import view.Boleto;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

 public class SelectChairs extends javax.swing.JFrame {
     
     Image asiento1 = Toolkit.getDefaultToolkit().createImage("D:\\Java\\NetbeansLogic\\Teatro\\src\\asientoCine.png");
     Image tarjeta = Toolkit.getDefaultToolkit().createImage("D:\\Java\\NetbeansLogic\\Teatro\\src\\mastercard.png");

     public SelectChairs() {
        initComponents();
        this.setLocationRelativeTo(this);
        
        asiento1 = asiento1.getScaledInstance(69, 64, 1);
        tarjeta = tarjeta.getScaledInstance(440, 240, 1);
        for (int i = 0; i <= 10; i++) {
            this.lblImg1.setIcon(new ImageIcon(asiento1));
            this.lblImg2.setIcon(new ImageIcon(asiento1));
            this.lblImg3.setIcon(new ImageIcon(asiento1));
            this.lblImg4.setIcon(new ImageIcon(asiento1));
            this.lblImg5.setIcon(new ImageIcon(asiento1));
            this.lblImg6.setIcon(new ImageIcon(asiento1));
            this.lblImg7.setIcon(new ImageIcon(asiento1));
            this.lblImg8.setIcon(new ImageIcon(asiento1));
            this.lblImg9.setIcon(new ImageIcon(asiento1));
            this.lblImg10.setIcon(new ImageIcon(asiento1));
            this.lblImg11.setIcon(new ImageIcon(asiento1));
            this.lblImg12.setIcon(new ImageIcon(asiento1));
            this.lblImg13.setIcon(new ImageIcon(asiento1));
            this.lblImg14.setIcon(new ImageIcon(asiento1));
            this.lblImg15.setIcon(new ImageIcon(asiento1));
            this.lblImg16.setIcon(new ImageIcon(asiento1));
            this.lblImg17.setIcon(new ImageIcon(asiento1));
            this.lblImg18.setIcon(new ImageIcon(asiento1));
            this.lblImg19.setIcon(new ImageIcon(asiento1));
            this.lblImg20.setIcon(new ImageIcon(asiento1));
            this.lblImg21.setIcon(new ImageIcon(asiento1));
            this.lblImg22.setIcon(new ImageIcon(asiento1));
            this.lblImg23.setIcon(new ImageIcon(asiento1));
            this.lblImg24.setIcon(new ImageIcon(asiento1));
            this.lblImg25.setIcon(new ImageIcon(asiento1));
            this.lblImg26.setIcon(new ImageIcon(asiento1));
            this.lblImg27.setIcon(new ImageIcon(asiento1));
            this.lblImg28.setIcon(new ImageIcon(asiento1));
            this.lblImg29.setIcon(new ImageIcon(asiento1));
            this.lblImg30.setIcon(new ImageIcon(asiento1));
            
            this.dispose.setIcon(new ImageIcon(asiento1));
            this.noDispose.setIcon(new ImageIcon(asiento1));
            this.lblAsientoComprar.setIcon(new ImageIcon(asiento1));
            this.lblMastercard.setIcon(new ImageIcon(tarjeta));
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lblImg1 = new javax.swing.JLabel();
        lblImg2 = new javax.swing.JLabel();
        lblImg3 = new javax.swing.JLabel();
        lblImg4 = new javax.swing.JLabel();
        lblImg5 = new javax.swing.JLabel();
        lblImg6 = new javax.swing.JLabel();
        lblImg7 = new javax.swing.JLabel();
        lblImg8 = new javax.swing.JLabel();
        lblImg9 = new javax.swing.JLabel();
        lblImg10 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lblImg11 = new javax.swing.JLabel();
        lblImg12 = new javax.swing.JLabel();
        lblImg13 = new javax.swing.JLabel();
        lblImg14 = new javax.swing.JLabel();
        lblImg15 = new javax.swing.JLabel();
        lblImg16 = new javax.swing.JLabel();
        lblImg17 = new javax.swing.JLabel();
        lblImg18 = new javax.swing.JLabel();
        lblImg19 = new javax.swing.JLabel();
        lblImg20 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lblImg21 = new javax.swing.JLabel();
        lblImg22 = new javax.swing.JLabel();
        lblImg23 = new javax.swing.JLabel();
        lblImg24 = new javax.swing.JLabel();
        lblImg25 = new javax.swing.JLabel();
        lblImg26 = new javax.swing.JLabel();
        lblImg27 = new javax.swing.JLabel();
        lblImg28 = new javax.swing.JLabel();
        lblImg29 = new javax.swing.JLabel();
        lblImg30 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        dispose = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        noDispose = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        panelWallpaper = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        lblAsientoComprar = new javax.swing.JLabel();
        lblMastercard = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblfuncionVista = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtFechaCad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCvv = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        txtNumTarjeta = new javax.swing.JPasswordField();
        btnProcesarPago = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblImg1.setBackground(new java.awt.Color(0, 186, 107));
        lblImg1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblImg1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblImg2.setBackground(new java.awt.Color(173, 109, 29));
        lblImg2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblImg2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblImg3.setBackground(new java.awt.Color(0, 186, 107));
        lblImg3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblImg3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblImg4.setBackground(new java.awt.Color(173, 109, 29));
        lblImg4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblImg4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblImg5.setBackground(new java.awt.Color(0, 186, 107));
        lblImg5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblImg5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblImg6.setBackground(new java.awt.Color(173, 109, 29));
        lblImg6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblImg6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblImg7.setBackground(new java.awt.Color(0, 186, 107));
        lblImg7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblImg7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblImg8.setBackground(new java.awt.Color(173, 109, 29));
        lblImg8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblImg8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblImg9.setBackground(new java.awt.Color(173, 109, 29));
        lblImg9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblImg9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblImg10.setBackground(new java.awt.Color(0, 186, 107));
        lblImg10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblImg10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImg1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblImg2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblImg3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblImg4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblImg5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblImg6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblImg7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblImg8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblImg9, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblImg10, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImg10, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImg9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImg8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImg7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImg6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImg5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImg4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImg3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImg2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImg1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblImg11.setBackground(new java.awt.Color(0, 186, 107));
        lblImg11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblImg11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblImg11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblImg11MouseEntered(evt);
            }
        });

        lblImg12.setBackground(new java.awt.Color(0, 186, 107));
        lblImg12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblImg12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblImg12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg12MouseClicked(evt);
            }
        });

        lblImg13.setBackground(new java.awt.Color(173, 109, 29));
        lblImg13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblImg13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblImg14.setBackground(new java.awt.Color(0, 186, 107));
        lblImg14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblImg14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblImg14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg14MouseClicked(evt);
            }
        });

        lblImg15.setBackground(new java.awt.Color(0, 186, 107));
        lblImg15.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblImg15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblImg15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg15MouseClicked(evt);
            }
        });

        lblImg16.setBackground(new java.awt.Color(0, 186, 107));
        lblImg16.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblImg16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblImg16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg16MouseClicked(evt);
            }
        });

        lblImg17.setBackground(new java.awt.Color(173, 109, 29));
        lblImg17.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblImg17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblImg18.setBackground(new java.awt.Color(0, 186, 107));
        lblImg18.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblImg18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblImg18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg18MouseClicked(evt);
            }
        });
        lblImg18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblImg18KeyPressed(evt);
            }
        });

        lblImg19.setBackground(new java.awt.Color(0, 186, 107));
        lblImg19.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblImg19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblImg19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg19MouseClicked(evt);
            }
        });

        lblImg20.setBackground(new java.awt.Color(0, 186, 107));
        lblImg20.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblImg20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblImg20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg20MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImg11, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblImg12, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblImg13, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblImg14, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblImg15, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblImg16, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblImg17, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblImg18, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblImg19, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblImg20, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblImg11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblImg20, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(lblImg19, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(lblImg18, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(lblImg17, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(lblImg16, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(lblImg15, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(lblImg14, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(lblImg13, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(lblImg12, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblImg21.setBackground(new java.awt.Color(0, 186, 107));
        lblImg21.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblImg21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblImg22.setBackground(new java.awt.Color(0, 186, 107));
        lblImg22.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblImg22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblImg23.setBackground(new java.awt.Color(0, 186, 107));
        lblImg23.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblImg23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblImg24.setBackground(new java.awt.Color(0, 186, 107));
        lblImg24.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblImg24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblImg25.setBackground(new java.awt.Color(173, 109, 29));
        lblImg25.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblImg25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblImg26.setBackground(new java.awt.Color(0, 186, 107));
        lblImg26.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblImg26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblImg27.setBackground(new java.awt.Color(0, 186, 107));
        lblImg27.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblImg27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblImg28.setBackground(new java.awt.Color(0, 186, 107));
        lblImg28.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblImg28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblImg29.setBackground(new java.awt.Color(173, 109, 29));
        lblImg29.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblImg29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblImg30.setBackground(new java.awt.Color(0, 186, 107));
        lblImg30.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblImg30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImg21, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblImg22, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblImg23, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblImg24, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblImg25, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblImg26, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblImg27, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblImg28, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblImg29, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblImg30, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImg30, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImg29, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImg28, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImg27, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImg26, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImg25, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImg24, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImg23, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImg22, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImg21, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(44, 0, 64));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        dispose.setBackground(new java.awt.Color(0, 186, 107));
        dispose.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        dispose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Disponible");

        noDispose.setBackground(new java.awt.Color(173, 109, 29));
        noDispose.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        noDispose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("No Disponible");

        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Precio por Asiento: $100");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dispose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                    .addComponent(noDispose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(58, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(dispose, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(noDispose, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(25, 25, 25))
        );

        jLabel3.setFont(new java.awt.Font("Harrington", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(231, 130, 39));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("¡OFERTA DE HALLOWEEN!");

        jLabel4.setBackground(new java.awt.Color(231, 130, 39));
        jLabel4.setFont(new java.awt.Font("Harrington", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("3x1 en adiquirir un asiento");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(232, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(472, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Seleccionar Asientos", jPanel1);

        panelWallpaper.setBackground(new java.awt.Color(0, 0, 0));

        jPanel8.setBackground(new java.awt.Color(59, 27, 78));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblAsientoComprar.setBackground(new java.awt.Color(0, 0, 0));
        lblAsientoComprar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAsientoComprar.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblAsientoComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblAsientoComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(231, 130, 39));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Función");

        lblfuncionVista.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Número de la tarjeta");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fecha de caducidad");

        txtFechaCad.setBackground(new java.awt.Color(102, 102, 102));
        txtFechaCad.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        txtFechaCad.setForeground(new java.awt.Color(255, 255, 255));
        txtFechaCad.setText("MM/AA");
        txtFechaCad.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtFechaCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaCadActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("CVV");

        txtCvv.setBackground(new java.awt.Color(102, 102, 102));
        txtCvv.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        txtCvv.setForeground(new java.awt.Color(255, 255, 255));
        txtCvv.setText("CVV");
        txtCvv.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nombre");

        txtCliente.setBackground(new java.awt.Color(102, 102, 102));
        txtCliente.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        txtCliente.setForeground(new java.awt.Color(255, 255, 255));
        txtCliente.setText("Nombre del cliente");
        txtCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });

        txtNumTarjeta.setText("jPasswordField1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCvv, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNumTarjeta))
                .addGap(105, 105, 105)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCliente, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(txtFechaCad, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(27, 27, 27))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFechaCad, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(txtNumTarjeta))
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCvv, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        btnProcesarPago.setBackground(new java.awt.Color(255, 0, 0));
        btnProcesarPago.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnProcesarPago.setForeground(new java.awt.Color(255, 255, 255));
        btnProcesarPago.setText("ENVIAR Y PROCESAR");
        btnProcesarPago.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProcesarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarPagoActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 51, 51));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Total");

        lblPrice.setBackground(new java.awt.Color(255, 255, 255));
        lblPrice.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblPrice.setForeground(new java.awt.Color(255, 255, 255));
        lblPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrice.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout panelWallpaperLayout = new javax.swing.GroupLayout(panelWallpaper);
        panelWallpaper.setLayout(panelWallpaperLayout);
        panelWallpaperLayout.setHorizontalGroup(
            panelWallpaperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelWallpaperLayout.createSequentialGroup()
                .addGroup(panelWallpaperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelWallpaperLayout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelWallpaperLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(panelWallpaperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelWallpaperLayout.createSequentialGroup()
                                .addComponent(lblfuncionVista, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addGroup(panelWallpaperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelWallpaperLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE)
                .addGroup(panelWallpaperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelWallpaperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblMastercard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnProcesarPago, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );
        panelWallpaperLayout.setVerticalGroup(
            panelWallpaperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelWallpaperLayout.createSequentialGroup()
                .addGroup(panelWallpaperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelWallpaperLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lblMastercard, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelWallpaperLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)))
                .addGroup(panelWallpaperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelWallpaperLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelWallpaperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblfuncionVista, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelWallpaperLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelWallpaperLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnProcesarPago, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Comprar boletos", panelWallpaper);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFechaCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaCadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaCadActionPerformed

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteActionPerformed

    private void lblImg11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg11MouseEntered
    }//GEN-LAST:event_lblImg11MouseEntered
private int contadorClicks = 0;
private int total = 0;

    private void lblImg11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg11MouseClicked
        contadorClicks++;
        Boleto boletoPrice = new Boleto();
        if (contadorClicks <= 3) {
            total += 100; // Sumar 100 al total
        }
        this.lblPrice.setText("$ " + total);
        boletoPrice.lblPriceBoleto.setText("$ " + total);
        this.lblImg11.setBackground(new Color(173, 109, 29));
        this.lblImg1.setBackground(new Color(173, 109, 29));
        this.lblImg21.setBackground(new Color(173, 109, 29));
         if (contadorClicks == 3) {
            contadorClicks = 0;
        }   
    }//GEN-LAST:event_lblImg11MouseClicked

    private void lblImg12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg12MouseClicked
        contadorClicks++;
        Boleto boletoPrice = new Boleto();
        if (contadorClicks <= 3) {
            total += 100; // Sumar 100 al total
        }
        this.lblPrice.setText("$ " + total);
        boletoPrice.lblPriceBoleto.setText("$ " + total);
        this.lblImg12.setBackground(new Color(173, 109, 29));
        this.lblImg3.setBackground(new Color(173, 109, 29));
        this.lblImg22.setBackground(new Color(173, 109, 29));
         if (contadorClicks == 3) {
            contadorClicks = 0;
        }
    }//GEN-LAST:event_lblImg12MouseClicked

    private void lblImg14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg14MouseClicked
        contadorClicks++;
        Boleto boletoPrice = new Boleto();
        if (contadorClicks <= 3) {
            total += 100; // Sumar 100 al total
        }
        this.lblPrice.setText("$ " + total);
        boletoPrice.lblPriceBoleto.setText("$ " + total);
        this.lblImg14.setBackground(new Color(173, 109, 29));
        this.lblImg23.setBackground(new Color(173, 109, 29));
        this.lblImg24.setBackground(new Color(173, 109, 29));
         if (contadorClicks == 3) {
            contadorClicks = 0;
        }
    }//GEN-LAST:event_lblImg14MouseClicked

    private void lblImg15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg15MouseClicked
        contadorClicks++;
        if (contadorClicks <= 3) {
            total += 100; // Sumar 100 al total
        }
        this.lblPrice.setText("$ " + total);
        this.lblImg15.setBackground(new Color(173, 109, 29));
        this.lblImg5.setBackground(new Color(173, 109, 29));
        this.lblImg26.setBackground(new Color(173, 109, 29));
         if (contadorClicks == 3) {
            contadorClicks = 0;
        }
    }//GEN-LAST:event_lblImg15MouseClicked

    private void lblImg16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg16MouseClicked
       contadorClicks++;
        if (contadorClicks <= 3) {
            total += 100; // Sumar 100 al total
        }
        this.lblPrice.setText("$ " + total);
        this.lblImg16.setBackground(new Color(173, 109, 29));
        this.lblImg7.setBackground(new Color(173, 109, 29));
        this.lblImg27.setBackground(new Color(173, 109, 29));
         if (contadorClicks == 3) {
            contadorClicks = 0;
        }
    }//GEN-LAST:event_lblImg16MouseClicked

    private void lblImg18KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblImg18KeyPressed
       
    }//GEN-LAST:event_lblImg18KeyPressed

    private void lblImg18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg18MouseClicked
       contadorClicks++;
        if (contadorClicks <= 3) {
            total += 100; // Sumar 100 al total
        }
        this.lblPrice.setText("$ " + total);
        this.lblImg18.setBackground(new Color(173, 109, 29));
        this.lblImg19.setBackground(new Color(173, 109, 29));
        this.lblImg28.setBackground(new Color(173, 109, 29));
         if (contadorClicks == 3) {
            contadorClicks = 0;
        }
    }//GEN-LAST:event_lblImg18MouseClicked

    private void lblImg19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg19MouseClicked
        contadorClicks++;
        if (contadorClicks <= 3) {
            total += 100; // Sumar 100 al total
        }
        this.lblPrice.setText("$ " + total);
        this.lblImg19.setBackground(new Color(173, 109, 29));
         if (contadorClicks == 3) {
            contadorClicks = 0;
        }
    }//GEN-LAST:event_lblImg19MouseClicked

    private void lblImg20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg20MouseClicked
       contadorClicks++;
        if (contadorClicks <= 3) {
            total += 100; // Sumar 100 al total
        }
        this.lblPrice.setText("$ " + total);
        this.lblImg20.setBackground(new Color(173, 109, 29));
        this.lblImg10.setBackground(new Color(173, 109, 29));
        this.lblImg30.setBackground(new Color(173, 109, 29));
         if (contadorClicks == 3) {
            contadorClicks = 0;
        }
    }//GEN-LAST:event_lblImg20MouseClicked

    
    
    private void btnProcesarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarPagoActionPerformed
        JOptionPane.showMessageDialog(this, "Procesando pago... Por favor espere.", "Procesando", JOptionPane.INFORMATION_MESSAGE);

    // Crear un SwingWorker para manejar el proceso en segundo plano
    new SwingWorker<Void, Void>() {
        @Override
        protected Void doInBackground() throws Exception {
            // Esperar 5 segundos
            Thread.sleep(3000);
            return null;
        }

        @Override
        protected void done() {
            // Este método se ejecuta en el hilo de la interfaz de usuario después de que doInBackground ha terminado
            
            Boleto sendData = new Boleto();
            sendData.setVisible(true);

            String cliente = txtCliente.getText();

            // Pasar los datos al JFrame Boleto
            char[] passwordChars = txtNumTarjeta.getPassword();
            String password = new String(passwordChars);
            sendData.lblPriceBoleto.setText("$ " + total);
            sendData.lblNameClient.setText(cliente);
            sendData.lblTarjetaBoleto.setText(password);
            Arrays.fill(passwordChars, '\0');

            // Configurar el ícono según la función seleccionada
            Functions funciones = new Functions(); // Instancia de Functions

            if (funciones.btnSelect == funciones.btnSelect) {
                sendData.lblFuncionBoleto.setIcon(new ImageIcon(funciones.func1));
            } else if (funciones.btnSelect2 == funciones.btnSelect2) {
                sendData.lblFuncionBoleto.setIcon(new ImageIcon(funciones.func2));
            } else if (funciones.btnSelect3 == funciones.btnSelect3) {
                sendData.lblFuncionBoleto.setIcon(new ImageIcon(funciones.func3));
            } else if (funciones.btnSelect4 == funciones.btnSelect4) {
                sendData.lblFuncionBoleto.setIcon(new ImageIcon(funciones.func4));
            }
        }
    }.execute();
    }//GEN-LAST:event_btnProcesarPagoActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SelectChairs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectChairs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectChairs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectChairs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectChairs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcesarPago;
    private javax.swing.JLabel dispose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblAsientoComprar;
    private javax.swing.JLabel lblImg1;
    private javax.swing.JLabel lblImg10;
    private javax.swing.JLabel lblImg11;
    private javax.swing.JLabel lblImg12;
    private javax.swing.JLabel lblImg13;
    private javax.swing.JLabel lblImg14;
    private javax.swing.JLabel lblImg15;
    private javax.swing.JLabel lblImg16;
    private javax.swing.JLabel lblImg17;
    private javax.swing.JLabel lblImg18;
    private javax.swing.JLabel lblImg19;
    private javax.swing.JLabel lblImg2;
    private javax.swing.JLabel lblImg20;
    private javax.swing.JLabel lblImg21;
    private javax.swing.JLabel lblImg22;
    private javax.swing.JLabel lblImg23;
    private javax.swing.JLabel lblImg24;
    private javax.swing.JLabel lblImg25;
    private javax.swing.JLabel lblImg26;
    private javax.swing.JLabel lblImg27;
    private javax.swing.JLabel lblImg28;
    private javax.swing.JLabel lblImg29;
    private javax.swing.JLabel lblImg3;
    private javax.swing.JLabel lblImg30;
    private javax.swing.JLabel lblImg4;
    private javax.swing.JLabel lblImg5;
    private javax.swing.JLabel lblImg6;
    private javax.swing.JLabel lblImg7;
    private javax.swing.JLabel lblImg8;
    private javax.swing.JLabel lblImg9;
    private javax.swing.JLabel lblMastercard;
    private javax.swing.JLabel lblPrice;
    public javax.swing.JLabel lblfuncionVista;
    private javax.swing.JLabel noDispose;
    private javax.swing.JPanel panelWallpaper;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtCvv;
    private javax.swing.JTextField txtFechaCad;
    public javax.swing.JPasswordField txtNumTarjeta;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the lblImg11
     */
    public javax.swing.JLabel getLblImg11() {
        return lblImg11;
    }

    /**
     * @param lblImg11 the lblImg11 to set
     */
    public void setLblImg11(javax.swing.JLabel lblImg11) {
        this.lblImg11 = lblImg11;
    }
}
