/*

 */
package Servicios;

import Entidades.Rectangulo;
import java.util.Scanner;

public class RectanguloServicios {

    public Rectangulo crearRectangulo() {

        Rectangulo r1 = new Rectangulo();

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese la base del rectangulo");

        r1.setBase(leer.nextInt());

        System.out.println("Ingrese la altura del rectangulo");

        r1.setAltura(leer.nextInt());

        while (r1.getBase() == r1.getAltura()) {
            System.out.println("Si los lados son inguales, seria un cuadrado");
            r1.setAltura(leer.nextInt());

        }

        return r1;

    }

    public void superficieRectangulo(Rectangulo r1) {

        int superficie = r1.getBase() * r1.getAltura();

        System.out.println("La superficie del rectangulo es de :" + superficie);

    }

    public void perimetroRectangulo(Rectangulo r1) {
        
        int perimetro = (r1.getBase() + r1.getAltura()) * 2;
        
        System.out.println("El perimetro del rectangulo es: " + perimetro);

    }
    
    public void dibujarRectangulo(Rectangulo r1){
        
        System.out.println("El rectangulo representado se ve asi:");
        
        for ( int i = 0; i < r1.getBase()  ; i++) {
            for (int j = 0; j < r1.getAltura()  ; j++) {
                if ( i == 0 || j == 0 || i == r1.getBase() -1 || j == r1.getAltura() -1 ){
                System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println(" "); 
        }
        
    
    }
    
    public void mostrarRectagulo (Rectangulo r1){
    
        System.out.println(r1.toString());
    }

}
