/*
Crear una clase CadenaServicio en el paquete servicios que implemente los siguientes métodos:
Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
  Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con otra nueva frase ingresada por el usuario.
Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.
Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package servicios;

import atributos.Cadena;
import java.util.Scanner;

public class CadenaServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Cadena crearCadena(){
    
        Cadena c1 = new Cadena();
        
        System.out.println("Ingrese la frase del objeto");
        
        c1.setFrase(leer.next());
        
        c1.setLongitud(c1.getFrase().length());
        
        return c1;
    }

    public void mostrarVocales(Cadena c1) {

        int contA = 0, contE = 0, contI = 0, contO = 0, contU = 0;

        for (int i = 0; i < c1.getLongitud(); i++) {
            char var;
            var = c1.getFrase().toLowerCase().charAt(i);

            switch (var) {
                case 'a':
                    contA++;
                    break;
                case 'e':
                    contE++;
                    break;
                case 'i':
                    contI++;
                    break;
                case 'o':
                    contO++;
                    break;
                case 'u':
                    contU++;
                    break;

            }
        }

        System.out.println("La cantidad de vocales que tiene la frase son : " + (contA + contE + contI + contO + contU));

    }

    public void invertirFrase(Cadena c1) {
       String fraseInvertida = "";

        for (int i = c1.getLongitud()-1 ; i >= 0; i--) {
           
           fraseInvertida += c1.getFrase().charAt(i);
            
        }
        System.out.println("La frase invertida es: " + fraseInvertida );
    }

    /*Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas
    veces se repite el carácter en la frase, por ejemplo:
  Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.*/
    public void vecesRepetido(Cadena c1) {

        System.out.println("Ingrese el caracter para contabilizar cuantas veces se repite");

        char carac = leer.next().charAt(0);
        int repet = 0;

        for (int i = 0; i < c1.getLongitud(); i++) {
            if (carac == (c1.getFrase().toLowerCase().charAt(i))) {
                repet++;
            }
        }
        System.out.println("El caracter fue econtrado " + repet + " veces.");
    }

    /*Método compararLongitud(String frase), deberá comparar la longitud de la frase que 
    compone la clase con otra nueva frase ingresada por el usuario.*/
    public void compararLongitud(Cadena c1) {
        System.out.println("ingrese una frase para comparar con la ya existente");
        String frase2 = leer.next();
      
        if (frase2.length()==c1.getLongitud()) {
            System.out.println("Las frases son iguales");
        }else if(frase2.length()>c1.getLongitud() ){
            System.out.println("Su frase es mayor");
        }else{
            System.out.println("Su frase es menor");
        }
        

    }

    /*Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva 
    frase ingresada por el usuario y mostrar la frase resultante.*/

    public void unirFrases(Cadena c1) {
        System.out.println("Ingrese una frase para unir a la frase ya existente ");
        String frase = leer.next();
        c1.setFrase(c1.getFrase().concat(frase));
        System.out.println(c1.getFrase());
    }

    /*Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase,
    por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.*/
    public void reemplazarFrase(Cadena c1) {
        System.out.println("ingrese el caractar que desea reemplzar por la letra a ");
        char reem = leer.next().charAt(0);
        String frase = c1.getFrase();
        c1.setFrase(frase.replace('a', reem));
        System.out.println(c1.getFrase());
    }
    
    /*Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario
    y devuelve verdadero si la contiene y falso si no.*/
    
    public void contiene(Cadena c1){
        System.out.println("Ingrese una letra para saber si la frase la contiene");
        String letra = leer.next();
        System.out.println(c1.getFrase().contains(letra));
    
    }
}
