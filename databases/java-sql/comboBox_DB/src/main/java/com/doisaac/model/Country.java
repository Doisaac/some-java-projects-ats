package com.doisaac.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class Country {
    private int idCountry;
    private String name;

    public int getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(int idCountry) {
        this.idCountry = idCountry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString(){
        return this.name;
    }
    
    public Vector<Country> showCountries(){
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection connection = null;
        DatabaseConnection cn = new DatabaseConnection();
        
        Vector<Country> countriesVector = new Vector<>();
        Country country = null;
        
        try{
            
            connection = cn.getConnection();
            
            ps = connection.prepareStatement("SELECT * FROM country");
            
            rs = ps.executeQuery();
            
            country = new Country();
            country.setIdCountry(0);
            country.setName("Select a Country");
            
            countriesVector.add(country);
            
            while (rs.next()){
                country = new Country();
                country.setIdCountry(rs.getInt("idCountry"));
                country.setName(rs.getString("name"));
                countriesVector.add(country);
            }
            
            connection.close();
            
        } catch (Exception e) {
            System.out.println("Error + " + e.getMessage());
        } 
        
        return countriesVector;
        
    }
}
