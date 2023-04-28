package Servicio;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class FechaService {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

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

    public Date fechaActual() {
        return new Date();
    }
    
        public void mostrar(Date fecha) {

        System.out.println(fecha.getTime());
    }
        
    public int diferencia(Date d1, Date d2){
        long diferencia = d1.getTime()- d2.getTime();
        double diferenciaAnios = diferencia / (365.25 * 24 * 60 * 60 * 1000);
        return (int) diferenciaAnios;
    }    

//
//    public Calendar fechaDeNacimiento(Calendar fecha) {
//        int anio, mes, dia;
//        System.out.print("Ingrese el año de su nacimiento: ");
//        anio = leer.nextInt();
//        System.out.print("Ingrese el mes de su nacimiento: ");
//        mes = leer.nextInt()-1;
//        System.out.print("Ingrese el dia de su nacimiento: ");
//        dia = leer.nextInt();
//        return new GregorianCalendar(anio, mes, dia);
//    }
//
//    public Calendar fechaActual() {
//        return new GregorianCalendar();
//    }
//
//    public void mostrar(Calendar fecha) {
//
//        System.out.println(fecha.get(Calendar.DAY_OF_MONTH)+"/"+(fecha.get(Calendar.MONTH)+1)+"/"+fecha.get(Calendar.YEAR));
//        System.out.println(fecha.getTime());
//    }
//
//    public void diferencia(Calendar fecha1, Calendar fecha2) {
//        long diferencia = fecha1.getTimeInMillis() - fecha2.getTimeInMillis();
//        long dias = diferencia / (24 * 60 * 60 * 1000);
//        System.out.println("La diferencia entre las dos fechas es de " + dias + " dias.");
//        int edad = (int) dias / 365;
//        System.out.println("Su edad es de "+edad+" años.");
//    }
}
