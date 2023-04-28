/*
Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con los atributos capacidadMáxima 
 (la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad actual de café que hay en la cafetera). 
 Agregar constructor vacío y con parámetros así como setters y getters. Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y simula la acción de servir la taza 
  con la capacidad indicada. Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El método le informará 
  al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
Método vaciarCafetera(): pone la cantidad de café actual en cero. 
Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade a la cafetera la cantidad de café indicada.

 */
package guia8ej2nespresso;

import Atributos.Cafetera;
import Servicios.CafeteraServicios;


public class Guia8Ej2NesPresso {

   
    public static void main(String[] args) {
        
        Cafetera c1 = new Cafetera();
       
        CafeteraServicios cs = new CafeteraServicios();
        
        cs.llenarCafetera(c1);
        
        cs.servirTaza(c1);
        
        cs.vaciarCafetera(c1);
        
        cs.agregarCafe(c1);
        
        cs.mostrarCafetera(c1);
    }
    
}
