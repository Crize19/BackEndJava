/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
lo siguiente:
* * * *
*     *
*     *
* * * *
 */
package Guia02EstructurasDeControl;

import java.util.Scanner;


public class Guia2Ej8Cuadrado {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de los lados del cuandrado");
        int num = leer.nextInt();
        
        
        
        for ( int i = 0; i < num  ; i++) {
            for (int j = 0; j < num  ; j++) {
                if ( i == 0 || j == 0 || i == num -1 || j == num -1 ){
                System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println(" "); 
        }
     
        
        
        
        
    }
    
}
