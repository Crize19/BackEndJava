package guia10ej2borrarraza;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Guia10Ej2BorrarRaza {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ArrayList<String> razas = new ArrayList();
        String res;

        do {
            System.out.println("\nIngrese una raza de perro");

            razas.add(leer.next().toLowerCase());

            System.out.println("\nDesea cargar otra raza? s/n");

            res = leer.next();

        } while (!res.equalsIgnoreCase("n"));

        razas.forEach((aux) -> {
            System.out.println(aux);
        });

        System.out.println("\nIngrese una raza de perro a eliminar");

        String razaB = leer.next().toLowerCase();
        int cont = 0;

//        for (int i = 0 ; i < razas.size(); i++) {
//            
//            if (razaB.equalsIgnoreCase(razas.get(i))) {
//                System.out.println("\nSe ha removido a la raza " + razas.get(i));
//                razas.remove(i);
//                cont++;
//                
//            }
//            
//        }
//        
//        if (cont<1) {
//            System.out.println("\nLa raza que desea eliminar no se encuentra");
//        }
        Iterator it = razas.iterator();
        
        while (it.hasNext()) {
            if (it.next().equals(razaB)) {
                it.remove();
                break;
            }
        }
        
        Collections.sort(razas);

        System.out.println("\nLista Ordenada\n");
        razas.forEach((aux) -> {
            System.out.println(aux);
        });

    }

}
