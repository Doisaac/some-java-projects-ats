package file.binaryfile;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class BinaryFile {

    public static void main(String[] args) {
        //writeBinary();
        addTextBinary();
        readBinaryFile();
    }
    
    public static void writeBinary(){
        try {
            FileOutputStream file = new FileOutputStream("people.bin");
            ObjectOutputStream writer = new ObjectOutputStream(file);
            Person douglas = new Person("Douglas", 19);
            Person alejandra = new Person("Alejandra", 25);
            Person josue = new Person("Josue", 14);
            
            writer.writeObject(douglas);
            writer.writeObject(alejandra);
            writer.writeObject(josue);
            
            writer.close();
        } catch (FileNotFoundException ex) {
            System.err.println("An error has ocurred");
        } catch (IOException ex) {
            System.err.println("An error has ocurred");
        }
    }
    
    public static void readBinaryFile(){
        Person person;
        try {
            FileInputStream file = new FileInputStream("people.bin");
            ObjectInputStream reader = new ObjectInputStream(file);
            
            while(true){ // Go through the binary file
                person = (Person) reader.readObject(); // throws exception to end the loop
                person.showPeopleData();
            }
            
        } catch(EOFException ex){ // Exception when is the end of the file 
            return;
        } catch (FileNotFoundException ex) {
            System.err.println("An error has ocurred");
        } catch (IOException ex) {
            System.err.println("An error has ocurred");
        } catch (ClassNotFoundException ex) {
            System.err.println("An error has ocurred");
        }
    }
    
    public static void addTextBinary(){
        try {
            FileOutputStream file = new FileOutputStream("people.bin", true);
            AddContent writer = new AddContent(file);
            Person isabel = new Person("Isabel", 59);
            Person carolina = new Person("Carolina", 40);
            
            writer.writeObject(isabel);
            writer.writeObject(carolina);
            
            writer.close();
        } catch (FileNotFoundException ex) {
            System.err.println("An error has ocurred");
        } catch (IOException ex) {
            System.err.println("An error has ocurred");
        }
    }
}
