package utilidades;

import Entidades.Mascotas;
import java.util.Comparator;

public class Comparadores {

    public static Comparator<Mascotas> ordenarPorNombreDesc = (Mascotas o1, Mascotas o2) -> o2.getNombre().compareTo(o1.getNombre());
    
    public static Comparator<Mascotas> ordenarPorEdadDesc = (Mascotas o1, Mascotas o2) -> o2.getEdad().compareTo(o1.getEdad());
       
}
