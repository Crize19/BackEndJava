/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida que el usuario
las va ingresando, construya una “sopa de letras para niños” de tamaño de 20 x 20 caracteres.
Las palabras se ubicarán todas en orden horizontal en una fila que será seleccionada de manera aleatoria. 
Una vez concluida la ubicación de las palabras, rellene los espacios no utilizados con un número aleatorio del 0 al 9.
Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes 
funciones de Java substring(), Length() y Math.random().
 */
package Guia04ArreglosVectores;

import java.util.Scanner;

public class Guia4Ex6SopaDeLetrasMaldita {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        char matrix[][] = new char[20][20];
        

        //introducir palabras
        int cont = 0;

        do {
            int aux = 0;
            System.out.println("Ingrese palabra numero " + (cont + 1));
            String palabra = leer.next();
            while (palabra.length() < 3 || palabra.length() > 5) {
                System.out.println("Escribi bien!");
                palabra = leer.next();
            }
            //posicion random fila 
            int randomF = (int) (Math.random() * 20);
            //posicion random de columna hasta maximo 15
            int randomC = (int) (Math.random() * 15);
            //introducir palabra en la matrix
            for (int j = randomC; j < (randomC + palabra.length()); j++) {
                matrix[randomF][j] = palabra.charAt(aux);
                aux++;
            }
            cont++;
        } while (cont < 5);

        //rellenar espacios vacios
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (matrix[i][j] == 0) {

                    matrix[i][j] = (char) (Math.random() * 10 + '0');
                }
            }
        }

        // mostar la matrix
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {

                System.out.print(" " + matrix[i][j] + " ");

            }
            System.out.println(" ");
        }

    }

}
