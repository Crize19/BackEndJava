/*
 Escribir un programa que pida tu nombre, lo guarde en una variable y lo
muestre por pantalla.
 */
package Guia01Generalidades;

import java.util.Scanner;


public class Guia1Ej2MostrarNombre {
    public static void main(String[] args) {
        
        Scanner leer =  new Scanner(System.in);
        
        System.out.println("Escribe tu nombre");
        
        String nombre = leer.next();
        
        System.out.println("Tu nombre es " + nombre);
        
    }
    
}
