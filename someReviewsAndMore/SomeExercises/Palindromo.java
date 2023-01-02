package SomeExercises;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Palindromo palindromoObject = new Palindromo();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, escribe la palabra u oración: ");
        String palindromo = sc.nextLine();
        
        boolean answer = palindromoObject.isPalindromo(palindromo);
        System.out.println("answer = " + answer);
    }
    
    public boolean isPalindromo(String palindromo){
        palindromo = palindromo.toLowerCase();
        palindromo = palindromo.replace(" ", "");
        
        for(int i = 0, j = (palindromo.length()-1); i <= j; i++, j--){
            if (palindromo.charAt(i) != palindromo.charAt(j)){
                return false;
            }
        }
        return true;
    }
    
    
}
