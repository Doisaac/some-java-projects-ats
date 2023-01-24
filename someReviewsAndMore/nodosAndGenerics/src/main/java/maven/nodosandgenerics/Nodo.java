package maven.nodosandgenerics;

public class Nodo<E> {
    
    E value;
    Nodo nextElement;

    public Nodo(E element) {
        this.value = element;
    }

    public E getValue() {
        return value;
    }

    public void setNextElement(Nodo nodo){
        this.nextElement = nodo;
    }

    public Nodo getNextElement(){
        return nextElement;
    }
    
    
    
    
}
