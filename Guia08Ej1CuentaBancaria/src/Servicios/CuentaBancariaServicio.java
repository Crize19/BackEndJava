/*
 
 */
package Servicios;

import Atributos.CuentaBancaria;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CuentaBancariaServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public CuentaBancaria crear(){
        
        CuentaBancaria c1 = new CuentaBancaria();
        
        System.out.println("Ingrese el numero del cuenta");
        
        c1.setNumeroCuenta(leer.nextInt());
        
        System.out.println("Ingrese el dni del cliente");
        
        c1.setDniCliente(leer.nextInt());
        
        System.out.println("Ingrese el saldo actual de la cuenta");
        
        c1.setSaldoActual(leer.nextDouble());
        
       return c1; 
    }
    
    
    public void ingresar(CuentaBancaria c1){
        System.out.println("Ingrese el monto a sumar al saldo");
        double ingreso=(leer.nextDouble());
        while (ingreso<0) {
            System.out.println("Ingrese un valor positivo");
            ingreso=leer.nextDouble();  
        }
        c1.setSaldoActual(c1.getSaldoActual()+ingreso);
        System.out.println("Su saldo actualizado es de: " + c1.getSaldoActual());
    
    }
    
    public void retirar(CuentaBancaria c1){
        System.out.println("Ingrese el monto a retirar");
        double retiro=leer.nextDouble();
        if (retiro<c1.getSaldoActual()) {
            
            c1.setSaldoActual(c1.getSaldoActual()-retiro);
            
        }else{
            System.out.println("Su saldo actual no es suficiente para el retiro");
            System.out.println("Se le entregaran su saldo actual de:" + c1.getSaldoActual());
            c1.setSaldoActual(0);
        }
        
        System.out.println("Su saldo actualizado luego del retiro es de: " + c1.getSaldoActual());
    }
    
    public void extraccionRapida(CuentaBancaria c1){
        
        System.out.println("Solo tiene disponible para retirar el 20% que es: " + (c1.getSaldoActual()*0.2) );
       c1.setSaldoActual(c1.getSaldoActual()*0.8);
        System.out.println("Su saldo actualizado luego de la extraccion rapida es de: " + c1.getSaldoActual());
    }
    
    public void consultarSaldo(CuentaBancaria c1){
        System.out.println("Su salo actual es de: " + c1.getSaldoActual());
        
    }
    
    public void consultarDatos(CuentaBancaria c1){
        System.out.println("los datos de la cuenta son:");
        System.out.println(c1.toString());
      
    }
    
    public void menuCuenta(CuentaBancaria c1){
        
        int var;
        do {
            try {
                Thread.sleep(1500);
            } catch (InterruptedException ex) {
                Logger.getLogger(CuentaBancariaServicio.class.getName()).log(Level.SEVERE, null, ex);
            }

        System.out.println("MENU");
        System.out.println("=====================");
        System.out.println("1. Ingresar saldo");
        System.out.println("2. Retirar");
        System.out.println("3. Extraccion Rapida");
        System.out.println("4. Consultar Saldo");
        System.out.println("5. Consultar Datos");
        System.out.println("=====================");
        System.out.println("Ingrese un numero para empezar a operar o 0 para salir");
        var = leer.nextInt();
                switch (var) {
                case 1:
                    ingresar(c1);
                    break;
                case 2:
                    retirar(c1);
                    break;
                case 3:
                    extraccionRapida(c1);
                    break;
                case 4:
                   consultarSaldo(c1);
                    break;
                case 5:
                    consultarDatos(c1);
                    break;
                
                default:
                    if (var!=0) {
                        System.out.println("Numero mal ingresado");
                    }
                   
            }
        } while (var!=0);
    }

}