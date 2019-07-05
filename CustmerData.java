package Gold;


import java.sql.*;
import javax.swing.*;
import java.text.*;
import java.util.*;

public class CustmerData extends javax.swing.JFrame {

        Connection con=null;
	Statement ps;
	ResultSet rs;
        PreparedStatement ps1;
        String name,address,itemName,mobileNo,date;
        int billNo;
        double netWeight,goldRate,totalAmount,majuri;
    public CustmerData() {
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
            gRate=Double.toString(rs.getDouble(1));
	}
        jGoldRate.setText(gRate);
        rs=ps.executeQuery("select * from goldmajuri");
        while(rs.next())
	{
           majuri=rs.getDouble(1);
	}
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jClear = new javax.swing.JButton();
        jShow = new javax.swing.JButton();
        jUpdate = new javax.swing.JButton();
        jDelete = new javax.swing.JButton();
        jSave = new javax.swing.JButton();
        jNew = new javax.swing.JButton();

        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);

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
        jWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jWeightActionPerformed(evt);
            }
        });
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
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBillNo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jName)
                                    .addComponent(jScrollPane1)
                                    .addComponent(jMobileNo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel11)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jGoldRate, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDate))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addGap(238, 238, 238))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
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
                        .addComponent(jItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
        jClear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jClearKeyPressed(evt);
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
        jShow.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jShowKeyPressed(evt);
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
        jUpdate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jUpdateKeyPressed(evt);
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
        jDelete.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jDeleteKeyPressed(evt);
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
        jSave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jSaveKeyPressed(evt);
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
        jNew.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jNewKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jNew)
                .addGap(18, 18, 18)
                .addComponent(jSave)
                .addGap(18, 18, 18)
                .addComponent(jShow)
                .addGap(18, 18, 18)
                .addComponent(jClear)
                .addGap(18, 18, 18)
                .addComponent(jUpdate)
                .addGap(18, 18, 18)
                .addComponent(jDelete)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jGoldRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGoldRateActionPerformed
        // jGoldRate.setText("28000");
    }//GEN-LAST:event_jGoldRateActionPerformed

    private void jWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jWeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jWeightActionPerformed

    private void jWeightKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jWeightKeyReleased
        try{
            double value1=Double.parseDouble(jWeight.getText());
            double value2=Double.parseDouble(jGoldRate.getText());
            value2=value2/10;
            double value3=value1*majuri;
            String str=Double.toString((value1*value2)+value3);
            jTotalAmount.setText(str);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e);
        }
    }//GEN-LAST:event_jWeightKeyReleased

    private void jItemNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemNameActionPerformed
        
    }//GEN-LAST:event_jItemNameActionPerformed

    private void jMobileNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMobileNoActionPerformed
 
    }//GEN-LAST:event_jMobileNoActionPerformed

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

    private void jNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNewActionPerformed
        newButton();

    }//GEN-LAST:event_jNewActionPerformed

    private void jSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSaveActionPerformed
        saveButton();
    }//GEN-LAST:event_jSaveActionPerformed

    private void jDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteActionPerformed
        deleteButton();
    }//GEN-LAST:event_jDeleteActionPerformed

    private void jUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUpdateActionPerformed

        updateButton();
    }//GEN-LAST:event_jUpdateActionPerformed

    private void jShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jShowActionPerformed

        showButton();
    }//GEN-LAST:event_jShowActionPerformed

    private void jClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jClearActionPerformed

        clearButton();
    }//GEN-LAST:event_jClearActionPerformed

    private void jNewKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jNewKeyPressed
        if(evt.getKeyCode()==10)
        {
            newButton();
        }
    }//GEN-LAST:event_jNewKeyPressed

    private void jSaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSaveKeyPressed
        if(evt.getKeyCode()==10)
        {
            saveButton();
        }
    }//GEN-LAST:event_jSaveKeyPressed

    private void jShowKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jShowKeyPressed
        if(evt.getKeyCode()==10)
        {
            showButton();
        }
    }//GEN-LAST:event_jShowKeyPressed

    private void jClearKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jClearKeyPressed
        if(evt.getKeyCode()==10)
        {
            clearButton();
        }
    }//GEN-LAST:event_jClearKeyPressed

    private void jUpdateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jUpdateKeyPressed
        if(evt.getKeyCode()==10)
        {
            updateButton();
        }
    }//GEN-LAST:event_jUpdateKeyPressed

    private void jDeleteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDeleteKeyPressed
        if(evt.getKeyCode()==10)
        {
            deleteButton();
        }
    }//GEN-LAST:event_jDeleteKeyPressed

    public void newButton()
    {
        clearData();
        jBillNo.setEditable(false);
        try{
            ps=con.createStatement();
            rs=ps.executeQuery("select count from LOGIN");
            int count=0;
            while(rs.next())
            {
                count=rs.getInt(1);
            }
            count+=1;
            System.out.println(count);
            jBillNo.setText(Integer.toString(count));

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e);
        }
    }
    
    public void saveButton()
    {
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
            billNo=Integer.parseInt(jBillNo.getText());
            address=jAddress.getText();
            mobileNo=jMobileNo.getText();
            itemName=(String)jItemName.getSelectedItem();
            netWeight=Double.parseDouble(jWeight.getText());
            goldRate=Double.parseDouble(jGoldRate.getText());
            totalAmount=Double.parseDouble(jTotalAmount.getText());
            date=jDate.getText();

            ps1=con.prepareStatement("insert into goldcustdata(bill_no,name,address,mobile_no,item_name,net_weight,gold_rate,amount,cdate) values(?,?,?,?,?,?,?,?,?)");
            ps1.setInt(1,billNo);
            ps1.setString(2,name);
            ps1.setString(3,address);
            ps1.setString(4,mobileNo);
            ps1.setString(5,itemName);
            ps1.setDouble(6,netWeight);
            ps1.setDouble(7,goldRate);
            ps1.setDouble(8,totalAmount);
            ps1.setString(9,date);

            ps1.executeUpdate();
            JOptionPane.showMessageDialog(this,"Successfully Inserted");
            stockUpdate();
            clearData();

            rs=ps.executeQuery("select * from goldcustdata");
            int count=0,next=0;
            while(rs.next())
            {
                next=rs.getInt(1);
                if(count<next)
                {
                    count=next;
                }
            }
            ps1=con.prepareStatement("UPDATE login SET count=?");
            ps1.setInt(1,count);
            ps1.executeUpdate();

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e);
        }
    }
    
    public void deleteButton()
    {
        try{
            int str=Integer.parseInt(jBillNo.getText());
            ps1=con.prepareStatement("delete from goldcustdata where bill_no=?");
            ps1.setInt(1,str);
            ps1.executeUpdate();
            JOptionPane.showMessageDialog(this,"Record Deleted");
            clearData();
            rs=ps.executeQuery("select * from goldcustdata");
            int count=0,next=0;
            while(rs.next())
            {
                next=rs.getInt(1);
                if(count<next)
                {
                    count=next;
                }
            }
            ps1=con.prepareStatement("UPDATE login SET count=?");
            ps1.setInt(1,count);
            ps1.executeUpdate();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e);
        }
    }
    
    public void showButton()
    {
        jBillNo.setEditable(false);
        jGoldRate.setEditable(true);
        try{
            int str=Integer.parseInt(jBillNo.getText());
            ps1=con.prepareStatement("select * from goldcustdata where bill_no=?");
            ps1.setInt(1,str);
            rs=ps1.executeQuery();
            while(rs.next())
            {
                jBillNo.setText(rs.getString(1));
                jName.setText(rs.getString(2));
                jAddress.setText(rs.getString(3));
                jMobileNo.setText(rs.getString(4));
                jItemName.setSelectedItem(rs.getString(5));
                jWeight.setText(Double.toString(rs.getDouble(6)));
                jGoldRate.setText(Double.toString(rs.getDouble(7)));
                jTotalAmount.setText(Double.toString(rs.getDouble(8)));
                jDate.setText(rs.getString(9));
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e);
        }
        jSave.setVisible(true);
    }
    
    public void updateButton()
    {
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
            netWeight=Double.parseDouble(jWeight.getText());
            goldRate=Double.parseDouble(jGoldRate.getText());
            totalAmount=Double.parseDouble(jTotalAmount.getText());
            date=jDate.getText();

            ps1=con.prepareStatement("UPDATE goldcustdata SET name=?,address=?,mobile_no=?,item_name=?,net_weight=?,gold_rate=?,amount=?,cdate=? where bill_no=?");

            ps1.setString(1,name);
            ps1.setString(2,address);
            ps1.setString(3,mobileNo);
            ps1.setString(4,itemName);
            ps1.setDouble(5,netWeight);
            ps1.setDouble(6,goldRate);
            ps1.setDouble(7,totalAmount);
            ps1.setString(8,date);
            ps1.setInt(9,str);
            ps1.executeUpdate();
            JOptionPane.showMessageDialog(this,"Data Updated");
            clearData();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e);
        }
    }
    
    public void clearButton()
    {
        clearData();
        JOptionPane.showMessageDialog(this,"Data Cleared");
    }
    
    public void clearData()
    {
        jBillNo.setEditable(true);
        jGoldRate.setEditable(false);
        jBillNo.setText("");
        jName.setText("");
        jAddress.setText("");
        jMobileNo.setText("");
        jItemName.setSelectedIndex(0);
        jWeight.setText("");
        jTotalAmount.setText("");
        currentDate();
    }
    
    void stockUpdate()
    {
        try{
            ps=con.createStatement();
            rs=ps.executeQuery("select * from goldstock");
            String date=null;
            double gStock=0;
            while(rs.next())
            {
                gStock=rs.getDouble(1);
                date=rs.getString(2);
            }
            gStock=gStock-netWeight;
            //System.out.println(gStock);
            ps1=con.prepareStatement("UPDATE goldstock SET stock=? where cdate=?");
            ps1.setDouble(1,gStock);
            ps1.setString(2,date);
            ps1.executeUpdate();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e);
        }
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
                new CustmerData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea jAddress;
    private javax.swing.JTextField jBillNo;
    private javax.swing.JButton jClear;
    private javax.swing.JLabel jDate;
    private javax.swing.JButton jDelete;
    private javax.swing.JTextField jGoldRate;
    private javax.swing.JComboBox<String> jItemName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JPanel jPanel2;
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
