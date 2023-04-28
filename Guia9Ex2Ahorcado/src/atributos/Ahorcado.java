package atributos;
/*
Crear una clase Ahorcado (como el juego), la cual deberá contener como atributos,
un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad 
jugadas máximas que puede realizar el usuario
*/
public class Ahorcado{

   private String [] palabraABuscar;
    
   private  int cantidadDeLetrasEncontradas;
   
   private int intentosMaximos;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabraABuscar, int cantidadDeLetrasEncontradas, int intentosMaximos) {
        this.palabraABuscar = palabraABuscar;
        this.cantidadDeLetrasEncontradas = cantidadDeLetrasEncontradas;
        this.intentosMaximos = intentosMaximos;
    }

    public String[] getPalabraABuscar() {
        return palabraABuscar;
    }

    public void setPalabraABuscar(String[] palabraABuscar) {
        this.palabraABuscar = palabraABuscar;
    }

    public int getCantidadDeLetrasEncontradas() {
        return cantidadDeLetrasEncontradas;
    }

    public void setCantidadDeLetrasEncontradas(int cantidadDeLetrasEncontradas) {
        this.cantidadDeLetrasEncontradas = cantidadDeLetrasEncontradas;
    }

    public int getIntentosMaximos() {
        return intentosMaximos;
    }

    public void setIntentosMaximos(int intentosMaximos) {
        this.intentosMaximos = intentosMaximos;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabraABuscar=" + palabraABuscar + ", cantidadDeLetrasEncontradas=" + cantidadDeLetrasEncontradas + ", intentosMaximos=" + intentosMaximos + '}';
    }
   
   





}