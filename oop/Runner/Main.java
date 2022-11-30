/*
 * In this software you have to enter "N" numbers of athletes, giving 
   their name and the race time they did. The software will
   show you the winner.
package Runner;

*/

package Runner;

import java.util.Scanner;

public class Main {
    
    private static int idCount = 0;
    
    public static int getWinner(Runner runners[]){
        int winnerPosition = 0;
        float currentWinner = runners[0].getRaceTime();
        
        for(int i = 1; i<runners.length; i++){
            if(runners[i].getRaceTime() < currentWinner){
                currentWinner = runners[i].getRaceTime();
                winnerPosition = i;
            }
        }
        return winnerPosition;
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int nAthetes, id, winner;
        float raceTime;
        String name;
        
        System.out.print("How many athetes do you want to enter?: ");
        nAthetes = sc.nextInt();
        
        Runner [] runners = new Runner[nAthetes];
        
        // Fills the array with each runner;
        for (int i = 0; i<runners.length; i++){
            System.out.println("\n\tPlease enter information of athete #" + (i+1));
            
            // ID its created automatically 
            id = ++idCount; 
            
            sc.nextLine();
            System.out.print("Name: ");
            name = sc.nextLine();
            
            System.out.print("Race Time: ");
            raceTime = sc.nextFloat();
            
            runners[i] = new Runner(idCount, name, raceTime);
        }
        
        // validates and assign the winner position
        
        winner = getWinner(runners);
        
        System.out.println("\tThe winner information" + "\n" + runners[winner].getInfo());
    }
}
