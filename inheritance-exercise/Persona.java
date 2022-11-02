package udemy.com;

public class Persona {
    
    private String nombre;
    private char genero;
    private int edad;
    private String dirección;

    //constructor vacio
    public Persona(){
        
    }
    
    //construsctor con 1 argumento nombre
    public Persona(String nombre){
        this.nombre = nombre;
    }
    
    //constructor con argumentos
    public Persona(String nombre, char genero, int edad, String direccion){
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.dirección = direccion;
    }
    
    
    
    
    
    // getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }
    
    //toString

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + ", direcci\u00f3n=" + dirección + '}';
    }
    
    
}
