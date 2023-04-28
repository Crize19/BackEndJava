/*
 
 */
package Servicios;

import Atributos.Raices;

public class RaicesServicios {
    
     Raices r1 = new Raices( 1,4,-5);
    
  
    double resul = discriminante (r1);

    public double discriminante(Raices r1) {

        double resultado = (r1.getB() * r1.getB()) - 4 * (r1.getA()) * (r1.getC());

        return resultado;
    }

    public boolean tieneRaices() {
 
            return resul > 0;     
        
    }
    
    public boolean tieneRaiz(){
    
            
     return resul == 0;
   
        
    }
    
    public void obtenerRaices(){
        
        
        double x1=(-r1.getB()+Math.sqrt(resul))/(2*r1.getA());
        double x2=(-r1.getB()-Math.sqrt(resul))/(2*r1.getA());
         
        System.out.println("Tiene dos soluciones:");
        System.out.println("Solucion X1");
        System.out.println(x1);
        System.out.println("Solucion X2");
        System.out.println(x2);
            
        
    
    }
    
    private void obtenerRaiz(){
         
        double x=(-r1.getB()+Math.sqrt(resul))/(2*r1.getA());
         
        System.out.println("Unica solucion");
        System.out.println(x);
         
    }
    
    public void calcular(){
         
        if(tieneRaices()){
            obtenerRaices();
        }
        else if( tieneRaiz()){
            obtenerRaiz();
        }else{
            System.out.println("No tiene soluciones");
        }
         
    }
}

