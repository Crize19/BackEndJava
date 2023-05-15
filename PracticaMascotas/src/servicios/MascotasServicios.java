package servicios;

import Entidades.Mascotas;
import java.util.ArrayList;
import java.util.Scanner;

public class MascotasServicios {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private ArrayList<Mascotas> mascList;

    public MascotasServicios() {
        this.mascList = new ArrayList();
    }

    public Mascotas crearMascotas() {

        System.out.println("Introducir nombre");
        String nombre = leer.next();

        System.out.println("Introducir apodo");
        String apodo = leer.next();

        System.out.println("Introducir tipo");
        String tipo = leer.next();

        return new Mascotas(nombre, apodo, tipo);
    }

    public void agregarMascotas(Mascotas m) {

        mascList.add(m);

    }

    public void mostrarMascotas() {

        System.out.println("Las mascotas actuales de la lista Mascotas son: ");

        mascList.forEach((aux) -> {
            System.out.println(aux.toString());
        });

        System.out.println("Cantidad = " + mascList.size());

    }

    public void fabricarChiquitos(int cantidad) {

        for (int i = 0; i < cantidad; i++) {
            mascList.add(new Mascotas("Fer" + (i + 1), "chiquito" + (i + 1), "Beagle" + (i + 1)));

        }

    }

    public void fabricarMascota(int cantidad) {

        for (int i = 0; i < cantidad; i++) {

            Mascotas m = crearMascotas();

            agregarMascotas(m);

        }
    }

    public void actualizarMascotaXreferencia(int index) {

        Mascotas m = mascList.get(index);
        m.setApodo("Roberto");

    }

    public void actualizarMascotaNuevaPorIndice(int index) {
        Mascotas m = crearMascotas();

        mascList.set(index, m);

    }
    
   public void eliminarMascotas (int index){
       
       mascList.remove(index);
   } 

   public void eliminarPorNombre(String nombre){
       for (int i = 0; i < mascList.size(); i++) {
           
           Mascotas m;
           m = mascList.get(i);

           if (m.getNombre().equals(nombre)) {
              mascList.remove(i);
               
           }
       }
   
   }
}
