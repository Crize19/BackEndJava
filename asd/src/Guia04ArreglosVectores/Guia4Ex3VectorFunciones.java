/*
Crear una función rellene un vector con números aleatorios, 
pasándole un arreglo por parámetro. Después haremos otra función o
procedimiento que imprima el vector.
 */
package Guia04ArreglosVectores;

import java.util.Scanner;


public class Guia4Ex3VectorFunciones {
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del vector");

        int vector[] = new int [leer.nextInt()];
        
        vector = rellenoVector (vector);
        
        muestreoVector(vector);
        
        
    }
    
    
    public static int[] rellenoVector (int [] vector){
    
    for (int i = 0 ; i < vector.length ; i++){
        vector[i] = (int) (Math.random() * 10);
      }
    return vector;
    }
    
    
    public static void muestreoVector ( int [] vector){
    
        for (int i = 0; i < vector.length; i++) {
            System.out.print(" " + vector[i] + " ");
        }
    
    }
    
    
}
