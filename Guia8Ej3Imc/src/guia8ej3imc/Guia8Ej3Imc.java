/*
Realizar una clase llamada Persona en el paquete de entidades que tengan los siguientes atributos: nombre, edad,
sexo (‘H’ para hombre, ‘M’ para mujer, ‘O’ para otro), peso y altura. Si desea añadir algún otro atributo, puede hacerlo.
Agregar constructores, getters y setters.
En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario y después 
se le asignan a sus respectivos atributos para llenar el objeto Persona. Además, comprueba que el sexo introducido sea correcto,
es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje


Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). Si esta fórmula da por
resultado un valor menor que 20, significa que la persona está por debajo de su peso ideal y la función devuelve un -1. Si 
la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona está en su peso ideal y la función 
devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos los métodos para cada objeto, deberá 
comprobar si la persona está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en distintas variables(arrays), para después 
calcular un porcentaje de esas 4 personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, 
y también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores. Para esto, podemos crear unos métodos adicionales.

 */
package guia8ej3imc;

import Atributos.Persona;
import Servicios.PersonaServicios;

public class Guia8Ej3Imc {

    public static void main(String[] args) {

        Persona[] personas = new Persona[4];
        int imc[] = new int[4];
        boolean edad[]= new boolean[4];
        
        PersonaServicios ps = new PersonaServicios();

        for (int i = 0; i < 4; i++) {
          
            personas[i] = ps.crearPersona(personas[i]);
            imc[i]=ps.calcularImc(personas[i].getPeso(),personas[i].getAltura());
            edad[i]=ps.esMayorDeEdad(personas[i].getEdad());
        }
        
        int contD=0, contS=0 ,contI=0, contMa=0, contMe=0 ;
         
         
        for (int i = 0; i < 4; i++) {
            switch (imc[i]) {
                case -1:
                    System.out.println(personas[i].getNombre()+" esta por debajo de su peso ideal");
                    contD++;
                    break;
                case 0:
                    System.out.println(personas[i].getNombre()+" esta en su peso ideal");
                    contI++;
                    break;
                default:
                    System.out.println(personas[i].getNombre()+" esta en por encima de su peso ideal");
                    contS++;
                    break;
            }
            if (edad[i]==true) {
                System.out.println(personas[i].getNombre()+" es mayor de edad");
                contMa++;
            }else{
                System.out.println(personas[i].getNombre()+" es menor de edad");
                contMe++;
            }
        }
        
        System.out.println("El porcentaje de personas que estan en su peso ideal " +((contI*100)/4)+"%" );
        System.out.println("El porcentaje de personas que estan por debajo " +((contD*100)/4)+"%");
        System.out.println("El porcentaje de personas que estan por encima " +((contS*100)/4)+"%");
        
        System.out.println("==============================");
        
        System.out.println("El pocentaje de personas mayores de edad es de "+((contMa*100)/4)+"%"  );
        System.out.println("El pocentaje de personas menores de edad es de "+((contMe*100)/4)+"%" );
    }

}
