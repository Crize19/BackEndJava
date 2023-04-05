/*
 Implementar un programa que le pida dos números enteros al usuario y
determine si ambos o alguno de ellos es mayor a 25.
 */
package Guia00Teorica;

import java.util.Scanner;


public class Guia2Ej6 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese dos numero enteros");
        
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        if (num1 > 25 && num2 >25 ){
            System.out.println("Ambos numeros son mayores a 25");
        }
        else{
            if (num1 > 25){
            System.out.println( num1 + " es mayor a 25");
            }
            else{    
                  if (num2 > 25 ){
                  System.out.println( num2 + " es mayor a 25");
                  }
                  else{
                      System.out.println("Ninguno de los dos numeros es mayor a 25");
                  }
           }
        }
    }
    
}
