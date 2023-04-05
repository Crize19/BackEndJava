/*
Desarrollar una clase Cancion con los siguientes atributos: título y autor.
Se deberá definir además dos constructores: uno vacío que inicializa el título
y el autor a cadenas vacías y otro que reciba como parámetros el título y el autor de la canción. 
Se deberán además definir los métodos getters y setters correspondientes.
 */
package guia5ex1cancion;

import Entidades.Cancion;
import Servicios.CancionServicios;


public class Guia5Ex1Cancion {

    
    public static void main(String[] args) {
       
        CancionServicios cs = new CancionServicios();
        
        Cancion c1 = cs.crearCancion();
        
        cs.mostrarCancion(c1);
        
        System.out.println("Titulo de la cancion: " + c1.getTitulo() + " y autor: " + c1.getAutor());
        
    }
    
}
