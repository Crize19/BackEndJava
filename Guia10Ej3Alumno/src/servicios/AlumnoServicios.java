package servicios;

import atributos.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    

    public ArrayList<Alumno> crearListaAlumno() {
        
        ArrayList<Alumno> alum = new ArrayList();
        
        String res;

        do {
            Alumno a1 = new Alumno();

            System.out.println("Ingrese el nombre del alumno");

            a1.setNombre(leer.next());

            ArrayList<Integer> notas = new ArrayList();

            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese la " + (i + 1) + "° nota del alumno ");
                int not = leer.nextInt();
                while (not<1 || not>10) {
                    System.out.println("Nota fuera de rango, reingrese");
                    not = leer.nextInt();
                }
                notas.add(not);
            }

            a1.setNotas(notas);

            alum.add(a1);

            System.out.println("Desea cargar otro alumno? s/n");
            res = leer.next();

        } while (!res.equalsIgnoreCase("n"));
        
      return alum;  

    }

    public Double notaFinal(ArrayList<Alumno> alum) {

        System.out.println("Ingrese el nombre del alumno para saber su promedio");

        String nombre = leer.next();
       
        double prom = 0;

        for (int i = 0; i < alum.size(); i++) {
            Alumno m = alum.get(i);
            if (m.getNombre().equalsIgnoreCase(nombre)) {
                for (int j = 0; j < m.getNotas().size(); j++) {
                    prom = prom + m.getNotas().get(j);
                    return (prom / alum.get(0).getNotas().size());
                }
            }

        }
        
       
            System.out.println("No se econtro el alumo en la lista");
        return null;
    }

}
