package file.createwritereadtextfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreateWriteReadTextFile {
    File file;
    
    //// MAIN //////////////////////////////////////////
    public static void main(String[] args) {
        CreateWriteReadTextFile fileObj = new CreateWriteReadTextFile();
        fileObj.createFile("saludo");
        fileObj.writeText("Hello, my name is Douglas Barrera. I am writing this at 10 minutos to 8");
        fileObj.addText("So thank you all, bye!");
        
        // reads the text file
        System.out.println("\n\t\t\tText\n");
        fileObj.readText();
    }
    
    /**
     * Creates a text file on "testDir/" 
     * @param filename The name of the new file
     */
    private void createFile(String fileName){
        file = new File("testDir/" + fileName + ".txt");
        
        try {
            if (file.createNewFile()){
                System.out.println("File created successfully");
            } 
        } catch (IOException ex) {
            System.err.println("Sorry, it was not possible to create the file");
        }
        
    }
    
    /**
     * Creates a new directory on "testDir/"
     * @param dirName The directory name
     */
    private void createDir(String dirName){
        file = new File("testDir/" + dirName);
        
        if (file.mkdir()){
            System.out.println("Directory created successfully");
        } else {
            System.out.println("Directory already exist or an error has happened");
        }
    }
    
    /**
     * Writes text into the file.txt
     * @param text The text to be inserted
     */
    private void writeText(String text){
        try {
            // creates a file writer object to be able to write into the file
            FileWriter writer = new FileWriter(file);
            writer.write(text);
            writer.close();
        } catch (IOException ex) {
           System.err.println("There has been a error");
        }
    }
    
    private void addText(String text){
        try {
            // creates a file writer object to be able to write into the file
            FileWriter writer = new FileWriter(file, true);
            writer.write("\r\n"+text);
            writer.close();
        } catch (IOException ex) {
           System.err.println("There has been a error");
        }
    }
    
    /**
     * Reads the text of a text file
     */
    private void readText(){
        String string;
        try {
            FileReader reader = new FileReader(file);
            BufferedReader lecture = new BufferedReader(reader);
            string = lecture.readLine();
            
            while(string != null){
                System.out.println(string);
                string = lecture.readLine();
            }
            
        } catch (FileNotFoundException ex) {
            System.err.println("Error" + ex);
        } catch (IOException ex) {
                Logger.getLogger(CreateWriteReadTextFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
