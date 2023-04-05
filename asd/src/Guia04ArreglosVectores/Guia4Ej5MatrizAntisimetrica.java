/*
 Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su
propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si
A = -AT. La matriz traspuesta de una matriz A se denota por AT y se
obtiene cambiando sus filas por columnas (o viceversa).
 */
package Guia04ArreglosVectores;

import java.util.Scanner;


public class Guia4Ej5MatrizAntisimetrica {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
       int matrix[][] = new int [3][3];
        int matrixt[][] = new int [3][3];
        
        System.out.println("Matriz original");
        
        for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++ ){
            System.out.println("Ingrese valor en i: " + i + " y en j: " + j);
             matrix[i][j] = leer.nextInt();
            }
        }
        
        for ( int i = 0; i < 3; i++){
        for ( int j = 0; j < 3; j++ ){   
        System.out.print(" " + matrix[i][j] + " ");
        }
        System.out.println(" ");
        }
        
        System.out.println("=========================");
        
        System.out.println("Matriz trsnspuesta");
        
        for ( int i = 0; i < 3; i++){
        for ( int j = 0; j < 3; j++ ){
             matrixt[i][j] = matrix[j][i];
        System.out.print(" " + matrixt[i][j] + " ");
        }
        System.out.println(" ");
        }
        
        
        int cont = 0;
                
        for( int i = 0; i < 3; i++){
        for ( int j = 0; j < 3; j++ ){
            if (matrix[i][j] != -matrixt[i][j]){
            cont++;
            }
        }
        
        }
        if (cont == 0){
        System.out.println("La matriz es antisimetrica");
        }
        else {
        System.out.println("La matriz no es antisimetrica");
        } 
        
        
        
    }
    
}
