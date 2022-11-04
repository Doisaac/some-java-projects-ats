package com.douglas.tienda;
import java.util.*;
public class ATS {
    //Scanner
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int numero, sumaP = 0, conteo_pos = 0, sumaN = 0, conteo_neg = 0, conteo_ceros = 0;
       float media_pos, media_neg;
       
       for(int i = 1; i <= 10; i++){
           System.out.print("Escribe el numero " + i);
           numero = sc.nextInt();
           
           if(numero == 0){
               conteo_ceros++;
           }
           else if(numero > 0){
               sumaP += numero;
               conteo_pos++;
           }
           else{
               sumaN += numero;
               conteo_neg++;
           }
           
       }
       
       if(conteo_pos == 0){
           System.out.println("no se puede sacar la media de los positivos");
       }
       else{
           media_pos = (float) sumaP/conteo_pos;
           System.out.println("la media de positivos es: " + media_pos);
       }
       
       if(conteo_neg == 0){
           System.out.println("No se puede sacar la media de los negativos");
       }
       else{
           media_neg = (float) sumaN / conteo_neg;
           System.out.println("la media de negativos es: " + media_neg);
       }
       
        System.out.println("La cantidad de ceros es: " + conteo_ceros);
    }
    
}
