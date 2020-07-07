package Hamate;

import java.util.ArrayList;

public class Baraja {

    //Atributos
    private ArrayList<Carta> baraja = new ArrayList<>(); //Compone todas las cartas
    
    private String rutas_imagenes[] = {};

    //Constructor
    public Baraja(ArrayList baraja) {

        this.baraja = baraja;

    }

    //Metodos get y set
    public ArrayList<Carta> getBaraja() {
        return baraja;
    }

    public void setBaraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "Baraja{" + "baraja=" + baraja + '}';
    }

}
