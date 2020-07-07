
package Gestion_citas;


public class Cita {
    
    //Atributos
    Paciente paciente;
    Personal personal;
    private String hora_cita;
    
    //Constructor
    public Cita(Paciente paciente, Personal personal, String hora_cita){
        
        this.paciente = paciente;
        this.personal = personal;
        this.hora_cita = hora_cita;

    }
    
    //Metodos get y set

    public Paciente getPaciente() {
        return paciente;
    }

    public Personal getPersonal() {
        return personal;
    }

    public String getHora_cita() {
        return hora_cita;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public void setHora_cita(String hora_cita) {
        this.hora_cita = hora_cita;
    }
    
    //Metodo toString

    @Override
    public String toString() {
        return "Cita{" + "paciente=" + paciente + ", personal=" + personal + ", hora_cita=" + hora_cita + '}';
    }
    
    
    
    
}
