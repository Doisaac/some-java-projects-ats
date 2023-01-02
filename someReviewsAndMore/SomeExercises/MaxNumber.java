package SomeExercises;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author MrDoisaac
 */
public class MaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int max = 0;
        
        int num1, num2, num3, num4;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Insert number 1"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Insert number 2"));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Insert number 3"));
        num4 = Integer.parseInt(JOptionPane.showInputDialog("Insert number 4"));
        
        // Ternary operators
        max = (num1 > num2) ? num1 : num2;
        max = (max > num3) ? max : num3;
        max = (max > num4)? max : num4;
        
        JOptionPane.showMessageDialog(null, "The max number is " + '"' + max +'"');
    }
}
