
package UI;

import Database.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.awt.Color;
import java.sql.ResultSet;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public final class Admin_option extends javax.swing.JFrame {
    Connection con=null;
    PreparedStatement pst = null;
    ResultSet rs=null;

    public Admin_option() {
        initComponents();
        con=DBconnect.connect();
        tableload();
        tableloadPart();
        typeComboLoad();
        partComboLoad();
        tableloadMando();
    }
    
    public void tableload(){
        try{
            String sql = "select * from account";
            pst=(PreparedStatement) con.prepareStatement(sql);
            rs=pst.executeQuery();
            accTable.setModel(DbUtils.resultSetToTableModel(rs));
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Something went wrong.");
        }
    }
    public void tableloadPart(){
        try{
            String sql = "select * from partition_table order by Partition_ID asc";
            pst=(PreparedStatement) con.prepareStatement(sql);
            rs=pst.executeQuery();
            tblePrt.setModel(DbUtils.resultSetToTableModel(rs));
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,  "Something went wrong.");
        }
    }
    public void tableloadMando(){
        try{
            String sql = "select * from file order by Account_No asc";
            pst=(PreparedStatement) con.prepareStatement(sql);
            rs=pst.executeQuery();
            tbleMando.setModel(DbUtils.resultSetToTableModel(rs));
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,  "Something went wrong.");
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        accNo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        fileNo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        rackNo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        accIdBox = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        partitionIdBox = new javax.swing.JComboBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbleMando = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jButton10 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        AccTypeId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        AccType = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ColorBox = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        accTable = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jButton11 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        prtBox = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        colorBox = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblePrt = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton12 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Admin Option");
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setResizable(false);

        jTabbedPane1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(240, 180, 7));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Account No:");

        accNo.setBackground(new java.awt.Color(240, 180, 7));
        accNo.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        accNo.setForeground(new java.awt.Color(255, 255, 255));
        accNo.setBorder(null);

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("File No:");

        fileNo.setBackground(new java.awt.Color(240, 180, 7));
        fileNo.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        fileNo.setForeground(new java.awt.Color(255, 255, 255));
        fileNo.setBorder(null);

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Rack No:");

        rackNo.setBackground(new java.awt.Color(240, 180, 7));
        rackNo.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        rackNo.setForeground(new java.awt.Color(255, 255, 255));
        rackNo.setBorder(null);

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Acc.Type ID:");

        accIdBox.setBackground(new java.awt.Color(240, 180, 7));
        accIdBox.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        accIdBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Acc.Type" }));
        accIdBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accIdBoxMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Partition ID:");

        partitionIdBox.setBackground(new java.awt.Color(240, 180, 7));
        partitionIdBox.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        partitionIdBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Part.ID" }));

        tbleMando.setBackground(new java.awt.Color(0, 0, 0));
        tbleMando.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tbleMando.setForeground(new java.awt.Color(255, 255, 255));
        tbleMando.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbleMando.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbleMandoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbleMando);

        jButton7.setBackground(new java.awt.Color(240, 180, 7));
        jButton7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton7.setText("Create");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(240, 180, 7));
        jButton8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton8.setText("Update");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(240, 180, 7));
        jButton9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton9.setText("Delete");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(240, 180, 7));
        jButton10.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton10.setText("Clear");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(accIdBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(partitionIdBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton10))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(accNo)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(fileNo, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(rackNo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fileNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rackNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(accIdBox, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(partitionIdBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9)
                    .addComponent(jButton10))
                .addContainerGap())
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Mandate", jPanel1);

        jPanel2.setBackground(new java.awt.Color(240, 180, 7));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Account Type ID :");

        AccTypeId.setBackground(new java.awt.Color(240, 180, 7));
        AccTypeId.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        AccTypeId.setForeground(new java.awt.Color(255, 255, 255));
        AccTypeId.setBorder(null);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Account Type :");

        AccType.setBackground(new java.awt.Color(240, 180, 7));
        AccType.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        AccType.setForeground(new java.awt.Color(255, 255, 255));
        AccType.setBorder(null);

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Type Color :");

        ColorBox.setBackground(new java.awt.Color(240, 180, 7));
        ColorBox.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        ColorBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Color", "RED", "GREEN", "BLUE", "ORANGE", "YELLOW" }));

        jButton1.setBackground(new java.awt.Color(240, 180, 7));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton1.setText("Create");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(240, 180, 7));
        jButton2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(240, 180, 7));
        jButton3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        accTable.setBackground(new java.awt.Color(0, 0, 0));
        accTable.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        accTable.setForeground(new java.awt.Color(255, 255, 255));
        accTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        accTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(accTable);

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));

        jButton11.setBackground(new java.awt.Color(240, 180, 7));
        jButton11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton11.setText("Clear");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(ColorBox, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(AccType, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                        .addComponent(AccTypeId, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AccTypeId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AccType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ColorBox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton11))
                .addContainerGap(38, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Account Type", jPanel2);

        jPanel3.setBackground(new java.awt.Color(240, 180, 7));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Partition No:");

        prtBox.setBackground(new java.awt.Color(240, 180, 7));
        prtBox.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        prtBox.setForeground(new java.awt.Color(255, 255, 255));
        prtBox.setBorder(null);

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Color:");

        colorBox.setBackground(new java.awt.Color(240, 180, 7));
        colorBox.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        colorBox.setMaximumRowCount(20);
        colorBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Color", "RED", "GREEN", "BLUE", "ORANGE", "YELLOW" }));
        colorBox.setBorder(null);

        tblePrt.setBackground(new java.awt.Color(0, 0, 0));
        tblePrt.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tblePrt.setForeground(new java.awt.Color(255, 255, 255));
        tblePrt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblePrt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblePrtMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblePrt);

        jButton4.setBackground(new java.awt.Color(240, 180, 7));
        jButton4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton4.setText("Create");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(240, 180, 7));
        jButton5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton5.setText("Update");
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(240, 180, 7));
        jButton6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton6.setText("Delete");
        jButton6.setBorder(null);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jButton12.setBackground(new java.awt.Color(240, 180, 7));
        jButton12.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton12.setText("Clear");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(prtBox, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton12))
                    .addComponent(colorBox, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(prtBox, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(colorBox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Partition", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String acc_type_id=AccTypeId.getText();
        String acc_type=AccType.getText();
        String acc_color=ColorBox.getSelectedItem().toString();
        
        try{
            String q="insert into account (Acc_Type_ID,Acc_Type,Color) values('"+acc_type_id+"','"+acc_type+"','"+acc_color+"')";
            pst = (PreparedStatement) con.prepareStatement(q);
            pst.execute();
            tableload();
            accIdBox.removeAllItems();
            typeComboLoad();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,  "Something went wrong.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void accTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accTableMouseClicked
        int row= accTable.getSelectedRow();
        String accId=accTable.getValueAt(row, 0).toString();
        String accType=accTable.getValueAt(row, 1).toString();
        String accColor=accTable.getValueAt(row, 2).toString();
        AccTypeId.setText(accId);
        AccType.setText(accType);
        ColorBox.setSelectedItem(accColor);
    }//GEN-LAST:event_accTableMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int x= JOptionPane.showConfirmDialog(null,"Do you really want to update?"); 
        if (x==0){
            String accId=AccTypeId.getText();
            String accType=AccType.getText();
            String AccColor=ColorBox.getSelectedItem().toString();
            try{
                String sql = "update account set Acc_Type='"+accType+"',Color='"+AccColor+"' where Acc_Type_ID='"+accId+"'";
                pst=(PreparedStatement) con.prepareStatement(sql);
                pst.execute();
                tableload();
                accIdBox.removeAllItems();
                typeComboLoad();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,  "Something went wrong.");
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int x= JOptionPane.showConfirmDialog(null, "Do you really want to delete?");
        if (x==0){
            String id = AccTypeId.getText();
            try{
                String sql="Delete from account where Acc_Type_ID='"+id+"'";
                pst=(PreparedStatement) con.prepareStatement(sql);
                pst.execute();
                tableload();
                accIdBox.removeAllItems();
                typeComboLoad();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,  "Something went wrong.");
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String part_Id=prtBox.getText();
        String prt_color=colorBox.getSelectedItem().toString();
        
        try{
            String q="insert into partition_table (Partition_ID,Partition_Color) values('"+part_Id+"','"+prt_color+"')";
            pst = (PreparedStatement) con.prepareStatement(q);
            pst.execute();
            tableloadPart();
            partitionIdBox.removeAllItems();
            partComboLoad();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Something went wrong.");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tblePrtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblePrtMouseClicked
        int row= tblePrt.getSelectedRow();
        String prtId=tblePrt.getValueAt(row, 0).toString();
        String prtColor=tblePrt.getValueAt(row, 1).toString();
        
        prtBox.setText(prtId);
        colorBox.setSelectedItem(prtColor);
    }//GEN-LAST:event_tblePrtMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int x= JOptionPane.showConfirmDialog(null,"Do you really want to update?"); 
        if (x==0){
            String partId=prtBox.getText();
            String clrBox=colorBox.getSelectedItem().toString();
            try{
                String sql = "update partition_table set Partition_Color='"+clrBox+"' where Partition_ID='"+partId+"'";
                pst=(PreparedStatement) con.prepareStatement(sql);
                pst.execute();
                tableloadPart();
                partitionIdBox.removeAllItems();
                partComboLoad();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Something went wrong.");
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int x= JOptionPane.showConfirmDialog(null, "Do you really want to delete?");
        if (x==0){
            String id = prtBox.getText();
            try{
                String sql="Delete from partition_table where Partition_ID='"+id+"'";
                pst=(PreparedStatement) con.prepareStatement(sql);
                pst.execute();
                tableloadPart();
                partitionIdBox.removeAllItems();
                partComboLoad();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Something went wrong.");
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    public void typeComboLoad(){
         try{
            Statement stm=(Statement) con.createStatement();
            ResultSet rs=stm.executeQuery("Select Acc_Type_ID from account");
            while(rs.next()){
                String type=rs.getString("Acc_Type_ID");
                accIdBox.addItem(type);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Something went wrong.");
        }
    }
    public void partComboLoad(){
        try{
            Statement stm=(Statement) con.createStatement();
            ResultSet rs=stm.executeQuery("Select Partition_ID from partition_table");
            while(rs.next()){
                String type=rs.getString("Partition_ID");
                partitionIdBox.addItem(type);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Something went wrong.");
        }
    }
    private void accIdBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accIdBoxMouseClicked
       
    }//GEN-LAST:event_accIdBoxMouseClicked

    private void tbleMandoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbleMandoMouseClicked
        int row= tbleMando.getSelectedRow();
        String acc_No=tbleMando.getValueAt(row, 0).toString();
        String file_No=tbleMando.getValueAt(row, 1).toString();
        String rack_No=tbleMando.getValueAt(row, 2).toString();
        String part_No=tbleMando.getValueAt(row, 3).toString();
        String acc_Type=tbleMando.getValueAt(row, 4).toString();
        
        accNo.setText(acc_No);
        fileNo.setText(file_No);
        rackNo.setText(rack_No);
        accIdBox.setSelectedItem(acc_Type);
        partitionIdBox.setSelectedItem(part_No);
    }//GEN-LAST:event_tbleMandoMouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String acc_No=accNo.getText();
        String file_No=fileNo.getText();
        String rack_No=rackNo.getText();
        String acc_Id=accIdBox.getSelectedItem().toString();
        String part_Id=partitionIdBox.getSelectedItem().toString();
        
        try{
            String q="insert into file (Account_No,File_No,Rack_No,Partition_ID,Acc_Type_ID) values('"+acc_No+"','"+file_No+"','"+rack_No+"','"+part_Id+"','"+acc_Id+"')";
            pst = (PreparedStatement) con.prepareStatement(q);
            pst.execute();
            tableloadMando();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Something went wrong.");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        int x= JOptionPane.showConfirmDialog(null,"Do you really want to update?"); 
        if (x==0){
            String acc_NO=accNo.getText();
            String file_No=fileNo.getText();
            String rack_No=rackNo.getText();
            String Acctype=accIdBox.getSelectedItem().toString();
            String part_id=partitionIdBox.getSelectedItem().toString();
            try{
                String sql = "update file set File_No='"+file_No+"',Rack_No='"+rack_No+"',Partition_ID='"+part_id+"',Acc_Type_ID='"+Acctype+"' where Account_No='"+acc_NO+"'";
                
                pst=(PreparedStatement) con.prepareStatement(sql);
                pst.execute();
                tableloadMando();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Something went wrong.");
            }
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        int x= JOptionPane.showConfirmDialog(null, "Do you really want to delete?");
        if (x==0){
            String acc_No = accNo.getText();
            try{
                String sql="Delete from file where Account_No='"+acc_No+"'";
                pst=(PreparedStatement) con.prepareStatement(sql);
                pst.execute();
                tableloadMando();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Something went wrong.");
            }
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        accNo.setText("");
        fileNo.setText("");
        rackNo.setText("");
        accIdBox.setSelectedItem("Select Acc.Type");
        partitionIdBox.setSelectedItem("Select Part.ID");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        AccTypeId.setText("");
        AccType.setText("");
        ColorBox.setSelectedItem("Select Color");
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        prtBox.setText("");
        colorBox.setSelectedItem("Select Color");
    }//GEN-LAST:event_jButton12ActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_option.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_option.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_option.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_option.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Admin_option().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AccType;
    private javax.swing.JTextField AccTypeId;
    private javax.swing.JComboBox ColorBox;
    private javax.swing.JComboBox accIdBox;
    private javax.swing.JTextField accNo;
    private javax.swing.JTable accTable;
    private javax.swing.JComboBox colorBox;
    private javax.swing.JTextField fileNo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox partitionIdBox;
    private javax.swing.JTextField prtBox;
    private javax.swing.JTextField rackNo;
    private javax.swing.JTable tbleMando;
    private javax.swing.JTable tblePrt;
    // End of variables declaration//GEN-END:variables
}
