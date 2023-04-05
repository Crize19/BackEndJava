package Guia03SubProgramas;

/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. 
La función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será una cadena,
este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 */


import java.util.Scanner;


public class Guia3Ej3ConversorMonedas {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        double euros;
        String moneda;
        
        System.out.println("Introduzca la cantidad de euros a convertir");
        euros = leer.nextInt();
        
        System.out.println("Escriba a que moneda desea hacer la conversion(dolares, yenes, libras)");
        moneda = leer.next();
        
        convertidor (euros,moneda);
        
        
    }
    
    
    public static void convertidor (double euros, String moneda){
    
        double aux;
    switch (moneda.toLowerCase()){
        
        case "dolares" :
            
            aux = euros * 0.86 ;
            System.out.println(euros + "euros son " + aux + " dolares");
            break;
            
        case "yenes":
            aux = euros * 1.28611;
            System.out.println(euros + "euros son " + aux + " yenes");
            break;
            
        case "libras" :
            aux = euros * 129.852;
            System.out.println(euros + "euros son " + aux + " libras");
            break;  
        
        default:
            System.out.println("Moneda no Valida");
            
            
    }
    
  
    
    
    }
  }
