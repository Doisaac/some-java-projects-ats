package udemy.com;

import java.util.Date;

public class UdemyCourse {

    public static void main(String[] args) {
       Empleado empleado1 = new Empleado("Juan", 5000);
       empleado1.setEdad(18);
       empleado1.setGenero('M');
       empleado1.setDirección("santa ana");
       System.out.println(empleado1);
       
       //objeto tipo cliente
        System.out.println("**************************************************************");
       Cliente cliente1 = new Cliente(new Date(), true);
       cliente1.setNombre("Carolina");
       System.out.println(cliente1);
       
    }
}
