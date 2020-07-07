package Gestion;

public class Empleado extends Persona {

    //Atributos
    private double sueldo;
    private Departamento departamento;
    private String categoria;
    private Direccion direccion;

    //Constructor
    public Empleado(String dni, String nombre, int edad,
            String estado, double sueldo, Departamento departamento, String categoria, Direccion direccion) {

        super(dni, nombre, edad, estado);
        this.categoria = categoria;
        this.departamento = departamento;
        this.sueldo = sueldo;
        this.direccion = direccion;

    }

    //Metodos get y set
    public void set_sueldo(double sueldo) {

        this.sueldo = sueldo;

    }

    public void set_departamento(Departamento departamento) {

        this.departamento = departamento;

    }

    public void set_categoria(String categoria) {

        this.categoria = categoria;

    }

    public double get_sueldo() {

        return sueldo;

    }

    public Departamento get_departamento() {

        return departamento;

    }

    public String get_categoria() {

        return categoria;

    }
    
    public double calculo_salario_neto(double retencion){
        
        return sueldo - sueldo * (retencion/100);
        
    }
    
    // Metodo toString
    @Override
    
    public String toString(){
        
        return super.toString() + sueldo + categoria + departamento;
        
    }

}
