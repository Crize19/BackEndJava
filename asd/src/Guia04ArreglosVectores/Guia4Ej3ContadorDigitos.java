/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package Guia04ArreglosVectores;

import java.util.Scanner;


public class Guia4Ej3ContadorDigitos {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del vector");
        
        int lar = leer.nextInt();
        
        int vector[] = new int [lar];
        
        for (int i = 0; i < lar; i++ ){
            vector[i]=(int) (Math.random() * 99999);
        }
        
        String aux= "";
        for (int elemento: vector){
            aux = aux + " " + elemento;
        }
        System.out.println(aux);
        
        int digitos[] = new int [5];
        
        for ( int i = 0; i < lar; i++ ){
            
            int numero = vector[i];
            
            int num = String.valueOf(numero).length();
            
        switch (num){
            
            case 1:
              digitos[0]++  ;
            break;
            
            case 2:
               digitos[1]++ ;
            break;
            
            case 3:
               digitos[2]++ ;
            break;
            
            case 4:
               digitos[3]++;
            break;  
            
           case 5:
               digitos[4]++;
            break;     
        }
     
       } 
        
        System.out.println("Se encontraron " + digitos[0] + " numeros con 1 digitos" );
        System.out.println("Se encontraron " + digitos[1] + " numeros con 2 digitos" );  
        System.out.println("Se encontraron " + digitos[2] + " numeros con 3 digitos" );
        System.out.println("Se encontraron " + digitos[3] + " numeros con 4 digitos" );
        System.out.println("Se encontraron " + digitos[4] + " numeros con 5 digitos" );
        
    }
    
}
