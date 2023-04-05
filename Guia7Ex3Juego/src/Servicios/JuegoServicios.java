/*

 */
package Servicios;

import Entidades.Juego;
import java.util.Scanner;

public class JuegoServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Juego crearJuego() {

        Juego j1 = new Juego();

        System.out.println("Ingrese el nombre del Primer jugador");

        j1.setJugador1(leer.next());

        System.out.println("Ingrese el nombre del Segundo jugador");

        j1.setJugador2(leer.next());

        System.out.println("Ingrese la cantidad de intentos que va  a tener el juego");

        j1.setIntentos(leer.nextInt());

        return j1;
    }

    public void jugarJuego(Juego j1) {

        String res;

        do {
            int cont = 0;
            int num1 = (int) (Math.random() * 1000);

            do {
                System.out.println(j1.getJugador2() + " ingrese un numero a ver si adivina");
                int numj2 = (leer.nextInt());

                if (numj2 == num1) {
                    System.out.println(j1.getJugador2() + " has ganado la partida");
                    j1.setVictoriasj2(j1.getVictoriasj2() + 1);
                    j1.setIntentosj2(j1.getIntentosj2() + 1);
                    break;
                }
                if (numj2 < num1) {
                    System.out.println("Mas alto");
                    System.out.println("intento " + (cont + 1) + "/" + j1.getIntentos());
                    j1.setIntentosj2(j1.getIntentosj2() + 1);

                } else {
                    System.out.println("Mas bajo");
                    System.out.println("intento " + (cont + 1) + "/" + j1.getIntentos());
                    j1.setIntentosj2(j1.getIntentosj2() + 1);

                }

                cont++;
                if (cont == j1.getIntentos()) {
                    System.out.println(j1.getJugador2() + " Has perdido la partida");
                    j1.setVictoriasj1(j1.getVictoriasj1() + 1);
                }

            } while (cont < j1.getIntentos());

            System.out.println("El numero a adivinar era " + num1);

            int num2 = (int) (Math.random() * 1000);
            cont = 0;
            do {
                System.out.println(j1.getJugador1() + " ingrese un numero a ver si adivina");
                int numj1 = (leer.nextInt());

                if (numj1 == num2) {
                    System.out.println(j1.getJugador1() + " has ganado la partida");
                    j1.setVictoriasj1(j1.getVictoriasj1() + 1);
                    j1.setIntentosj1(j1.getIntentosj1() + 1);
                    break;
                }
                if (numj1 < num2) {
                    System.out.println("Mas alto");
                    System.out.println("intento " + (cont + 1) + "/" + j1.getIntentos());
                    j1.setIntentosj1(j1.getIntentosj1() + 1);

                } else {
                    System.out.println("Mas bajo");
                    System.out.println("intento " + (cont + 1) + "/" + j1.getIntentos());
                    j1.setIntentosj1(j1.getIntentosj1() + 1);
                }

                cont++;
                if (cont == j1.getIntentos()) {
                    System.out.println(j1.getJugador1() + " Has perdido la partida");
                    j1.setVictoriasj2(j1.getVictoriasj2() + 1);
                }

            } while (cont < j1.getIntentos());

            System.out.println("El numero a adivinar era " + num2);
            System.out.println("Desea salir del juego? (s/n)");
            res = leer.next();

        } while (res.equalsIgnoreCase("N"));

        System.out.println("Victorias de " + j1.getJugador1() + " " + j1.getVictoriasj1() + " en " + j1.getIntentosj1() + " intentos");
        System.out.println("===========");
        System.out.println("Victorias de " + j1.getJugador2() + " " + j1.getVictoriasj2() + " en " + j1.getIntentosj2() + " intentos");

    }

    public void mostrarJuego(Juego j1) {
        System.out.println(j1.toString());
    }
}
