
// SHOWS ARRAY STARTING WITH THE FIRST AND THE LAST ONE .... IN THAT WAY
package ReviewingArrays;

/**
 *
 * @author MrDoisaac
 */
public class FirstAndLast {

    public static void main(String[] args) {

        int [] numbers = new int[10];
        
        // generates random numbers for the array
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = (int) (Math.random()*100);
        }
        
        System.out.println("\nORIGINAL");
        for(int e: numbers){
            System.out.print(e + " , ");
        }
        
        System.out.println("");
        
        
        System.out.println("NEW");
        
        for (int i = 0; i < (numbers.length/2); i++){
            System.out.print(numbers[i] + " , ");
            System.out.print(numbers[9-i] + " , "); // 9 - i is going to be decreasing each time, it starts with the last one
        }
        
    }
}
