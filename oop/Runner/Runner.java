package Runner;

/**
 *
 * @author MrDoisaac
 */
public class Runner {
    
    private int idRunner;
    private String name;
    private float raceTime;
    
    
    public Runner(int idRunner, String name, float raceTime){
        this.idRunner = idRunner;
        this.name = name;
        this.raceTime = raceTime;
    }

    public float getRaceTime() {
        return raceTime;
    }
    
    public String getInfo(){
        System.out.println("\n*-*-*-**-*-*-**-*-*-**-*-*-**-*-*-*");
        return "ID: " + idRunner 
                + "\nName: " + name 
                + "\nRace Time: " + raceTime + " seconds\n"
                + "*-*-*-**-*-*-**-*-*-**-*-*-**-*-*-*";
    }
}
