/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author David Marquez
 */
public class JugadorException extends Exception {
    
    public static final String SALDO_INSUFICIENTE = " No se dispone del saldo para realizar la apuesta " ;
    
    public static final String NIF_incorrecto = " El NIF prporcionado no corresponde a ningun jugador registrado. " ;
    
    public static final String CONTRASEÑA_INCORRECTA = " La contraseña no es correcta " ;
    
    public static final String EDAD_INCORRECTA = " El jugador debe ser mayor de edad para poder jugar " ;
    
    public JugadorException() {
        super(" Se ha producido una excepcion en la aplicacion. ") ;
        
    }
    
    public JugadorException(String txt) {
        
        super(txt) ;
        
    }
    
}
