/*

 */
package Servicios;

import Atributos.Persona;
import java.util.Scanner;

public class PersonaServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona(Persona p1) {
        System.out.println("Ingrese el Nombre");
        String nombre = leer.next();
        System.out.println("Ingrese el sexo");
        String sexo = leer.next();
        while (!sexo.equalsIgnoreCase("h") && !sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("o")) {
            System.out.println("Ingrese correctamente el sexo");
            sexo = leer.next();
        }
        System.out.println("Ingrese la edad");
        int edad = leer.nextInt();
        System.out.println("Ingrese la altura en mts");
        double altura = leer.nextDouble();
        System.out.println("Ingrese el peso en kg");
        double peso = leer.nextDouble();

        return new Persona(nombre, edad, sexo, peso, altura);
    }

    public boolean esMayorDeEdad(int edad) {
   
          return edad > 17;

    }

    public int calcularImc(double peso, double altura) {

        double imc = peso / (altura * altura);

        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }

    }
    
    

}
