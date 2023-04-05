/*
 .
 */
package Servicios;

import Entidades.Cancion;
import java.util.Scanner;


public class CancionServicios {
    
    
    public Cancion crearCancion(){
    
    Cancion c1 = new Cancion();
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
        System.out.println("Ingrese el titulo de la cancion");
        
        c1.setTitulo(leer.next());
        
        System.out.println("Ingrese el autor de la cancion");
        
        c1.setAutor(leer.next());
    
    return c1;
    
    }
    
    public void mostrarCancion(Cancion c1){
    
        System.out.println(c1.toString());
    
    }
    
}
