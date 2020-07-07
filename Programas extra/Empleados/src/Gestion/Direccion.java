
package Gestion;


public class Direccion {
    
    //Atributos
    private String calle;
    private int numero;
    private int codigo_postal;
    private String localidad;
    private String provincia;
    
    //Constructor
    public Direccion(String calle, int numero, int codigo_postal, String localidad, String provincia){
        
        this.calle = calle;
        this.codigo_postal = codigo_postal;
        this.localidad = localidad;
        this.numero = numero;
        this.provincia = provincia;
        
    }

    //Metodos get y set
    public String getCalle() {
        return calle;
    }

    public int getNumero() {
        return numero;
    }

    public int getCodigo_postal() {
        return codigo_postal;
    }

    public String getLocalidad() {
        return localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCodigo_postal(int codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    //Metodo toString
    @Override
    public String toString() {
        
        return calle + numero + codigo_postal + localidad + provincia;
        
    }
    
    
    
    
}
