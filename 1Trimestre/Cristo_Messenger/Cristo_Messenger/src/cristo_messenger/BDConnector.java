/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cristo_messenger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Lenovo
 */
public class BDConnector {
    
    protected Connection conn;
    protected String user;
    protected String password;
    protected String sgbd; //mysql
    protected String ip;
    protected String puerto;
    protected String url;
    protected Statement stmt;    
    protected ResultSet rs;
    public String dbname; //
    
    
    BDConnector () throws SQLException { 
        //Por defecto se va a conectar a MySQL
        //System.out.println("DEBUG: Constructor bdconnector");
        
        user = "clasedam2";
        password = "root";
        sgbd = "mysql";
        ip = "clasedam2.ddns.net";
        puerto = "3306";
        dbname = "cristomessenger";
        stmt = null;       
        rs = null; 
        
        url = "jdbc:" + sgbd + "://"+ ip +":" + puerto + "/";
        conn = DriverManager.getConnection(url, user, password);
        
        System.out.println("Connected to database");
              
        //System.out.println("DEBUG:Termino constructor bdconnector");
    }
    
    BDConnector (String us, String pass, String sgbd, String ip, String port, String db) throws SQLException {
        
        user = us;
        password = pass;
        this.sgbd = sgbd;
        dbname = db;
        this.ip = ip;
        puerto = port;
        stmt = null;       
        rs = null; 
        
        url = "jdbc:" + sgbd + "://"+ ip +":" + puerto + "/";
        conn = DriverManager.getConnection(url, user, password);
        
        System.out.println("Connected to database");
        
       // conn = get_connection();
    }
    
    public void set_conn (Connection conn) {
        this.conn = conn;
    }
    
    public void set_user (String user) {
        this.user = user;
    }
    
    public void set_password (String pass) {
        this.password = pass;
    }
    
    public void set_dbname (String db) {
        this.dbname = db;
    }
    
    public void set_dgbd (String sg) {
        this.sgbd = sg;
    }
    
    public void set_ip (String ip) {
        this.ip = ip;
    }
    
    public void set_puerto (String port) {
        this.puerto = port;
    }   
    
    public void setUrl(String url) {
        this.url = url;
    }
    
    public void set_stmt (Statement statem) {
        this.stmt = statem;
    }
    
    public void set_rs (ResultSet rs) {
        this.rs = rs;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }
    
    public Connection getConn() {
        return conn;
    }
        
    public String get_user () {
        return user;
    }
    
    public String get_password () {
        return password;
    }
    
    public String get_sgbd () {
        return sgbd;
    }
    
    public String get_dbname () {
        return dbname;
    }
    
    public String get_ip () {
        return ip;
    }
    
    public String get_puerto () {
        return puerto;
    }
    
    public Statement get_stmt () {
        return stmt;
    }
    
    public ResultSet get_rs () {
        return rs;
    }

    public String getUrl() {
        return url;
    }
    
}
