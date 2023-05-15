

package guia10ej4cine;

import entidad.Pelicula;
import java.util.ArrayList;
import servicios.PeliculaServicios;


public class Guia10Ej4Cine {

    
    public static void main(String[] args) {
        
        PeliculaServicios ps = new PeliculaServicios();
        
        ArrayList<Pelicula> peliculas = ps.crearListaPeliculas();
        
        ps.mostrarPeliculas(peliculas);
        ps.mostrarPeliculasDuracionMayor(peliculas);
        ps.ordenarPeliculasDuracionMA(peliculas);
        ps.ordenarPeliculasDuracionMe(peliculas);
        ps.ordenarPeliculasTitulo(peliculas);
        ps.ordenarPeliculasDirector(peliculas);
        
        
       
    }

}
