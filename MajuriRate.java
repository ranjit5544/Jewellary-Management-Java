
package Rate;

import java.sql.*;
import javax.swing.*;

public class MajuriRate extends javax.swing.JFrame {
    Connection con=null;
    PreparedStatement ps1=null;
    Statement ps=null;
    ResultSet rs=null;

    public MajuriRate() {
        initComponents();
        try{
         Class.forName("oracle.jdbc.driver.OracleDriver");
	con=DriverManager.getConnection("jdbc:oracle:thin:@:1521:xe","system","1234");
	ps=con.createStatement();
        rs=ps.executeQuery("select * from goldmajuri");
        String majuri=null;
        while(rs.next())
	{
            majuri=Double.toString(rs.getDouble(1));
	}
        jOldRate.setText(majuri);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jOldRate = new javax.swing.JTextField();
        jChange = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jNewRate = new javax.swing.JTextField();

        setTitle("Majuri");
        setAlwaysOnTop(true);
        setLocationByPlatform(true);

        jPanel1.setBackground(java.awt.SystemColor.inactiveCaption);
        jPanel1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Gold Majuri");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("New Majuri");

        jOldRate.setEditable(false);
        jOldRate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jOldRate.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jChange.setBackground(new java.awt.Color(51, 255, 204));
        jChange.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jChange.setText("Change");
        jChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChangeActionPerformed(evt);
            }
        });
        jChange.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jChangeKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Current Majuri");

        jNewRate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jNewRate.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jOldRate, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(jNewRate))
                .addGap(48, 48, 48))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jChange)
                        .addGap(135, 135, 135))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(116, 116, 116))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jOldRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3)
                    .addComponent(jNewRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jChange)
                .addGap(61, 61, 61))
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

    private void jChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChangeActionPerformed
        changeButton();
    }//GEN-LAST:event_jChangeActionPerformed

    private void jChangeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jChangeKeyPressed
        if(evt.getKeyCode()==10)
        {
            changeButton();
        }
    }//GEN-LAST:event_jChangeKeyPressed

    void changeButton()
    {
        try{
            double value=Double.parseDouble(jNewRate.getText());
            ps1=con.prepareStatement("UPDATE goldmajuri SET amount=? where SR=1");
            ps1.setDouble(1,value);
            ps1.executeUpdate();
            JOptionPane.showMessageDialog(this,"Rate Changed!!!");
            jNewRate.setText("");
            rs=ps.executeQuery("select * from goldmajuri");
            String majuri=null;
            while(rs.next())
            {
                majuri=Double.toString(rs.getDouble(1));
            }
            jOldRate.setText(majuri);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,"Invalid Entry");
            jNewRate.setText("");
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
            java.util.logging.Logger.getLogger(MajuriRate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MajuriRate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MajuriRate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MajuriRate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MajuriRate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jChange;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jNewRate;
    private javax.swing.JTextField jOldRate;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
