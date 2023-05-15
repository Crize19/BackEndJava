package servicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PaisesServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Set<String> cargarPaises() {

        Set<String> paisesSet = new HashSet();

        String res;

        do {
            System.out.println("Ingrese un pais a lista");

            paisesSet.add(leer.next().toUpperCase());
            
            System.out.println("Desea cargar otra pais? s/n");
            res = leer.next();

        } while (!res.equalsIgnoreCase("n"));

        return paisesSet;
    }

    public void ordenarAlfabeticamente(Set<String> paises) {

        System.out.println("\n Paises ordenados alfabeticamente");
       ArrayList <String> paisesOrd = new ArrayList(paises);
        Collections.sort(paisesOrd);
        for (String pais : paisesOrd) {
            System.out.println(pais);
        }
    }
    
    public void eliminarPais(Set <String> paises){
        
        System.out.println(":Ingrese el nombre de un pais para eliminar de la lista");
        String paisE = leer.next().toUpperCase();
        
        Iterator it = paises.iterator();
        int cont = 0;
        while (it.hasNext()) {
            if (it.next().equals(paisE)) {
                System.out.println("Se removio el pais " + paisE);
                it.remove();
                cont++;
                ordenarAlfabeticamente(paises);
            }
        }
        
        if (cont==0) {
            System.out.println("El pais a eliminar no se encontro");
        }
    }
    
    
}
