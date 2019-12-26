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

/**
 *
 * @author Lenovo
 */
public class Friends_Controller {
    
     private Friends_Model friends;
    
    //*****CONSTRUCTOR******//

    Friends_Controller() throws SQLException {
        friends = new Friends_Model();
    }
    
    //*****CLASS METHODS*****//
    
    //TODO metodos que dentro se llama a la query y al metodo correspodiente para que le pida a la bd
    
    public void get_all_friends_con (ArrayList friends, String id_orig) {
        try{
            this.friends.get_all_friends_model(this.friends.get_dbname(), this.friends.getTabladb(), friends, id_orig);
            
        } catch (SQLException ex) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
