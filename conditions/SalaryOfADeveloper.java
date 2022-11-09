/*
Exercise: A Developer needs to calculate his salary
weekly, which is obtained as follows:
If you work 40 hours or less you are paid $16 per hour.
If you work more than 40 hours, you are paid $16 for each
one of the first 40 hours and $20 for each hour
extra.

Ejercicio: Un desarrollador necesita calcular Su salario
semanal, el cual se obtiene de la siguiente manera
Si trabaja 40 horas o menos se le paga $16 por hora
Si trabaja mas de 40 horas se le paga $16 por cada
una de las primeras 40 horas y $20 por cada hora
extra.
*/
package com.douglas.projects;

import javax.swing.JOptionPane;
        
public class SalaryOfADeveloper {
    public static void main(String[] args) {
        
        int hoursWorked;
        float totalSalary;
        
        hoursWorked = Integer.parseInt(JOptionPane.showInputDialog("Type your hours worked: "));
        
        if(hoursWorked <= 40){
            totalSalary = hoursWorked * 16;
        }
        else {
            totalSalary = (40 * 16) + ((hoursWorked - 40) * 20);
        }
        
        JOptionPane.showMessageDialog(null, "Your final Salary is: " + totalSalary);
    }
}
