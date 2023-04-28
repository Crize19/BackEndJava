

package integrador;

import atributos.Estudiantes;
import servicios.EstudiantesServicios;


public class Integrador {

    
    public static void main(String[] args) {
        
        EstudiantesServicios es = new EstudiantesServicios();
        
        Estudiantes[] est = new Estudiantes[8];
        
        for (int i = 0; i < est.length; i++) {
            System.out.println("Ingrese el nombre del estudiante n° " + (i+1));
            est[i]=es.crearEstudiante();
            
        }
        
       double promt = es.mostrarNotas(est);
       
       es.mostrarCerebritos(est, promt);
       
        System.out.println("================================");
       
       es.mostrarVagitos(est, promt);
    }

}
