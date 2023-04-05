/*

 */
package Entidad;


public class Cuenta {
    
    private double saldo;
    private String titular;

    public Cuenta() {
    }

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "saldo=" + saldo + ", titular=" + titular + '}';
    }
    
    
    
}
