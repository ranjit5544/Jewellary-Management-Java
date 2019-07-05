
import javax.swing.*;
import java.sql.*;
import java.text.*;
import java.util.Calendar;


public class LogIn extends javax.swing.JFrame {
    
    String cdate=null;

    public LogIn() {
        initComponents();
        currentDate();
        tbGoldCustData();
        tbSilverCustData();
        tbGoldRate();
        tbSilverRate();
        tbGoldStock();
        tbSilverStock();
        tbGoldMajuri();
        tbSilverMajuri();
        goldUpdation();
        silverUpdation();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jUserid = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();
        jLogIn = new javax.swing.JButton();
        jCancle = new javax.swing.JButton();
        jDate = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.SystemColor.windowBorder);
        setLocation(new java.awt.Point(500, 100));

        jPanel1.setBackground(new java.awt.Color(255, 51, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User ID");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");

        jUserid.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jPassword.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLogIn.setBackground(new java.awt.Color(0, 255, 255));
        jLogIn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLogIn.setText("Log In");
        jLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLogInActionPerformed(evt);
            }
        });
        jLogIn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLogInKeyPressed(evt);
            }
        });

        jCancle.setBackground(new java.awt.Color(0, 255, 255));
        jCancle.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jCancle.setText("Cancle");
        jCancle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCancleActionPerformed(evt);
            }
        });
        jCancle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCancleKeyPressed(evt);
            }
        });

        jDate.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jDate.setText("   ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jUserid)
                            .addComponent(jPassword)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLogIn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCancle)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(52, 52, 52))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jDate)
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDate)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jUserid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLogIn)
                    .addComponent(jCancle))
                .addGap(29, 29, 29))
        );

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 204));
        jLabel3.setText("GAJRAJ JEWELLERY");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(96, 96, 96))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCancleActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jCancleActionPerformed

    private void jLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLogInActionPerformed

        loginButton();        
    }//GEN-LAST:event_jLogInActionPerformed

    private void jLogInKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLogInKeyPressed
        if(evt.getKeyCode()==10)
        {
            loginButton();
        }
    }//GEN-LAST:event_jLogInKeyPressed

    private void jCancleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCancleKeyPressed
        
        if(evt.getKeyCode()==10)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jCancleKeyPressed

    void loginButton()
    {
        try
        {
            Connection con=null;
            Statement ps;
            ResultSet rs;
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con=DriverManager.getConnection("jdbc:oracle:thin:@:1521:xe","system","1234");
            ps=con.createStatement();
            rs=ps.executeQuery("select * from LOGIN");
            String s1=null,s2=null;
            while(rs.next())
            {
                s1=rs.getString(1);
                s2=rs.getString(2);
            }
            
            Boolean complete=jUserid.print();
            if(complete)
            {
                JOptionPane.showMessageDialog(null,"Done");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Printing");
            }

            if(jUserid.getText().equals(s1) && jPassword.getText().equals(s2))
            {
                //JOptionPane.showMessageDialog(this,"Correct User Name and Password");
                this.dispose();
                MainForm mf=new MainForm();
                mf.setTitle("GAJRAJ JEWELLARY");
                mf.setVisible(true); 
                mf.setSize(1200,700);

            }
            else
            {
                JOptionPane.showMessageDialog(this,"Invalid User Name or Password");
                jUserid.setText("");
                jPassword.setText("");
            }

        }
        catch(Exception e)
        {
            System.out.println("Log In"+e);
        }
    }
    
    void tbGoldCustData()
    {
        Connection con;
	Statement ps;
	ResultSet rs;
        PreparedStatement ps1;
        try{
            
        Class.forName("oracle.jdbc.driver.OracleDriver");
	con=DriverManager.getConnection("jdbc:oracle:thin:@:1521:xe","system","1234");
	ps=con.createStatement();
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
            try{
            
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con=DriverManager.getConnection("jdbc:oracle:thin:@:1521:xe","system","1234");
            ps=con.createStatement();
            String str="create table goldcustdata(bill_no integer not null,name varchar(30) not null,address varchar(50),mobile_no varchar(10) not null,item_name varchar(20) not null,net_weight number not null,gold_rate number not null,amount number not null,cdate varchar(15) not null,primary key(bill_no))";
            ps.executeUpdate(str);
            ps.executeUpdate("update login set count=0");
            }
            catch(Exception e1)
            {
              JOptionPane.showMessageDialog(this,"Gold Cust Data"+e1);  
            }
        }
    }
    
    void tbSilverCustData()
    {
        Connection con;
	Statement ps;
	ResultSet rs;
        PreparedStatement ps1;
        try{
            
        Class.forName("oracle.jdbc.driver.OracleDriver");
	con=DriverManager.getConnection("jdbc:oracle:thin:@:1521:xe","system","1234");
	ps=con.createStatement();
        rs=ps.executeQuery("select * from silvercustdata");
        int count=0,next=0;
        while(rs.next())
            {
                next=rs.getInt(1);
                if(count<next)
                {
                    count=next;
                }
            }
        ps1=con.prepareStatement("UPDATE login SET silcount=?");
        ps1.setInt(1,count);
        ps1.executeUpdate();
        }
        catch(Exception e)
        {
            try{
            
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con=DriverManager.getConnection("jdbc:oracle:thin:@:1521:xe","system","1234");
            ps=con.createStatement();
            String str="create table silvercustdata(bill_no integer not null,name varchar(30) not null,address varchar(50),mobile_no varchar(10) not null,item_name varchar(20) not null,net_weight number not null,silver_rate number not null,amount number not null,cdate varchar(15) not null,primary key(bill_no))";
            ps.executeUpdate(str);
            ps.executeUpdate("update login set silcount=0");
            }
            catch(Exception e1)
            {
              JOptionPane.showMessageDialog(this,"Silver Cust Data"+e1);  
            }
        }
    }
    
    void tbGoldRate()
    {
        Connection con;
	Statement ps;
	ResultSet rs;
        try{
            
        Class.forName("oracle.jdbc.driver.OracleDriver");
	con=DriverManager.getConnection("jdbc:oracle:thin:@:1521:xe","system","1234");
	ps=con.createStatement();
        rs=ps.executeQuery("select * from goldrate");
        }
        catch(Exception e)
        {
            try{
            
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con=DriverManager.getConnection("jdbc:oracle:thin:@:1521:xe","system","1234");
            ps=con.createStatement();
            String str="create table goldrate(rate number not null,sr integer)";
            ps.executeUpdate(str);
            str="insert into goldrate values(0000,1)";
            ps.executeUpdate(str);
            }
            catch(Exception e1)
            {
              JOptionPane.showMessageDialog(this,"Gold Rate"+e1);  
            }
        }
    }
    
     void tbSilverRate()
    {
        Connection con;
	Statement ps;
	ResultSet rs;
        try{
            
        Class.forName("oracle.jdbc.driver.OracleDriver");
	con=DriverManager.getConnection("jdbc:oracle:thin:@:1521:xe","system","1234");
	ps=con.createStatement();
        rs=ps.executeQuery("select * from silverrate");
        }
        catch(Exception e)
        {
            try{
            
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con=DriverManager.getConnection("jdbc:oracle:thin:@:1521:xe","system","1234");
            ps=con.createStatement();
            String str="create table silverrate(rate number not null,sr integer)";
            ps.executeUpdate(str);
            str="insert into silverrate values(0000,1)";
            ps.executeUpdate(str);
            }
            catch(Exception e1)
            {
              JOptionPane.showMessageDialog(this,"Silver Rate"+e1);  
            }
        }
    }
     
     void tbGoldStock()
    {
        Connection con;
	Statement ps;
	ResultSet rs;
        try{
            
        Class.forName("oracle.jdbc.driver.OracleDriver");
	con=DriverManager.getConnection("jdbc:oracle:thin:@:1521:xe","system","1234");
	ps=con.createStatement();
        rs=ps.executeQuery("select * from goldstock");
        }
        catch(Exception e)
        {
            try{
            
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con=DriverManager.getConnection("jdbc:oracle:thin:@:1521:xe","system","1234");
            ps=con.createStatement();
            String str="create table goldstock(stock number not null,cdate varchar(15),primary key(cdate))";
            ps.executeUpdate(str);
            str="insert into goldstock values(0,'01/01/2017')";
            ps.executeUpdate(str);
            }
            catch(Exception e1)
            {
              JOptionPane.showMessageDialog(this,"Gold Stock"+e1);  
            }
        }
    }
     
     void tbGoldMajuri()
    {
        Connection con;
	Statement ps;
	ResultSet rs;
        try{
            
        Class.forName("oracle.jdbc.driver.OracleDriver");
	con=DriverManager.getConnection("jdbc:oracle:thin:@:1521:xe","system","1234");
	ps=con.createStatement();
        rs=ps.executeQuery("select * from goldmajuri");
        }
        catch(Exception e)
        {
            try{
            
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con=DriverManager.getConnection("jdbc:oracle:thin:@:1521:xe","system","1234");
            ps=con.createStatement();
            String str="create table goldmajuri(amount number not null,sr number)";
            ps.executeUpdate(str);
            str="insert into goldmajuri values(400,1)";
            ps.executeUpdate(str);
            }
            catch(Exception e1)
            {
              JOptionPane.showMessageDialog(this,"Majuri"+e1);  
            }
        }
    }
     
     void tbSilverStock()
    {
        Connection con;
	Statement ps;
	ResultSet rs;
        try{
            
        Class.forName("oracle.jdbc.driver.OracleDriver");
	con=DriverManager.getConnection("jdbc:oracle:thin:@:1521:xe","system","1234");
	ps=con.createStatement();
        rs=ps.executeQuery("select * from silverstock");
        }
        catch(Exception e)
        {
            try{
            
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con=DriverManager.getConnection("jdbc:oracle:thin:@:1521:xe","system","1234");
            ps=con.createStatement();
            String str="create table silverstock(stock number not null,cdate varchar(15),primary key(cdate))";
            ps.executeUpdate(str);
            str="insert into silverstock values(0,'01/01/2017')";
            ps.executeUpdate(str);
            }
            catch(Exception e1)
            {
              JOptionPane.showMessageDialog(this,"Silver Stock"+e1);  
            }
        }
    }
     
     void tbSilverMajuri()
    {
        Connection con;
	Statement ps;
	ResultSet rs;
        try{
            
        Class.forName("oracle.jdbc.driver.OracleDriver");
	con=DriverManager.getConnection("jdbc:oracle:thin:@:1521:xe","system","1234");
	ps=con.createStatement();
        rs=ps.executeQuery("select * from silvermajuri");
        }
        catch(Exception e)
        {
            try{
            
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con=DriverManager.getConnection("jdbc:oracle:thin:@:1521:xe","system","1234");
            ps=con.createStatement();
            String str="create table silvermajuri(amount number not null,sr number)";
            ps.executeUpdate(str);
            str="insert into silvermajuri values(400,1)";
            ps.executeUpdate(str);
            }
            catch(Exception e1)
            {
              JOptionPane.showMessageDialog(this,"Silver Majuri"+e1);  
            }
        }
    }
     
     void goldUpdation()
     {
         try
         {
             Connection con;
            Statement ps;
            ResultSet rs=null;       
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
            if(date.equals(cdate)!=true)
            {
                PreparedStatement ps1=null;
                ps1=con.prepareStatement("insert into goldstock(stock,cdate) values(?,?)");
                ps1.setDouble(1,gStock);
                ps1.setString(2,cdate);
                ps1.executeUpdate();
            }
         }
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(this,"Gold Stock Update"+e);
         }
     }
     
     void silverUpdation()
     {
         try
         {
             Connection con;
            Statement ps;
            ResultSet rs=null;       
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con=DriverManager.getConnection("jdbc:oracle:thin:@:1521:xe","system","1234");
            ps=con.createStatement();
            rs=ps.executeQuery("select * from silverstock");
            String date=null;
            double gStock=0;
            while(rs.next())
            {
                gStock=rs.getDouble(1);
                date=rs.getString(2);
                
            }
            if(date.equals(cdate)!=true)
            {
                PreparedStatement ps1=null;
                ps1=con.prepareStatement("insert into silverstock(stock,cdate) values(?,?)");
                ps1.setDouble(1,gStock);
                ps1.setString(2,cdate);
                ps1.executeUpdate();
            }
         }
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(this,"Silver Stock Update"+e);
         }
     }
     
     void currentDate()
    {
        DateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        Calendar cal=Calendar.getInstance();
        jDate.setText(dateFormat.format(cal.getTime()));
        cdate=dateFormat.format(cal.getTime());
    }
    
       public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jCancle;
    private javax.swing.JLabel jDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jLogIn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField jUserid;
    // End of variables declaration//GEN-END:variables
}
