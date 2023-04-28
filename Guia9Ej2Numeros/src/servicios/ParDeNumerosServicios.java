/*
Método mostrarValores que muestra cuáles son los dos números guardados.
Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número.
  Previamente se deben redondear ambos valores.
Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores.
  Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package servicios;

import atributos.ParDeNumeros;

public class ParDeNumerosServicios {

    public ParDeNumeros crarNumeros() {

        ParDeNumeros n1 = new ParDeNumeros();

        return n1;
    }

    //Método mostrarValores que muestra cuáles son los dos números guardados.
    public void mostrarNumeros(ParDeNumeros n1) {
        System.out.println("El numero 1 es: " + n1.getNum1());
        System.out.println("El numero 2 es: " + n1.getNum2());

    }

    //Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
    public void devolverMayor(ParDeNumeros n1) {

        double mayor = Math.max(n1.getNum1(), n1.getNum2());

        System.out.println("El numero mayor es: " + mayor);

    }

    //Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número.
    //Previamente se deben redondear ambos valores.
    public void calcularPotencia(ParDeNumeros n1) {

        double pot = Math.pow(Math.round(Math.max(n1.getNum1(), n1.getNum2())), Math.round(Math.min(n1.getNum1(), n1.getNum2())));

        System.out.println("La potencia del mayor elevado por el menor es: " + pot);
    }

    //Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores.
    //Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
    
    public void calcularRaiz(ParDeNumeros n1) {
        
        double raiz = Math.sqrt(Math.min(Math.abs(n1.getNum1()),Math.abs(n1.getNum2())));
        
        System.out.println("La raiz del numero menors es: " + raiz);
    }
}
