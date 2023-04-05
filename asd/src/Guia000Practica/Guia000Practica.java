
package Guia000Practica;

import java.util.Scanner;


public class Guia000Practica {
    public static void main(String[] args) {
        
        System.out.println("Hola Mundo");
   	
        
        //VARIABLES
    	int numero = 10;
        String nombre = "Cristian";
        char letra = 'P';
        double decimales = 11.2;
        boolean bandera = false;
        long largo = 12354687;
        
        
        //ARITMETICA
        int num1=4 , num2=2, suma, resta, multiplicacion, division;
        suma=num1+num2;
        resta=num1-num2;
        multiplicacion=num1*num2;
        division=num1/num2;
        System.out.println("El resultado de la suma es: "+suma);  
        System.out.println("El resultado de la resta es:"+resta); 
        System.out.println("El resulta de la multiplicacion es :"+multiplicacion);
        System.out.println("El resultado de la division es "+division);
              
        
        //INTERCAMBIADOR
        int n1=35,n2=20,aux;
        
        System.out.println(" Antes numero 1: "+n1+" numero 2: "+n2);
        
        aux=n2;
        n1=n2;
        n2=aux;
        
        System.out.println(" Despues numero 1: "+n1+" numero 2: "+n2);
        
        //IF ANIDADO
        
        int numero1=10,numero2=10;
        
        if (numero2>numero1){
            System.out.println("El numero dos es mayor que el numero uno ");
            
        }
        else{
            if (numero1==numero2){
                System.out.println("Som iguales");
            }
            else{
             System.out.println("El numero uno es mayor al numero dos");
            }
	}
        
        
       //SWICH
       
       int dia = 8;
       String nombredia;
       
       
       switch (dia){
           
           case 1: nombredia="Lunes";
           break;
           case 2: nombredia="Martes";
           break;
           case 3: nombredia="Miercoles";
           break;
           case 4: nombredia="Jueves";
           break;
           case 5: nombredia="Viernes";
           break;
           case 6: nombredia="Sabado";
           break;
           case 7: nombredia="Domingo";
           break;
           default: nombredia="Numero de dia invalido"; 
       }
        System.out.println("El dia seleccionado es: "+nombredia);
        
       //ejercicio 
        
        
        double sueldo;
        int cat;
        
        System.out.println("Ingrese la categoria del empleado");
        
        Scanner Leer = new Scanner(System.in);
        cat = Leer.nextInt();
        
        while(cat<1 || cat>3){
            System.out.println("Debe ingresar una categoria valida");
            cat = Leer.nextInt();
        }
        
        if (cat == 1){
            sueldo = 15890 + (15890*0.10);
        }
        else {
            if(cat == 2 ){
            sueldo = 25630.89;
            }
            else{
                
                sueldo = 35560.20 - (35560.20*0.11);
    
            }
        
        }
        System.out.println("El sueldo de la categoria: " + cat + " es de: " + sueldo);
        
        
         // vector       
           
        int vector[] = new int[4];
        
        vector[0] = 2;
        vector[1] = 35;
        vector[2] = 48;
        vector[3] = 157;
        
        // recorride vector
        
        for (int i = 0; i < 4; i++) {
        	System.out.print("[" + vector[i] + "]");
    	}
        System.out.println(" ");
        
        
        // carga de vector
        
        int vector1[] = new int [4];
        
        for (int i = 0; i < vector1.length; i++){
                   System.out.println("Ingrese el valor para el indice " + i );
                   vector1[i] = Leer.nextInt();
        }
                
                
        for (int i = 0; i < vector1.length; i++){
            System.out.print("[" + vector1[i] + "]");
             
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }       
}
