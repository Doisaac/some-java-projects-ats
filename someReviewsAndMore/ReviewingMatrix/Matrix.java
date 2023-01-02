/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ReviewingMatrix;

/**
 *
 * @author MrDoisaac
 */
public class Matrix {
    public static void main(String[] args) {
        
        int[][] numbers = { {1,2,3,2}, {4,5,6}, {7,8,9} };
        
        for (int i = 0; i<numbers.length; i++){ // i roads the rows
            
            for(int j = 0; j <numbers[i].length; j++){ // j roads the columns
                System.out.print(numbers[i][j]);
            }
            
            System.out.println("");
        }
        
       
    }
}
