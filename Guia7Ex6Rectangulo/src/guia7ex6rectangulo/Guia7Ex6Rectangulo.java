/*
Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un método "calcular_area" que calcule y devuelva el área del rectángulo. 
Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados de 4 y 6 y imprime el área del rectángulo.
 */
package guia7ex6rectangulo;

import Entidades.Rectangulo;
import Servicios.RectanguloServicios;


public class Guia7Ex6Rectangulo {

   
    public static void main(String[] args) {
        
        RectanguloServicios rs = new RectanguloServicios();
        
        Rectangulo rectangulo1 = rs.crearRectangulo();
        
        rs.areaRectagulo(rectangulo1);
        
        rs.mostrarRectangulo(rectangulo1);
       
    }
    
}
