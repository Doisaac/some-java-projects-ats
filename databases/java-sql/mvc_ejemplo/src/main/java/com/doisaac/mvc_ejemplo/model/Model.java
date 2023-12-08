package com.doisaac.mvc_ejemplo.model;

public class Model {
    
    private double number1;
    private double number2;
    private double result;
    
    
    public double resultOfAddition(){
        result = number1 + number2;
        return result;
    }
    

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
    
    
    
}
