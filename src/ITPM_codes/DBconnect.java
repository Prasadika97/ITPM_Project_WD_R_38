
package ITPM_codes;


import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class DBconnect {
    
    public static Connection connect (){
        
        Connection conn = null;
        
        try {
            Class.forName("org.sqlite.JDBC");
            conn =DriverManager.getConnection("jdbc:sqlite:itpm.db");
            
        } catch (Exception e){
            
            JOptionPane.showMessageDialog(null, e);
        }
        
        return conn ;
        
        
    }
    
}
