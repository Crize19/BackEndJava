/*
 Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0
y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
package Guia00Teorica;

import java.util.Scanner;


public class Guia2Ej8 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una nota (Entre 1 y 10)");
        int nota = leer.nextInt();
        while (nota < 0 || nota > 10){
            System.out.println("Ingrese un valor correcto");
            nota = leer.nextInt();
        }
        
        System.out.println("La nota ingresada es: " + nota);
    }
    
}
