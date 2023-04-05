/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales
(la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).
 */
package Guia04ArreglosVectores;

import java.util.Scanner;

public class Guia4Ex2ComparacionVectores {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el tamño de los vectores");
        int N = leer.nextInt();

        int vector1[] = new int[N];
        int vector2[] = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese un numero para el primer vector, en la posicion: " + i);
            vector1[i] = leer.nextInt();
            System.out.println("Ingrese un numero para el segundo vector, en la posicion: " + i);
            vector2[i] = leer.nextInt();
        }

        
        for (int i = 0; i < N; i++) {
            System.out.print(" " + vector1[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < N; i++) {
            System.out.print(" " + vector2[i] + " ");
        }
        System.out.println(" ");
        
        
        boolean igualdad = true;
        for (int i = 0; i < N; i++) {
            if (vector1[i] != vector2[i]) {
                igualdad  = false;
             break;
            }
        }
        
        if (igualdad == false) {
            System.out.println("Los vectores no son iguales");
            
        }
        else    {
            System.out.println("Los vectores son iguales");   
        }
        
    }

}
