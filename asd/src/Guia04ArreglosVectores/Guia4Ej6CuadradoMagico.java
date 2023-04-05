/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del
1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son
idénticas. Crear un programa que permita introducir un cuadrado por
teclado y determine si este cuadrado es mágico o no. El programa
deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package Guia04ArreglosVectores;

import java.util.Scanner;

public class Guia4Ej6CuadradoMagico {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("");

        int matrix[][] = new int[3][3];

        //llenar matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese valor en i: " + i + " y en j: " + j);
                matrix[i][j] = leer.nextInt();
                while (matrix[i][j] < 0 || matrix[i][j] > 10) {
                    System.out.println("ingrese un valor correcto");
                    matrix[i][j] = leer.nextInt();

                }
            }

        }

        System.out.println("=========");

        //mostrar matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println(" ");
        }

        //sacar valor de suma de las filas
        int valorMagico = (matrix[0][0] + matrix[1][0] + matrix[2][0]);

        System.out.println("El valor magico es de : " + valorMagico);

        int suma = 0;
        boolean CuadradoMagico = true;

        //verificar filas
        for (int i = 0; i < 3; i++) {
            int sumaFila = 0;
            for (int j = 0; j < 3; j++) {
                sumaFila += matrix[i][j];
            }
            if (sumaFila != valorMagico) {
                CuadradoMagico = false;
                break;
            }

        }

        //verificar columnas
        if (CuadradoMagico == true) {
            for (int j = 0; j < 3; j++) {
                int sumaColumna = 0;
                for (int i = 0; i < 3; i++) {
                    sumaColumna += matrix[i][j];
                }
                if (sumaColumna != valorMagico) {
                    CuadradoMagico = false;
                    break;
                }
            }

        }

        //verificar las diagonales
        if (CuadradoMagico == true) {
            int diagonal1 = matrix[0][0] + matrix[1][1] + matrix[2][2];
            int diagonal2 = matrix[0][2] + matrix[1][1] + matrix[2][0];
            if (diagonal1 != valorMagico || diagonal2 != valorMagico) {
                CuadradoMagico = false;

            }
        }

        //mostrar resultados
        if (CuadradoMagico == true) {
            System.out.println("Es un cuadrado Magico");
        } else {
            System.out.println("El cuadrado no es magico");
        }

    }
}
