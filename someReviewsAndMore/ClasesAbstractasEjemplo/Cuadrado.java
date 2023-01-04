package ClasesAbstractasEjemplo;

public class Cuadrado implements Figura, Dibujable{
    
    private int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }
    
    
    @Override
    public double calcularArea() {
        return (lado*lado);
    }
    
    @Override
    public void dibujar() {
        System.out.println("Hola, estoy dibujando un cuadraro");
    }
    
    
    // CODIGO DE CLASES ABSTRACTA
    /*
    public Cuadrado(int lado, double x, double y) {
        super(x, y);
        this.lado = lado;
    }
    */

    
}
