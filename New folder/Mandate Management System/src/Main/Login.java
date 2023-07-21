/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;


import UI.Home;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.awt.Color;
import java.awt.Image;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/**
 *
 * @author THARANGA-TKS
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        //imgc();
        
    }
    
    public void imgc(){
        ImageIcon ico= new ImageIcon("src\\Image\\Bank_of_Ceylon.svg.png");
        ImageIcon icoUser= new ImageIcon("src\\Image\\user-profile-icon.png");
        ImageIcon icoPass= new ImageIcon("src\\Image\\2889676.png");
        Image img= ico.getImage();
        Image imgUser= icoUser.getImage();
        Image imgPass= icoPass.getImage();
        Image imgScale=img.getScaledInstance(lblImg.getWidth(),lblImg.getHeight(), Image.SCALE_SMOOTH);
        Image imgScaleU=imgUser.getScaledInstance(uLbl.getWidth(),uLbl.getHeight(), Image.SCALE_SMOOTH);
        Image imgScaleP=imgPass.getScaledInstance(pLbl.getWidth(),pLbl.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon =new ImageIcon(imgScale);
        ImageIcon scaledIconU =new ImageIcon(imgScaleU);
        ImageIcon scaledIconP =new ImageIcon(imgScaleP);
        lblImg.setIcon(scaledIcon);
        uLbl.setIcon(scaledIconU);
        pLbl.setIcon(scaledIconP);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblImg = new javax.swing.JLabel();
        lePnl = new javax.swing.JPanel();
        passwordText = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        usernameText = new javax.swing.JTextField();
        xLbl = new javax.swing.JLabel();
        lPnl = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        uLbl = new javax.swing.JLabel();
        pLbl = new javax.swing.JLabel();
        msgLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(50, 50, 0, 0));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.TOOLKIT_EXCLUDE);
        setResizable(false);
        setUndecorated(true);

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lblImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/IMG_20230312_212628.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        jPanel1.add(jPanel2);

        lePnl.setBackground(new java.awt.Color(240, 180, 7));

        passwordText.setBackground(new java.awt.Color(240, 180, 7));
        passwordText.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        passwordText.setForeground(new java.awt.Color(255, 255, 255));
        passwordText.setText("Password");
        passwordText.setBorder(null);
        passwordText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordTextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                passwordTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                passwordTextMouseExited(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        usernameText.setBackground(new java.awt.Color(240, 180, 7));
        usernameText.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        usernameText.setForeground(new java.awt.Color(255, 255, 255));
        usernameText.setText("Username");
        usernameText.setBorder(null);
        usernameText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameTextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                usernameTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                usernameTextMouseExited(evt);
            }
        });

        xLbl.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        xLbl.setForeground(new java.awt.Color(255, 255, 255));
        xLbl.setText("X");
        xLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                xLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                xLblMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                xLblMousePressed(evt);
            }
        });
        xLbl.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                xLblMouseDragged(evt);
            }
        });

        lPnl.setBackground(new java.awt.Color(240, 180, 7));
        lPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        lPnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lPnlMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lPnlMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("     Login");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout lPnlLayout = new javax.swing.GroupLayout(lPnl);
        lPnl.setLayout(lPnlLayout);
        lPnlLayout.setHorizontalGroup(
            lPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        lPnlLayout.setVerticalGroup(
            lPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        uLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/IMG_20230312_214533.png"))); // NOI18N

        pLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/IMG_20230312_214704.png"))); // NOI18N

        msgLbl.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        msgLbl.setForeground(new java.awt.Color(255, 0, 0));
        msgLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout lePnlLayout = new javax.swing.GroupLayout(lePnl);
        lePnl.setLayout(lePnlLayout);
        lePnlLayout.setHorizontalGroup(
            lePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lePnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lePnlLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(xLbl))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lePnlLayout.createSequentialGroup()
                        .addGroup(lePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(lePnlLayout.createSequentialGroup()
                                .addGroup(lePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(uLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(lePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(lePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(lePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jSeparator1))
                                        .addGroup(lePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(passwordText)
                                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(lPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(msgLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 24, Short.MAX_VALUE)))
                .addContainerGap())
        );
        lePnlLayout.setVerticalGroup(
            lePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lePnlLayout.createSequentialGroup()
                .addComponent(xLbl)
                .addGap(14, 14, 14)
                .addGroup(lePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(uLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(lePnlLayout.createSequentialGroup()
                        .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(msgLbl)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jPanel1.add(lePnl);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        java.awt.Dimension dialogSize = getSize();
        setLocation((screenSize.width-dialogSize.width)/2,(screenSize.height-dialogSize.height)/2);
    }// </editor-fold>//GEN-END:initComponents

    private void xLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xLblMouseClicked
        System.exit(0);
    }//GEN-LAST:event_xLblMouseClicked

    private void xLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xLblMouseEntered
        xLbl.setForeground(Color.red);
    }//GEN-LAST:event_xLblMouseEntered

    private void xLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xLblMouseExited
        xLbl.setForeground(Color.white);
    }//GEN-LAST:event_xLblMouseExited

    private void xLblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xLblMousePressed
      
    }//GEN-LAST:event_xLblMousePressed

    private void xLblMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xLblMouseDragged
       
    }//GEN-LAST:event_xLblMouseDragged

    private void lPnlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lPnlMouseEntered
        
    }//GEN-LAST:event_lPnlMouseEntered

    private void lPnlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lPnlMouseExited
        
    }//GEN-LAST:event_lPnlMouseExited

    private void usernameTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameTextMouseEntered
        
        
    }//GEN-LAST:event_usernameTextMouseEntered

    private void passwordTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordTextMouseEntered
        
    }//GEN-LAST:event_passwordTextMouseEntered

    private void usernameTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameTextMouseExited
        if (usernameText.getText().equals("")){
            usernameText.setText("Username");
        }
    }//GEN-LAST:event_usernameTextMouseExited

    private void passwordTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordTextMouseExited
        if(passwordText.getText().equals("")){
            passwordText.setText("Password");
        }
    }//GEN-LAST:event_passwordTextMouseExited

    private void usernameTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameTextMouseClicked
        usernameText.setText("");
        msgLbl.setText("");
    }//GEN-LAST:event_usernameTextMouseClicked

    private void passwordTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordTextMouseClicked
        msgLbl.setText("");
        passwordText.setText("");
    }//GEN-LAST:event_passwordTextMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb", "root", "");
            String lSql = "Select * from login_table where username=? and password=?";
            PreparedStatement pst = (PreparedStatement) conn.prepareStatement(lSql);
            pst.setString(1, usernameText.getText());
            pst.setString(2, passwordText.getText());
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                Home aobj = new Home();
                aobj.setVisible(true);
                this.dispose();
            } else {
                msgLbl.setText("Incorrect Username or Password.");
            }
        } catch (Exception e) {
            msgLbl.setText("Something went wrong. Please try again.");
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        lPnl.setBackground(new Color(205,152,0));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        lPnl.setBackground(new Color(240,180,7));
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        lPnl.setBackground(new Color(173,105,3));
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseReleased
        lPnl.setBackground(new Color(205,152,0));
    }//GEN-LAST:event_jLabel1MouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel lPnl;
    private javax.swing.JLabel lblImg;
    private javax.swing.JPanel lePnl;
    private javax.swing.JLabel msgLbl;
    private javax.swing.JLabel pLbl;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JLabel uLbl;
    private javax.swing.JTextField usernameText;
    private javax.swing.JLabel xLbl;
    // End of variables declaration//GEN-END:variables
}
