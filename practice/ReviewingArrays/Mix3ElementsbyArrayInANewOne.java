
// Mix three elements of each array in a new Array
package ReviewingArrays;
/**
 *
 * @author MrDoisaac
 */
public class Mix3ElementsbyArrayInANewOne {
    public static void main(String[] args) {
        
        int[] numbers1 = new int[12];
        int[] numbers2 = new int[12];
        int[] finishArray = new int [24];
        
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
        
        // fill final array
        
        int fCount = 0, n1Count = 0, n2Count = 0;
        while ( fCount < finishArray.length){
            
            // fills 3 elements of numbers1 
            finishArray[fCount++] = numbers1[n1Count++];
            finishArray[fCount++] = numbers1[n1Count++];
            finishArray[fCount++] = numbers1[n1Count++];
            
            // fills 3 elements of numbers2
            finishArray[fCount++] = numbers2[n2Count++];
            finishArray[fCount++] = numbers2[n2Count++];
            finishArray[fCount++] = numbers2[n2Count++];
        }
        
        
        // Shows final array
        for (int e: finishArray){
            System.out.print(e + " ");
        }
        
    }
}
