/*
 *  This software, gives you an average height and an average age.
    It also gives you the number of people over 18, and the number of
    people who are taller than 1.75m. Notice that you can just enter 5 students.
 */
package com.douglas.projects;

import javax.swing.JOptionPane;

public class AverageHeight {
    
    public static void main(String[] args) {
        
        int age, over18 = 0, overThan175 = 0, ageSum = 0, ageCount = 0, heightCount = 0;
        float height, averageH, averageA,heightSum= 0 ;
         
        for(int i = 1; i<=5; i++){
            
            age = Integer.parseInt(JOptionPane.showInputDialog("Student #" + i + "\nEnter his/her age: " ));
            height = Float.parseFloat(JOptionPane.showInputDialog("Student #" + i + "\nEnter his/her height #" + i + ": "));
            
            ageCount++;
            heightCount++;
            
            ageSum += age;
            heightSum += height;
            
            if( (age>18) ){
                over18++;
            }
            
            if( (height > 1.75) ){
                overThan175++;
            }
            
        }
        
        // Operations for calculate the averages
        averageA = (float) ageSum / ageCount;
        averageH = (float) heightSum / heightCount;
        
        JOptionPane.showMessageDialog(null, "The average of age is: " + averageA);
        JOptionPane.showMessageDialog(null, "The average of height is: " + averageH);
        
        // Condition for age
        if( over18 > 0){
            JOptionPane.showMessageDialog(null, over18 + " Are older than 18 years old");
        }
        else {
            JOptionPane.showMessageDialog(null, "No one is older than 18 years old");
        }
        
        // Condition for height.
        if( overThan175 > 0){
            JOptionPane.showMessageDialog(null, overThan175+ " People are taller than 1.75m");
        }
        else{
            JOptionPane.showMessageDialog(null, " No one is taller than 1.75m");
        }
                
    }
}
