/*

 */
package servicios;

import atributos.SopaDeLetras;
import java.util.Arrays;
import java.util.Scanner;


public class SopaDeLetrasServicios {
    
    
    Scanner leer = new Scanner(System.in);
    
    String[] palabras = {
        "horno", "plato", "mesas", "silla", "vasos", "camas", "coche", "clase", "perro", "papel",
        "pollo", "vacas", "paris", "tokio", "llave", "libro", "casas", "cinco", "siete", "lapiz" 
    };
    
public SopaDeLetras rellenarSopa(){
    
    
    SopaDeLetras s1 = new SopaDeLetras();
    
    char[][] matriz = new char[10][10];

        for (int i = 0; i < 10; i++) {
            String palabra1 = palabras[i].toUpperCase();;
            String palabra2 = palabras[i + 10].toUpperCase();;
            for (int j = 0; j < 5; j++) {

                matriz[i][j] = palabra1.charAt(j);
                matriz[i][j + 5] = palabra2.charAt(j);

            }
        }
        
        s1.setMatrix(matriz);
        
        return s1;
}


public void mostrarSopa(SopaDeLetras s1){
     char[][] matriz = s1.getMatrix();
   
            
     for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(" " + matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
    System.out.println("\n");
}

public void pedirPalabra(SopaDeLetras s1){
     
  String palabra = leer.next();
     while (palabra.length()!= 5) {
         System.out.println("Longitud de palabra fuera de rango, reingrese");
         palabra = leer.next();
     }
     s1.setEncontrarPalabra(palabra.toUpperCase());
 }

 public int[] buscarPalabra(SopaDeLetras s1){
     
     
     
     
     char[][] matriz = s1.getMatrix();
    int [] pos = new int [2];
     
     for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] == s1.getEncontrarPalabra().charAt(0) && matriz[i][j+1]== s1.getEncontrarPalabra().charAt(1) 
                        && matriz[i][j+2]== s1.getEncontrarPalabra().charAt(2) && matriz[i][j+3]== s1.getEncontrarPalabra().charAt(3)
                        && matriz[i][j+4]== s1.getEncontrarPalabra().charAt(4)) {
                  
                    pos[0]=i;
                    pos[1]=j;
                    
                  
                }
            }
        }
     return pos;
     
 }  
 
 
 
 public void cambioDePalabra(SopaDeLetras s1){
     
     pedirPalabra(s1);
     
     char[][] matriz = s1.getMatrix();
     int[] pos = buscarPalabra(s1);
    
     
     System.out.println("Ingrese la palabra nueva");
     String palabra2 = leer.next().toUpperCase();
     while (palabra2.length()!= 5) {
         System.out.println("Longitud de palabra fuera de rango, reingrese");
         palabra2 = leer.next();
     }
     
     for (int i = 0; i < matriz.length; i++) {
         for (int j = 0; j < matriz.length; j++) {
             if (i == pos[0] && j == pos[1] ) {
                matriz[i][j]= palabra2.charAt(0);
                matriz[i][j+1]=palabra2.charAt(1);
                matriz[i][j+2]=palabra2.charAt(2);
                matriz[i][j+3]=palabra2.charAt(3);
                matriz[i][j+4]=palabra2.charAt(4);
                
             }
         }
         
     }
     
     s1.setMatrix(matriz);
     
     mostrarSopa(s1);
 }
 
 public void sopaInvertida(SopaDeLetras s1){
     
      char[][] matriz = s1.getMatrix();
   
      System.out.println("Sopa de Letras Invertida \n");
            
     for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(" " + matriz[j][i] + " ");
            }
            System.out.println(" ");
        }
     
     
 }

 
}
