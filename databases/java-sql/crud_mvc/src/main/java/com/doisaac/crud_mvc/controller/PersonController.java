package com.doisaac.crud_mvc.controller;

import com.doisaac.crud_mvc.model.Person;
import com.doisaac.crud_mvc.model.PersonQuerys;
import com.doisaac.crud_mvc.view.MainFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import javax.swing.JOptionPane;

public class PersonController implements ActionListener {

    // view
    private MainFrame view;
    private Person person;
    private PersonQuerys model;

    public PersonController(MainFrame view, Person personModel, PersonQuerys personQuerys) {
        this.view = view;
        this.person = personModel;
        this.model = personQuerys;
        view.btnInsert.addActionListener(this);
        view.btnClean.addActionListener(this);
        view.btnSearch.addActionListener(this);
        view.btnModify.addActionListener(this);
        view.btnDelete.addActionListener(this);
    }

    public void init() {
        view.setTitle("MVC CRUD");
        view.setLocationRelativeTo(null);
        view.lID.setVisible(false);
        view.tfPersonId.setVisible(false);
        view.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == view.btnInsert) {
            try {
                person.setPersonCode(view.tfPersonCode.getText());
                person.setFirstName(view.tfFirstName.getText());
                person.setCountry(view.tfCountry.getText());
                person.setPhoneNumber(view.tfPhoneNumber.getText());
                person.setEmail(view.tfEmail.getText());
                person.setBirthDate(Date.valueOf(view.tfBirthday.getText()));
                person.setGender(String.valueOf(view.cmGender.getSelectedItem()));

                if (model.insertPerson(person)) {
                    JOptionPane.showMessageDialog(null, "Person successfully added");
                    cleanTextFields();
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Please, fill the data correctly");
            }
        } else if (e.getSource() == view.btnClean) {
            cleanTextFields();
        } else if (e.getSource() == view.btnSearch) {

            person.setPersonCode(view.tfSearch.getText());

            if (model.searchPerson(person)) {
                view.lID.setVisible(true);
                view.tfPersonId.setVisible(true);
                view.tfPersonId.setText(String.valueOf(person.getIdPerson()));
                view.tfPersonCode.setText(person.getPersonCode());
                view.tfFirstName.setText(person.getFirstName());
                view.tfCountry.setText(person.getCountry());
                view.tfPhoneNumber.setText(person.getPhoneNumber());
                view.tfEmail.setText(person.getEmail());
                view.tfBirthday.setText(String.valueOf(person.getBirthDate()));
                view.cmGender.setSelectedItem(person.getGender());
            } else {
                JOptionPane.showMessageDialog(null, "There is no person with this code");
                cleanTextFields();
            }

        } else if (e.getSource() == view.btnModify) {

            person.setIdPerson(Integer.parseInt(view.tfPersonId.getText()));
            person.setPersonCode(view.tfPersonCode.getText());
            person.setFirstName(view.tfFirstName.getText());
            person.setCountry(view.tfCountry.getText());
            person.setPhoneNumber(view.tfPhoneNumber.getText());
            person.setEmail(view.tfEmail.getText());
            person.setBirthDate(Date.valueOf(view.tfBirthday.getText()));
            person.setGender(String.valueOf(view.cmGender.getSelectedItem()));

            if (model.modifyPerson(person)) {
                JOptionPane.showMessageDialog(null, "Person sucessfully modified");
                cleanTextFields();
            } else {
                JOptionPane.showMessageDialog(null, "There is no person with this code");
            }
        } else if (e.getSource() == view.btnDelete){
            
            person.setIdPerson(Integer.parseInt(view.tfPersonId.getText()));
            
            if (model.deletePerson(person)){
                JOptionPane.showMessageDialog(null, "Person successfully deleted");
                cleanTextFields();
            } 
            else{
                JOptionPane.showMessageDialog(null, "An error has occurred, pleasy check again");
            }
            
        }

    }

    // Clean all the view textFields
    public void cleanTextFields() {
        view.tfPersonId.setVisible(false);
        view.lID.setVisible(false);
        view.tfSearch.setText(null);
        view.tfPersonCode.setText(null);
        view.tfFirstName.setText(null);
        view.tfCountry.setText(null);
        view.tfPhoneNumber.setText(null);
        view.tfEmail.setText(null);
        view.tfBirthday.setText(null);
        view.cmGender.setSelectedIndex(0);
    }

}
