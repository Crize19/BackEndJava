/*

 */
package Servicios;

import Entidades.Puntos;
import java.util.Scanner;

public class PuntosServicios {

    public Puntos crearPuntos() {

        Scanner leer = new Scanner(System.in);

        Puntos p1 = new Puntos();

        System.out.println("Ingrese el valor x1 del punto");
        p1.setX1(leer.nextInt());
        
        System.out.println("Ingrese el valor y1 del punto");
        p1.setY1(leer.nextInt());
        
        System.out.println("Ingrese el valor x2 del punto");
        p1.setX2(leer.nextInt());
        
        System.out.println("Ingrese el valor y2 del punto");
        p1.setY2(leer.nextInt());
        
        return p1;

    }

    
    public void  distanciaPuntos(Puntos p1){
    
        int cat1 = (int)Math.pow(p1.getX2()- p1.getX1(),2);
        
        int cat2 = (int)Math.pow(p1.getY2()- p1.getY1(),2);
        
        double distancia = Math.sqrt( cat1 + cat2);
        
        System.out.println("La distancia entre los puntos es: "+ distancia);
    }
    
    
    public void mostrarPuntos(Puntos p1) {
    
        System.out.println(p1.toString());
    }
}
