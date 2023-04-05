package Guia03SubProgramas;

/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre
sumar, restar, multiplicar y dividir. La aplicación debe tener una función para
cada operación matemática y deben devolver sus resultados para imprimirlos en el main..
 */


import java.util.Scanner;

public class Guia3Ej1Calculadora {
    public static void main(String[] args) {
         Scanner Leer = new Scanner(System.in);
    
    int num1, num2;
    
        System.out.println("Por favor ingrese dos numero ");
        
        num1 = Leer.nextInt();
        num2 = Leer.nextInt();
        
        System.out.println("Por Favor Elija la operacion del menu que desea realizar");
        System.out.println("1: Sumar");
        System.out.println("2: Restar");
        System.out.println("3: Multiplicar");
        System.out.println("4: Dividir");
        
        int opcion = Leer.nextInt();
        while (opcion<1 || opcion >4){
            System.out.println("Porfavor introduzca una opcion correcta");
            opcion = Leer.nextInt();
        }
        
        double resultado = 0;
        
        switch (opcion){
            
            case 1:
                resultado = sumar(num1,num2);
            break;
            
            case 2:
                resultado = restar(num1,num2);
            break;
            
            case 3:
                resultado = multiplicar(num1,num2);
            break;
            
            case 4:
                resultado = dividir(num1,num2);
            break;
           
        }
        
        System.out.println("El resultado de la operacion es: " + resultado);        
        
    }
    
    public static int sumar (int num1, int num2){
    return num1 + num2;
    }
    
     public static int restar (int num1, int num2){
    return num1 - num2;
    }
     
     public static int multiplicar (int num1, int num2){
    return num1 * num2;
    }
    
     public static double dividir (int num1, int num2){
    return (double) num1 / num2;
    }
    
}
