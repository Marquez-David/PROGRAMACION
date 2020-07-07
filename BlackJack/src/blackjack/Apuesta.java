
package blackjack;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Esta clase almacena el jugador, la mano y elmetodo verPremio
 * @author David Marquez Minguez
 */
public class Apuesta {
    
    // Atributos - Objetos
    
    int ContadorCrupier = 0 ; // Calcula el valor de la mano del crupier
    
    int ContadorJugador = 0 ; // Calcula el valor de la mano del jugador
    
    private ArrayList<String> almacenEstadisticas = new ArrayList<>() ;
    
    private Baraja mano ;
    
    private int apuesta  ;  // El dinero que apuesta
    
    private JugadorRegistrado jr ;
    
    private String premio ;  // Que tipo de premio le ha tocado
    
   /**
    * Constructor donde llmamos a metodos(verPremioJugador, verPremioCrupier)
    * @param mano
    * @param ContadorJugador
    * @param ContadorCrupier 
    */
    
    public Apuesta( Baraja mano, int ContadorJugador, int ContadorCrupier, int apuesta) {
        
        this.mano = mano ;
        
        this.apuesta = apuesta ;
        
        verPremioJugador() ;
        
        verPremioCrupier() ;
        
        verPremioTotal() ;
          
    }
    
    // Metodos
    
    /**
     * Metodo que comprueba el premio del jugador
     */
    
    public void verPremioJugador() { 
        
       // Contadores del Jugador 
        
        int ContadorAs = 0 ;
        int ContadorDos = 0 ;
        int ContadorTres = 0 ;
        int ContadorCuatro = 0 ;
        int ContadorCinco = 0 ;
        int ContadorSeis = 0 ;
        int ContadorSiete = 0 ;
        int ContadorOcho = 0 ;
        int ContadorNueve = 0 ;
        int ContadorSota = 0 ;
        int ContadorCaballo = 0 ;
        int ContadorRey = 0 ;   
        
        for (int i = 0; i < mano.getManoJugador().size(); i++) { // Recorremos la mano
            
            if("As de ".equals(mano.getManoJugador().get(i).getNumero())) {
                
                ContadorAs = ( ContadorAs + 1 ) * 1 ;  // Estamos calculando el valor de la mano del jugador
                
            } 
            
            else if ("Dos de ".equals(mano.getManoJugador().get(i).getNumero())) {
                
                ContadorDos = ( ContadorDos + 1 ) * 2 ;  // Si el jugador obtiene 2 multiplicamos las veces que ha obtenido dicha carta, por el valor de la misma.
                                                        
            }
            
            else if ("Tres de ".equals(mano.getManoJugador().get(i).getNumero())) {
                
                ContadorTres = ( ContadorTres + 1 ) * 3 ;
                
            }
            
            else if ("Cuatro de ".equals(mano.getManoJugador().get(i).getNumero())) {
                
                ContadorCuatro = ( ContadorCuatro + 1 ) * 4 ;
                
            }
            
            else if ("Cinco de ".equals(mano.getManoJugador().get(i).getNumero())) {
                
                ContadorCinco = ( ContadorCinco + 1 ) * 5 ;
                
            }
            
            else if("Seis de ".equals(mano.getManoJugador().get(i).getNumero())) {
                
                ContadorSeis = ( ContadorSeis + 1 ) * 6 ;
                
            }
            
            else if("Siete de ".equals(mano.getManoJugador().get(i).getNumero())) {
                
                ContadorSiete = ( ContadorSiete + 1 ) * 7 ;
                
            }
            
            else if("Ocho de ".equals(mano.getManoJugador().get(i).getNumero())) {
                
                ContadorOcho = ( ContadorOcho + 1 ) * 8 ;
                
            }
            
            else if("Nueve de ".equals(mano.getManoJugador().get(i).getNumero())) {
                
                ContadorNueve = ( ContadorNueve + 1 ) * 9 ;
             
            }
            
            else if("Sota de ".equals(mano.getManoJugador().get(i).getNumero())) {
                
                ContadorSota = ( ContadorSota + 1 ) * 10 ;
                
            }
            
            else if("Caballo de ".equals(mano.getManoJugador().get(i).getNumero())){
                
                ContadorCaballo = ( ContadorCaballo + 1 ) * 11 ;
                
            }
            
            else if ("Rey de ".equals(mano.getManoJugador().get(i).getNumero())) {
                
                ContadorRey = ( ContadorRey + 1 ) * 12 ;
            }
  
        }
        
        ContadorJugador = ContadorAs + ContadorDos + ContadorTres + ContadorCuatro + ContadorCinco + ContadorSeis + 
                          ContadorSiete + ContadorOcho + ContadorNueve + ContadorSota + ContadorCaballo + ContadorRey ;
    }
        
    /**
     * Metodo que comprueba el premio del crupier
     */
    
    public void verPremioCrupier() {
        
        // Contadores Crupier
        
        int ContAs = 0 ;
        int ContDos = 0 ;
        int ContTres = 0 ;
        int ContCuatro = 0 ;
        int ContCinco = 0 ;
        int ContSeis = 0 ;
        int ContSiete = 0 ;
        int ContOcho = 0 ;
        int ContNueve = 0 ;
        int ContSota = 0 ;
        int ContCaballo = 0 ;
        int ContRey = 0 ;
        
        for (int i = 0; i < mano.getManoCrupier().size(); i++) {  // Recorremos la mano del crupier
            
            if("As de ".equals(mano.getManoCrupier().get(i).getNumero())) {
                
                ContAs = ( ContAs + 1 ) * 1 ;  // Estamos calculando el valor de la mano del jugador
                
            }
            
            if("As de ".equals(mano.getManoCrupier().get(i).getNumero())) {
                
                ContAs = ( ContAs + 1 ) * 11 ;  // El usuario podra elegir con el valor del 1
                
            }
            
            else if ("Dos de ".equals(mano.getManoCrupier().get(i).getNumero())) {
                
                ContDos = ( ContDos + 1 ) * 2 ;  // Si el jugador obtiene 2 multiplicamos las veces que ha obtenido dicha carta, por el valor de la misma.
                    
            }
                
            else if ("Tres de ".equals(mano.getManoJugador().get(i).getNumero())) {
                
                ContTres = ( ContTres + 1 ) * 3 ;
                
            }
            
            else if ("Cuatro de ".equals(mano.getManoCrupier().get(i).getNumero())) {
                
                ContCuatro = ( ContCuatro + 1 ) * 4 ;
                
            }
            
            else if ("Cinco de ".equals(mano.getManoCrupier().get(i).getNumero())) {
                
                ContCinco = ( ContCinco + 1 ) * 5 ;
                
            }
            
            else if("Seis de ".equals(mano.getManoCrupier().get(i).getNumero())) {
                
                ContSeis = ( ContSeis + 1 ) * 6 ;
                
            }
            
            else if("Siete de ".equals(mano.getManoCrupier().get(i).getNumero())) {
                
                ContSiete = ( ContSiete + 1 ) * 7 ;
                
            }
            
            else if("Ocho de ".equals(mano.getManoCrupier().get(i).getNumero())) {
                
                ContOcho = ( ContOcho + 1 ) * 8 ;
                
            }
            
            else if("Nueve de ".equals(mano.getManoCrupier().get(i).getNumero())) {
                
                ContNueve = ( ContNueve + 1 ) * 9 ;
             
            }
            
            else if("Sota de ".equals(mano.getManoCrupier().get(i).getNumero())) {
                
                ContSota = ( ContSota + 1 ) * 10 ;
                
            }
            
            else if("Caballo de ".equals(mano.getManoCrupier().get(i).getNumero())){
                
                ContCaballo = ( ContCaballo + 1 ) * 10 ;
                
            }
            
            else if ("Rey de ".equals(mano.getManoCrupier().get(i).getNumero())) {
                
                ContRey = ( ContRey + 1 ) * 10 ;
            }
            
            ContadorCrupier = ContAs + ContDos + ContTres + ContCuatro + ContCinco + ContSeis + ContSiete + ContOcho
                    + ContNueve + ContSota + ContCaballo + ContRey;
            
        }
        
        
    }
    
    /**
     * Calcula el premio del jugador y cuanto gana
     * @return String
     */
    
    public String verPremioTotal() {
        
        //  Empate
            
            if ( ContadorCrupier == ContadorJugador ) {  
                
                jr.setSaldoActual(jr.getSaldoActual() + apuesta) ; // Recupera el dinero apostado

                premio = " EMPATE " ;  // Tipo de premio que obtiene
                
                almacenEstadisticas.add( premio ) ;  // Añadimos el tipo de premio a las estadisticas
               
            }
            
        // Superior
            
            else if ( (ContadorJugador > ContadorCrupier) && (ContadorJugador < 21) ) {  
                
                jr.setSaldoActual(jr.getSaldoActual() + apuesta*2) ; // Multiplicamos la apuesta por 2
                
                premio = " SUPERIOR " ;  
                
                almacenEstadisticas.add( premio ) ;
            
            }
            
        // BlackJack
            
            if( mano.getManoJugador().contains("As de ") && (mano.getManoJugador().contains("Sota de ") 
             || mano.getManoJugador().contains("Caballo de ") || mano.getManoJugador().contains("Rey de "))){
                
                jr.setSaldoActual(jr.getSaldoActual() + apuesta*4) ;  // Multiplicamos la apuesta por 4
                
                premio = " BLACKJACK " ;
                
                almacenEstadisticas.add( premio ) ;
                
            }
              
        // Pierde 
            
            else {
                
                jr.setSaldoActual(jr.getSaldoActual() - apuesta) ;  // Pierde lo apostado
                
                premio = " DERROTA " ;
                
                almacenEstadisticas.add( premio ) ;
                
            }
            
            return premio ;
        
    }
    
    /**
     * Metodo que se encarga de contabilizar cuantas veces toca un tipo de premio
     * @return Los distinbtos contadores
     */
    
    public String cuantasVeces() {
        
        int contadorEmpate = 0 ;
        int contadorSuperior = 0 ;
        int contadorBlackjack = 0 ;
        int contadorDerrota = 0 ;
        
        for ( int i = 0; i < almacenEstadisticas.size();i++) { // Recorrmos el Array de estadisticas
            
            if((" EMPATE ".equals(almacenEstadisticas.get(i)))) {
                
                contadorEmpate += 1 ;
                
            }
            
            else if((" SUPERIOR ".equals(almacenEstadisticas.get(i)))) {
                
                contadorSuperior += 1 ;
                
            }
            
            else if((" BLACKJACK ".equals(almacenEstadisticas.get(i)))){
                
                contadorBlackjack += 1 ;
                
            }
            
            else if((" DERROTA ".equals(almacenEstadisticas.get(i)))){
                
                contadorDerrota += 1 ;
                
            }
       
        }
        
        return "Empates: " + contadorEmpate + "Superior: " + contadorSuperior + "BlackJack: " + contadorBlackjack + "Derrota: " + contadorDerrota;
        
    }
    
    /**
     * Metodo ue calcula el suplemento que se lleva el jugador por año registrado
     */
    
    public void SuplementoSaldo() {
        
        Calendar fechaActual = new GregorianCalendar() ;
        
         int año = fechaActual.get(Calendar.YEAR) ;  // Obtenemos el año actual del sistema
         
         int resto = año - jr.getFechaRegistro() ;  // Calculamos la diferencia entre el año de registro y el año actual
         
         jr.setSaldoActual( jr.getSaldoActual() + jr.getSaldoActual() * ( 2 * resto)/100) ; // Multiplicamos el saldo por 0.2 por cada año
             
    }
    
    // Metodos Get y Set

    public int getApuesta() {
        
        return apuesta;
    
    }

    public String getPremio() {
       
        return premio;
    
    }

    public void setApuesta(int apuesta) {
        
        this.apuesta = apuesta;
    
    }

    public void setPremio(String premio) {
        
        this.premio = premio;
    
    }

    public int getContadorCrupier() {
        
        return ContadorCrupier;
    
    }

    public int getContadorJugador() {
        
        return ContadorJugador;
    
    }

    public void setContadorCrupier(int ContadorCrupier) {
        
        this.ContadorCrupier = ContadorCrupier;
    
    }

    public void setContadorJugador(int ContadorJugador) {
        
        this.ContadorJugador = ContadorJugador;
    
    }
    
    /**
     * Metodo toString
     * @return apuesta premio
    */
    
    @Override
    
    public String toString() {
        
        return  apuesta + premio ;
        
    }
 
}
