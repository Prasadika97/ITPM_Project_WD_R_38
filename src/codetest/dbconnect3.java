
package codetest;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class dbconnect3 {

    public static Connection connect3 (){
    
     Connection conn3 = null;
     
     try{
       Class.forName("com.mysql.jdbc.Driver");
       conn3 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/session","root","");
     }catch (Exception e){
         
         JOptionPane.showMessageDialog(null, e);
     }
     
     return conn3;
    }
}
