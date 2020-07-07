
package Gestion_citas;


public class Receta {
    
    Paciente paciente;
    private String medicamento;
    
    public Receta(Paciente paciente, String medicamento){
        
        this.medicamento = medicamento;
        this.paciente = paciente;
        
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    @Override
    public String toString() {
        return "Receta{" + "paciente=" + paciente + ", medicamento=" + medicamento + '}';
    }
    
    
    
}
