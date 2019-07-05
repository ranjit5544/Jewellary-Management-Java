package Gold;

import java.sql.*;
import java.text.*;
import java.util.*;
import javax.swing.*;

public class CustLoan extends javax.swing.JFrame {

        Connection con=null;
	Statement ps;
	ResultSet rs;
        PreparedStatement ps1;
        String name,address,itemName,mobileNo,date;
        int billNo;
        double cutting,netWeight,goldRate,totalAmount;
    public CustLoan() {
        initComponents();
        currentDate();
        try{
         Class.forName("oracle.jdbc.driver.OracleDriver");
	con=DriverManager.getConnection("jdbc:oracle:thin:@:1521:xe","system","1234");
	ps=con.createStatement();
        rs=ps.executeQuery("select * from GOLDRATE");
        String gRate=null;
        while(rs.next())
	{
            gRate=rs.getString(1);
	}
        jGoldRate.setText(gRate);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jClear = new javax.swing.JButton();
        jShow = new javax.swing.JButton();
        jUpdate = new javax.swing.JButton();
        jDelete = new javax.swing.JButton();
        jSave = new javax.swing.JButton();
        jNew = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jBillNo = new javax.swing.JTextField();
        jName = new javax.swing.JTextField();
        jMobileNo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jAddress = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jWeight = new javax.swing.JTextField();
        jGoldRate = new javax.swing.JTextField();
        jItemName = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTotalAmount = new javax.swing.JTextField();
        jDate = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jCutting = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setAlwaysOnTop(true);
        setLocationByPlatform(true);

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setAutoscrolls(true);

        jClear.setBackground(new java.awt.Color(0, 255, 204));
        jClear.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jClear.setForeground(new java.awt.Color(51, 51, 51));
        jClear.setText("Clear");
        jClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jClearActionPerformed(evt);
            }
        });

        jShow.setBackground(new java.awt.Color(0, 255, 204));
        jShow.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jShow.setForeground(new java.awt.Color(51, 51, 51));
        jShow.setText("Show");
        jShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jShowActionPerformed(evt);
            }
        });

        jUpdate.setBackground(new java.awt.Color(0, 255, 204));
        jUpdate.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jUpdate.setForeground(new java.awt.Color(51, 51, 51));
        jUpdate.setText("Update");
        jUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUpdateActionPerformed(evt);
            }
        });

        jDelete.setBackground(new java.awt.Color(0, 255, 204));
        jDelete.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jDelete.setForeground(new java.awt.Color(51, 51, 51));
        jDelete.setText("Delete");
        jDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteActionPerformed(evt);
            }
        });

        jSave.setBackground(new java.awt.Color(0, 255, 204));
        jSave.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jSave.setForeground(new java.awt.Color(51, 51, 51));
        jSave.setText("Save");
        jSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSaveActionPerformed(evt);
            }
        });

        jNew.setBackground(new java.awt.Color(0, 255, 204));
        jNew.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jNew.setForeground(new java.awt.Color(51, 51, 51));
        jNew.setText("New");
        jNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jNew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jSave)
                .addGap(36, 36, 36)
                .addComponent(jShow)
                .addGap(37, 37, 37)
                .addComponent(jClear)
                .addGap(39, 39, 39)
                .addComponent(jUpdate)
                .addGap(28, 28, 28)
                .addComponent(jDelete)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jShow)
                    .addComponent(jUpdate)
                    .addComponent(jDelete)
                    .addComponent(jSave)
                    .addComponent(jClear)
                    .addComponent(jNew))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Details");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel2.setText("Bill No.");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel3.setText("Name");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel4.setText("Address");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel5.setText("Mobile No.");

        jBillNo.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jBillNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBillNoActionPerformed(evt);
            }
        });
        jBillNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jBillNoKeyReleased(evt);
            }
        });

        jName.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jMobileNo.setColumns(10);
        jMobileNo.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jMobileNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMobileNoActionPerformed(evt);
            }
        });
        jMobileNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jMobileNoKeyReleased(evt);
            }
        });

        jAddress.setColumns(20);
        jAddress.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jAddress.setRows(5);
        jScrollPane1.setViewportView(jAddress);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel6.setText("Net Weight");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel7.setText("Glod Rate");

        jWeight.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jWeight.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jWeight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jWeightKeyReleased(evt);
            }
        });

        jGoldRate.setEditable(false);
        jGoldRate.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jGoldRate.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jGoldRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGoldRateActionPerformed(evt);
            }
        });

        jItemName.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jItemName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ring ", "Chain" }));
        jItemName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemNameActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel8.setText("Item Name");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel9.setText("Total Amount");

        jTotalAmount.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jTotalAmount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTotalAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTotalAmountKeyReleased(evt);
            }
        });

        jDate.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jDate.setText("   ");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel11.setText("Date");

        jCutting.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jCutting.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jCutting.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jCutting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCuttingActionPerformed(evt);
            }
        });
        jCutting.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jCuttingKeyReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel10.setText("Cutting");

        jLabel12.setText("%");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBillNo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jName)
                            .addComponent(jScrollPane1)
                            .addComponent(jMobileNo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jGoldRate, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDate)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jCutting, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addGap(20, 20, 20))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 479, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addGap(89, 89, 89)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                .addGap(238, 238, 238))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(185, 185, 185))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(jBillNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDate)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3)
                    .addComponent(jName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel5)
                    .addComponent(jMobileNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jGoldRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jLabel8))
                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, jPanel1Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jCutting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))))
                .addGap(81, 81, 81))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jClearActionPerformed

        clearData();
        JOptionPane.showMessageDialog(this,"Data Cleared");
    }//GEN-LAST:event_jClearActionPerformed

    private void jShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jShowActionPerformed

        jBillNo.setEditable(false);
        jGoldRate.setEditable(true);
        try{
            int str=Integer.parseInt(jBillNo.getText());
            ps1=con.prepareStatement("select * from goldloandata where bill_no=?");
            ps1.setInt(1,str);
            rs=ps1.executeQuery();
            while(rs.next())
            {
                jBillNo.setText(rs.getString(1));
                jName.setText(rs.getString(2));
                jAddress.setText(rs.getString(3));
                jMobileNo.setText(rs.getString(4));
                jItemName.setSelectedItem(rs.getString(5));
                jCutting.setText(rs.getString(6));
                jWeight.setText(Double.toString(rs.getDouble(7)));
                jGoldRate.setText(Double.toString(rs.getDouble(8)));
                jTotalAmount.setText(Double.toString(rs.getDouble(9)));
                jDate.setText(rs.getString(10));
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e);
        }
        jSave.setVisible(true);
    }//GEN-LAST:event_jShowActionPerformed

    private void jUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUpdateActionPerformed

        try{

            String strMB=jMobileNo.getText();
            if(strMB.length()==0)
            {
                throw new Exception("Please Enter Mobile No.");
            }
            if(strMB.length()>10 || strMB.length()<10)
            {
                throw new Exception("Invalid Mobile No.");
            }
            name=jName.getText();
            if(name.length()==0)
            {
                throw new Exception("Please Enter Name");
            }
            int str=Integer.parseInt(jBillNo.getText());
            name=jName.getText();
            address=jAddress.getText();
            mobileNo=jMobileNo.getText();
            itemName=(String)jItemName.getSelectedItem();
            cutting=Double.parseDouble(jCutting.getText());
            netWeight=Double.parseDouble(jWeight.getText());
            goldRate=Double.parseDouble(jGoldRate.getText());
            totalAmount=Double.parseDouble(jTotalAmount.getText());
            date=jDate.getText();

            ps1=con.prepareStatement("UPDATE goldloandata SET name=?,address=?,mobile_no=?,item_name=?,cutting=?,net_weight=?,gold_rate=?,amount=?,cdate=? where bill_no=?");

            ps1.setString(1,name);
            ps1.setString(2,address);
            ps1.setString(3,mobileNo);
            ps1.setString(4,itemName);
            ps1.setDouble(5,cutting);
            ps1.setDouble(6,netWeight);
            ps1.setDouble(7,goldRate);
            ps1.setDouble(8,totalAmount);
            ps1.setString(9,date);
            ps1.setInt(10,str);
            ps1.executeUpdate();
            JOptionPane.showMessageDialog(this,"Data Updated");
            clearData();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e);
        }

    }//GEN-LAST:event_jUpdateActionPerformed

    private void jDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteActionPerformed
        try{
            int str=Integer.parseInt(jBillNo.getText());
            ps1=con.prepareStatement("delete from goldloandata where bill_no=?");
            ps1.setInt(1,str);
            ps1.executeUpdate();
            JOptionPane.showMessageDialog(this,"Record Deleted");
            clearData();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e);
        }
    }//GEN-LAST:event_jDeleteActionPerformed

    private void jSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSaveActionPerformed
        try{
            String strBN=jBillNo.getText();
            if(strBN.length()==0)
            {
                throw new Exception("Please Enter Bill No.");
            }
            String strMB=jMobileNo.getText();
            if(strMB.length()==0)
            {
                throw new Exception("Please Enter Mobile No.");
            }
            if(strMB.length()>10 || strMB.length()<10)
            {
                throw new Exception("Invalid Mobile No.");
            }
            name=jName.getText();
            if(name.length()==0)
            {
                throw new Exception("Please Enter Name");
            }
            address=jAddress.getText();
            mobileNo=jMobileNo.getText();
            itemName=(String)jItemName.getSelectedItem();
            cutting=Double.parseDouble(jCutting.getText());
            netWeight=Double.parseDouble(jWeight.getText());
            goldRate=Double.parseDouble(jGoldRate.getText());
            totalAmount=Double.parseDouble(jTotalAmount.getText());
            date=jDate.getText();

            ps1=con.prepareStatement("insert into goldloandata(bill_no,name,address,mobile_no,item_name,cutting,net_weight,gold_rate,amount,cdate) values(?,?,?,?,?,?,?,?,?,?)");
            ps1.setInt(1,billNo);
            ps1.setString(2,name);
            ps1.setString(3,address);
            ps1.setString(4,mobileNo);
            ps1.setString(5,itemName);
            ps1.setDouble(6,cutting);
            ps1.setDouble(7,netWeight);
            ps1.setDouble(8,goldRate);
            ps1.setDouble(9,totalAmount);
            ps1.setString(10,date);

            ps1.executeUpdate();

            JOptionPane.showMessageDialog(this,"Successfully Inserted");
            clearData();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e);
        }
    }//GEN-LAST:event_jSaveActionPerformed

    private void jNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNewActionPerformed
        clearData();
    }//GEN-LAST:event_jNewActionPerformed

    private void jBillNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBillNoActionPerformed

    }//GEN-LAST:event_jBillNoActionPerformed

    private void jBillNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBillNoKeyReleased
        try{
            billNo=Integer.parseInt(jBillNo.getText());
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,"Invalid Entry");
        }
    }//GEN-LAST:event_jBillNoKeyReleased

    private void jMobileNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMobileNoActionPerformed

    }//GEN-LAST:event_jMobileNoActionPerformed

    private void jMobileNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMobileNoKeyReleased
        try{
            double mb=Double.parseDouble(jMobileNo.getText());
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,"Invalid Entry");
            jMobileNo.setText("");
        }
    }//GEN-LAST:event_jMobileNoKeyReleased

    private void jWeightKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jWeightKeyReleased
        try{
            double value1=Double.parseDouble(jWeight.getText());
            double value2=Double.parseDouble(jGoldRate.getText());
            String str=Double.toString(value1*value2);
            jTotalAmount.setText(str);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e);
        }
    }//GEN-LAST:event_jWeightKeyReleased

    private void jGoldRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGoldRateActionPerformed
        // jGoldRate.setText("28000");
    }//GEN-LAST:event_jGoldRateActionPerformed

    private void jItemNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemNameActionPerformed

    }//GEN-LAST:event_jItemNameActionPerformed

    private void jTotalAmountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTotalAmountKeyReleased
        try{
            totalAmount=0;
            totalAmount=Double.parseDouble(jTotalAmount.getText());
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,"Invalid Entry");

        }
    }//GEN-LAST:event_jTotalAmountKeyReleased

    private void jCuttingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCuttingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCuttingActionPerformed

    private void jCuttingKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCuttingKeyReleased
        try{
            double cut=Double.parseDouble(jCutting.getText());
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e);
        }
    }//GEN-LAST:event_jCuttingKeyReleased

    public void clearData()
    {
        jBillNo.setEditable(true);
        jGoldRate.setEditable(false);
        jBillNo.setText("");
        jName.setText("");
        jAddress.setText("");
        jMobileNo.setText("");
        jItemName.setSelectedIndex(0);
        jCutting.setText("");
        jWeight.setText("");
        jTotalAmount.setText("");
        currentDate();
    }
    
    void currentDate()
    {
        DateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        Calendar cal=Calendar.getInstance();
        jDate.setText(dateFormat.format(cal.getTime()));
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustLoan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea jAddress;
    private javax.swing.JTextField jBillNo;
    private javax.swing.JButton jClear;
    private javax.swing.JTextField jCutting;
    private javax.swing.JLabel jDate;
    private javax.swing.JButton jDelete;
    private javax.swing.JTextField jGoldRate;
    private javax.swing.JComboBox<String> jItemName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jMobileNo;
    private javax.swing.JTextField jName;
    private javax.swing.JButton jNew;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jSave;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jShow;
    private javax.swing.JTextField jTotalAmount;
    private javax.swing.JButton jUpdate;
    private javax.swing.JTextField jWeight;
    // End of variables declaration//GEN-END:variables
}
