/*
Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B.
   Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
 */
package servicios;

import java.util.Arrays;

public class ArrayServicios {

    public void iniciarlizarA(double[] arrayA) {

        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = Math.random() * 10 + 1;
        }
        //  Arrays.fill(arrayA, Math.random()*10 +1);

    }

    public void mostrarA(double[] arrayA) {

        System.out.println(Arrays.toString(arrayA));
        System.out.print("");
    }

    public void ordenarA(double[] arrayA) {

        Arrays.sort(arrayA);
        
    }

    public void iniciarlizarB(double[] arrayA, double[] arrayB) {

        Arrays.fill(arrayB, 0.5);
        arrayB = Arrays.copyOfRange(arrayA, 9, 10);
    }
}
