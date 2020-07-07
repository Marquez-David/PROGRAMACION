package Hamate;

import java.util.ArrayList;

public class Jugador_maquina extends Jugador {

    //Atributos
    private String modo_juego;

    //Cnstructor
    public Jugador_maquina(String modo_juego, ArrayList mano, String color) {

        super(mano, color);
        this.modo_juego = modo_juego;

    }

    //Metodos get y Set
    public String getModo_juego() {
        return modo_juego;
    }

    public void setModo_juego(String modo_juego) {
        this.modo_juego = modo_juego;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "modo_juego=" + modo_juego;
    }

}
