package file.thefileclass;

import java.io.File;

public class TheFileClass {

    public static void main(String[] args) {
        // creates a file object
        File file = new File("testDir/names.txt");
      
        if (file.exists()){
            System.out.println("The file exists");
        } else {
            System.out.println("The file doesn't exist");
        }
        
        System.out.println("");
        System.out.println("Absolute Path: " + file.getAbsolutePath());
        System.out.println("Is a dir?: " + file.isDirectory());
        System.out.println("Is a file?: " + file.isFile());
        System.out.println("Can you read it?: " + file.canRead());
        System.out.println("Name: " + file.toString());
        
    }
}
