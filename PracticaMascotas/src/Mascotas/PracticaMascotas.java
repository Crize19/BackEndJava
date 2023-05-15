

package Mascotas;

import servicios.MascotasServicios;


public class PracticaMascotas {

    
    public static void main(String[] args) {
        
        MascotasServicios sm = new MascotasServicios();
        
        sm.fabricarMascota(2);
        
        sm.mostrarMascotas();
        
        sm.actualizarMascotaNuevaPorIndice(0);
        
        sm.mostrarMascotas();
        
        sm.eliminarMascotas(0);
        
        sm.mostrarMascotas();
        
       
    }

}
