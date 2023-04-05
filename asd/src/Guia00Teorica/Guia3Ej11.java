/*
Escribir un programa que procese una secuencia de caracteres ingresada por
teclado y terminada en punto, y luego codifique la palabra o frase ingresada de
la siguiente manera: cada vocal se reemplaza por el carácter que se indica en
la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se
mantienen sin cambios.
 */
package Guia00Teorica;

import java.util.Scanner;


public class Guia3Ej11 {

    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        System.out.println("Ingrese una secuencia de caracteres (terminada en punto): ");
        String entrada = Leer.nextLine();

        while (!entrada.endsWith(".")) {
            System.out.println("Por favor asegurese de que la frase termine en un punto");
            entrada = Leer.nextLine();
        }

        String salida = codificar(entrada);
        System.out.println("Secuencia codificada: " + salida);

    }

    public static String codificar(String entrada) {
        String salida = "";
        for (int i = 0; i < entrada.length() - 1; i++) {
            char c = entrada.charAt(i);
            switch (c) {
                case 'a':
                    salida += '@';
                    break;
                case 'e':
                    salida += '#';
                    break;
                case 'i':
                    salida += '$';
                    break;
                case 'o':
                    salida += '%';
                    break;
                case 'u':
                    salida += '*';
                    break;
                case 'A':
                    salida += '@';
                    break;
                case 'E':
                    salida += '#';
                    break;
                case 'I':
                    salida += '$';
                    break;
                case 'O':
                    salida += '%';
                    break;
                case 'U':
                    salida += '*';
                    break;
                default:
                    salida += c;
                    break;
            }
        }
        salida += "."; // Agrega el punto al final de la cadena de salida
        return salida;
    }

}
