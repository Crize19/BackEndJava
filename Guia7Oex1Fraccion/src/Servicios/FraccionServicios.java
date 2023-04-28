/*

 */
package Servicios;

import Atributos.Fraccion;
import java.util.Scanner;


public class FraccionServicios {
    
    Scanner leer = new Scanner (System.in);
    
    
    
    public Fraccion crarFraccion(){
    
    Fraccion f1 = new Fraccion();

        
        System.out.println("Ingrese Primer numerador");
        
        
        f1.setNumerador1(leer.nextInt());
        
        System.out.println("Ingrese primer denominador");
        
        f1.setDenominador1(leer.nextInt());
        
        
        System.out.println("Ingrese segundo numerador");
        
        f1.setNumerador2(leer.nextInt());
        
        System.out.println("Ingrese Segundo denominador");
        
        f1.setDenominador2(leer.nextInt());
     
 
    return f1;
    }
    
    
    public void sumaFraccion(Fraccion f1){
    
    float suma;
    
        if (f1.getDenominador1() == f1.getDenominador2()) {
            
            suma = (f1.getNumerador1() + f1.getNumerador2()) / f1.getDenominador1();
            
        }else {
        float comM = f1.getDenominador1()*f1.getDenominador2();
        
        suma= ((f1.getNumerador1()*f1.getDenominador2())+(f1.getNumerador2()*f1.getDenominador1()))/comM ;
        
        }
        
        System.out.println("La suama de la fraccion es : " + suma);
        
    }
    
    public void restaFraccion (Fraccion f1){
        
        float resta;
        if (f1.getDenominador1() == f1.getDenominador2()) {
            
            resta = (f1.getNumerador1() - f1.getNumerador2()) / f1.getDenominador1();
            
        }else {
        float comM = f1.getDenominador1()*f1.getDenominador2();
        
        resta= ((f1.getNumerador1()*f1.getDenominador2())-(f1.getNumerador2()*f1.getDenominador1()))/comM ;
        
        }
        
        System.out.println("La suama de la fraccion es : " + resta);
        
    }
    
    public void multiFraccion(Fraccion f1){
    double multiplicacion = ((double)f1.getNumerador1()*f1.getNumerador2() ) / ((double)f1.getDenominador1()*f1.getDenominador2());
    
        System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
    }
   
    
    public void diviFraccion(Fraccion f1){
    
    double divi = ((double)f1.getNumerador1()*f1.getDenominador2() ) / ((double)f1.getDenominador1()*f1.getNumerador2());
    
        System.out.println("La division de la fraccion es: " + divi );
    }
    
    public void menuFraccion (Fraccion f1){
        
        System.out.println("Ingrese una opcion para operar");
        System.out.println("Menu:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        int opc = leer.nextInt();
        
        switch (opc) {
           
                case 1:
                   sumaFraccion(f1);
                break;
                case 2:
                   restaFraccion (f1);
                break;
                case 3:
                   multiFraccion(f1);
                break;
                case 4:
                diviFraccion (f1);
                break;
                
            default:
                System.out.println("Opcion mal ingresada");
        }
    
    
    }
    
    public void mostrarFuncion(Fraccion f1){
    
        System.out.println(f1);
    }
    
    
}
