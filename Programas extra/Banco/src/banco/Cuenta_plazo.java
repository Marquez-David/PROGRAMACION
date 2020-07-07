package banco;

import java.time.LocalDate;

public class Cuenta_plazo extends Cuenta {

    //Atributos
    private int num_anios;

    //Constructor
    public Cuenta_plazo(String numero_cuenta, double saldo, LocalDate fecha_apertura, int num_anios) {

        super(numero_cuenta, saldo, fecha_apertura);
        this.num_anios = num_anios;

    }

    //Metodos get y set
    public int getNum_anios() {
        return num_anios;
    }

    public void setNum_anios(int num_anios) {
        this.num_anios = num_anios;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "cuenta_plazo{" + "num_anios=" + num_anios + '}';
    }

}
