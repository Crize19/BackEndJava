/*

 */
package Servicios;

import Atributos.Tiempo;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TiempoServicios {

    Scanner leer = new Scanner(System.in);

    public Tiempo crearTiempo() {

        Tiempo t1 = new Tiempo();

        System.out.println("Ingrese la hora");

        t1.setHora(leer.nextInt());

        while (t1.getHora() < 0 || t1.getHora() > 24) {

            System.out.println("Hora mal ingresada, vuelva a ingresarla");

            t1.setHora(leer.nextInt());
        }

        System.out.println("Ingrese los minutos");

        t1.setMinutos(leer.nextInt());

        while (t1.getMinutos() < 0 || t1.getMinutos() > 60) {

            System.out.println("Minutos mal ingresados, vuelva a ingresarlos");

            t1.setMinutos(leer.nextInt());
        }

        System.out.println("Ingrese los segundos");

        t1.setSegundos(leer.nextInt());

        while (t1.getSegundos() < 0 || t1.getSegundos() > 60) {

            System.out.println("Segundos mal ingresados, vuelva a ingresarlos");

            t1.setSegundos(leer.nextInt());
        }

        return t1;

    }

    public void imprimirTiempo(Tiempo t1) {

        String hector[] = new String[3];

        if (t1.getHora() < 10) {
            hector[0] = "0" + (String.valueOf(t1.getHora()));

        } else {
            hector[0] = String.valueOf(t1.getHora());
        }

        if (t1.getMinutos() < 10) {
            hector[1] = "0" + (String.valueOf(t1.getMinutos()));

        } else {
            hector[1] = String.valueOf(t1.getMinutos());
        }

        if (t1.getSegundos() < 10) {
            hector[2] = "0" + (String.valueOf(t1.getSegundos()));

        } else {
            hector[2] = String.valueOf(t1.getSegundos());
        }

        System.out.println(hector[0] + " : " + hector[1] + " : " + hector[2]);

    }

    public void avanzarTiempo(Tiempo t1) {
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(TiempoServicios.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (t1.getMinutos() == 59 && t1.getSegundos() == 59) {
            if (t1.getHora() < 23) {
                t1.setHora(t1.getHora() + 1);

            } else {
                t1.setHora(0);
            }
        }

        if (t1.getSegundos() == 59) {
            if (t1.getMinutos() < 59) {
                t1.setMinutos(t1.getMinutos() + 1);
            } else {
                t1.setMinutos(0);
            }
        }

        if (t1.getSegundos() < 59) {
            t1.setSegundos(t1.getSegundos() + 1);

        } else {
            t1.setSegundos(0);
       }
        
    }

    public void mostrarTiempo(Tiempo t1) {

        System.out.println(t1.toString());
    }
}
