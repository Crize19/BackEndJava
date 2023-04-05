/*
 Los profesores del curso de programación de Egg necesitan llevar un registro de las notas adquiridas 
por sus 10 alumnos para luego obtener una cantidad de aprobados y desaprobados. Durante el período de 
cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos y 2 por parciales. 
Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del programa
los profesores necesitan obtener por pantalla la cantidad de aprobados y desaprobados, teniendo en 
cuenta que solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.

 */
package Guia04ArreglosVectores;

import java.util.Scanner;

public class Guia4Ex4Notas {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        double matrix[] = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese nota Primer trabajo práctico evaluativo " + i);
            int tp1 = leer.nextInt();
            System.out.println("Ingrese nota Segundo trabajo práctico evaluativo " + i);
            int tp2 = leer.nextInt();
            System.out.println("Ingrese nota Primer Integrador " + i);
            int i1 = leer.nextInt();
            System.out.println("Ingrese nota Segundo integrador " + i);
            int i2 = leer.nextInt();

            matrix[i] = (tp1 * .1) + (tp2 * .15) + (i1 * .25) + (i2 * .5);

        }

        for (int i = 0; i < 10; i++) {
            System.out.println(matrix[i]);

        }
        int contA = 0;
        int contD = 0;

        for (int i = 0; i < 10; i++) {
            if (matrix[i] > 6) {
                contA++;
            } else {
                contD++;
            }

        }

        System.out.println("Los aprovados son " + contA);
        System.out.println("Los desaprobados son " + contD);

    }

}
