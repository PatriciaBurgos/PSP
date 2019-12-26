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
public class Message_Controller {
    
    private Message_Model message;
    
    //*****CONSTRUCTOR******//

    Message_Controller() throws SQLException {
        message = new Message_Model();
    }
    
    //*****CLASS METHODS*****//
    
    //TODO metodos que dentro se llama a la query y al metodo correspodiente para que le pida a la bd
    
    public void get_messages(ArrayList mess, String user_orig, String user_dest) {
        try{
            this.message.get_messages(this.message.get_dbname(), this.message.getTabladb(), mess, user_orig, user_dest);
            
        } catch (SQLException ex) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
