
package codetest;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class dbconnect2 {
    
    public static Connection connect2(){
        
        Connection conn2 = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn2 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return conn2;
    
    
    }
    
}
