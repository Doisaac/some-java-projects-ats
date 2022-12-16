// try catch with uncheckedException

package Exceptions;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author MrDoisaac
 */
public class UncheckedException {
    
    public static void main(String[] args) {
        UncheckedException test = new UncheckedException();
        test.operation2();
    }
    
    
    public void operation (){
        int num1 =  5, num2 = 0;
        int resultado = num1/num2;
        System.out.println("resultado = " + resultado);
    }
    
    public void operation2 (){
        try{
         operation();   
        } catch (ArithmeticException ae){
            JOptionPane.showMessageDialog(null, "Sorry you can't divide a number by 0");
        } finally {
            System.out.println("COMPLETED");
        }
        
       
    }
    
    
}
