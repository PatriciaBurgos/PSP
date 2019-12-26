/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cristo_messenger;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Message_Model extends BDConnector{
    
    private String id_user_orig;
    private String id_user_dest;
    private String date;
    private String hour;
    private String text;
    private boolean read;
    private boolean send;
    
    private String tabladb;
    private String query;
    
    //*****CONSTRUCTOR******//

    Message_Model() throws SQLException {
        super();
        this.id_user_orig = " ";
        this.id_user_dest = " ";
        this.date = " ";
        this.hour = " ";
        this.text = " ";
        this.read = false;
        this.send = false;
        this.tabladb = "message";
        this.query = " ";
    }

    Message_Model(String id_user_orig, String id_user_dest, String date, String hour, String text, boolean read, boolean send) throws SQLException {
        super();
        this.id_user_orig = id_user_orig;
        this.id_user_dest = id_user_dest;
        this.date = date;
        this.hour = hour;
        this.text = text;
        this.read = read;
        this.send = send;
        this.tabladb = "message";
        this.query = " ";
    }

    //*****SETS AND GETS*****//

    public String getId_user_orig() {
        return id_user_orig;
    }

    public void setId_user_orig(String id_user_orig) {
        this.id_user_orig = id_user_orig;
    }

    public String getId_user_dest() {
        return id_user_dest;
    }

    public void setId_user_dest(String id_user_dest) {
        this.id_user_dest = id_user_dest;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean getRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public boolean getSend() {
        return send;
    }

    public void setSend(boolean send) {
        this.send = send;
    }
    
    public String getTabladb() {
        return tabladb;
    }

    public void setTabladb(String tabladb) {
        this.tabladb = tabladb;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }
    
    //*****CLASS METHODS*****//
    
    //TODO querys
    public void query_messages () {
        setQuery ("SELECT * FROM " + get_dbname() + "." + tabladb);
    }
    

    public void get_messages(String db, String table, ArrayList mess, String user_orig, String user_dest) throws SQLException {
        this.query_messages();
       
        try {
            this.set_stmt(this.getConn().createStatement());
            
            this.set_rs(this.get_stmt().executeQuery(query));
            
            while (get_rs().next()) {
                
                String id_user_orig = get_rs().getString("id_user_orig");
                String id_user_dest = get_rs().getString("id_user_dest");
                String text = get_rs().getString("text");
                
                System.out.println("ID_ORIG_VISTA: " +user_orig);
                System.out.println("ID_ORIG_MODEL: " +id_user_orig);
                
                
                if (user_orig.equals(id_user_orig) || user_orig.equals(id_user_dest) || user_dest.equals(id_user_orig) || user_dest.equals(id_user_dest)) {
                    System.out.println("ENTRA");
                    
                    Message_Model  messa = new Message_Model ();
                    messa.setId_user_orig(id_user_orig);
                    messa.setId_user_dest(id_user_dest);
                    messa.setText(text);
                    
                    mess.add(messa);
                }
                
            }
        } catch (SQLException e ) {
            System.out.println(e);
        } 
        finally {
            if (get_stmt() != null) { get_stmt().close(); }
        }
    }
    
    
}
