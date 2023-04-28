/*

 */
package Atributos;


public class Triangulo {
    
    private int altura;
    
    private int base;

    public Triangulo(int altura, int base) {
        this.altura = altura;
        this.base = base;
    }

    public Triangulo() {
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "altura=" + altura + ", base=" + base + '}';
    }
    
    
    
}
