
package entidad;

import java.util.Comparator;


public class Pelicula {
    
    private String titulo;
    private String director;
    private Double hora;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Double hora) {
        this.titulo = titulo;
        this.director = director;
        this.hora = hora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Double getHora() {
        return hora;
    }

    public void setHora(Double hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", hora=" + hora + '}';
    }
    
    public static Comparator<Pelicula> compararDuracionMayor = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getHora().compareTo(p2.getHora());
        }
    
    };
            
    public static Comparator<Pelicula> compararDuracionMenor= new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p2.getHora().compareTo(p1.getHora());
        }
    
    };
            
    public static Comparator<Pelicula> compararTitulo= new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getTitulo().compareTo(p2.getTitulo());
        }
    
    };
            
    public static Comparator<Pelicula> compararDirector= new Comparator<Pelicula>(){
        @Override
       public int compare(Pelicula p1, Pelicula p2) {
            return p1.getDirector().compareTo(p2.getDirector());
        }
    
    };
    

}
