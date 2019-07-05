import java.sql.*;
import javax.swing.*;

public class ABA_Jewallary {
    
    
    public void clearData()
    {
        
    }
     static
    {
        Connection con;
	Statement ps;
	ResultSet rs;
        try{
            
        Class.forName("oracle.jdbc.driver.OracleDriver");
	con=DriverManager.getConnection("jdbc:oracle:thin:@:1521:xe","system","1234");
	ps=con.createStatement();
        rs=ps.executeQuery("select * from login");
        }
        catch(Exception e)
        {
            try{
            
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con=DriverManager.getConnection("jdbc:oracle:thin:@:1521:xe","system","1234");
            ps=con.createStatement();
            String str="create table login(username varchar(30),password varchar(20),count int,silcount int)";
            ps.executeUpdate(str);
            str="insert into login values('admin','1234',0,0)";
            ps.executeUpdate(str);
            con.close();
            }
            catch(Exception e1)
            {
              System.out.println("Log In"+e1);
            }
        }
    }

    public static void main(String[] args) {
        
        LogIn l1=new LogIn();
        l1.setTitle("Log In");
        l1.setVisible(true);
        
    }
    
}
