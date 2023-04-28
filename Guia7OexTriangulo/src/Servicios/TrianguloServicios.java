/*
 
 */
package Servicios;

import Atributos.Triangulo;
import java.util.Scanner;


public class TrianguloServicios {
    
    
    Scanner leer = new Scanner(System.in);
    
    
    public Triangulo crearTriangulo(){
        
        Triangulo t1 = new Triangulo();
        
        System.out.println("Ingrese el lado del triangulo que son iguales");
        
        t1.setAltura(leer.nextInt());
        
        System.out.println("Ingrese el lado distinto del triangulo");
        
        t1.setBase(leer.nextInt());
    
    return t1;
    }
    
    public double areaTriangulo(Triangulo t1){
    
        double area = (t1.getBase()*t1.getAltura())/2;
    
        return area;
    }
    
    public int perimetroTriangulo(Triangulo t1){
    
    int perimetro = t1.getBase()+(t1.getAltura()*2);
       
      return perimetro;  
    }
}
