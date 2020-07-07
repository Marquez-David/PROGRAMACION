package Hamate;

public class Jugador_exception extends Exception {

    public static final String NIF_INCORRECTO = "El NIF proporcionado es incorrecto.";

    public static final String EDAD_INCORRECTA = "El jugador debe ser mayor de edad para poder jugar";

    public static final String CARTA_NO_SELECCIONADA = "No se ha seleccionado ninguna carta para jugar.";

    public static final String RETO_INCORRECTO = "No se ha seleccionado la dirección del reto";

    //Constructores
    public Jugador_exception() {
        
        super("Se ha producido una excepcion en la aplicacion. ");
        
    }
    
    public Jugador_exception(String txt) {
        
        super(txt);
        
    }

}
