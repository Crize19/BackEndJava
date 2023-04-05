/*
Realizar un programa que simule el funcionamiento de un dispositivo
RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
cadenas deben llegar con un formato fijo: tienen que ser de un máximo
de 5 caracteres de largo, el primer carácter tiene que ser X y el último
tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas,
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
FDE), y toda secuencia distinta de FDE, que no respete el formato se
considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de
lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
deberá investigar cómo se utilizan las siguientes funciones de Java
Substring(), Length(), equals().
 */
package Guia02EstructurasDeControl;

import java.util.Scanner;

public class Guia2Ej7LectorDeCadenas {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int contC = 0, contI = 0;
        String frase = "asd";

        while (!frase.equals("&&&&&")) {
            System.out.println("Ingrese una frase en formato FDE de 5 caracteres (ingrese &&&&& para terminar los envios)");
            frase = leer.nextLine();

            while (frase.length() != 5) {
                System.out.println("Ingrese una frase valida");
                frase = leer.nextLine();
            }
            if (frase.equals("&&&&&")) {
                System.out.println("Envios terminados");
                break;
            }
            if (frase.substring(0, 1).equalsIgnoreCase("X") && frase.substring(4,5).equalsIgnoreCase ("O")  ) {
                System.out.println("Correcto");
                contC++;
            }
            else {
                System.out.println("Incorrecto");
                contI++;
            }

        }

        System.out.println("Informe");
        System.out.println("Frases correctas: " + contC);
        System.out.println("Frases incorrectas: " + contI);

    }

}