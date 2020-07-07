package taller;

public class Pieza {

    //Atributos
    private String nombre;
    private double precio;
    private int horas_reparacion;

    //Constructor
    public Pieza(String nombre, double precio,int horas_reparacion) {

        this.nombre = nombre;
        this.precio = precio;
        this.horas_reparacion = horas_reparacion;

    }
   

    //Metodos get
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getHoras_reparacion() {
        return horas_reparacion;
    }

    //Metodos set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setHoras_reparacion(int horas_reparacion) {
        this.horas_reparacion = horas_reparacion;
    }

    //Metodo toString

    @Override
    public String toString() {
        return "Pieza{" + "nombre=" + nombre + ", precio=" + precio + ", horas_reparacion=" + horas_reparacion + '}';
    }
    

}
