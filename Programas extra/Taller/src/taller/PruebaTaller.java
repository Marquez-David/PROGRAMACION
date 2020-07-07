
package taller;


public class PruebaTaller {


    public static void main(String[] args) {
        
        Pieza P1 = new Pieza("Rueda",50.00,3);
        Pieza P2 = new Pieza("Volante",15.35,1);
        Pieza P3 = new Pieza("Frenos",35.98,5);
        
        Vehiculo V1 = new Vehiculo("ASDF-3","Seat","Ibiza");
        
        V1.getPiezas_reparadas().add(P1);
        V1.getPiezas_reparadas().add(P2);
        V1.getPiezas_reparadas().add(P3);
        
        Taller T1 = new Taller("Taller 1","91654892",12.35,5,V1);
        
        System.out.println(T1.getPrecio_total());
        
        
       
        
        
        
    }
   
    
}
