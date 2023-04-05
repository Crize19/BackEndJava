/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas
y después toda en minúsculas.
 */
package Guia01Generalidades;

import java.util.Scanner;


public class Guia1Ej3MayusculasYMinisculas {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Escribe una frase");
        
        String frase = leer.nextLine();
        
        System.out.println("Frase en mayusculas: " + frase.toUpperCase());
        
        System.out.println("Frase en minusculas: " + frase.toLowerCase());
             
        
    }
    
}
