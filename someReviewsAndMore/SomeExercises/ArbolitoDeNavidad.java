// Christmas Tree, Happy new year 2023
/*
           *
          ***
         *****
        *******
          |||  
 */
package SomeExercises;

import java.util.Scanner;

public class ArbolitoDeNavidad {

    public static void main(String[] args) {

        menu();

    }

    public static void crearArbolito(int altura) {

        // Dibuja el arbol, recorre todas las filas del arbol
        for (int fila = 0; fila < altura; fila++) {

            // espacios blancos
            for (int espacio = 0; espacio < (altura - fila - 1); espacio++) {
                System.out.print(" ");
            }
            //asteriscos
            for (int asterisco = 0; asterisco < (fila * 2 + 1); asterisco++) {
                System.out.print("*");
            }

            // salto de linea
            System.out.println("");
        }

        //Dibuja el tronco
        for (int base = 0; base < (3); base++) {

            //Espacios en blanco
            for (int espacio = 0; espacio < altura - 2; espacio++) {
                System.out.print(" ");

            }

            // tronco
            for (int tronco = 0; tronco < 3; tronco++) {
                System.out.print("|");
            }

            // salto de linea
            System.out.println("");
        }
    }

    public static void menu() {
        int opcionDeMenu;
        char seguirComprando;
        Scanner sc = new Scanner(System.in);
        
        do {
            do{
                System.out.println("\n++--++--++--++--++--++--++--++--++--+--++-++--++--++");
                System.out.println("Bienvenido a la tienda de arbolitos navideños");
                System.out.println("1. Comprar arbol de $5 dolares");
                System.out.println("2. Comprar arbol de $10 dolares");
                System.out.println("3. Comprar arbol de $20 dolares");
                System.out.println("0. Salir");
                System.out.println("++--++--++--++--++--++--++--++--++--+--++-++--++--++");
                System.out.print("\nPor favor, digite el numero de la opción que desea: ");
                opcionDeMenu = sc.nextInt();
                
                if (opcionDeMenu < 0 || opcionDeMenu > 3){
                    System.out.println("\nPOR FAVOR, ELEGÍ UNA OPCIÓN CORRECTA");
                }
            } while(opcionDeMenu < 0 || opcionDeMenu > 3);

            switch (opcionDeMenu) {
                case 0:
                    break;
                case 1:
                    System.out.println("");
                    crearArbolito(5);
                    break;
                case 2:
                    System.out.println("");
                    crearArbolito(10);
                    break;
                case 3:
                    System.out.println("");
                    crearArbolito(20);
                    break;
            }
            
            if(opcionDeMenu == 0){
                break;
            } else {
                System.out.print("\n¿Desea comprar otro arbolito? (S/N): ");
                seguirComprando = sc.next().charAt(0);
            }
        } while (seguirComprando == 's' || seguirComprando == 'S');
    }
}
