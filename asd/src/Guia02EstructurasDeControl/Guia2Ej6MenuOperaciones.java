/*
Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú.
Menu
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opcion:

 */
package Guia02EstructurasDeControl;

import java.util.Scanner;


public class Guia2Ej6MenuOperaciones {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
         System.out.println("Ingrese un numero positivo: ");
         int num = leer.nextInt();
         System.out.println("Ingrese otro numero positivo: ");
         int num1 = leer.nextInt();
        
         
         String res = "N";
         int option;
            
            
            
         do {   
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija opcion:");
            
            option = leer.nextInt();
            
            switch(option){
                case 1:
                    System.out.println("La suma es: " + (num+num1));
                    break;
                case 2:
                    System.out.println("La resta es: " + (num-num1));
                    break;
                case 3:
                    System.out.println("El producto es: " + (num*num1));
                    break;
                case 4:
                    System.out.println("La division es: " + (num/num1));
                    break;
                case 5:
                    System.out.println("Deseas salir?: S/N");
                    res = leer.next();
                    break;
                default:
                    System.out.println("Ingrese un numero entre 1 y 5");    
            }
            
        } while (res.equalsIgnoreCase("N"));
          
    
        
        
        
    }
}
