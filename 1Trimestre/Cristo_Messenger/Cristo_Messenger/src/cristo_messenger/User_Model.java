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
public class User_Model extends BDConnector{
    
    private String id_user; //login
    private String name; 
    private String password;
    private String surname1;
    private String surname2;
    private String photo;
    private int state;
    
    private String tabladb;
    private String query;
    
    //*****CONSTRUCTOR******//

    public User_Model() throws SQLException {
        super();
        this.id_user = " ";
        this.name = " ";
        this.password = " ";
        this.surname1 = " ";
        this.surname2 = " ";
        this.photo = " ";
        this.state = -1;
        this.tabladb = "user";
        this.query = " ";
    }   
    
    User_Model(String id_user, String name, String password, String surname1, String surname2, String photo, int state) throws SQLException {
        super();
        this.id_user = id_user;
        this.name = name;
        this.password = password;
        this.surname1 = surname1;
        this.surname2 = surname2;
        this.photo = photo;
        this.state = state;
        this.tabladb = "user";
        this.query = " ";
    }
    
    
    //*****SETS AND GETS*****//

    public String getId_user() {
        return id_user;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSurname1() {
        return surname1;
    }

    public void setSurname1(String surname1) {
        this.surname1 = surname1;
    }

    public String getSurname2() {
        return surname2;
    }

    public void setSurname2(String surname2) {
        this.surname2 = surname2;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
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
    
    //TODO gets
    
    public void query_all_users () {
        setQuery ("SELECT * FROM " + get_dbname() + "." + tabladb); 
    }
    
    
    public void get_all_users_model (String db, String table, ArrayList users) throws SQLException {
       // System.out.println("DEBUG:Method get_all_users_model");
       
       this.query_all_users();
       
        try {
            this.set_stmt(this.getConn().createStatement());
            
            this.set_rs(this.get_stmt().executeQuery(query));
            
            while (get_rs().next()) {
                String id_user = get_rs().getString("id_user");
                String name = get_rs().getString("name");

                User_Model  user = new User_Model ();
                user.setId_user(id_user);
                user.setName(name);
                
                users.add (user);
                
            }
        } catch (SQLException e ) {
            System.out.println(e);
        } 
        finally {
            if (get_stmt() != null) { get_stmt().close(); }
        }
    }    
    
            
    public void get_all_users_login_model (String db, String table, ArrayList users) throws SQLException {
       // System.out.println("DEBUG:Method get_all_users_model");
       
       this.query_all_users();
       
        try {
            this.set_stmt(this.getConn().createStatement());
            
            this.set_rs(this.get_stmt().executeQuery(query));
            
            while (get_rs().next()) {
                String id_user = get_rs().getString("id_user");
                String password = get_rs().getString("password");

                User_Model  user = new User_Model ();
                user.setId_user(id_user);
                user.setPassword(password);
                
                users.add (user);
                
            }
        } catch (SQLException e ) {
            System.out.println(e);
        } 
        finally {
            if (get_stmt() != null) { get_stmt().close(); }
        }
    }    
    
    public void set_new_user_model (String db, String table, User_Model new_user) throws SQLException {
        
        
        try {
            System.out.println("DEBUG: INSERT (Mod)");
            this.set_stmt(this.getConn().createStatement());
            String insertar = ("INSERT INTO cristo_messenger.user VALUES ('"+new_user.getId_user()+"', '"+new_user.getName()+"', '"+new_user.getPassword()+"','"+new_user.getSurname1()+"','"+new_user.getSurname2()+"','"+new_user.getPhoto()+"','"+new_user.getState()+"');");
            System.out.println(insertar);
            this.stmt.executeUpdate(insertar);
            
            System.out.println("New user bd");
            

        } catch (SQLException e ) {
            System.out.println(e);
        } 
        finally {
            if (get_stmt() != null) { get_stmt().close(); }
        }
    }
    
}
