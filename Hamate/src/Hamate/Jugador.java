package Hamate;

import java.util.ArrayList;

public class Jugador {

    //Atributos
    private ArrayList<Carta> mano = new ArrayList<>();
    private String color; //Rojo - Azul

    //Constructor
    public Jugador(ArrayList mano, String color) {

        this.color = color;
        this.mano = mano;

    }

    //Metodos get y set
    public ArrayList<Carta> getMano() {
        return mano;
    }

    public String getColor() {
        return color;
    }

    public void setMano(ArrayList<Carta> mano) {
        this.mano = mano;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "mano=" + mano + ", color=" + color;
    }

}
