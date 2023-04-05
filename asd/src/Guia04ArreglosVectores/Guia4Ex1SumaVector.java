/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N,
con los valores ingresados por el usuario.
 */
package Guia04ArreglosVectores;

import java.util.Scanner;


public class Guia4Ex1SumaVector {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del vector");
        int N = leer.nextInt();
        
        int vector[] = new int [N];
        
        int suma = 0;
        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese un numero pasa sumar, en la posicion: " + i);
            vector [i] = leer.nextInt();
            suma += vector[i];
        }
        
        System.out.println("La suma de todos los valores es: " + suma );
    }
    
}
