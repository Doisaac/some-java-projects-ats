/*
 *This program asks for 10 numbers, and shows:
 1- The positive numbers' mean 
 2- The negative numbers' maan
 4- The numbers of zeros.
 */
package com.douglas.projects;

import javax.swing.JOptionPane;

public class MeanOf10N {
    public static void main(String[] args) {
        
        int number, positiveSum = 0, positiveCount = 0,  negativeSum = 0, negativeCount = 0, zeros = 0;
        
        float positiveMean, negativeMean;
        
        for(int i = 1; i <= 10; i++){
            number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
            
            if(number == 0){
                zeros +=1;
            }
            else if( number > 0){
                positiveCount += 1;
                positiveSum +=number;
            }
            else{
                negativeCount+=1;
                negativeSum += number;
            }
        }
        
        //condition for allow a positive mean
        if( (positiveCount == 0) ){
            JOptionPane.showMessageDialog(null, "You can't have a positive numbers mean");
        }
        else{
            positiveMean = (float) positiveSum / positiveCount;
            JOptionPane.showMessageDialog(null, "The Positive mean is: " + positiveMean);
        }
        
        //condition for allow a negative mean
        if( (negativeCount == 0) ){
            JOptionPane.showMessageDialog(null, "You can't have a negative numbers mean");
        }
        else{
            negativeMean = (float) negativeSum / negativeCount;
            JOptionPane.showMessageDialog(null, "The Negative mean is: " + negativeMean);
        }
        
        JOptionPane.showMessageDialog(null, "The number of zeros is: " + zeros);
        
        
    }
}
