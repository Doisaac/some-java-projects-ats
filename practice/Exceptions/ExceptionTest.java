
// Checked exceptions

package Exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class ExceptionTest {
    
    
    public static void main(String [] args){
        
        ExceptionTest et  = new ExceptionTest();
        
        et.readFile2();
        
    }
    
    
    public void readFile() throws FileNotFoundException, IOException{
        
        File file = new File("C:\\Users\\MrDoisaac\\Desktop\\readMePlease.txt");
        
        FileReader fr = new FileReader(file);
        
        BufferedReader bf = new BufferedReader(fr);
        
        String line;
        
        while ( (line = bf.readLine() ) != null) {
            System.out.println(line);
        }
        
    }
    
    public void readFile2() {
        
        try {
           readFile(); 
        } catch (FileNotFoundException ex1){
            JOptionPane.showMessageDialog(null, "Please verify the file path");
        } catch (IOException ex2){
            JOptionPane.showMessageDialog(null, "A not verify exception has ocurred");
        } finally {
            System.out.println("Program has completed successfully");
        }
      
        
    }
    
    
   
}
