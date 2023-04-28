/*
Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.
 */
package guia7oex1fraccion;

import Atributos.Fraccion;
import Servicios.FraccionServicios;






public class Guia7Oex1Fraccion {

   
    public static void main(String[] args) {
        
        FraccionServicios fs = new FraccionServicios();
        
        Fraccion f1 = fs.crarFraccion();
        
        fs.menuFraccion(f1);
        
        fs.mostrarFuncion(f1);
       
        
    }
    
}
