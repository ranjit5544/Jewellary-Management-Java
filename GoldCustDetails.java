/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gold;

import java.sql.*;
import javax.swing.*;

public class GoldCustDetails extends javax.swing.JFrame {

    Connection con=null;
    Statement ps;
    ResultSet rs;
    PreparedStatement ps1;
        
    public GoldCustDetails() {
        initComponents();   
        try{
        Class.forName("oracle.jdbc.driver.OracleDriver");
	con=DriverManager.getConnection("jdbc:oracle:thin:@:1521:xe","system","1234");
	ps=con.createStatement();
        }
        catch(Exception e)
        {
            
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jDD = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jMM = new javax.swing.JTextField();
        jYYYY = new javax.swing.JTextField();
        jSilver = new javax.swing.JButton();
        jGold = new javax.swing.JButton();
        jGoldSold = new javax.swing.JTextField();
        jSilverSold = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setTitle("Details");
        setAlwaysOnTop(true);
        setLocationByPlatform(true);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Date");

        jDD.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jDD.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Details");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("/");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("YYYY");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("MM");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("DD");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("/");

        jMM.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jMM.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jYYYY.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jYYYY.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jSilver.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jSilver.setText("Silver");
        jSilver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSilverActionPerformed(evt);
            }
        });
        jSilver.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jSilverKeyPressed(evt);
            }
        });

        jGold.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jGold.setText("Gold");
        jGold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGoldActionPerformed(evt);
            }
        });
        jGold.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jGoldKeyPressed(evt);
            }
        });

        jGoldSold.setEditable(false);
        jGoldSold.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jGoldSold.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jSilverSold.setEditable(false);
        jSilverSold.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jSilverSold.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Silver Sold");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Gold Sold");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDD, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel5)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jMM, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jYYYY, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jGold)
                        .addGap(38, 38, 38)
                        .addComponent(jSilver)))
                .addGap(215, 215, 215))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jGoldSold, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jSilverSold, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(jYYYY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jMM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSilver)
                    .addComponent(jGold))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jGoldSold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSilverSold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(79, 79, 79))
        );

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
    }// </editor-fold>//GEN-END:initComponents

    private void jSilverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSilverActionPerformed
         
        silverButton();
    }//GEN-LAST:event_jSilverActionPerformed

    private void jGoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGoldActionPerformed
        goldButton();
    }//GEN-LAST:event_jGoldActionPerformed

    private void jGoldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jGoldKeyPressed
        if(evt.getKeyCode()==10)
        {
            goldButton();
        }
    }//GEN-LAST:event_jGoldKeyPressed

    private void jSilverKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSilverKeyPressed
        if(evt.getKeyCode()==10)
        {
            silverButton();
        }
    }//GEN-LAST:event_jSilverKeyPressed

    void goldButton()
    {
        String d=jDD.getText();
        String m=jMM.getText();
        String y=jYYYY.getText();
        if(d.length()==1)
        {
            d="0"+d;
        }
        if(d.length()==1)
        {
            d="0"+d;
        }
        if(m.length()==1)
        {
            m="0"+m;
        }
        try{
            String cdate=d+"/"+m+"/"+y;
        ps1=con.prepareStatement("select net_weight from goldcustdata where cdate=?");
        ps1.setString(1,cdate);
        //rs=ps.executeQuery("select net_weight from silvercustdata");
        System.out.println(cdate);
        rs=ps1.executeQuery();
        double gWeight=0;
        while(rs.next())
	{
            gWeight+=rs.getDouble(1);
            
	}
        jGoldSold.setText(Double.toString(gWeight));
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e);
        }
    }
    
    void silverButton()
    {
        String d=jDD.getText();
        String m=jMM.getText();
        String y=jYYYY.getText();
        if(d.length()==1)
        {
            d="0"+d;
        }
        if(d.length()==1)
        {
            d="0"+d;
        }
        if(m.length()==1)
        {
            m="0"+m;
        }
        try{
            String cdate=d+"/"+m+"/"+y;
        ps1=con.prepareStatement("select net_weight from silvercustdata where cdate=?");
        ps1.setString(1,cdate);
        //rs=ps.executeQuery("select net_weight from silvercustdata");
        System.out.println(cdate);
        rs=ps1.executeQuery();
        double gWeight=0;
        while(rs.next())
	{
            gWeight+=rs.getDouble(1);
            
	}
        jSilverSold.setText(Double.toString(gWeight));
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e);
        }
    }
    
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
            java.util.logging.Logger.getLogger(GoldCustDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GoldCustDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GoldCustDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GoldCustDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GoldCustDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jDD;
    private javax.swing.JButton jGold;
    private javax.swing.JTextField jGoldSold;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jMM;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jSilver;
    private javax.swing.JTextField jSilverSold;
    private javax.swing.JTextField jYYYY;
    // End of variables declaration//GEN-END:variables
}
