package BashCalculator;

import javax.swing.JOptionPane;

/**
 *
 * @author MrDoisaac
 */
public class Main {
    public static void main(String[] args) {
        Operation op = new Operation();
        
        double number1 = Double.parseDouble(JOptionPane.showInputDialog("Enter number #1"));
        double number2 = Double.parseDouble(JOptionPane.showInputDialog("Enter number #2"));
        
        double sum = op.sum(number1, number2);
        double rest = op.rest(number1, number2);
        double multiplication = op.multiplication(number1, number2);
        double division = op.division(number1, number2);
        
        //shows results
        op.showResults(sum, rest, multiplication, division);
    }
}
