package taller;

import java.util.ArrayList;

public class Vehiculo {

    //Atributos
    private String matricula;
    private String marca;
    private String modelo;
    //Array que contendra el objeto pieza
    private ArrayList<Pieza> piezas_reparadas = new ArrayList<>();

    //Constructor
    public Vehiculo(String matricula, String marca, String modelo) {

        this.marca = marca;
        this.matricula = matricula;
        this.modelo = modelo;

    }

    //Metodos get
    public ArrayList<Pieza> getPiezas_reparadas() {
        return piezas_reparadas;
    }

    //Metodos set
    public void setPiezas_reparadas(ArrayList<Pieza> piezas_reparadas) {
        this.piezas_reparadas = piezas_reparadas;
    }

    //Metodo toString

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", piezas_reparadas=" + piezas_reparadas + '}';
    }


}
