/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SomeExercises;

/**
 *
 * @author MrDoisaac
 */
public class SomeStringMethods {
    public static void main(String[] args) {
        
        String name = "Douglas";
        System.out.println("name = " + name.length());
        System.out.println("name.toUpperCase = " + name.toUpperCase());
        System.out.println("name.toLowerCase = " + name.toLowerCase());
        System.out.println("name.equals = " + name.equals("Douglas"));
        System.out.println("name.equals = " + name.equals("douglas"));
        // doesn't matter about upper and lower cases
        System.out.println("name.ignoreCase = " + name.equalsIgnoreCase("douglas"));
        //returns 0 if they are the same, it works as the equals method
        System.out.println("name.compareTo = " + name.compareTo("Douglas"));
        System.out.println("name.charAt = " + name.charAt(0));
        //prints the string after that position
        System.out.println("name.subString = " + name.substring(0, 3));
        System.out.println("name = " + name);
        
        
        System.out.println("");
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace = " + trabalenguas.replace('a','.'));
        // return the position of the character
        System.out.println("trabalenguas.indexOf = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.lastIndexOf = " + trabalenguas.lastIndexOf('a'));
        System.out.println("trabalenguas.indexOf = " + trabalenguas.indexOf("lenguas"));
        System.out.println("trabalenguas.contains = " + trabalenguas.contains("lenguas"));
        System.out.println("trabalenguas.startsWith = " + trabalenguas.startsWith("tr"));
        System.out.println("trabalenguas.endsWith = " + trabalenguas.endsWith("s"));
        
        
    }
}
