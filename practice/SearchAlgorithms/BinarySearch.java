package SearchAlgorithms;

/**
 *
 * @author MrDoisaac
 */
public class BinarySearch {
    
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,8,44};
        binarySearch(numbers, 44);
    }
    
    public static void binarySearch(int[] numbers, int numToSearch){
        int lower = 0;
        int higher = numbers.length;
        int i = 0;
        
        boolean found = false;
        int half = (lower + higher)/2;
        
        while(lower <= higher && i < numbers.length){
            if( numbers[half] == numToSearch){
                found = true;
            }
            if ( numbers[half] > numToSearch){
                higher = half;
                half = ( lower + higher )/2;
                
            }
            if ( numbers[half] < numToSearch){
                lower = half;
                half = ( lower + higher )/2 ;
            }
            i++;
        }
        
        if(found == true){
            System.out.println("The number is the position: " + (half));
        }
        else{
            System.out.println("The number is not in the list");
        }
        
    }
    
}
