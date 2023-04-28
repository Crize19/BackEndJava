
package Ejercicios;

import Entidad.Persona;
import Servicio.PersonaService;
import java.util.Date;


public class Ejercicio05 {

    public static void main(String[] args) {
        PersonaService p1 = new PersonaService();
        Persona a = p1.crearPersona();
        Date fecha = new Date();
        
        System.out.println(p1.calcularEdad(a, fecha));
        System.out.println(p1.menorQue(a, fecha));
        p1.mostrarPersona(a);
    }

}
