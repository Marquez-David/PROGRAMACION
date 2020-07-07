
package blackjack;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Esta clase se encargara de pedir datos al usuario
 * @author david
 */
public class PruebaBlackJack implements Serializable{
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        Scanner entrada = new Scanner(System.in);
        
        // Atributos
        
        String nif ;
        String nombre ;
        int apuesta ;
        int fechaNacimiento ;
        String numeroCuentaBancaria ;
        String contraseña ;
        
        /**
         * Peticion de datos
         */
        
        System.out.println("Introduce tu nombre: ");
        nombre = entrada.nextLine();
        

        System.out.println("Introduce tu DNI: ");
        nif = entrada.nextLine();
        
        System.out.println("Introduce tu numero de cuenta bancaria: ") ;
        numeroCuentaBancaria = entrada.nextLine() ;
        
        System.out.println("Introduce la contraseña: ") ;
        contraseña = entrada.nextLine() ;
        
        System.out.println("Introduce el año en el que naciste: ") ;
        fechaNacimiento = entrada.nextInt();

        if(fechaNacimiento > 98) {
            
            try {
                throw new JugadorException(JugadorException.EDAD_INCORRECTA) ;
            } catch (JugadorException ex) {
                Logger.getLogger(PruebaBlackJack.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
       
        System.out.println("¿Cuanto quiere apostar?: ");
        apuesta = entrada.nextInt();
        
        /**
         * Objetos
         */
        
        JugadorRegistrado J1 = new JugadorRegistrado(nif,nombre,fechaNacimiento,numeroCuentaBancaria,contraseña,99,9,9) ;
        
      
        if(apuesta > J1.getSaldoActual()) {
            
            try {
                throw new JugadorException(JugadorException.SALDO_INSUFICIENTE) ;
            } catch (JugadorException ex) {
                Logger.getLogger(PruebaBlackJack.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }

        Carta C1 = new Carta("" , "") ;

        Baraja B1 = new Baraja() ;
        
        Apuesta A1 = new Apuesta( B1 ,0 ,0, apuesta) ;
        
     
        
        //Premio P1 = new Premio(apuesta,"") ;
        
        System.out.println("Nombre: " + J1.getNombre() + " Nif: " + J1.getNif() + "\n"
                + "Apuesta: " + A1.getApuesta() + "$" + "\n" + 
                "Mano de la apuesta: " + B1.getManoJugador() + "Mano Crupier: " + B1.getManoCrupier() + "\n"
        + "Premio: " + A1.getPremio() + "\n" + "Saldo: " + J1.getSaldoActual()) ;
  
    }
    
}
