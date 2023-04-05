/*
Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
+ (9 * C / 5).
 */
package Guia01Generalidades;

import java.util.Scanner;


public class Guia1Ej4Temperatura {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese los grados centigrados a convertir");
        int cent = leer.nextInt();
        
        int far = 32 + (9* cent /5);
        
        System.out.println("Su equivalente de " + cent + " º centrigrados a fahrenheit es de " + far + " º");
      
    }
    
}
