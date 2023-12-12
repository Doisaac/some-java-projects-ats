package com.doisaac.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class State {
    
    private int idState;
    private String name;

    public int getIdState() {
        return idState;
    }

    public void setIdState(int idState) {
        this.idState = idState;
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
    
    public Vector<State> showStates(Integer idCountry){
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection connection = null;
        DatabaseConnection cn = new DatabaseConnection();
        
        Vector<State> statesVector = new Vector<>();
        State state = null;
        
        try{
            
            connection = cn.getConnection();
            
            ps = connection.prepareStatement("SELECT * FROM states WHERE"
                    + " idCountry=" + idCountry);
            
            rs = ps.executeQuery();
            
            state = new State();
            state.setIdState(0);
            state.setName("Select a State");
            
            statesVector.add(state);
            
            while (rs.next()){
                state = new State();
                state.setIdState(rs.getInt("idState"));
                state.setName(rs.getString("name"));
                statesVector.add(state);
            }
            
            connection.close();
            
        } catch (Exception e) {
            System.out.println("Error + " + e.getMessage());
        } 
        
        return statesVector;
        
    }
}
