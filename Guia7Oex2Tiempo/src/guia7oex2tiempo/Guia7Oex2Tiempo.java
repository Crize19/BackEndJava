/*
Definir la clase Tiempo, la cual tendrá la hora, minutos y segundos. Definir dos constructores: un
constructor vacío y otro con la hora, minutos y segundos ingresado por el usuario. Deberá definir
además, los métodos getters y setters correspondientes, y el método imprimirHoraCompleta().
Recordar crear una validación sobre las horas, minutos y segundos ingresados por el usuario. Te
animas a simular el paso del tiempo en consola??????
 */
package guia7oex2tiempo;

import Atributos.Tiempo;
import Servicios.TiempoServicios;


public class Guia7Oex2Tiempo {

    
    public static void main(String[] args) {
       
        TiempoServicios ts = new TiempoServicios();
        
        Tiempo t1 = ts.crearTiempo();
        
       
        
        for (int i = 0; i <10; i++) {
            ts.imprimirTiempo(t1);
            ts.avanzarTiempo(t1);
            
        }
        
        ts.mostrarTiempo(t1);
    }
    
}
