
package servicios;

import atributos.Estudiantes;
import java.util.Scanner;


public class EstudiantesServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Estudiantes crearEstudiante(){
    
        
        String nombre = leer.next();
        System.out.println("ingrese la nota final del alumno");
        double nota = leer.nextDouble();
        while (nota>10|| nota<1) {
            System.out.println("Nota fuera de rango, reingrese");
            nota=leer.nextDouble();
        }
        
        return new Estudiantes(nombre, nota);
    }
    
    public double mostrarNotas(Estudiantes [] est){
        double prom = 0;
        
        for (int i = 0; i < est.length; i++) {
            prom += est[i].getNota();
        }
        double promt= prom/est.length;
         System.out.println("El promedio del curso es de :" + promt);
    return promt;
    }
    
    public void mostrarCerebritos(Estudiantes [] est, double promt){
    
        for (int i = 0; i < est.length; i++) {
            if (est[i].getNota()>promt) {
                System.out.println(est[i].getNombre()+" tiene un promedio superior al resto");
            }
        }
    
    }
    
     public void mostrarVagitos(Estudiantes [] est, double promt){
    
        for (int i = 0; i < est.length; i++) {
            if (est[i].getNota()<promt) {
                System.out.println(est[i].getNombre()+" tiene un promedio inferior al resto(" + est[i].getNota()+")" );
            }
        }
    
    }
    
}
