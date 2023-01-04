package Pokemon;

public abstract class Pokemon {
    
    // atributos de los pokemons
    protected int numPokedex;
    protected String nombre;
    protected double peso;
    protected String sexo;
    protected int temporada;
    
    // ataques básicos que los pokemon pueden realizar
    protected abstract void atacarPlacaje();
    protected abstract void atacarAraniazo();
    protected abstract void atacarMordisco();
}
