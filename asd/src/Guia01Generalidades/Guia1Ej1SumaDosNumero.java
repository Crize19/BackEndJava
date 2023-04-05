/*
 Escribir un programa que pida dos números enteros por teclado y calcule
la suma de los dos. El programa deberá después mostrar el resultado de
la suma
 */
package Guia01Generalidades;

import java.util.Scanner;


public class Guia1Ej1SumaDosNumero {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero a sumar");
        int num1 = leer.nextInt();
        
        System.out.println("Ingrese el segundo numero a sumar");
        
        int num2 = leer.nextInt();
        
        System.out.println("La suma de " + num1 + " + " + num2 + " es igual a " +  (num1 + num2));
         
    }
    
}
