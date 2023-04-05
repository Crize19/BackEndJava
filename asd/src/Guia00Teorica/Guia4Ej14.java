/*
Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus
compañeros de equipo
 */
package Guia00Teorica;

import java.util.Scanner;


public class Guia4Ej14 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        String vector[] = new String[8];

        for (int i = 0; i < 8; i++) {

            System.out.println("Ingrese los nombres de los companieron del grupo");
            vector[i] = leer.next();

        }

        for (int i = 0; i < 8; i++) {

            System.out.println(vector[i]);

        }

    }
}
    

