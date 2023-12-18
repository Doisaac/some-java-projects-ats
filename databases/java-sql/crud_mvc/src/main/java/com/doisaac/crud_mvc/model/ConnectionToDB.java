package com.doisaac.crud_mvc.model;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConnectionToDB {
    
    /* Variables */
    protected static final String URL = "jdbc:mysql://localhost:3306/school";
    protected static final String USER = "root";
    protected static final String PASSWORD = "123456";
    /* End variables */
    
    /*
     * Creates the connection to the database
    */
    protected Connection getConnection(){
        
        Connection conn = null;
        
        try {
            
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "An error has occurred: " + ex);
        }
        
        return conn;
    }
    
    
}