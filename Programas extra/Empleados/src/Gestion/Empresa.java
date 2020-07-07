
package Gestion;

import java.util.ArrayList;


public class Empresa {
    
    //Atributos
    private String nombre;
    private String cif;
    private ArrayList<Departamento> departamentos;
    private Direccion direccion;
    
    //Constructor
    public Empresa(String nombre, String cif){
        
        this.cif = cif;
        this.nombre = nombre;
        
    }

    //Metodos get y set
    public String getNombre() {
        return nombre;
    }

    public String getCif() {
        return cif;
    }

    public ArrayList<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public void setDepartamentos(ArrayList<Departamento> departamentos) {
        this.departamentos = departamentos;
    }
    
    //Metodo toString
    @Override
    public String toString() {
        
        return nombre + cif + departamentos;
        
    }
    
    
}
