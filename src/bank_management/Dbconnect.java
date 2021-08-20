
package bank_management;
/*
 *
 * @author ABD
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class Dbconnect {
    static String url = "jdbc:mysql://194.59.164.22:3306/u486881116_Bank_mag";
//    static String dbName = "u486881116_Bank_mag";
    static String user = "u486881116_Banking";
    static String password = "Rishi#10#12#2001";
    public static Connection dbconnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url,user,password);
            return conn;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return null;
    }
}