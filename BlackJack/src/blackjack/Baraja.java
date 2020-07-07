
package blackjack;

import java.util.ArrayList ;
import java.util.Random;
/**
 * Clase que se encarga de crear la mano y la baraja
 * @author david marquez minguez
 */
public class Baraja {
    
    // Atributos - Objetos
    
    private String arrayPalos[] = {"Oros", "Bastos", "Espadas", "Copas" } ;
    
    private String arrayNumeros[] = {"As de ", "Dos de ", "Tres de ", "Cuatro de ", "Cinco de ", "Seis de ", "Siete de ", "Ocho de ", "Nueve de ", "Sota de ", "Caballo de ", "Rey de "} ;
    
    private ArrayList<Carta> baraja = new ArrayList<>() ;  // ArrayList porque va a cambiar de tamaño
    
    private ArrayList<Carta> manoJugador = new ArrayList<>() ;  // Representa lamano del Jugador
    
    private ArrayList<Carta> manoCrupier = new ArrayList<>() ;  // Representa la mano del Crupier
    
    /**
     * Constructor donde llamamos a metodos(cearBaraja, crearMano)
     */
    
    public Baraja () {
        
        crearBaraja() ;  // Llamamos al metodo en el constructor
        
        crearMano() ;  // Llamamos al metodo en el constructor
        
    }
    
    /**
     * Este metodo crea una baraja a partir del objeto carta
     */
    
    public void crearBaraja() {
        
        for ( int i = 0; i < 12; i++ ) {  // Recorremos los numeros
            
            for ( int j = 0; j < 4; j++ ) {  // Recorremos las figuras
                
                Carta carta = new Carta( arrayNumeros[i], arrayPalos[j]) ;  // El objeto carta representa cada carta de la baraja
                
                baraja.add(carta) ;  // Añadimos el objeto a la baraja
                
            }
        }
        
    }
    
    /**
     * Este metodo crea una mano de dos cartas a partir le la baraja, crea la mano del ugador y crupier
     */
    
    public void crearMano() {  
        
        Random rand = new Random() ;
        
        for ( int i = 0; i < 2; i++ ) {  //  El crupier reparte 2 cartas 
            
            int numeroRandom = rand.nextInt(baraja.size()) ;  //  Escojemos un numero aleatorio entre 0-47 las posiciones del array de baraja
        
            int numeroRandom2 = rand.nextInt(baraja.size()) ; // Numero random del crupier
        
            manoJugador.add(baraja.get(numeroRandom)) ;  // Introducimos la carta e la mano
        
            baraja.remove(numeroRandom) ;  // Elminamos la carta de la baraja como indica el enunciado
        
            manoCrupier.add(baraja.get(numeroRandom2)) ; //  Creamos la mano del Crupier
        
            baraja.remove(numeroRandom2) ;  // Eliminamos las cartas de la baraja
        
        } 
   
    }
    
    /**
     * Este metodo da una carta aletoria y la añade a la mano
     */
    
    public void darCarta() {  // Simulara dar a una carta al jugador
        
        Random rand = new Random() ;
        
        int numeroRandom = rand.nextInt(baraja.size()) ;  // Selecionamos un numero aleatorio entre las posiciones de la baraja
        
        manoJugador.add(baraja.get(numeroRandom)) ;  // Introducimos la carta en la mano
        
        baraja.remove(numeroRandom) ;  // La eliminamos de la baraja
        
        manoCrupier.add(baraja.get(numeroRandom)) ; //  Creamos la mano del Crupier
        
        baraja.remove(numeroRandom) ;  // Eliminamos las cartas de la baraja
        
        
    }

    // Metodos Get y Set
    
    public String[] getArrayPalos() {
        
        return arrayPalos;
    
    }

    public String[] getArrayNumeros() {
        
        return arrayNumeros;
    
    }

    public ArrayList<Carta> getBaraja() {
        
        return baraja;
    
    }

    public ArrayList<Carta> getMano() {
        
        return manoJugador;
    
    }

    public void setArrayPalos(String[] arrayPalos) {
        
        this.arrayPalos = arrayPalos;
    
    }

    public void setArrayNumeros(String[] arrayNumeros) {
        
        this.arrayNumeros = arrayNumeros;
    
    }

    public void setBaraja(ArrayList<Carta> baraja) {
        
        this.baraja = baraja;
    
    }

    public void setMano(ArrayList<Carta> mano) {
        
        this.manoJugador = mano;
    
    }

    public ArrayList<Carta> getManoJugador() {
        
        return manoJugador;
    
    }

    public ArrayList<Carta> getManoCrupier() {
        
        return manoCrupier;
    
    }
  
    /**
     * Metodo toString
     * @return  manoJugador
     */

    @Override
    
    public String toString() {
        
        return manoJugador.get(0).toString() + "," +  manoJugador.get(1).toString();
    
    }
    
    
    
    
    
    
    
    
    
 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
