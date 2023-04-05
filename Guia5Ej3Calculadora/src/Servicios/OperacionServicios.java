/*
 
 */
package Servicios;

import Entidades.Operacion;
import java.util.Scanner;

public class OperacionServicios {

    public Operacion crearOperacion() {

        Operacion o1 = new Operacion();

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese primer numero");

        o1.setNum1(leer.nextInt());

        System.out.println("Ingrese segundo numero");

        o1.setNum2(leer.nextInt());

        return o1;
    }

    public void sumarOperacion(Operacion o1) {

        int suma = o1.getNum1() + o1.getNum2();

        System.out.println("La suma de operacion es: " + suma);

    }

    public void restarOperacion(Operacion o1) {

        int resta = o1.getNum1() - o1.getNum2();

        System.out.println("La resta de operacion es : " + resta);

    }

    public void multiplicarOperacion(Operacion o1) {

        int multiplicacion;

        if (o1.getNum1() == 0 || o1.getNum2() == 0) {

            multiplicacion = 0;

            System.out.println("Error al multiplicar por cero, el resultado es: " + multiplicacion);

        } else {

            multiplicacion = o1.getNum1() * o1.getNum2();

            System.out.println("La multiplicacion de operacion es:" + multiplicacion);
        }

    }
    
    public void dividirOperacion(Operacion o1) {

        double division;

        if (o1.getNum1() == 0 || o1.getNum2() == 0) {

            division = 0;

            System.out.println("Error al dividir por cero, el resultado es: " + division);

        } else {

            division = o1.getNum1() / o1.getNum2();

            System.out.println("La division de operacion es:" + division);
        }

    }
    
    public void mostrarOperacion(Operacion o1){
        System.out.println(o1.toString());
    }
    
}
