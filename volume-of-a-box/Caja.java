package Udemy;

public class Caja {
    // atributos
    int ancho, alto, profundo;
    
    //constructor vacio
    public Caja(){
        
    }    
    
    // constructor con 3 argumentos
    public Caja(int arg1, int arg2, int arg3){
        this.ancho = arg1;
        this.alto = arg2;
        this.profundo = arg3;
    }
    
    //metodo de cálculo del volumen de la caja segun la formula vol = ancho x alto x profundo
    public int calcular (){
        int formula = ancho * alto * profundo;
        return formula;
    }
}