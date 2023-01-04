package Pokemon;

public class Squirtle extends Pokemon implements IAgua{
    
    // método constructor
    public Squirtle() {
    }
    
    
    // métodos de clase abstracta pokemon
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Squirtle, y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Squirtle, y este es mi ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Squirtle, y este es mi ataque mordico");
    }
    
    // métodos abstractos de interfaz agua
    @Override
    public void atacarConHidrobomba() {
        System.out.println("Hola soy Squirtle, y este es mi ataque con hidrobomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Hola soy Squirtle, y este es mi ataque burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Hola soy Squirtle, y este es mi ataque pistola de agua");
    }
}
