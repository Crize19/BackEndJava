/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero se
debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". El
programa deberá calcular y mostrar el resultado de la suma de los números
leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso
de la sentencia break.
 */
package Guia00Teorica;

import java.util.Scanner;


public class Guia2Ej9 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int cont = 0;
        int num = 0;
        int suma = 0;
        do {  
            System.out.println("Ingrese hasta 20 numeros a sumar, si ingresa 0 saldra del programa");
            num = leer.nextInt();
            if (num > 0){
            suma = suma + num;
            }
            if (num == 0){
            break;
            }
            cont ++;   
            } while (cont < 20);
         
        if (num == 0){
            System.out.println("Se capturo el numero cero");
        }
        else{{
            System.out.println("Muchas gracias por usar nuestro programa");
        }}
        
        System.out.println("La suma de sus numeros positivos es de: " + suma);
    }
}
