package guia9ej6curso;

import atributos.Curso;
import servicios.CursoServicios;

public class Guia9Ej6Curso {

    public static void main(String[] args) {

        CursoServicios cs = new CursoServicios();

        Curso c1 = cs.crarCurso();
        
        cs.calcularGananciaSemanal(c1);
        
        
                
                
    }

}
