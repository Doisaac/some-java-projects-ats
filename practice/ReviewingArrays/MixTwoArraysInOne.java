// Mix two arrays of 10 elements in a new Array[20]
package ReviewingArrays;

/**
 *
 * @author MrDoisaac
 */

public class MixTwoArraysInOne {
    
    public static void main(String[] args) {
        
        int[] numbers1 = new int[10];
        int[] numbers2 = new int[10];
        int[] finishArray = new int [20];
        
        // Counter of the array
        int fCount = 0;
        
        // fills  the array numbers1
        for (int i = 0; i < numbers1.length; i++){
            numbers1[i] = (int) (Math.random()*100);
        }
        
        // fills  the array numbers2
        for (int i = 0; i < numbers2.length; i++){
            numbers2[i] = (int) (Math.random()*100);
        }
        
        //show array numbers1
        System.out.println("Original Array 1");
        
        for (int e: numbers1){
            System.out.print(e + " ");
        }
        System.out.println("\n");
        
        //show array numbers2
        System.out.println("Original Array 2");
        for (int e: numbers2){
            System.out.print(e + " ");
        }
        System.out.println("\n");  
        
        // fill Finish array 
        for (int i = 0; i < numbers1.length; i++){
            
            finishArray[fCount++] = numbers1[i];
            
            finishArray[fCount++] = numbers2[i];
            
        }
        
        // show final array
        System.out.println("\t\tThe final Array is");
        for (int e: finishArray){
            System.out.print(e + " ");
        }
        
        
    }
    
    
}
