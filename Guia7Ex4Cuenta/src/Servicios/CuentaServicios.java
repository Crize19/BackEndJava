/*

 */
package Servicios;

import Entidad.Cuenta;
import java.util.Scanner;


public class CuentaServicios {
    
    Scanner leer = new Scanner(System.in);
    
    public Cuenta crearCuenta(){
        
        Cuenta c1 = new Cuenta();
        
        System.out.println("Ingrese el nombre del titular de la cuenta:");
        c1.setTitular(leer.next());
        System.out.println("Ingrese el saldo de la cuenta:");
        c1.setSaldo(leer.nextDouble());
        
    
    return c1;
    }
    
    
    public void retirarCuenta(Cuenta c1){
        
        double retirar;
        String respuesta;
        do{
        System.out.println("Ingrese el monto a reirar:");
        retirar = leer.nextDouble();
        if (retirar>c1.getSaldo()){
            System.out.println("Error, quiere retirar mas dinero del que tiene");
            System.out.println("Ingrese el monto a reirar:");
          retirar = leer.nextDouble();
        }
        
        c1.setSaldo(c1.getSaldo()-retirar);
        
        System.out.println("Su saldo actual es de: " + c1.getSaldo());
        
            System.out.println("Desea realizar otra extraccion? y/n");
            respuesta = leer.next();
        }while (respuesta.equalsIgnoreCase("y")); 
            
        
    }
    
    public void mostrarCuenta (Cuenta c1){
    
        System.out.println(c1.toString());
    }
    
}
