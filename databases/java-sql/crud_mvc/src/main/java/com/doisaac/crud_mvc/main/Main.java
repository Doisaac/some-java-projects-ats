package com.doisaac.crud_mvc.main;

import com.doisaac.crud_mvc.controller.PersonController;
import com.doisaac.crud_mvc.model.Person;
import com.doisaac.crud_mvc.model.PersonQuerys;
import com.doisaac.crud_mvc.view.MainFrame;

public class Main {

    public static void main(String[] args) {
        MainFrame view = new MainFrame();
        Person persona = new Person();
        PersonQuerys model = new PersonQuerys(); 
        
        PersonController controller = new PersonController(view, persona, model);
        controller.init();
    }
}
