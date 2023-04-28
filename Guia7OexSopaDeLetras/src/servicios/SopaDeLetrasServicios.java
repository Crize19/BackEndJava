/*

 */
package servicios;

import atributos.SopaDeLetras;
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
                System.out.print(" " +matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
  
}
 public void buscarPalabra(SopaDeLetras s1){
     
     System.out.println("Ingrese la palabra a buscar");
     s1.setEncontrarPalabra(leer.next());
     
 }   
}
