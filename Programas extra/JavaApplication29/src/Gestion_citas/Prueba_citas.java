
package Gestion_citas;


public class Prueba_citas {


    public static void main(String[] args) {
        
        Personal P1 = new Personal("David","47319570Z","17:45","18:30");
        Personal P2 = new Personal("Juan","78590356C","18:55","19:00");
        
        Paciente Pa1 = new Paciente("Adrian",123456758);
        Paciente Pa2 = new Paciente("Pepe", 123456789);
        
        Cita C1 = new Cita(Pa1,P1,"17:00");
        Cita C2 = new Cita(Pa2,P2,"15:35");
        
        Receta R1 = new Receta(Pa1,"Medicamento");
        
        
        // Gestion de los medicos
        
        //System.out.println(C1.toString());
        //P1.reservar_cita_medico(C2);
        //System.out.println(P1.getCitas_medicos());
        //P1.procesar_consulta_medico(C2);
        //System.out.println(P1.getCitas_medicos());
        
        //Gestion de los Enfermeros
        
        
        //System.out.println(C2.toString());
        P2.reservar_cita_enfermeros(C2);
        System.out.println(P2.getCitas_enfermeros());
        P2.procesar_consulta_enfermeros(C2);
        System.out.println(P2.getCitas_enfermeros());
        
        
        
        
        
        
        
        
        
    }
    
}
