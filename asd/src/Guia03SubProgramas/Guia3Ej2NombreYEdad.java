/*
 Diseñe una función que pida el nombre y la edad de N personas e imprima los datos
de las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir 
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package Guia03SubProgramas;

import java.util.Scanner;


public class Guia3Ej2NombreYEdad {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        String nombre;
        int edad;
        String continuar = "Si";
        
       while (continuar.equalsIgnoreCase("Si")){
        System.out.println("Por favor ingrese el nombre de la persona");
        nombre = leer.next();
        
        System.out.println("Por favor ingrese la edad de " + nombre);
        edad = leer.nextInt();
        
        while (edad < 0 || edad > 120){
            System.out.println("Por favor ingrese una edad real");
            edad = leer.nextInt();
        }
        
        System.out.println("nombre: " + nombre + "/// Edad: " + edad);
        
        if (edad < 18){
            System.out.println("Es menor de edad");
        }
        else {
            System.out.println("Es mayor de edad");
        }
        
        System.out.println("Desea seguir mostrando personas? (Si/No)");
           
        continuar = leer.next();
       
    } 
        
        
    }
    
}
