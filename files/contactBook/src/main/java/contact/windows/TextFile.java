package contact.windows;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TextFile {
    
    private File file;
    
    /**
     * Creates a new text file for save the contacts on it
     */
    public void createFile(){
        try {
            this.file = new File("contacts.txt");
            
            if (file.createNewFile()){
                System.out.println("The file was created successfully");
            }
            
        } catch (IOException ex) {
            System.out.println("There was an error creating the file");
        }
    }

    public void writeText(Person person){
        try {
            FileWriter writer = new FileWriter(this.file, true);
            writer.write(person.getName() + "%" + person.getEmail() + "%" + person.getPhoneNumber() + "\r\n");
            writer.close();
        } catch (IOException ex) {
            System.out.println("An error has happenned");
        }
        
    }
}
