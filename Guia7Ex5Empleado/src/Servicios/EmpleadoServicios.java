/*

 */
package Servicios;

import Entidades.Empleado;
import java.util.Scanner;


public class EmpleadoServicios {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Empleado crearEmpleado(){
        
        Empleado e1 = new Empleado();
        
        System.out.println("Ingrese el nombre del empleado");
        e1.setNombre(leer.next());
        System.out.println("Ingrese la edad de " + e1.getNombre());
        e1.setEdad(leer.nextInt());
        while (e1.getEdad()<18 || e1.getEdad()>65) {
            if (e1.getEdad()<18) {
                System.out.println("Es ilegal emplear a menores, confirme la edad");
                e1.setEdad(leer.nextInt());
            }else{
                System.out.println("Ya se tendria que haber jubilado, confirme la edad");
                e1.setEdad(leer.nextInt());
            }
            
        }
        System.out.println("Ingrese el salario de " + e1.getNombre());
        e1.setSalario(leer.nextDouble());
        
        return e1;
    }
    
    public void aumentoEmpleado(Empleado e1){
        
        double aumento;
        
        if(e1.getEdad()<30){
        e1.setSalario(e1.getSalario()*1.05);
        }else{
        e1.setSalario(e1.getSalario()*1.1);
        }
        System.out.println("El salario de " + e1.getNombre() + " con el aumento aplicado es de :" + e1.getSalario());
    }
    
    public void mostrarEmpleado(Empleado e1){
        System.out.println(e1.toString());
    }
}
