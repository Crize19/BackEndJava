

package guia10ej1razas;

import java.util.ArrayList;
import java.util.Scanner;


public class Guia10Ej1Razas {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n"); 
        
        ArrayList<String> razas = new ArrayList();
        String res;
        
        do {
            System.out.println("Ingrese una raza de perro");
            
            razas.add(leer.next());
            
            System.out.println("Desea cargar otra raza? s/n" );
            
            res= leer.next();
            
        } while (!res.equalsIgnoreCase("n"));
        
        razas.forEach((aux) -> {
            System.out.println(aux);
        });
            
        
        }
       
    }


