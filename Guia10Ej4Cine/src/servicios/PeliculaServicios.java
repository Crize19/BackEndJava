package servicios;

import entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PeliculaServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<Pelicula> crearListaPeliculas() {

        ArrayList<Pelicula> peliculas = new ArrayList();

        String res;

        do {
            Pelicula p1 = new Pelicula();

            System.out.println("Ingrese el titulo de la pelicula");

            p1.setTitulo(leer.next());

            System.out.println("Ingrese el nombre del director de la pelicula");

            p1.setDirector(leer.next());

            System.out.println("Ingrese la duracion de la pelicula");

            p1.setHora(leer.nextDouble());

            peliculas.add(p1);

            System.out.println("Desea cargar otra pelicula? s/n");
            res = leer.next();

        } while (!res.equalsIgnoreCase("n"));

        return peliculas;

    }
    
    
    public void mostrarPeliculas(ArrayList<Pelicula> peliculas){
        System.out.println("\n Lista de Peliculass");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
            
        }
       
    }
    
    public void mostrarPeliculasDuracionMayor(ArrayList<Pelicula> peliculas){
        System.out.println("\n Lista de peliculas mayor a una hora");
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getHora()>1) {
                System.out.println(pelicula);
            }
        }
        
    }
public void ordenarPeliculasDuracionMA(ArrayList<Pelicula> peliculas){
    
    System.out.println("\n Peliculas ordenadas de mayor a menor en duracion");
    
        peliculas.sort(Pelicula.compararDuracionMayor);
        
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
    }

}

public void ordenarPeliculasDuracionMe(ArrayList<Pelicula> peliculas){
    System.out.println("\nPeliculas ordenadas de menor a mayor en duracion ");
    peliculas.sort(Pelicula.compararDuracionMenor);
       for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
    }
}
public void ordenarPeliculasTitulo(ArrayList<Pelicula> peliculas){
    System.out.println("\n Peliculas ordenadas por Titulo");
    
    peliculas.sort(Pelicula.compararTitulo);
       for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
    }
}

public void ordenarPeliculasDirector(ArrayList<Pelicula> peliculas){
    System.out.println("\nPeliculas ordenadas por Director");
    peliculas.sort(Pelicula.compararDirector);
       for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
    }
}
}
