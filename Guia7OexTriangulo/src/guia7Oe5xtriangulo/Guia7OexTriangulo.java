/*
Definir una clase triangulo que modelara triángulos isósceles . Definir los atributos necesarios para
operar. Crear los métodos correspondientes a la clase Entidad.
Crear un arreglo con 4 objetos de la clase
Crear los siguientes métodos:
● Calcular área
● Calcular perímetro
● Mostrar los datos del triangulo que tenga el área de mayor superficie

 */
package guia7Oe5xtriangulo;

import Atributos.Triangulo;
import Servicios.TrianguloServicios;


public class Guia7OexTriangulo {

   
    public static void main(String[] args) {
        
        TrianguloServicios ts = new TrianguloServicios();
        
        Triangulo [] trian = new Triangulo[4];
        double area[]= new double[4];
        int perimetro[]= new int[4];
        double mayor =0;
        int pos=0;
        
        for (int i = 0; i < 4; i++) {
            
            trian[i]=ts.crearTriangulo();
            area[i]=ts.areaTriangulo(trian[i]);
            if (area[i]>mayor) {
                mayor = area[i];
                pos = i;
            }
            perimetro[i]=ts.perimetroTriangulo(trian[i]);
            
        }
        
        for (int i = 0; i < 4; i++) {
            
             System.out.println("El area del triangulo " +(i+1) + " es: " + area[i]);
             
             System.out.println("El perimetro del triangulo " +(i+1) + " es de: " + perimetro[i] );
            System.out.println("============================");
        }
        
        System.out.println("Los datos del triangulo con mayor area es el triangulo :" + (pos + 1));
        System.out.println(trian[pos].toString());
        
    }
    
}
