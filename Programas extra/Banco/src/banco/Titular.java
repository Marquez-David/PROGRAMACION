package banco;

public class Titular {

    //Atributos
    private String NIF;
    private String nombre;
    private int telefono;
    private String direccion;

    //Constructor
    public Titular(String NIF, String nombre, int telefono, String direccion) {

        this.NIF = NIF;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;

    }

    //Metodos get y set
    public String getNIF() {
        return NIF;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "Titular{" + "NIF=" + NIF + ", nombre=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion + '}';
    }

}
