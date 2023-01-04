package ClasesAbstractasEjemplo;

public class Circulo implements Figura, Dibujable, Rotable {
    
    private double radio;
    
    public Circulo(){
        
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    
    @Override
    public double calcularArea() {
        return (Math.PI * this.radio * this.radio);
    }
    
    @Override
    public void dibujar() {
        System.out.println("Hola, estoy dibujando un circulo");
    }

    @Override
    public void rotar() {
        System.out.println("Hola, estoy rotanto un circulo");
    }
    
    
//    CODIGO DE CLASES ABSTRACTAS
//    public Circulo(double radio, double x, double y) {
//        super(x, y);
//        this.radio = radio;
//    }

    
}
