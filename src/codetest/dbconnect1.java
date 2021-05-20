
package codetest;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class dbconnect1 {
     public static Connection connect1(){
         
         Connection conn1 = null;
         
         try {
             Class.forName("com.mysql.jdbc.Driver");
             conn1 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project1","root","");
             
         } catch (Exception e) {
             
             JOptionPane.showMessageDialog(null, e);
         }
         
         return conn1;
     
     }
}
