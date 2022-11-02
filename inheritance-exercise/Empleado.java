package udemy.com;

public class Empleado extends Persona{
 
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;
    
    //Constructor
    public Empleado(String nombre, double sueldo){
        super(nombre);
        this.idEmpleado = ++contadorEmpleado;
        this.sueldo = sueldo;
    }
    
    //metodos getter and setters
    public int getIdEmpleado(){
        return idEmpleado;
    }
    
    public double getSueldo(){
        return sueldo;
    }
    
    public static int getContadorEmpleado(){
        return contadorEmpleado;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + "Empleado{" + "idEmpleado=" + idEmpleado + ", sueldo=" + sueldo + '}';
    }

    
}
