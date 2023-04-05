/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego, crea un método "retirar_dinero"
que permita retirar una cantidad de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo 
después de realizar una transacción de retiro.

 */
package guia7ex4cuenta;

import Entidad.Cuenta;
import Servicios.CuentaServicios;


public class Guia7Ex4Cuenta {

    
    public static void main(String[] args) {
        
        CuentaServicios cs = new CuentaServicios();
        
        Cuenta c1 = cs.crearCuenta();
        
        cs.retirarCuenta(c1);
        
        cs.mostrarCuenta(c1);
    }
    
}
