/*

 */
package Servicios;

import Atributos.Fecha;
import java.util.Scanner;

public class FechaServicios {

    Scanner leer = new Scanner(System.in);

    public Fecha crearFecha() {

        Fecha f1 = new Fecha();

        System.out.println("Ingrese el año, entre 1900 y 2023");
        f1.setAño(leer.nextInt());
        if (f1.getAño() < 1900 || f1.getAño() > 2023) {
            f1.setAño(1900);
        }

        System.out.println("Ingrese numero para el mes");
        f1.setMes(leer.nextInt());
        while (f1.getMes() < 1 || f1.getMes() > 12) {
            System.out.println("Mes fue de rango, reingrese mes");
            f1.setMes(leer.nextInt());

        }

        return f1;
    }

    public boolean bisiestoFecha(Fecha f1) {
        if ((f1.getAño() % 4 == 0 && f1.getAño() % 100 != 0) || f1.getAño() % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void diasFecha(Fecha f1) {

        int dias = 0, diasA = 0;
        String mes = "";

        for (int i = 0; i < 4; i++) {

            switch (f1.getMes()) {
                case 1:
                    mes = "Enero";
                    dias = 31;
                    diasA = 31;
                    break;
                case 2:
                    mes = "Febrero";
                    if (bisiestoFecha(f1)) {
                        dias = 29;
                    } else {
                        dias = 28;
                    }
                    break;
                case 3:
                    mes = "Marzo";
                    dias = 31;
                    if (bisiestoFecha(f1)) {
                        diasA = 29;
                    } else {
                        diasA = 28;
                    }
                    break;
                case 4:
                    mes = "Abril";
                    dias = 30;
                    diasA = 31;
                    break;
                case 5:
                    mes = "Mayo";
                    dias = 31;
                    diasA = 30;
                    break;
                case 6:
                    mes = "Junio";
                    dias = 30;
                    diasA = 31;
                    break;
                case 7:
                    mes = "Julio";
                    dias = 31;
                    diasA = 30;
                    break;
                case 8:
                    mes = "Agosto";
                    dias = 31;
                    diasA = 31;
                    break;
                case 9:
                    mes = "Septiembre";
                    dias = 30;
                    diasA = 31;
                    break;
                case 10:
                    mes = "Octubre";
                    dias = 31;
                    diasA = 30;
                    break;
                case 11:
                    mes = "Noviembre";
                    dias = 30;
                    diasA = 31;
                    break;
                case 12:
                    mes = "Diciembre";
                    dias = 31;
                    diasA = 30;
                    break;

            }
            if (i == 0) {
                System.out.println("Usted ingreso mes " + f1.getMes() + " (" + mes + " )" + ", que tiene " + dias + " dias.");
                System.out.println("Ingrese el dia");
                f1.setDia(leer.nextInt());
                while (f1.getDia() < 1 || f1.getDia() > dias) {
                    System.out.println("Dia fuera de rango, reintroduzca");
                    f1.setDia(leer.nextInt());
                }
                System.out.println("Su fecha es " + f1.getDia() + " de " + mes + " de " + f1.getAño());

                if (f1.getDia() == 1 && f1.getMes() == 1) {
                    f1.setAño(f1.getAño() - 1);
                }
                if (f1.getDia() == 1 && f1.getMes() == 1) {
                    f1.setMes(12);
                } else if (f1.getDia() == 1) {
                    f1.setMes(f1.getMes() - 1);
                }

                if (f1.getDia() > 1) {
                    f1.setDia(f1.getDia() - 1);

                } else {
                    f1.setDia(diasA);
                }

            }

            if (i == 1 || i == 2) {
                if (i == 1) {
                    System.out.println("La fecha anterior seria: " + f1.getDia() + " de " + mes + " de " + f1.getAño());
                }

                if (f1.getDia() == dias && f1.getMes() == 12) {
                    f1.setAño(f1.getAño() + 1);
                }
                if (f1.getDia() == dias && f1.getMes() == 12) {
                    f1.setMes(1);
                } else if (f1.getDia() == dias) {
                    f1.setMes(f1.getMes() + 1);
                }

                if (f1.getDia() == dias) {
                    f1.setDia(1);
                } else {
                    f1.setDia(f1.getDia() + 1);
                }

            }

            if (i == 3) {
                System.out.println("La fecha posterior seria: " + f1.getDia() + " de " + mes + " de " + f1.getAño());

            }
        }
    }

    public void mostrarbiFecha(Fecha f1) {

        if (bisiestoFecha(f1)) {
            System.out.println("El año es bisiesto");

        } else {
            System.out.println("El año no es bisiesto");
        }

    }

}
