
package Ejercicios;

import Servicio.FechaService;
import java.util.Calendar;
import java.util.Date;

public class Ejercicio04 {

    public static void main(String[] args) {
        
        FechaService fecha = new FechaService();
        Date actual = fecha.fechaActual();
        Date nacimiento = fecha.fechaDeNacimiento();
        //Calendar actual = fecha.fechaActual();
        //Calendar nacimiento = fecha.fechaDeNacimiento(actual);
        
        System.out.println(actual);
        System.out.println(nacimiento);
        System.out.println(fecha.diferencia(actual, nacimiento));
    }

}
