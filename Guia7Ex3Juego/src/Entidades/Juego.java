/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Crize
 */
public class Juego {
    
    private String jugador1;
    
    private String jugador2;
    
    private int intentosj1;
    
    private int intentosj2;
    
    private int victoriasj1;
    
    private int victoriasj2;
        
    private int intentos;

    public Juego() {
    }

    public Juego(String jugador1, String jugador2, int intentosj1, int intentosj2, int victoriasj1, int victoriasj2, int numadivinar, int intentos) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.intentosj1 = intentosj1;
        this.intentosj2 = intentosj2;
        this.victoriasj1 = victoriasj1;
        this.victoriasj2 = victoriasj2;
        this.intentos = intentos;
    }

   
    

    public String getJugador1() {
        return jugador1;
    }

    public String getJugador2() {
        return jugador2;
    }

    public int getIntentosj1() {
        return intentosj1;
    }

    public int getIntentosj2() {
        return intentosj2;
    }

    public int getVictoriasj1() {
        return victoriasj1;
    }

    public int getVictoriasj2() {
        return victoriasj2;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public void setJugador1(String jugador1) {
        this.jugador1 = jugador1;
    }

    public void setJugador2(String jugador2) {
        this.jugador2 = jugador2;
    }

    public void setIntentosj1(int intentosj1) {
        this.intentosj1 = intentosj1;
    }

    public void setIntentosj2(int intentosj2) {
        this.intentosj2 = intentosj2;
    }

    public void setVictoriasj1(int victoriasj1) {
        this.victoriasj1 = victoriasj1;
    }

    public void setVictoriasj2(int victoriasj2) {
        this.victoriasj2 = victoriasj2;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugador1=" + jugador1 + ", jugador2=" + jugador2 + ", intentosj1=" + intentosj1 + ", intentosj2=" + intentosj2 + ", victoriasj1=" + victoriasj1 + ", victoriasj2=" + victoriasj2 + ", intentos=" + intentos + '}';
    }

    
    

    

   
}
