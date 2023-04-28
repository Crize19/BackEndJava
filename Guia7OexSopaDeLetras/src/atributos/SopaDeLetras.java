/*

 */
package atributos;


public class SopaDeLetras {
    
    private char [][] matrix;
    
    private String encontrarPalabra;

    public SopaDeLetras() {
    }

    public SopaDeLetras(char[][] matrix, String encontrarPalabra) {
        this.matrix = matrix;
        this.encontrarPalabra = encontrarPalabra;
    }

    public char[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(char[][] matrix) {
        this.matrix = matrix;
    }

    public String getEncontrarPalabra() {
        return encontrarPalabra;
    }

    public void setEncontrarPalabra(String encontrarPalabra) {
        this.encontrarPalabra = encontrarPalabra;
    }

 

    
    
}
