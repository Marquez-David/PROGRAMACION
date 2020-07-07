package Gestion_citas;

import java.util.ArrayList;

public class Personal_medico extends Personal {

    //Atributos
    private int numero_colegiado;
    //private ArrayList<Cita> citas_medicos = new ArrayList<>();

    //Constructor
    public Personal_medico(String nombre, String DNI, String hora_comienzo, String hora_fin_consulta, int numero_colegiado) {

        super(nombre, DNI, hora_comienzo, hora_fin_consulta);
        this.numero_colegiado = numero_colegiado;

    }

    /*
    
    Habia pensado tambien en hacer esta forma, Mediante un metodo que dependiente de a que clase llames en el  main,
    precesa el de los medicos o el de los enfermeros. Podria ser una posiible mejora.
    
    public boolean reservar_cita(Cita cita) {

        if (citas_medicos.size() > 25) {

            return false;

        } else {
            
            citas_medicos.add(cita);

            return true;

        }

    }
    
    public void procesar_consulta(Cita cita){
        
        citas_medicos.remove(cita);
        
    }
*/

    //Metodos get y set
    public int getNumero_colegiado() {
        return numero_colegiado;
    }

    public void setNumero_colegiado(int numero_colegiado) {
        this.numero_colegiado = numero_colegiado;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "Personal_medico{" + "numero_colegiado=" + numero_colegiado + '}';
    }

}
