package Pokemon;

public class Charmander extends Pokemon implements IFuego{
    
    // método constructor
    public Charmander(){
        
    }
    
    
    
    // métodos de clase abstracta pokemon
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Charmander, y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Charmander, y este es mi ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Charmander, y este es mi ataque mordico");
    }
    
    // métodos abstractos de interfaz fuego
    @Override
    public void atacarConPunioFuego() {
         System.out.println("Hola soy Charmander, y este es mi ataque con puño fuego");
    }

    @Override
    public void atacarLanzallamas() {
         System.out.println("Hola soy Charmander, y este es mi ataque lanza llamas");
    }

    @Override
    public void atacarAscuas() {
         System.out.println("Hola soy Charmander, y este es mi ataque ascuas");
    }
    
}
