/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.haircut;

/**
 *
 * @author Prog
 */
public class EHaircut {
    
    //  Connect to an MySQL Database, run query, get result set
        public static String url = "jdbc:mysql://localhost:3306/e-haircut?serverTimezone=UTC";
        public static String userid = "root";
        public static String password = "";
        

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MainMenu start = new MainMenu();
        start.setVisible(true);
        
    }
    
}
 