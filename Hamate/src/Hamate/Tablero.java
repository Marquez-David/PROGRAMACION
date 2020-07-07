package Hamate;

import java.util.ArrayList;

public class Tablero {

    //Atributos
    private ArrayList<Carta> tablero = new ArrayList<>();

    //Constructor
    public Tablero(ArrayList tablero) {

        this.tablero = tablero;

    }

    //Metodos get y set
    public ArrayList<Carta> getTablero() {
        return tablero;
    }

    public void setTablero(ArrayList<Carta> tablero) {
        this.tablero = tablero;
    }

    //Metodo toString
    @Override
    public String toString() {

        return "tablero=" + tablero;

    }

}
