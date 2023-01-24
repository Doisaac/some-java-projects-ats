package maven.nodosandgenerics;

import java.util.List;


public class NodosAndGenerics {

    public static void main(String[] args) {
        // creates 2 differents nodos
        Nodo nodo1 = new Nodo(new Person("Isaac"));
        Nodo<Integer> nodo2 = new Nodo<>(13);
        
        // links the nodos
        nodo1.setNextElement(nodo2);
        System.out.println(nodo1.getNextElement().getValue());
   }
}
