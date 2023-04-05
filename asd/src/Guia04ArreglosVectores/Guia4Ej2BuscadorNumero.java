/*
 Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y 
le pida al usuario un número a buscar en el vector. El programa mostrará dónde se
encuentra el numero y si se encuentra repetido.
 */
package Guia04ArreglosVectores;

import java.util.Scanner;


public class Guia4Ej2BuscadorNumero {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del vector");
        
        int lar = leer.nextInt();
        
        int vector[] = new int [lar];
        
        for (int i = 0; i < lar; i++ ){
            vector[i]=(int) (Math.random() * 10);
        }
        
        String aux= "";
        for (int elemento: vector){
            aux = aux + " " + elemento;
        }
        System.out.println(aux);
        
        System.out.println("Ingresar un numero a buscar entre 0 y 10");
        int buscado = leer.nextInt();
        while (buscado<0 || buscado > 10){
            System.out.println("ingrese un valor correcto");
            buscado = leer.nextInt();
        }
        
        int cont = 0;
        for (int i = 0; i < lar; i++){
            if (vector[i] == buscado){
                System.out.println("El numero " + buscado + " se encuentra en la posicion " + i);
            cont ++;}
        }
                
        if (cont > 1)  {
            System.out.println("El numero " + buscado + " se encontro " + cont + " veces");
        }    
        else {
            if (cont == 1 ){
                System.out.println("El numero " + buscado + " se encontro una sola vez");
            }
            else {
                System.out.println("el numero " + buscado + " no se encontro");
            }
        
        }
        
        
        
    }
       
}
