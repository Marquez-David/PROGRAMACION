package Gestion_citas;

public class Paciente {

    //Atributos
    private String nombre;
    private long num_tarj_sanitaria;

    //Constructor
    public Paciente(String nombre, long num_tarj_sanitaria) {

        this.nombre = nombre;
        this.num_tarj_sanitaria = num_tarj_sanitaria;

    }
    
    //Metodos get y set

    public String getNombre() {
        return nombre;
    }

    public long getNum_tarj_sanitaria() {
        return num_tarj_sanitaria;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNum_tarj_sanitaria(long num_tarj_sanitaria) {
        this.num_tarj_sanitaria = num_tarj_sanitaria;
    }
    
    //Metodo toString
    @Override
    public String toString() {
        return "Pacientes{" + "nombre=" + nombre + ", num_tarj_sanitaria=" + num_tarj_sanitaria + '}';
    }
    

}
