

package guia10ej5paises;


import java.util.Set;
import servicios.PaisesServicios;


public class Guia10Ej5Paises {

    
    public static void main(String[] args) {
        
        PaisesServicios ps = new PaisesServicios();
        
        Set<String> paises = ps.cargarPaises();
        
        ps.ordenarAlfabeticamente(paises);
        ps.eliminarPais(paises);
        
        
       
    }

}
