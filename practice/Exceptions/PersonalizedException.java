/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exceptions;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author MrDoisaac
 */
public class PersonalizedException {
    
    private static int number;
    private static Scanner sc;
    
    
    public static void main(String[] args){
        try{
          enterNumbers();  
        } catch ( Exception0 e0 ){
            JOptionPane.showMessageDialog(null, "'0' IS NOT ACCEPTED");
        }
        finally{
            System.out.println("PROGRAM HAS ENDED");
        }
    }
    
    public static void enterNumbers() throws Exception0{
        sc = new Scanner(System.in);
        
        do {
            System.out.print("Please enter a number: ");
            number = sc.nextInt();
            
                    
            if ( number == 0){ // this throws a personalized exception made in the other class "Exception0"
                throw new Exception0();
            }
            
        } while(number != 0 && number != 1);
    }
    
    
}
