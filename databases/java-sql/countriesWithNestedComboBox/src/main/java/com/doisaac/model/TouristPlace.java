package com.doisaac.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class TouristPlace {
    
    private int idPlace;
    private String name;

    public int getIdPlace() {
        return idPlace;
    }

    public void setIdPlace(int idPlace) {
        this.idPlace = idPlace;
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
    
    public Vector<TouristPlace> showPlaces(Integer idState){
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection connection = null;
        DatabaseConnection cn = new DatabaseConnection();
        
        Vector<TouristPlace> placesVector = new Vector<>();
        TouristPlace place = null;
        
        try{
            
            connection = cn.getConnection();
            
            ps = connection.prepareStatement("SELECT * FROM touristPlaces WHERE"
                    + " idState=" + idState);
            
            rs = ps.executeQuery();
            
            place = new TouristPlace();
            place.setIdPlace(0);
            place.setName("Select a Tourist Place");
            placesVector.add(place);
            
            while (rs.next()){
                place = new TouristPlace();
                place.setIdPlace(rs.getInt("idState"));
                place.setName(rs.getString("name"));
                placesVector.add(place);
            }
            
            connection.close();
            
        } catch (Exception e) {
            System.out.println("Error + " + e.getMessage());
        } 
        
        return placesVector;
        
    }

}
