package Servicio;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaService {

    private final Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {
        System.out.println("Ingrese su nombre");
        String nombre = leer.next();
        Date fecha = fechaDeNacimiento();
        return new Persona(nombre, fecha);
    }

    public Date fechaDeNacimiento() {
        int anio, mes, dia;
        System.out.print("Ingrese el año de su nacimiento: ");
        anio = leer.nextInt() - 1900;
        System.out.print("Ingrese el mes de su nacimiento: ");
        mes = leer.nextInt() - 1;
        System.out.print("Ingrese el dia de su nacimiento: ");
        dia = leer.nextInt();
        return new Date(anio, mes, dia);
    }
    
    public int calcularEdad(Persona a, Date x){
        
        long mili =x.getTime() - a.getNacimiento().getTime();
        double diferenciaAnios = mili / (365.25 * 24 * 60 * 60 * 1000);
        return (int) diferenciaAnios;
    }
    
    public boolean menorQue(Persona a, Date x){
        System.out.println("Ingrese una edad");
        int edad1= leer.nextInt();
        
        return calcularEdad(a, x) < edad1;
    }
    
    public void mostrarPersona(Persona a){
        System.out.println(a.toString());
    }
    
}
