/*

 */
package NifServicios;

import Atributos.Nif;
import java.util.Scanner;


public class NifServicio {
    
    Scanner leer = new Scanner(System.in);

    String letras="TRWAGMYFPDXBNJZSQVHLCKE";
   


    public Nif crearNif(){
        
        Nif n1 = new Nif();
        
        System.out.println("Ingrese el dni");
        
        n1.setDni(leer.nextLong());
        
        int nif =Math.round(n1.getDni()% 23);
        
        System.out.println("Posicion de letra: " + nif);

        n1.setLetra(letras.substring(nif,nif +1));

        System.out.println("Letra nif : " +n1.getLetra());
        
    return n1;
    }
    
    
    public void mostrar(Nif n1){
        
        System.out.println(n1.getDni()+"-"+n1.getLetra());
    
    }
}
