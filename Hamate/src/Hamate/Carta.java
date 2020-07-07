package Hamate;

public class Carta {

    //Atributos
    private String ruta_imagen; //Direccion de almacenamiento de la imgen de la carta
    private int valor_izquierdo; //Valor entre 1 y 7
    private int valor_derecho; //Valor entre 1 y 7
    private String color; //Azul o Rojo

    //Constructor
    public Carta(String ruta_imagen, int valr_derecha, int valor_izquierda, String color) {

        this.color = color;
        this.ruta_imagen = ruta_imagen;
        this.valor_derecho = valor_derecho;
        this.valor_izquierdo = valor_izquierdo;

    }

    //Metodos get y set
    public String getRuta_imagen() {
        return ruta_imagen;
    }

    public int getValor_izquierdo() {
        return valor_izquierdo;
    }

    public int getValor_derecho() {
        return valor_derecho;
    }

    public String getColor() {
        return color;
    }

    public void setRuta_imagen(String ruta_imagen) {
        this.ruta_imagen = ruta_imagen;
    }

    public void setValor_izquierdo(int valor_izquierdo) {
        this.valor_izquierdo = valor_izquierdo;
    }

    public void setValor_derecho(int valor_derecho) {
        this.valor_derecho = valor_derecho;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //Metodo toString 
    @Override
    public String toString() {

        return "ruta_imagen=" + ruta_imagen + ", valor_izquierdo=" + valor_izquierdo + ", valor_derecho=" + valor_derecho + ", color=" + color;
    }

}
