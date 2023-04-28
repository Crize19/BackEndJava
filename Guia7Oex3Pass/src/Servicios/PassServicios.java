/*
 
 */
package Servicios;

import Atributos.Pass;
import java.util.Scanner;

public class PassServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Pass usuarioPass() {

        Pass u1 = new Pass("0000000000", "Cristian", 35337596);

        return u1;
    }

    public void crearPass(Pass p1) {

        System.out.println("Ingresar una contraseña de longitud 10");

        p1.setPass(leer.next());

        while (p1.getPass().length() != 10) {
            System.out.println("Corregir el largo de la contraseña");
            p1.setPass(leer.next());
        }

    }

    public void analizarPass(Pass p1) {

        int contZ = 0;
        int contA = 0;

        for (int i = 0; i < 10; i++) {

            if (p1.getPass().substring(i, i + 1).equalsIgnoreCase("A")) {
                contA++;
            }
            if (p1.getPass().substring(i, i + 1).equalsIgnoreCase("Z")) {
                contZ++;
            }

        }

        if (contZ > 0 && contA > 1) {
            System.out.println("Su contraseña es de nivel ALTO");

        } else if (contZ > 0 && contA < 2) {
            System.out.println("Su contraseña es de nivel MEDIO");

        } else {
            System.out.println("Su contraseña es de nivel BAJO");
        }

    }

    public void modPass(Pass p1) {

        System.out.println("Ingrese su contraseña para poder realizar las modificaciones");

        String pass = leer.next();

        if (p1.getPass().equals(pass)) {
            System.out.println("Ingrese la nueva contrseña para el usuario");
            p1.setPass(leer.next());
             while (p1.getPass().length() != 10) {
            System.out.println("Corregir el largo de la contraseña");
            p1.setPass(leer.next());
        }

        } else {

            System.out.println("Error en la contraseña");
        }

    }

    public void modnombrePass(Pass p1) {

        System.out.println("Ingrese su contraseña para poder realizar las modificaciones");

        String pass = leer.next();

        if (p1.getPass().equals(pass)) {
            System.out.println("Ingrese el nuevo nombre para el usuario");
            p1.setNombre(leer.next());

        } else {

            System.out.println("Error en la contraseña");
        }

    }

    public void moddniPass(Pass p1) {

        System.out.println("Ingrese su contraseña para poder realizar las modificaciones");

        String pass = leer.next();

        if (p1.getPass().equals(pass)) {
            System.out.println("Ingrese el nuevo dni para el usuario");
            p1.setDni(leer.nextInt());

        } else {

            System.out.println("Error en la contraseña");
        }

    }

    public void menuPass(Pass p1) {

        String res = "N";

        do {
            System.out.println("Ingrese un numero para seleccionar la gestion");
            System.out.println("========Menu========");
            System.out.println("1. Ingresar la Contraseña.");
            System.out.println("2. Nivel de su Contraseña.");
            System.out.println("3. Modificar Contraseña.");
            System.out.println("4. Modificar Nombre.");
            System.out.println("5. Modificar DNI.");
            System.out.println("6. Salir.");
            System.out.println("========    ========");

            int opc = leer.nextInt();

            switch (opc) {
                case 1:
                    crearPass(p1);
                    break;
                case 2:
                    analizarPass(p1);
                    break;
                case 3:
                    modPass(p1);
                    break;
                case 4:
                    modnombrePass(p1);
                    break;
                case 5:
                    moddniPass(p1);
                    break;
                case 6:
                    System.out.println("Desea salir? (s/n)");
                    res = leer.next();
                    break;
                default:
                    System.out.println("Opcion mal ingresada");

            }
        } while (res.equalsIgnoreCase("n"));

    }

    public void mostrarPass(Pass p1) {
        System.out.println(p1.toString());

    }
}
