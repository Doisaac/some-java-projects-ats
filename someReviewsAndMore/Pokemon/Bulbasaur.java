package Pokemon;

public class Bulbasaur extends Pokemon implements IPlanta {
    
    //atributos
    
    
    
    public Bulbasaur() {
    }

    
    
    // métodos de clase abstracta pokemon
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Bulbasour, y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Bulbasour, y este es mi ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Bulbasour, y este es mi ataque mordico");
    }
    
    // métodos abstractos de interfaz planta
    @Override
    public void atacarDrenaje() {
        System.out.println("Hola soy Bulbasour, y este es mi ataque Drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Hola soy Bulbasour, y este es mi ataque Paralizar");
    }
    
}
