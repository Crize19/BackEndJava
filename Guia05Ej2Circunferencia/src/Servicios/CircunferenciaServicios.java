/*

 */
package Servicios;

import Entidades.Circunferencia;
import java.util.Scanner;


public class CircunferenciaServicios {
    
    
    public Circunferencia creacionCircunferencia(){
        
        Circunferencia c1 = new Circunferencia();
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el radio");
        c1.setRadio(leer.nextDouble());
        
        return c1;
    }
    
    
    public void areaCircunferencia (Circunferencia c1){
       double radio = c1.isRadio();
       double area = 3.1416*(radio*radio);
       
        System.out.println("El area de la circunferencia es: " + area );
    }
    
    
    public void perimetroCircunferencia(Circunferencia c1){
        double radio = c1.isRadio();
        double perimetro = 2 * 3.1416 * radio;
        
        System.out.println("El perimetros de la circunferencia es: " + perimetro );
    }
    
    public void mostrarCircunferencia( Circunferencia c1){
    System.out.println("El radio de la circinferencia ingresado es de :" + c1.toString());
       
    }
}
