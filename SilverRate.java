
package Rate;

import java.sql.*;
import javax.swing.*;

public class SilverRate extends javax.swing.JFrame {

    Connection con=null;
    Statement ps;
    PreparedStatement ps1;
    ResultSet rs;
    public SilverRate() {
        initComponents();
        try{
         Class.forName("oracle.jdbc.driver.OracleDriver");
	con=DriverManager.getConnection("jdbc:oracle:thin:@:1521:xe","system","1234");
	ps=con.createStatement();
        rs=ps.executeQuery("select * from SILVERRATE");
        String sRate=null;
        while(rs.next())
	{
            sRate=Double.toString(rs.getDouble(1));
	}
        jOldRate.setText(sRate);
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

        setTitle("Silver Rate");
        setAlwaysOnTop(true);
        setLocationByPlatform(true);

        jPanel1.setBackground(java.awt.SystemColor.inactiveCaption);
        jPanel1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Today Silver Rate");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("New Rate");

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
        jLabel4.setText("Old Rate");

        jNewRate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jNewRate.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(109, 109, 109))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jChange)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jOldRate, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(jNewRate))
                .addGap(48, 48, 48))
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
            Double value=Double.parseDouble(jNewRate.getText());
            ps1=con.prepareStatement("UPDATE silverrate SET rate=? where SR=1");
            ps1.setDouble(1,value);
            ps1.executeUpdate();
            JOptionPane.showMessageDialog(this,"Rate Changed!!!");
            jNewRate.setText("");
            rs=ps.executeQuery("select * from SILVERRATE");
            String sRate=null;
            while(rs.next())
            {
                sRate=Double.toString(rs.getDouble(1));
            }
            jOldRate.setText(sRate);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,"Invalid Entry");
            jNewRate.setText("");
        }
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SilverRate().setVisible(true);
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
