package com.doisaac.mvc_ejemplo.controller;

import com.doisaac.mvc_ejemplo.model.Model;
import com.doisaac.mvc_ejemplo.view.View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener{
    
    private View view;
    private Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
        view.btnTotal.addActionListener(this);
    }
    
    public void init(){
        view.setTitle("MVC Example");
        view.setLocationRelativeTo(null);
        view.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        model.setNumber1(Double.parseDouble(view.tfNumber1.getText()));
        model.setNumber2(Double.parseDouble(view.tfNumber2.getText()));
        
        double result = model.resultOfAddition();
        String resultFormatted = String.format("%.2f", result);
        
        view.tfResult.setText(resultFormatted);
        
    }
    
}
