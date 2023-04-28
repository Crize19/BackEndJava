package servicios;

import atributos.Curso;
import java.util.Scanner;

public class CursoServicios{

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
/*
Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos que asisten a las clases.
Nosotros nos encargaremos de almacenar esta información en un arreglo e iterar con un bucle, 
solicitando en cada repetición que se ingrese el nombre de cada alumno.    
*/

public String [] cargarAlumnos(){
 String [] alum = new String [5];
    for (int i = 0; i < alum.length; i++) {
        System.out.println("Ingrese el nombre del alumno n°" + (i+1));
        alum[i]=leer.next();
    }
 
return alum;
}
/*
Método crearCurso(): el método crear curso, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto Curso.
En este método invocamos al método cargarAlumnos() para asignarle valor al atributo alumnos
*/
public Curso crarCurso(){
Curso c1 = new Curso();
    System.out.println("Ingrese el nombre del curso");
    c1.setNombreDelCurso(leer.next());
    System.out.println("Ingrese la cantidad de horas del curso");
    c1.setCantidadHorasPorDia(leer.nextInt());
    System.out.println("Ingrese la cantidad de dias por semana");
    c1.setCantidadDiasPorSemana(leer.nextInt());
    System.out.println("Ingrese el turno del curso");
    c1.setTurno(leer.next());
    System.out.println("Ingrese el precio por hora");
    c1.setPrecioPorHora(leer.nextDouble());
    c1.setAlumnos(cargarAlumnos());

return c1;
}


/*
Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia en una semana por curso.
Para ello, se deben multiplicar la cantidad de horas por día, el precio por hora, la cantidad de alumnos 
y la cantidad de días a la semana que se repite el encuentro.
*/

public void calcularGananciaSemanal(Curso c1){
double ganancia = c1.getCantidadHorasPorDia()*c1.getPrecioPorHora()*5*c1.getCantidadDiasPorSemana();
    System.out.println("La ganancia semanal es de $" + ganancia + " pesos");
}
}