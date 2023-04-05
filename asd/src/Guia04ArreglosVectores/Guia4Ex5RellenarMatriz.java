/*
 Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios y muestre la suma de sus elementos.
 */
package Guia04ArreglosVectores;

import java.util.Scanner;

public class Guia4Ex5RellenarMatriz {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de filas para la matriz");
        int N = leer.nextInt();

        System.out.println("ingrese la cantidad de columnas para la matriz");
        int M = leer.nextInt();

        int matrix[][] = new int[N][M];

        int suma = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {

                matrix[i][j] = (int) (Math.random() * 10);
                suma += matrix[i][j];

            }

        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {

                System.out.print(" " + matrix[i][j] + " ");

            }
            System.out.println(" ");
        }

        System.out.println("La sumas de los valores de la matriz es de :" + suma);

    }

}
