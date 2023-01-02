/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SearchAlgorithms;

import javax.swing.JOptionPane;

/**
 *
 * @author MrDoisaac
 */
public class SequentialSearch {
    
    public static void main(String[] args) {
        int [] numeros = {1,1,3,4};
        sequentialSearch(numeros, 8);
    }
    
    public static void sequentialSearch (int [] inputArray, int numToSearch){
        
        int i = 0; // position of the array
        boolean found = false; // starts beign false, if the number is found, it becomes true and  while loop stops.
        
        while ( i < inputArray.length && !found){
            
            if (inputArray[i] == numToSearch){
                found = true;
            }
            i++;
        }
        if (found == true){
            System.out.println("The number is in the position: " + "'" + (i-1) +"'");
        }
        else{
            System.out.println("Sorry the number is not in the list, try again");
        }
        
        
        
    }
    
}
