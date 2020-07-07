package Gestion;

import java.util.ArrayList;

public class Departamento {
    
    //Atributos
    private String nombre;
    private int id;
    private String localizacion;
    private String empresa;
    private ArrayList<Empleado> empleados;

    //Constructor
    public Departamento(String nombre, int id, String localizacion, String empresa) {

        this.empresa = empresa;
        this.id = id;
        this.localizacion = localizacion;
        this.nombre = nombre;

    }

    // Metodos get y set
    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    //Metodo toString
    @Override
    public String toString() {

        return nombre + id + localizacion + empresa;

    }

}
