package com.doisaac.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SQLUser {
    
    private ConnecionToDB cn;
    private Connection connection;
    private PreparedStatement ps;
    private ResultSet rs;
    
    /**
     * Register a user into the database
     * @param user
     * @return true if the user was added, false if not 
     */
    public boolean registerUser(User user){
        
        cn = new ConnecionToDB();
        connection = null;
        ps = null;
        
        try
        {
            connection = cn.getConnection();
            ps = connection.prepareStatement("INSERT INTO user (username, password, name, email, idUser_Type) "
                    + "VALUES (?,?,?,?,?)");
            
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getName());
            ps.setString(4, user.getEmail());
            ps.setInt(5, user.getIdUser_Type());
            
            ps.executeUpdate();
            
            connection.close();
            return true;
            
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    /**
     * Check if the username is already taken
     * @param username
     * @return 1 if the user exist, 0 if not
     */
    public int checkIfUserExist(String username){
        
        cn = new ConnecionToDB();
        connection = null;
        ps = null;
        
        try
        {
            connection = cn.getConnection();
            ps = connection.prepareStatement("SELECT COUNT(id) FROM user WHERE username=?");
            
            ps.setString(1, username);
            rs = ps.executeQuery();
            
            if (rs.next()){
                return rs.getInt(1);
            } 
            
            connection.close();
            
            return 1;
            
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            return 1;
        }
    }
    
    /**
     * Verifies if a email is correct or not
     * @param email the email to check
     * @return true if the email is correct, false if not
     */
    public boolean verifyEmail(String email){
        Pattern pattern = Pattern.compile( "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" +
            "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        
        Matcher matcher = pattern.matcher(email);
        
        return matcher.find();
    }
    
    /**
     * Verifies if the user is already registered 
     * @param user
     * @return true if the user exist, false if not 
     */
    public boolean userSignin(User user){
        
        cn = new ConnecionToDB();
        connection = null;
        ps = null;
        
        try
        {
            connection = cn.getConnection();
            ps = connection.prepareStatement(
                    "SELECT u.id, u.username, u.password, u.name, u.idUser_Type, ut.name " +
                    "FROM user as u INNER JOIN user_type as ut " + 
                    "ON u.idUser_Type = ut.id " + 
                    "WHERE username=?");
            
            ps.setString(1, user.getUsername());
            
            rs = ps.executeQuery();
            
            if (rs.next())
            {
                if (user.getPassword().equals(rs.getString("password")))
                {
                    ps = connection.prepareStatement("UPDATE user SET last_session=? WHERE id=?");
                    ps.setString(1, user.getLast_session());
                    ps.setInt(2, rs.getInt("id"));
                    
                    ps.executeUpdate();
                    
                    user.setId(rs.getInt("u.id"));
                    user.setName(rs.getString("u.name"));
                    user.setIdUser_Type(rs.getInt("u.idUser_Type"));
                    user.setUserRol(rs.getString("ut.name"));
                    return true;
                }
                else{
                    return false;
                }
            }
            connection.close();
            
            return false;
            
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
