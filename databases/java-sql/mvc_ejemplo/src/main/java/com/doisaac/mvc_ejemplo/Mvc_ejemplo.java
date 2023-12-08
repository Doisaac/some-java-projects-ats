package com.doisaac.mvc_ejemplo;

import com.doisaac.mvc_ejemplo.controller.Controller;
import com.doisaac.mvc_ejemplo.model.Model;
import com.doisaac.mvc_ejemplo.view.View;

public class Mvc_ejemplo {

    public static void main(String[] args) {
        View viewFrame = new View();
        Model modelFrame = new Model();
        
        
        Controller controllerFrame = new Controller(viewFrame, modelFrame);
        controllerFrame.init();
        
        
    }
}
