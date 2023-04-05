/*

 */
package Servicios;

import Entidades.Rectangulo;
import java.util.Scanner;


public class RectanguloServicios {
    
    Scanner leer = new Scanner(System.in);
    
    public Rectangulo crearRectangulo(){
        
        Rectangulo rectangulo1 = new Rectangulo();
        
        System.out.println("Ingrese el lado 1 de rectangulo");
        rectangulo1.setLado1(leer.nextInt());
        System.out.println("Ingrese el lado 2 del rectangulo ");
        rectangulo1.setLado2(leer.nextInt());
    
       return rectangulo1; 
    }
    
    public void areaRectagulo(Rectangulo rectangulo1){
        
    int area = rectangulo1.getLado1() * rectangulo1.getLado2();
    
        System.out.println("El area del rectangulo es de: " + area  );
    
    }
    
    public void mostrarRectangulo (Rectangulo rectangulo1){
        System.out.println(rectangulo1.toString());
    
    }
}
