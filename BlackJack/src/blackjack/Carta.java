
package blackjack;

/**
 * Esta clase se encarga de almacenar el palo y el numero de cada carta
 * @author david marquez minguez
 */
public class Carta {
    
    // Atributos
    
    private String palo ;
    
    private String numero ;
    
    /**
     * Constructor de la clase
     * @param numero
     * @param palo 
     */
    
    public Carta ( String numero , String palo ) {
        
        this.palo = palo ;
        
        this.numero = numero ;
        
    }
    
    // Metodos Get y Set

    public String getPalo() {
        
        return palo;
    
    }

    public String getNumero() {
        
        return numero;
    
    }

    public void setPalo(String palo) {
        
        this.palo = palo;
    
    }

    public void setNumero(String numero) {
        
        this.numero = numero;
    
    }
    
    /**
     * Metodo toString
     * @return numero + palo
     */

    @Override
    
    public String toString() {
        
        return numero + palo ;
    
    }
        
}
