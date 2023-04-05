/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus atributos serán, x1, y1, x2, y2,
siendo cada x e y un punto. Generar un objeto puntos usando un método crearPuntos() que le pide al usuario los dos números y
los ingresa en los atributos del objeto. Después, a través de otro método calcular y devolver la distancia que existe entre los dos puntos
que existen en la clase Puntos. Para conocer como calcular la distancia entre dos puntos consulte el siguiente link:
 

 */
package guia7ex2puntos;

import Entidades.Puntos;
import Servicios.PuntosServicios;


public class Guia7Ex2Puntos {

    
    public static void main(String[] args) {
        
        PuntosServicios ps = new PuntosServicios();
        
        Puntos p1 = ps.crearPuntos();
        
        ps.distanciaPuntos(p1);
        
        ps.mostrarPuntos(p1);
        
        System.out.println(p1.toString());
    }
    
}
