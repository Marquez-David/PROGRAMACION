package Gestion_citas;

import java.util.ArrayList;

public class Personal_sanitario extends Personal {

    //Atributos
    private String especialidad;
    //private ArrayList<Cita> citas_enfermeros1 = new ArrayList<>();
    Receta receta;

    //Constructor
    public Personal_sanitario(String nombre, String DNI, String hora_comienzo, String hora_fin_consulta, String especialidad) {

        super(nombre, DNI, hora_comienzo, hora_fin_consulta);
        
    }
     
    /*
    public boolean reservar_cita(Cita cita) {

        if (citas_enfermeros1.size() > 40) {

            return false;

        } else {
            
            citas_enfermeros1.add(cita);

            return true;

        }

    }
    
    public void procesar_consulta(Cita cita){
        
        citas_enfermeros1.remove(cita);
        
    }
    
    
    public Receta expedir_cita(Receta receta){
        
        return receta;
        
    }
*/
    
    //Metodos get y set

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
 
    
    
    //Metodo toString

    @Override
    public String toString() {
        return "Personal_sanitario{" + "especialidad=" + especialidad + '}';
    }
    
}
