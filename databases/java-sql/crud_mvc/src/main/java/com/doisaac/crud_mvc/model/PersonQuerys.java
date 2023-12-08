package com.doisaac.crud_mvc.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class PersonQuerys extends ConnectionToDB{
    
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;
    
    /**
     * Insert a person into the db
     */
    public boolean insertPerson(Person person){
        
        Connection connection = null;
        
        try {
            connection = getConnection();
            
            preparedStatement = connection.prepareStatement("INSERT INTO"
                    + " people (personCode, firstName, country, phoneNumber, "
                    + "email, birthdate, gender) VALUES (?,?,?,?,?,?,?)");
            
            preparedStatement.setString(1, person.getPersonCode());
            preparedStatement.setString(2, person.getFirstName());
            preparedStatement.setString(3, person.getCountry());
            preparedStatement.setString(4, person.getPhoneNumber());
            preparedStatement.setString(5, person.getEmail());
            preparedStatement.setDate(6, person.getBirthDate());
            preparedStatement.setString(7, person.getGender());
            
            int status = preparedStatement.executeUpdate();
            
            if (status > 0){
                return true;
            }
            else {
                return false;
            }
            
            
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "An error has occurred " + ex);
            return false;
            
        } finally {
            try {
                connection.close();
            } catch (Exception e) {
                return false;
            }
        }
        
    }
    
    /**
     * Search a person in the database
     * @param person 
     * @return true if the person exist, otherwise is false
     */
    public boolean searchPerson(Person person){
        
        Connection connection = null;
        
        try {
            connection = getConnection();
            
            preparedStatement = connection.prepareStatement("SELECT * FROM"
                    + " people WHERE personCode=?");
            
            preparedStatement.setString(1, person.getPersonCode());
            
            resultSet = preparedStatement.executeQuery();
            
            if (resultSet.next()){
                person.setIdPerson(resultSet.getInt("idPerson"));
                person.setPersonCode(resultSet.getString("personCode"));
                person.setFirstName(resultSet.getString("firstName"));
                person.setCountry(resultSet.getString("country"));
                person.setPhoneNumber(resultSet.getString("phoneNumber"));
                person.setEmail(resultSet.getString("email"));
                person.setBirthDate(resultSet.getDate("birthdate"));
                person.setGender(resultSet.getString("gender"));
                
                return true;
            }
            else {
                return false;
            }
            
            
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "An error has occurred " + ex);
            return false;
            
        } finally {
            try {
                connection.close();
            } catch (Exception e) {
                return false;
            }
        }
    }
    
    /**
     * Modifies a person from database
     * @param person
     * @return 
     */
    public boolean modifyPerson(Person person){
        
        Connection connection = null;
        
        try {
            connection = getConnection();
            
            preparedStatement = connection.prepareStatement("UPDATE people SET "
                    + "personCode=?, firstName=?, country=?, phoneNumber=?, "
                    + "email=?, birthdate=?, gender=? WHERE idPerson=?");
            
            preparedStatement.setString(1, person.getPersonCode());
            preparedStatement.setString(2, person.getFirstName());
            preparedStatement.setString(3, person.getCountry());
            preparedStatement.setString(4, person.getPhoneNumber());
            preparedStatement.setString(5, person.getEmail());
            preparedStatement.setDate(6, person.getBirthDate());
            preparedStatement.setString(7, person.getGender());
            preparedStatement.setString(8, String.valueOf(person.getIdPerson()));
            
            int status = preparedStatement.executeUpdate();
            
            if (status > 0){
                return true;
            }
            else {
                return false;
            }
            
            
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "An error has occurred " + ex);
            return false;
            
        } finally {
            try {
                connection.close();
            } catch (Exception e) {
                return false;
            }
        }
        
    }
    
    /**
     * Deletes a person from the batabase
     * @param person
     * @return 
     */
    public boolean deletePerson(Person person){
        
        Connection connection = null;
        
        try {
            connection = getConnection();
            
            preparedStatement = connection.prepareStatement("DELETE FROM people"
                    + " WHERE idPerson=?");
            
            preparedStatement.setString(1, String.valueOf(person.getIdPerson()));
            
            int status = preparedStatement.executeUpdate();
            
            if (status > 0){
                return true;
            }
            else {
                return false;
            }
            
            
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "An error has occurred " + ex);
            return false;
            
        } finally {
            try {
                connection.close();
            } catch (Exception e) {
                return false;
            }
        }
        
    }
}
