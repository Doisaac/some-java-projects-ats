package Pokemon;

public class Pikachu extends Pokemon implements IElectrico{
    // método constructor
    public Pikachu() {
    }
    
    
    // métodos de clase abstracta pokemon
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Pikachu, y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Pikachu, y este es mi ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Pikachu, y este es mi ataque mordico");
    }
    
    // métodos abstractos de interfaz electrico
    @Override
    public void atacarImpactrueno() {
        System.out.println("Hola soy Pikachu, y este es mi ataque impact trueno");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Hola soy Pikachu, y este es mi ataque puño fuego");
    }
    
}
