
package Gold;

import java.sql.*;
import javax.swing.*;
import java.text.*;
import java.util.*;

public class GoldStock extends javax.swing.JFrame {

    Connection con=null;
    Statement ps;
    ResultSet rs;
    PreparedStatement ps1;
    
    public GoldStock() {
        initComponents();
        currentDate();
        try{
         Class.forName("oracle.jdbc.driver.OracleDriver");
	con=DriverManager.getConnection("jdbc:oracle:thin:@:1521:xe","system","1234");
	ps=con.createStatement();
        rs=ps.executeQuery("select * from goldstock");
        String date=null;
        double gStock=0;
        while(rs.next())
	{
            gStock=rs.getDouble(1);
            date=rs.getString(2);
	}
        jCurrent.setText(Double.toString(gStock));
        jCDate.setText(date);
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jCurrent = new javax.swing.JTextField();
        jNew = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jUpdate = new javax.swing.JButton();
        jNDate = new javax.swing.JLabel();
        jCDate = new javax.swing.JLabel();
        jAdd = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jUpdate1 = new javax.swing.JButton();

        setTitle("Gold Stock");
        setAlwaysOnTop(true);
        setLocationByPlatform(true);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 102));
        jLabel1.setText("Gold Stock");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Current Stock");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Re-Enter Stock");

        jCurrent.setEditable(false);
        jCurrent.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jCurrent.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jNew.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jNew.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jNew.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jNewKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("gm");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("gm");

        jUpdate.setBackground(new java.awt.Color(204, 204, 204));
        jUpdate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jUpdate.setForeground(new java.awt.Color(102, 102, 255));
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

        jNDate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jCDate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jAdd.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jAdd.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jAdd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jAddKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Add New Stock");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("gm");

        jUpdate1.setBackground(new java.awt.Color(204, 204, 204));
        jUpdate1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jUpdate1.setForeground(new java.awt.Color(102, 102, 255));
        jUpdate1.setText("New");
        jUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUpdate1ActionPerformed(evt);
            }
        });
        jUpdate1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jUpdate1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCurrent, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNew, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jNDate)
                            .addComponent(jCDate))))
                .addContainerGap(126, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jUpdate)
                .addGap(32, 32, 32)
                .addComponent(jUpdate1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel4)
                            .addComponent(jCurrent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jCDate)
                        .addGap(82, 82, 82)
                        .addComponent(jNDate)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jUpdate)
                    .addComponent(jUpdate1))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jNewKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jNewKeyReleased
        try{
        double newStock=Double.parseDouble(jNew.getText());
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(this,"Invalid Entry");
           jNew.setText("");
       }
    }//GEN-LAST:event_jNewKeyReleased

    private void jUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUpdateActionPerformed
        updateButton();
    }//GEN-LAST:event_jUpdateActionPerformed

    private void jAddKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jAddKeyReleased
        try{
        double newStock=Double.parseDouble(jAdd.getText());
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(this,"Invalid Entry");
           jAdd.setText("");
       }
    }//GEN-LAST:event_jAddKeyReleased

    private void jUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUpdate1ActionPerformed
        newButton();
    }//GEN-LAST:event_jUpdate1ActionPerformed

    private void jUpdateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jUpdateKeyPressed
        if(evt.getKeyCode()==10)
        {
            updateButton();
        }
    }//GEN-LAST:event_jUpdateKeyPressed

    private void jUpdate1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jUpdate1KeyPressed
        if(evt.getKeyCode()==10)
        {
            newButton();
        }
    }//GEN-LAST:event_jUpdate1KeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyPressed

    void updateButton()
    {
        try{
            double newStock=Double.parseDouble(jAdd.getText());
            double oldStock=Double.parseDouble(jCurrent.getText());
            ps1=con.prepareStatement("UPDATE goldstock SET stock=? where cdate=?");
            ps1.setDouble(1,oldStock+newStock);
            ps1.setString(2,jCDate.getText());
            ps1.executeQuery();
            ps=con.createStatement();
            rs=ps.executeQuery("select * from goldstock");
            String date=null;
            double gStock=0;
            while(rs.next())
            {
                gStock=rs.getDouble(1);
                date=rs.getString(2);
            }
            jCurrent.setText(Double.toString(gStock));
            jCDate.setText(date);
            JOptionPane.showMessageDialog(this,"Stock Updated");
            jAdd.setText("");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e);
        }
    }
    
    void newButton()
    {
        try{
            double newStock=Double.parseDouble(jNew.getText());
            ps1=con.prepareStatement("UPDATE goldstock SET stock=? where cdate=?");
            ps1.setDouble(1,newStock);
            ps1.setString(2,jCDate.getText());
            ps1.executeQuery();
            ps=con.createStatement();
            rs=ps.executeQuery("select * from goldstock");
            String date=null;
            double gStock=0;
            while(rs.next())
            {
                gStock=rs.getDouble(1);
                date=rs.getString(2);
            }
            jCurrent.setText(Double.toString(gStock));
            jCDate.setText(date);
            JOptionPane.showMessageDialog(this,"New Stock Updated");
            jNew.setText("");
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
        jNDate.setText(dateFormat.format(cal.getTime()));
        
    }
    
    
    
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
            java.util.logging.Logger.getLogger(GoldStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GoldStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GoldStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GoldStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GoldStock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jAdd;
    private javax.swing.JLabel jCDate;
    private javax.swing.JTextField jCurrent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jNDate;
    private javax.swing.JTextField jNew;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jUpdate;
    private javax.swing.JButton jUpdate1;
    // End of variables declaration//GEN-END:variables
}
