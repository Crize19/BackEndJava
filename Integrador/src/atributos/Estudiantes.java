package atributos;

public class Estudiantes{

private String nombre;

private double nota;

    public Estudiantes() {
    }

    public Estudiantes(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Estudiantes{" + "nombre=" + nombre + ", nota=" + nota + '}';
    }





}