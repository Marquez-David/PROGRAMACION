package banco;

import java.time.LocalDate;

public class Cuenta_corriente extends Cuenta {

    //Atributos
    private long num_tarjeta_credito;

    //Constructor
    public Cuenta_corriente(String numero_cuenta, double saldo, LocalDate fecha_apertura, long num_tarjeta_credito) {

        super(numero_cuenta, saldo, fecha_apertura);
        this.num_tarjeta_credito = num_tarjeta_credito;

    }

    //Metodos get y set
    public long getNum_tarjeta_credito() {
        return num_tarjeta_credito;
    }

    public void setNum_tarjeta_credito(long num_tarjeta_credito) {
        this.num_tarjeta_credito = num_tarjeta_credito;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "Cuenta_corriente{" + "num_tarjeta_credito=" + num_tarjeta_credito + '}';
    }

}
