/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cristo_messenger;

import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class User_Controller {
    
    private User_Model user;
    
    
    //*****CONSTRUCTOR******//

    User_Controller() throws SQLException {
        user = new User_Model();
    }
    
    //*****SETS AND GETS*****//

    
    //*****CLASS METHODS*****//
    
    //TODO metodos que dentro se llama a la query y al metodo correspodiente para que le pida a la bd
    
    public void get_all_users_control(ArrayList users) throws SQLException {
        
        try{
            user.get_all_users_model(user.get_dbname(), user.getTabladb(), users);
            
        } catch (SQLException ex) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean check_user (String user_screen, String password) {
        ArrayList <User_Model> login = new ArrayList <User_Model>(); 
        boolean check = false;
        
        try{
            user.get_all_users_login_model(user.get_dbname(), user.getTabladb(),login);
            
            for (int i = 0; i<login.size(); i++) {
                /*DEBUG*/
                System.out.println("user: " + user_screen);
                System.out.println("login: " + login.get(i).getId_user());
                System.out.println("password: " + password);
                System.out.println("password_login: "+ login.get(i).getPassword());
                
                
                if (login.get(i).getId_user().equals(user_screen) && (login.get(i).getPassword().equals(password))) {
                    check=true;
                    
                    /*DEBUG*/
                    
                    System.out.println("Controller");
                    System.out.println("check: " + check);
                    System.out.println("user: " + user_screen);
                    System.out.println("password: " + password);
        
                    
                }
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return check;
    }
    
    public boolean check_user_id (String user_screen) {
        ArrayList <User_Model> login = new ArrayList <User_Model>(); 
        boolean check = false;
        
        try{
            user.get_all_users_login_model(user.get_dbname(), user.getTabladb(),login);
            
            for (int i = 0; i<login.size(); i++) {
                /*DEBUG*/
               /* System.out.println("user: " + user_screen);
                System.out.println("login: " + login.get(i).getId_user());
                System.out.println("password: " + password);
                System.out.println("password_login: "+ login.get(i).getPassword());*/
                
                
                if (login.get(i).getId_user().equals(user_screen)) {
                    check=true;
                    
                    /*DEBUG*/
                    
                  /*  System.out.println("Controller");
                    System.out.println("check: " + check);
                    System.out.println("user: " + user_screen);
                    System.out.println("password: " + password);*/
        
                }
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return check;
    }
    
    public User_Model get_user_act (String user_2screen) throws SQLException {
        ArrayList <User_Model> login = new ArrayList <User_Model>(); 
        User_Model act=new User_Model();
        
        try{
            user.get_all_users_login_model(user.get_dbname(), user.getTabladb(),login);
            
            for (int i = 0; i<login.size(); i++) {
                
                if (login.get(i).getId_user().equals(user_2screen) ) {
                    
                    act.setId_user(login.get(i).getId_user());
                    act.setName(login.get(i).getName());
                    act.setPassword(login.get(i).getPassword());
                    act.setSurname1(login.get(i).getSurname1());
                    act.setSurname2(login.get(i).getSurname2());
                    act.setPhoto(login.get(i).getPhoto());
                    act.setState(login.get(i).getState());
                }
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return act;
    } 
    
    public void agregar_user (String user,String name,String pass,String sur1,String sur2) throws SQLException {
        User_Model user_mod=new User_Model(user,name,pass,sur1,sur2,"url",0);
        System.out.println("DEBUG: INSERT (CON)");
        try{
            user_mod.set_new_user_model(user_mod.get_dbname(), user_mod.getTabladb(),user_mod);
            System.out.println("DEBUG: INSERT TERMINADO (CON)");
        } catch (SQLException ex) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
