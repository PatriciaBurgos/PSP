/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cristo_messenger;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author Lenovo
 */
public class Vista {

    ArrayList <User_Model> users;
    User_Controller user;
    
    Vista () throws SQLException {
        users = new ArrayList ();
        user = new User_Controller();
    }
    
    public void get_users() throws SQLException {
        user.get_all_users_control(users);
    }

    public void print_users () {        
        for (int i = 0; i<users.size(); i++) {
            System.out.print(users.get(i).getId_user() + "\t");
            System.out.println(users.get(i).getName());
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
                
        Vista vista = new Vista();
        
        vista.get_users();
        vista.print_users();
          
        First_Screen v = new First_Screen();
        v.setVisible(true);

        System.out.println("Finish");
    }
    
    
}
