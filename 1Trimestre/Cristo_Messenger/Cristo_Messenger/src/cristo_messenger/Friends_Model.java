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
public class Friends_Model extends BDConnector{
    
    private String id_user_orig;
    private String id_user_dest;
    private boolean accept_request;
    
    private String tabladb;
    private String query;
    
    
    //*****CONSTRUCTOR******//
    
    Friends_Model() throws SQLException {
        super();
        this.id_user_orig = " ";
        this.id_user_dest = " ";
        this.accept_request = false;
        this.tabladb = "friend";
        this.query = " ";        
    }

    Friends_Model(String id_user_orig, String id_user_dest, boolean accept_request) throws SQLException {
        super();
        this.id_user_orig = id_user_orig;
        this.id_user_dest = id_user_dest;
        this.accept_request = accept_request;
        this.tabladb = "friend";
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

    public boolean getAccept_request() {
        return accept_request;
    }

    public void setAccept_request(boolean accept_request) {
        this.accept_request = accept_request;
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

    public void query_all_friends () {
        setQuery ("SELECT * FROM " + get_dbname() + "." + tabladb);
    }
    
    
    public void get_all_friends_model (String db, String table, ArrayList friends, String id_orig) throws SQLException {
        
        this.query_all_friends();
       
        try {
            this.set_stmt(this.getConn().createStatement());
            
            this.set_rs(this.get_stmt().executeQuery(query));
            
            while (get_rs().next()) {
                
                String id_user_orig = get_rs().getString("id_user_orig");
                String id_user_dest = get_rs().getString("id_user_dest");
                
                System.out.println("ID_ORIG_VISTA: " +id_orig);
                System.out.println("ID_ORIG_MODEL: " +id_user_orig);
                
                
                if (id_orig.equals(id_user_orig)) {
                    System.out.println("ENTRA");
                    String name = id_user_dest;
                    
                    friends.add(name);
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
