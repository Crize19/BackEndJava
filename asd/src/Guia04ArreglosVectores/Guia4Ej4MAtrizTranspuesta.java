/*
 Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre
la traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y 
se obtiene cambiando sus filas por columnas (o viceversa).

 */
package Guia04ArreglosVectores;


public class Guia4Ej4MAtrizTranspuesta {
    public static void main(String[] args) {
        
        int matrix[][] = new int [4][4];
        int matrixt[][] = new int [4][4];
        
        System.out.println("Matriz original");
        
        for (int i = 0; i < 4; i++){
        for (int j = 0; j < 4; j++ ){
             matrix[i][j] =(int) (Math.random() * 9);
             System.out.print(" " + matrix[i][j] + " ");
            }
        System.out.println(" ");
        }
        
        System.out.println("=========================");
        
        System.out.println("Matriz trsnspuesta");
        
        for ( int i = 0; i < 4; i++){
        for ( int j = 0; j < 4; j++ ){
             matrixt[i][j] = matrix[j][i];
        System.out.print(" " + matrixt[i][j] + " ");
        }
        System.out.println(" ");
        }
        
       
        
    }
}
