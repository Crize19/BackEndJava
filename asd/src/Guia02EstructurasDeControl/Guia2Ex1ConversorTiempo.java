/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. 
Por ejemplo, si el usuario ingresa 1600 minutos, 
el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package Guia02EstructurasDeControl;

import java.util.Scanner;


public class Guia2Ex1ConversorTiempo {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de minutos a convertir");
        
        int minutos = leer.nextInt();
        
        
        int dias = minutos / 1440;
        int horas = (minutos  - (dias * 1440)) / 60;
        
        System.out.println("Su equivalente es de: " + dias + " dias y " + horas + " horas");
        
        //1440 1 dia
    }
    
}
