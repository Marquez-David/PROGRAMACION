package banco;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cuenta {

    //Atributos
    private String numero_cuenta;
    private double saldo;
    private LocalDate fecha_apertura;
    private ArrayList<Titular> titulares = new ArrayList<>();
    private Titular titular;

    //Constructor
    public Cuenta(String numero_cuenta, double saldo, LocalDate fecha_apertura) {

        this.saldo = saldo;
        this.numero_cuenta = numero_cuenta;
        this.fecha_apertura = LocalDate.now();

    }

    //Metodo retirar_saldo
    public void retirar_saldo(double importe_retirar) {

        if ((this.saldo = this.saldo - importe_retirar) < 0) {

            System.out.println("No tienes saldo suficiente. Saldo actual : " + saldo);

        } else {

            this.saldo = this.saldo - importe_retirar;

        }

    }

    //Metodo añadir saldo
    public void aniadir_saldo(double importe_aniadir) {

        this.saldo = this.saldo + importe_aniadir;

    }

    //Metodo dar_alta
    public void dar_alta(Titular titular_alta) {

        titulares.add(titular_alta);

    }

    //Metodo dar de baja
    public void dar_baja(Titular titular_baja) {

        if (titulares.contains(titular_baja)) {

            titulares.remove(titular_baja);

        } else {

            System.out.println("Este titular no se encuentra en el sistema. ");

        }

    }

    //Metodos get y set
    public String getNumero_cuenta() {
        return numero_cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public LocalDate getFecha_apertura() {
        return fecha_apertura;
    }

    public void setNumero_cuenta(String numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setFecha_apertura(LocalDate fecha_apertura) {
        this.fecha_apertura = fecha_apertura;
    }

    public ArrayList<Titular> getTitulares() {
        return titulares;
    }

    //Metodo toString
    @Override

    public String toString() {

        return "Cuenta{" + "numero_cuenta=" + numero_cuenta + ", saldo=" + saldo + ", fecha_apertura=" + fecha_apertura + '}';

    }

}
