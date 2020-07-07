
package blackjack;

/**
 * Esta clase almacena los datos de los jugadores
 * @version 9/07/2017
 * @author David Marquez Minguez
 */

public class JugadorRegistrado {
    
    // Atributos
    
    private String nif ;
    
    private String nombre ;
    
    private int fechaNacimiento ;
    
    private String numeroCuentaBancaria ;
    
    private String contraseña ;
    
    private int saldoActual ;
    
    private int fechaRegistro ;  // Solo se pedira el año de registro
    
    private int  saldo ;  // Representa la cantidad de dinero que va a ingresar el jugador.
    
    /**
     * Constructor de la clase
     * @param nif
     * @param nombre
     * @param fechaNacimiento
     * @param numeroCuentaBancaria
     * @param contraseña
     * @param saldoActual
     * @param fechaRegistro
     * @param saldo 
     */
    
    public JugadorRegistrado(String nif, String nombre, int fechaNacimiento, 
            
            String numeroCuentaBancaria, String contraseña, int saldoActual, int fechaRegistro, int saldo){
        
        this.contraseña = contraseña ;
        
        this.fechaNacimiento = fechaNacimiento ;
        
        this.fechaRegistro = fechaRegistro ;
        
        this.nif = nif ;
        
        this.nombre = nombre ;
        
        this.numeroCuentaBancaria = numeroCuentaBancaria ;
        
        this.saldoActual = saldoActual ;
        
        this.saldo = saldo ;
          
    }
    
    // Metodos
    
    /**
     * Este metodo simula la retirada de saldo de la casa de apuestas
     * @return none
     */
    
    public int retirarBeneficios() { 
        
        saldoActual = 0 ;  
        
        return saldoActual ;
           
    }
    
    /**
     * Este metodo simula el ingreso de dinero por parte del jugador
     * @param saldo
     * @return  el saldo que tieneel jugador en la casa de apuestas
     */
    
    public int aumentarSaldo( int saldo ) {
        
        saldoActual = saldoActual +  saldo ;  
        
        return saldoActual ;
           
    }
    
    // Metodos Get y Set

    public String getNif() {
        
        return nif;
    
    }

    public String getNombre() {
        
        return nombre;
    
    }

    public int getFechaNacimiento() {
        
        return fechaNacimiento;
    
    }

    public String getNumeroCuentaBancaria() {
        
        return numeroCuentaBancaria;
    
    }

    public String getContraseña() {
        
        return contraseña;
    
    }

    public int getSaldoActual() {
        
        return saldoActual;
    
    }

    public int getFechaRegistro() {
        
        return fechaRegistro;
    
    }

    public void setNif(String nif) {
        
        this.nif = nif;
    
    }

    public void setNombre(String nombre) {
        
        this.nombre = nombre;
    
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        
        this.fechaNacimiento = fechaNacimiento;
    
    }

    public void setNumeroCuentaBancaria(String numeroCuentaBancaria) {
        
        this.numeroCuentaBancaria = numeroCuentaBancaria;
    
    }

    public void setContraseña(String contraseña) {
        
        this.contraseña = contraseña;
    
    }

    public void setSaldoActual(int saldoActual) {
        
        this.saldoActual = saldoActual;
    
    }

    public void setFechaRegistro(int fechaRegistro) {
        
        this.fechaRegistro = fechaRegistro;
    
    }

    public int getSaldo() {
        
        return saldo;
    
    }

    public void setSaldo(int saldo) {
        
        this.saldo = saldo;
    
    }
    
    /**
     * Metodo toString
     * @return String
     */

    @Override
    
    public String toString() {
        
        return nif + nombre + fechaNacimiento + numeroCuentaBancaria + contraseña + saldoActual + fechaRegistro + saldo ;
        
    
    }
       
}
