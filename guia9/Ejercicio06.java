package Ejercicios;
import Entidad.Curso;
import Servicio.CursoService;

public class Ejercicio06 {

    public static void main(String[] args) {
        
        CursoService c1 = new CursoService();
        Curso a = c1.crearCurso();
        System.out.println(c1.calcularGanancias(a));
       
        
    }

}
