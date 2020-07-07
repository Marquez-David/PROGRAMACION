
package blackjack;

import java.util.HashMap;

/**
 * Esta clase almacenara los datos de los jugadores registrados, gestion de puestas y saldos
 * @author david marquez minguez
 */

public class CasaApuestas {
    
    // Atributos - Objetos
    
    JugadorRegistrado jr  ; 
    
    HashMap < String , JugadorRegistrado> almacenDatos = new HashMap < String , JugadorRegistrado >() ; // HashMap( Key , Value)
    
    /**
     * Constructor de la clase
     * @param almacenDatos 
     */
    
    public CasaApuestas( HashMap almacenDatos ) {
        
        this.almacenDatos = almacenDatos ;
        
    }
    
    // Metodos 
    
    /**
     * Este mettodo simula dar de alta  un jugador
     * @param jr 
     */
    
    public void altaJugador( JugadorRegistrado jr ) {  
        
        if ( almacenDatos.containsKey(jr.getNif())) {  // Si el Jugador ya ha sido registrado
            
            // No introduce nada,puesto que ya esta registrado.
            
        }
        
        else { // Aun no ha sido registrado
            
            almacenDatos.put(jr.getNif() , jr) ;  // Introducimos el Jugador
            
        }
         
    }
    
    /**
     * Este metodo simula dar de baja a un jugador
     * @param NIF 
     */
    
    public void bajaJugador( String NIF ) {  
        
        if ( almacenDatos.containsKey(jr.getNif())) {
            
            if ( jr.getSaldoActual() > 0 ) {  // Si el saldo del jugador es positivo
                
                jr.retirarBeneficios() ; // Llamamos a la funcion
                
                almacenDatos.remove(NIF) ;  // Eliminamos al Jugador
            }
            
            else {  // El saldo del jugador = 0 
                
               almacenDatos.remove(NIF) ;  // Eliminamos al Jugador
                
            }
             
        }
           
    }
    
    // Metodos Get y Set 

    public HashMap<String, JugadorRegistrado> getAlmacenDatos() {
        
        return almacenDatos;
    
    }

    public void setAlmacenDatos(HashMap<String, JugadorRegistrado> almacenDatos) {
        
        this.almacenDatos = almacenDatos;
    
    }
    
    /**
     * Metodo toString
     * @return almacenDatos
     */

    @Override
    
    public String toString() {
        
        return "CasaApuestas{" + "almacenDatos=" + almacenDatos + '}';
    
    }

}
