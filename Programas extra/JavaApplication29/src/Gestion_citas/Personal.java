package Gestion_citas;

import java.util.ArrayList;

public class Personal {

    //Atributos
    private String nombre;
    private String DNI;
    private String hora_comienzo;
    private String hora_fin_consulta;

    /*Como el enunciado habla sobre el numero de citas de medicos y enfermeros por separado, 
    he decidido hacer dos arrayList distintos.*/
    private ArrayList<Cita> citas_medicos = new ArrayList<>();
    private ArrayList<Cita> citas_enfermeros = new ArrayList<>();

    Paciente paciente;
    Cita cita;
    Personal_medico personal_medico;
    Personal_sanitario personal_sanitario;

    //Constructor
    public Personal(String nombre, String DNI, String hora_comienzo, String hora_fin_consulta) {

        this.nombre = nombre;
        this.DNI = DNI;
        this.hora_comienzo = hora_comienzo;
        this.hora_fin_consulta = hora_fin_consulta;

    }

    //Metodos para gestion de citas
    public boolean reservar_cita_medico(Cita cita) {

        if (citas_medicos.size() > 25) {

            return false;

        } else {

            citas_medicos.add(cita);

            return true;

        }

    }

    public void procesar_consulta_medico(Cita cita) {

        citas_medicos.remove(cita);

    }

    public boolean reservar_cita_enfermeros(Cita cita) {

        if (citas_enfermeros.size() > 40) {

            return false;

        } else {

            citas_enfermeros.add(cita);

            return true;

        }

    }

    public void procesar_consulta_enfermeros(Cita cita) {

        citas_enfermeros.remove(cita);

    }

    //Metodos get y set
    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public String getHora_comienzo() {
        return hora_comienzo;
    }

    public String getHora_fin_consulta() {
        return hora_fin_consulta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setHora_comienzo(String hora_comienzo) {
        this.hora_comienzo = hora_comienzo;
    }

    public void setHora_fin_consulta(String hora_fin_consulta) {
        this.hora_fin_consulta = hora_fin_consulta;
    }

    public ArrayList<Cita> getCitas_medicos() {
        return citas_medicos;
    }

    public ArrayList<Cita> getCitas_enfermeros() {
        return citas_enfermeros;
    }

    public void setCitas_medicos(ArrayList<Cita> citas_medicos) {
        this.citas_medicos = citas_medicos;
    }

    public void setCitas_enfermeros(ArrayList<Cita> citas_enfermeros) {
        this.citas_enfermeros = citas_enfermeros;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "Personal{" + "nombre=" + nombre + ", DNI=" + DNI + ", hora_comienzo=" + hora_comienzo + ", hora_fin_consulta=" + hora_fin_consulta + '}';
    }

}
