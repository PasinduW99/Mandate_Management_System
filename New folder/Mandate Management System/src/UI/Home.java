/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Database.DBconnect;
import Main.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.awt.Color;
import java.awt.Image;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author THARANGA-TKS
 */
public class Home extends javax.swing.JFrame {
     Connection con=null;
     PreparedStatement pst = null;
     ResultSet rs=null;
     

    public Home() {
        initComponents();
        con=DBconnect.connect();
        acc_noText.setText("");
        fLbl.setText(" ");
        rLbl.setText(" ");
        pLbl.setText(" ");
        tColor.setBackground(Color.WHITE);
        pColor.setBackground(Color.WHITE);
        rP.setBackground(Color.WHITE);
        fP.setBackground(Color.WHITE);
        //imgc();
    }
    
     public void imgc(){
        ImageIcon ico= new ImageIcon("src\\Image\\Bank_of_Ceylon.svg.png");
        //ImageIcon ico= new ImageIcon("src\\Image\\user-profile-icon.png");
        //ImageIcon icoPass= new ImageIcon("src\\Image\\2889676.png");
        Image img= ico.getImage();
        //Image imgUser= icoUser.getImage();
        //Image imgPass= icoPass.getImage();
        Image imgScale=img.getScaledInstance(lblImg.getWidth(),lblImg.getHeight(), Image.SCALE_SMOOTH);
        //Image imgScaleU=imgUser.getScaledInstance(uLbl.getWidth(),uLbl.getHeight(), Image.SCALE_SMOOTH);
        //Image imgScaleP=imgPass.getScaledInstance(pLbl.getWidth(),pLbl.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon =new ImageIcon(imgScale);
        //ImageIcon scaledIconU =new ImageIcon(imgScaleU);
        //ImageIcon scaledIconP =new ImageIcon(imgScaleP);
        lblImg.setIcon(scaledIcon);
        //uLbl.setIcon(scaledIconU);
        //pLbl.setIcon(scaledIconP);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lblImg = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        acc_noText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tColor = new javax.swing.JPanel();
        fP = new javax.swing.JPanel();
        fLbl = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rP = new javax.swing.JPanel();
        rLbl = new javax.swing.JLabel();
        pColor = new javax.swing.JPanel();
        pLbl = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pnlOp = new javax.swing.JPanel();
        lblAdmin = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        pnlAbout = new javax.swing.JPanel();
        lblAbout = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        pnlExit = new javax.swing.JPanel();
        lblExit = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        pnlLog = new javax.swing.JPanel();
        lblLog = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        pnlSearch = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlClear = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblMsg = new javax.swing.JLabel();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mandate Management System - BOC");
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 26)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Mandate Management System - Bank of Ceylon");

        lblImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/IMG_20230312_213048.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(240, 180, 7));

        acc_noText.setBackground(new java.awt.Color(240, 180, 7));
        acc_noText.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        acc_noText.setForeground(new java.awt.Color(255, 255, 255));
        acc_noText.setBorder(null);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Account No:");

        javax.swing.GroupLayout tColorLayout = new javax.swing.GroupLayout(tColor);
        tColor.setLayout(tColorLayout);
        tColorLayout.setHorizontalGroup(
            tColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 122, Short.MAX_VALUE)
        );
        tColorLayout.setVerticalGroup(
            tColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 121, Short.MAX_VALUE)
        );

        fLbl.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        fLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fLbl.setText("1");

        javax.swing.GroupLayout fPLayout = new javax.swing.GroupLayout(fP);
        fP.setLayout(fPLayout);
        fPLayout.setHorizontalGroup(
            fPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
        );
        fPLayout.setVerticalGroup(
            fPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fPLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(fLbl))
        );

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Rack No:");

        rLbl.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        rLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rLbl.setText("1");

        javax.swing.GroupLayout rPLayout = new javax.swing.GroupLayout(rP);
        rP.setLayout(rPLayout);
        rPLayout.setHorizontalGroup(
            rPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
        );
        rPLayout.setVerticalGroup(
            rPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rPLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(rLbl))
        );

        pLbl.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        pLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pLbl.setText("1");

        javax.swing.GroupLayout pColorLayout = new javax.swing.GroupLayout(pColor);
        pColor.setLayout(pColorLayout);
        pColorLayout.setHorizontalGroup(
            pColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
        );
        pColorLayout.setVerticalGroup(
            pColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pColorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pLbl))
        );

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Partition:");

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("File No:");

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("File Color:");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlOp.setBackground(new java.awt.Color(255, 255, 255));

        lblAdmin.setBackground(new java.awt.Color(0, 0, 0));
        lblAdmin.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdmin.setText("Option");
        lblAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAdminMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAdminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAdminMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblAdminMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblAdminMouseReleased(evt);
            }
        });

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pnlOpLayout = new javax.swing.GroupLayout(pnlOp);
        pnlOp.setLayout(pnlOpLayout);
        pnlOpLayout.setHorizontalGroup(
            pnlOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(jSeparator7))
                .addContainerGap())
        );
        pnlOpLayout.setVerticalGroup(
            pnlOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpLayout.createSequentialGroup()
                .addComponent(lblAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(pnlOp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 36));

        pnlAbout.setBackground(new java.awt.Color(255, 255, 255));

        lblAbout.setBackground(new java.awt.Color(0, 0, 0));
        lblAbout.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblAbout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAbout.setText("About Us");
        lblAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAboutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAboutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAboutMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblAboutMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblAboutMouseReleased(evt);
            }
        });

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pnlAboutLayout = new javax.swing.GroupLayout(pnlAbout);
        pnlAbout.setLayout(pnlAboutLayout);
        pnlAboutLayout.setHorizontalGroup(
            pnlAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAboutLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAbout, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(jSeparator8))
                .addContainerGap())
        );
        pnlAboutLayout.setVerticalGroup(
            pnlAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAboutLayout.createSequentialGroup()
                .addComponent(lblAbout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(pnlAbout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 214, 140, 36));

        pnlExit.setBackground(new java.awt.Color(255, 255, 255));

        lblExit.setBackground(new java.awt.Color(0, 0, 0));
        lblExit.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExit.setText("Exit");
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblExitMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblExitMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblExitMouseReleased(evt);
            }
        });

        jSeparator9.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pnlExitLayout = new javax.swing.GroupLayout(pnlExit);
        pnlExit.setLayout(pnlExitLayout);
        pnlExitLayout.setHorizontalGroup(
            pnlExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlExitLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblExit, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(jSeparator9))
                .addContainerGap())
        );
        pnlExitLayout.setVerticalGroup(
            pnlExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlExitLayout.createSequentialGroup()
                .addComponent(lblExit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(pnlExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 256, 140, 36));

        pnlLog.setBackground(new java.awt.Color(255, 255, 255));

        lblLog.setBackground(new java.awt.Color(0, 0, 0));
        lblLog.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblLog.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLog.setText("Log Out");
        lblLog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblLogMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblLogMouseReleased(evt);
            }
        });

        jSeparator10.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pnlLogLayout = new javax.swing.GroupLayout(pnlLog);
        pnlLog.setLayout(pnlLogLayout);
        pnlLogLayout.setHorizontalGroup(
            pnlLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLog, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(jSeparator10))
                .addContainerGap())
        );
        pnlLogLayout.setVerticalGroup(
            pnlLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogLayout.createSequentialGroup()
                .addComponent(lblLog)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(pnlLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 140, 36));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setAlignmentX(1.0F);
        jSeparator1.setAlignmentY(1.0F);

        pnlSearch.setBackground(new java.awt.Color(240, 180, 7));
        pnlSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Search");
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

        javax.swing.GroupLayout pnlSearchLayout = new javax.swing.GroupLayout(pnlSearch);
        pnlSearch.setLayout(pnlSearchLayout);
        pnlSearchLayout.setHorizontalGroup(
            pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
        );
        pnlSearchLayout.setVerticalGroup(
            pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        pnlClear.setBackground(new java.awt.Color(240, 180, 7));
        pnlClear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Clear");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel3MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlClearLayout = new javax.swing.GroupLayout(pnlClear);
        pnlClear.setLayout(pnlClearLayout);
        pnlClearLayout.setHorizontalGroup(
            pnlClearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
        );
        pnlClearLayout.setVerticalGroup(
            pnlClearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        lblMsg.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblMsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(tColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator1)
                                .addComponent(acc_noText, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42)
                        .addComponent(pnlSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblMsg, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(3, 3, 3)
                        .addComponent(acc_noText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnlClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pnlSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        java.awt.Dimension dialogSize = getSize();
        setLocation((screenSize.width-dialogSize.width)/2,(screenSize.height-dialogSize.height)/2);
    }// </editor-fold>//GEN-END:initComponents

    private void lblAdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdminMouseEntered
        pnlOp.setBackground(new Color(240,180,7));
    }//GEN-LAST:event_lblAdminMouseEntered

    private void lblAdminMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdminMousePressed
        pnlOp.setBackground(new Color(173,105,3));
    }//GEN-LAST:event_lblAdminMousePressed

    private void lblAboutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAboutMouseEntered
        pnlAbout.setBackground(new Color(240,180,7));
    }//GEN-LAST:event_lblAboutMouseEntered

    private void lblAboutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAboutMousePressed
        pnlAbout.setBackground(new Color(173,105,3));
    }//GEN-LAST:event_lblAboutMousePressed

    private void lblExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseEntered
        pnlExit.setBackground(new Color(240,180,7));
    }//GEN-LAST:event_lblExitMouseEntered

    private void lblExitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMousePressed
        pnlExit.setBackground(new Color(173,105,3));
    }//GEN-LAST:event_lblExitMousePressed

    private void lblAdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdminMouseExited
        pnlOp.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_lblAdminMouseExited

    private void lblAboutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAboutMouseExited
        pnlAbout.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_lblAboutMouseExited

    private void lblExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseExited
        pnlExit.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_lblExitMouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
         try{
            String acc_no=acc_noText.getText();
            
            if (acc_no.length()>0){
                String sql="select file.Rack_No,file.File_No,file.Partition_ID,partition_table.Partition_Color,account.Color from account,partition_table,file where file.Account_No='"+acc_no+"' and file.Partition_ID=partition_table.Partition_ID and file.Acc_Type_ID=account.Acc_Type_ID;";
                pst=(PreparedStatement) con.prepareStatement(sql);
                rs=pst.executeQuery();
                if(rs.next()){
                    lblMsg.setText("Mandate find successfully.");
                    lblMsg.setForeground(Color.white);
                    String f_no=rs.getString(2);
                    String r_no=rs.getString(1);
                    String p_no=rs.getString(3);
                    String p_c=rs.getString(4);
                    String t_c=rs.getString(5);
                    
                    
                    fLbl.setText(f_no);
                    rLbl.setText(r_no);
                    pLbl.setText(p_no);
                    if (t_c.equals("RED")){
                        tColor.setBackground(Color.red);
                    }
                    else if(t_c.equals("GREEN")){
                        tColor.setBackground(Color.GREEN);
                    }
                    else if(t_c.equals("BLUE")){
                        tColor.setBackground(Color.BLUE);
                    }
                    else if(t_c.equals("ORANGE")){
                        tColor.setBackground(Color.ORANGE);
                    }
                    else if(t_c.equals("YELLOW")){
                        tColor.setBackground(Color.YELLOW);
                    }
                    if (p_c.equals("RED")){
                        pColor.setBackground(Color.red);
                    }
                    else if(p_c.equals("GREEN")){
                        pColor.setBackground(Color.GREEN);
                    }
                    else if(p_c.equals("BLUE")){
                        pColor.setBackground(Color.BLUE);
                    }
                    else if(p_c.equals("ORANGE")){
                        pColor.setBackground(Color.ORANGE);
                    }
                    else if(p_c.equals("YELLOW")){
                        pColor.setBackground(Color.YELLOW);
                        
                    }
                    
                    
                }
                else{
                    lblMsg.setText("Invalid Acc No.");
                    lblMsg.setForeground(Color.red);
                    acc_noText.setText("");
                    
                }
            }
            else{
                lblMsg.setText("Account No Field is Empty.");
                lblMsg.setForeground(Color.red);
            }
        }catch(Exception e){
            lblMsg.setText("Something went wrong. Please try again.");
            lblMsg.setForeground(Color.red);
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        acc_noText.setText("");
        fLbl.setText(" ");
        rLbl.setText(" ");
        pLbl.setText(" ");
        tColor.setBackground(Color.WHITE);
        pColor.setBackground(Color.WHITE);
        lblMsg.setText("");
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        pnlSearch.setBackground(new Color(205,152,0));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        pnlSearch.setBackground(new Color(240,180,7));
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        pnlSearch.setBackground(new Color(173,105,3));
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseReleased
        pnlSearch.setBackground(new Color(205,152,0));
    }//GEN-LAST:event_jLabel1MouseReleased

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        pnlClear.setBackground(new Color(205,152,0));

    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        pnlClear.setBackground(new Color(240,180,7));    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        pnlClear.setBackground(new Color(173,105,3));
    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseReleased
        pnlClear.setBackground(new Color(205,152,0));
    }//GEN-LAST:event_jLabel3MouseReleased

    private void lblLogMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogMouseEntered
        pnlLog.setBackground(new Color(240,180,7));
    }//GEN-LAST:event_lblLogMouseEntered

    private void lblLogMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogMouseExited
        pnlLog.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_lblLogMouseExited

    private void lblLogMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogMousePressed
        pnlLog.setBackground(new Color(173,105,3));
    }//GEN-LAST:event_lblLogMousePressed

    private void lblAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdminMouseClicked
        Pw_authentication pw = new Pw_authentication();
        pw.setVisible(true);
    }//GEN-LAST:event_lblAdminMouseClicked

    private void lblLogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogMouseClicked
        Login lg =new Login();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblLogMouseClicked

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        int x= JOptionPane.showConfirmDialog(null, "Do you really want to Exit?");
        if(x==0){
            System.exit(0);
        }
    }//GEN-LAST:event_lblExitMouseClicked

    private void lblAdminMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdminMouseReleased
        pnlOp.setBackground(new Color(205,152,0));
    }//GEN-LAST:event_lblAdminMouseReleased

    private void lblLogMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogMouseReleased
        pnlLog.setBackground(new Color(205,152,0));
    }//GEN-LAST:event_lblLogMouseReleased

    private void lblAboutMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAboutMouseReleased
        pnlAbout.setBackground(new Color(205,152,0));
    }//GEN-LAST:event_lblAboutMouseReleased

    private void lblExitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseReleased
        pnlExit.setBackground(new Color(205,152,0));
    }//GEN-LAST:event_lblExitMouseReleased

    private void lblAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAboutMouseClicked
        About_Us au=new About_Us();
        au.setVisible(true);
    }//GEN-LAST:event_lblAboutMouseClicked

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Home().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField acc_noText;
    private javax.swing.JLabel fLbl;
    private javax.swing.JPanel fP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblAbout;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblImg;
    private javax.swing.JLabel lblLog;
    private javax.swing.JLabel lblMsg;
    private javax.swing.JPanel pColor;
    private javax.swing.JLabel pLbl;
    private javax.swing.JPanel pnlAbout;
    private javax.swing.JPanel pnlClear;
    private javax.swing.JPanel pnlExit;
    private javax.swing.JPanel pnlLog;
    private javax.swing.JPanel pnlOp;
    private javax.swing.JPanel pnlSearch;
    private javax.swing.JLabel rLbl;
    private javax.swing.JPanel rP;
    private javax.swing.JPanel tColor;
    // End of variables declaration//GEN-END:variables
}
