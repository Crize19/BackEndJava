/*
Crear un programa que dado un número determine si es par o impar.
 */
package Guia02EstructurasDeControl;

import java.util.Scanner;


public class Guia2Ej1NumeroParEimpar {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("El numero ingresado es par");
        } 
        else {
            System.out.println("El numero ingresado es impar");
        }
    }
    
}
