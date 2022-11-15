/*
Exercise: A company that is dedicated to the sale of disinfectants
needs a Delaware manage invoices. On each invoice appears: the
article code, the quantity sold in liters and the price per liter.
5 invoices sent are requested: Total billing, quantity in liters sold 
of the Article 1 and how many invoices were issued for more than S600.
 */
package com.douglas.projects;

import javax.swing.JOptionPane;

public class CompanyReceipt {
    public static void main(String[] args) {
       
        int articleCode, liters, article1 = 0, moreThan6 = 0;
        float priceForLiter,invoiceAmount = 1, totalPrice = 0;
        
        for(int i = 1; i <= 5; i++){
            
            articleCode = Integer.parseInt(JOptionPane.showInputDialog(
                    "Available Articles\n" + "Article #1: $0.6 per liter"
                    + "\nArticle #2: $3 per liter"
                    + "\nArticle #3: 1.25€ per liter"
                    + "\nEnter the Article Code:"));
            
            liters = Integer.parseInt(JOptionPane.showInputDialog(
                    "Article #" + articleCode + "\n" + "Enter the number of liters:"));
            
            if( articleCode == 1){
                priceForLiter = 0.6f;
                invoiceAmount = priceForLiter * liters;
                totalPrice += invoiceAmount;
                article1++;
            }
            else if(articleCode ==2){
                priceForLiter = 3;
                invoiceAmount = priceForLiter * liters;
                totalPrice += invoiceAmount;
            }
            
            else if(articleCode ==3){
                priceForLiter = 1.25f;
                invoiceAmount = priceForLiter * liters;
                totalPrice += invoiceAmount;
            }
            
            if(invoiceAmount > 600){
                moreThan6++;
            }
        }
        
        System.out.println("\n**************************************************");
        
        System.out.println("                   INVOICE                          ");
        System.out.println("\n Quantity of liters saled of article #1: " + article1);
        System.out.println("\n Quantity of invoices saled of more than $600: " + moreThan6);
        System.out.println("\n Total price: " + totalPrice);
        
        System.out.println("\n**************************************************");
    }
}
