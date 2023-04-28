/*

 */
package Servicios;

import Atributos.Cafetera;
import java.util.Scanner;


public class CafeteraServicios {
    
    Scanner leer = new Scanner(System.in);
    
    Cafetera c1 = new Cafetera();
    
    
    public void llenarCafetera(Cafetera c1){
        c1.setCapacidadMaxima(1.8);
        System.out.println("La cafetera se ha llenado a su maxima capacidad " + c1.getCapacidadMaxima() + "Lts. ");
        c1.setCantidadActual(1.8);
    }
    
    public void servirTaza(Cafetera c1){
        System.out.println("Ingrese la medida de la taza a servir en litros");
        double taza = leer.nextDouble();
        if (taza>c1.getCantidadActual()) {
            System.out.println("La cantidad actual no alcanzar a llenar la taza, se llenara hasta " + c1.getCantidadActual() + "Lts");
            
        }else{
            System.out.println("La taza se ha llenado");
            c1.setCantidadActual(c1.getCantidadActual()-taza);
        }
    }
    
    public void vaciarCafetera(Cafetera c1){
        
        System.out.println("La cafetera se autolimpiara y pasara de " + c1.getCantidadActual() + " a cero lts, recuerde llenarla");
    }
    
    public void agregarCafe(Cafetera c1){
        System.out.println("Ingrese la cantidad de cafe a agregar en Lts.");
        double agregar = leer.nextDouble();
        if (agregar>c1.getCapacidadMaxima()) {
            System.out.println("Es demasiado la cantidad, se llenar hasta el maximo");
            c1.setCantidadActual(c1.getCapacidadMaxima());
        }else {
            System.out.println("La cafetera se ha llenar hasta la cantidad indicada");
            c1.setCantidadActual(agregar);
        }
    }
    
    public void mostrarCafetera(Cafetera c1){
        System.out.println(c1.toString());
    }
}
