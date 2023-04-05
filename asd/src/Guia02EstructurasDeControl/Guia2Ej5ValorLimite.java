/*
Escriba un programa en el cual se ingrese un valor limite positivo, y a
continuacion solicite numeros al usuario hasta que la suma de los
numeros introducidos supere el limite inicial.
 */
package Guia02EstructurasDeControl;

import java.util.Scanner;


public class Guia2Ej5ValorLimite {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un valor limite para operar");
        int limit = leer.nextInt();
        
        int num;
        int suma = 0;
         
        while (suma<=limit){
        System.out.println("Ingrese un numero para sumar");
        num = leer.nextInt();
        suma = suma + num;
        }
                
     
       System.out.println("La suma de los numero supero el limite de " + limit);
        
        
    }
    
}
