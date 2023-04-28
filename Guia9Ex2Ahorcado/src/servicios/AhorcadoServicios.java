package servicios;

import atributos.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class AhorcadoServicios {

    Scanner leer = new Scanner(System.in);

    String letrasUsadas = "";

    /*
Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. 
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
palabra en un índice del vector. Y también, guarda la cantidad de jugadas máximas y el
valor que ingresó el usuario.  
     */
    public Ahorcado crearJuego() {
        Ahorcado a1 = new Ahorcado();
        String palabra = JOptionPane.showInputDialog("Ingrese la palabra a adivinar");
        System.out.println("Dispone de 5 intentos para adivinar la palabra");
        a1.setIntentosMaximos(5);
        String[] pal = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            pal[i] = palabra.substring(i, i + 1);
        }
        a1.setPalabraABuscar(pal);
        return a1;
    }

    /*
Método longitud(): muestra la longitud de la palabra que se debe encontrar.
Nota: buscar como se usa el vector.length
     */
    public void longitud(Ahorcado a1) {
        System.out.println("La longitud de la palabra: " + a1.getPalabraABuscar().length);
    }

    /*
Método buscar(letra):  este método recibe una letra dada por el usuario y
busca si la letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
     */
    public void buscar(String letra, Ahorcado a1, String palabra) {

        if (palabra.contains(letra)) {
            System.out.println("La letra esta dentro de la palabra");
        } else {
            System.out.println("la letra no se encuntra dentro dela palabra");
        }
    }

    /*
Método encontradas(letra):  que reciba una letra ingresada por el usuario
y muestre cuantas letras han sido encontradas y cuántas le faltan.
Este método además deberá devolver true si la letra estaba y false si la letra no estaba,
ya que, cada vez que se busque una letra que no esté, se le restará uno a sus oportunidades.
     */
    public boolean encontradas(String letra, Ahorcado a1, String palabra) {
        int contE = 0;
        boolean encontrada = false;
        for (String palabraABuscar : a1.getPalabraABuscar()) {
            if (palabraABuscar.equals(letra)) {
                encontrada = true;
                contE++;
            }
        }

        if (encontrada == true) {

            a1.setCantidadDeLetrasEncontradas(a1.getCantidadDeLetrasEncontradas() + contE);

        } else {
            a1.setIntentosMaximos(a1.getIntentosMaximos() - 1);
        }

        System.out.println("Número de letras (encontradas, faltantes): (" + a1.getCantidadDeLetrasEncontradas() + "/" + (a1.getPalabraABuscar().length-a1.getCantidadDeLetrasEncontradas()) + ")");
        return encontrada;
    }

    /*
    Método intentos(): para mostrar cuántas oportunidades le queda al jugador
     */
    public void intentos(Ahorcado a1) {
        System.out.println("Cantidad de intentos restantes: " + a1.getIntentosMaximos());
    }

    /*
    Método juego(): el método juego se encargará de llamar todos los métodos previamente 
    mencionados e informará cuando el usuario descubra toda la palabra o se quede sin intentos.
    Este método se llamará en el main.

     */
    public void juego() {
        Ahorcado a1 = crearJuego();

        String palabra = Arrays.toString(a1.getPalabraABuscar());
        String[] palabraOculta = new String[a1.getPalabraABuscar().length];
        Arrays.fill(palabraOculta, "_");
        String letra;
        longitud(a1);
       
        do {
            letra = letras();
            mostrarPalabra(a1, letra, palabraOculta);
            longitud(a1);
            buscar(letra, a1, palabra);
            encontradas(letra, a1, palabra);
            intentos(a1);
            mostrarAhorcado(a1);
            if (a1.getCantidadDeLetrasEncontradas() == a1.getPalabraABuscar().length) {
                System.out.println("Has adivinado la palabra, ganaste la partida ");
                break;

            }
            if (a1.getIntentosMaximos() == 0) {
                System.out.println("Has perdido la partida");
                System.out.println("La palabra era : " + Arrays.toString(a1.getPalabraABuscar()));
            }

        } while (a1.getIntentosMaximos() > 0);

    }

    public String letras() {
        String letra;
        System.out.println("==========================================");
        System.out.println("Ingrese una letra");
        do {
            letra = leer.next();

            if (letrasUsadas.contains(letra)) {
                System.out.println("Letra repetida, vuelva a ingresar");

            }

        } while (letrasUsadas.contains(letra));
        letrasUsadas += letra;
        // System.out.println(letra);
        // System.out.println(letrasUsadas);
        return letra;

    }

    public void mostrarPalabra(Ahorcado a1, String letra, String[] palabraOculta) {

        String[] copiaPalabra = a1.getPalabraABuscar();

        for (int i = 0; i < a1.getPalabraABuscar().length; i++) {
            if (copiaPalabra[i].equals(letra)) {
                palabraOculta[i] = letra;

            }
        }
        for (int j = 0; j < a1.getPalabraABuscar().length; j++) {
            if (!"_".equals(palabraOculta[j])) {
                System.out.print(palabraOculta[j] + " ");

            } else {
                System.out.print("_ ");

            }

        }

        System.out.println("");
    }

    public void mostrarAhorcado(Ahorcado a1) {
        int intentos = a1.getIntentosMaximos();

        String[][] dibujo
             = {{" ", " ", " ", " ", " ", " ", " ", " ",},
                {"", " ┌", "─", "─", "", " ", " ", " ",},
                {" ", "│", "", " ", " │", " ", " ", " ",},
                {" ", "│", " ", " ", "*", " ", " ", " ",},
                {" ", "│", " ", "*", " ", "*", " ", " ",},
                {" ", "│", " ", " ", "*", " ", " ", " ",},
                {" ", "│", " ", " ", "*", " ", " ", " ",},
                {" ", "│", "*", "*", "*", "*", "*", " ",},
                {" ", "│", "*", " ", "*", " ", "*", " ",},
                {" ", "│", "*", " ", "*", " ", "*", " ",},
                {" ", "│", " ", " ", "*", " ", " ", " ",},
                {" ", "│", " ", " ", "*", " ", " ", " ",},
                {" ", "│", " ", "*", " ", "*", " ", " ",},
                {" ", "│", " ", "*", " ", "*", " ", " ",},
                {" ", "│", " ", "*", " ", "*", " ", " ",},
                {" ", "│", "*", "*", " ", "*", "*", " ",},
                {"─", "─", "─", " ", " ", " ", " ", " ",}};
        if (intentos < 5) {
            dibujo[15][2] = " ";
            dibujo[15][3] = " ";
            dibujo[14][3] = " ";
            dibujo[13][3] = " ";
            dibujo[12][3] = " ";
        }
        if (intentos < 4) {
            dibujo[15][6] = " ";
            dibujo[15][5] = " ";
            dibujo[14][5] = " ";
            dibujo[13][5] = " ";
            dibujo[12][5] = " ";
        }
        if (intentos < 3) {
            dibujo[9][2] = " ";
            dibujo[8][2] = " ";
            dibujo[7][2] = " ";
            dibujo[7][3] = " ";
        }

        if (intentos < 2) {
            dibujo[9][6] = " ";
            dibujo[8][6] = " ";
            dibujo[7][6] = " ";
            dibujo[7][5] = " ";
        }
        if (intentos < 1) {
            dibujo[7][4] = " ";
            dibujo[8][4] = " ";
            dibujo[9][4] = " ";
            dibujo[10][4] = " ";
            dibujo[11][4] = " ";
            dibujo[7][3] = "─";
            dibujo[7][4] = "─";
            dibujo[7][5] = "─";
            
        }
        for (int i = 0; i < 17; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(dibujo[i][j] + " ");
            }
            System.out.println("");
        }

    }

}
