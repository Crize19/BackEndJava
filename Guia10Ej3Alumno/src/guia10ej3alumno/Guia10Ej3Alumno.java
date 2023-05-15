

package guia10ej3alumno;

import atributos.Alumno;
import java.util.ArrayList;
import servicios.AlumnoServicios;


public class Guia10Ej3Alumno {

    
    public static void main(String[] args) {
       AlumnoServicios as = new AlumnoServicios();
       ArrayList<Alumno> alum = as.crearListaAlumno();
       
       System.out.println("El promedio del alumno es " + as.notaFinal(alum));
    }

}
