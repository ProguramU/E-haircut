/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.haircut;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Josh
 * 
 * Use this class instead para di na paulit ulit ccall mo nalang sya
 * as Connection conn = Driver.getConnection()
 * pag need mo
 */
public class Driver {
        private static String url = "jdbc:mysql://localhost:3306/e-haircut?serverTimezone=UTC";
        private static String userid = "root";
        private static String password = "";
        private static Connection conn = null;
        
        public static Connection getConnection() {
            try{
                conn = DriverManager.getConnection(url, userid, password);
            }catch(Exception e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
                
            
            return conn;
        }
}
