package taller;

import java.util.ArrayList;

public class Taller {

    //Atributos
    private String nombre;
    private String telefono;
    private double precio_por_hora;
    private double precio_total;
    Vehiculo V1;

    //Constructor
    public Taller(String nombre, String telefono, double precio_por_hora, int horas_reparacion, Vehiculo v1) {

        this.nombre = nombre;
        this.precio_por_hora = precio_por_hora;
        this.telefono = telefono;
        this.precio_total = precio_total;
        this.V1 = v1;

        reparar_vehiculo();

    }

    //Reparar Vehiculo
    public void reparar_vehiculo() {

        precio_total = 0;

        for (int i = 0; i < V1.getPiezas_reparadas().size(); i++) {

            precio_total += V1.getPiezas_reparadas().get(i).getPrecio()
                    * V1.getPiezas_reparadas().get(i).getHoras_reparacion() * precio_por_hora;

        }

    }

    //Metodos get
    public double getPrecio_por_hora() {
        return precio_por_hora;
    }

    public double getPrecio_total() {
        return precio_total;
    }

    //Metodos set
    public void setPrecio_por_hora(double precio_por_hora) {
        this.precio_por_hora = precio_por_hora;
    }

    public void setPrecio_total(double precio_total) {
        this.precio_total = precio_total;
    }

    //Metodo toString

    @Override
    public String toString() {
        return "Taller{" + "nombre=" + nombre + ", telefono=" + telefono + ", precio_por_hora=" + precio_por_hora + ", precio_total=" + precio_total + ", V1=" + V1 + '}';
    }
    

}
