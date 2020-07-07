package Gestion;

public class Persona {

    //Atributos
    private String dni;
    private String nombre;
    private int edad;
    private String estado;

    //Constructor
    public Persona(String dni, String nombre, int edad, String estado) {

        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;

    }

    //Metodos get y set
    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getEstado() {
        return estado;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    //Metodo toString
    @Override

    public String toString() {

        return dni + nombre + edad + estado;

    }

}
