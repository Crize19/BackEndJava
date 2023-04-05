/*
Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.
Nota: investigar la función Math.sqrt().
 */
package Guia01Generalidades;

import java.util.Scanner;


public class Guia1Ej5DobleTipleRaiz {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero entero para buscar su doble, triple y raiz cuadrada");
        
        int num = leer.nextInt();
        double raiz =  Math.sqrt(num);
        System.out.println("El doble de " + num + " es: " + (num * 2));
        System.out.println("El triple de " + num + " es: " + (num * 3));
        System.out.println("La raiz cuadrada de " + num + " es: " + raiz );
        
        
       
        }
    }
    

