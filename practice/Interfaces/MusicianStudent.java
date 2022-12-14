package Interfaces;

/**
 *
 * @author MrDoisaac
 */
public class MusicianStudent implements Musician, Student {
    
    @Override
    public void speak(){
        System.out.println("I'm speaking bro");
    }
    
    @Override
    public void playMusic(){
        System.out.println("I'm playing the guitar bro");
    }
    
    @Override
    public void study(){
        System.out.println("I'm studying programming languages bro");
    }
}
