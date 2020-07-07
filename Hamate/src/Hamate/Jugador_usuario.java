package Hamate;

import java.time.LocalDate;
import java.util.ArrayList;

public class Jugador_usuario extends Jugador {

    //Atributos
    private String nombre;
    private String apellidos;
    private String NIF;
    private LocalDate fecha_nacimiento;

    /* El enunciado separa en dos puntos distintos nombre, de apellidos, 
       por eso lo pongo como dos atributsdiferentes*/
    
    //Constructor
    public Jugador_usuario(String nombre, String apellidos, ArrayList mano, 
                           String color, String NIF, LocalDate fech_ncimiento) {

        super(mano, color);
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.NIF = NIF;
        this.fecha_nacimiento = fecha_nacimiento;

    }

    //Metodos get y set
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNIF() {
        return NIF;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
   

    //Metodo toString
    @Override
    public String toString() {
        return "nombre=" + nombre + ", apellidos=" + apellidos  + "NIF=" + NIF + "fecha_nacimiento=" + fecha_nacimiento;
    }

}
