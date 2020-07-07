package Gestion;

import java.time.LocalDate;

public class Contrato {

    //Atributos
    private LocalDate fecha_creacion;
    private Empresa empresa;
    private Empleado empleado;

    //Constructor
    public Contrato(LocalDate fecha_creacion, Empresa empresa, Empleado empleado) {

        this.fecha_creacion = LocalDate.now();
        this.empleado = empleado;
        this.empresa = empresa;

    }

    //Metodos get y set
    public LocalDate getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(LocalDate fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "Contrato{" + "fecha_creacion=" + fecha_creacion + ", empresa=" + empresa + ", empleado=" + empleado + '}';
    }



    
}
