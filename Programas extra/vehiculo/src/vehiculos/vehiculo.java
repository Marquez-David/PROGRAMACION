package vehiculos;

public class vehiculo {

    private String matricula;
    private String marca;
    private String modelo;
    private int velocidad;
    private boolean luces;
    private int marcha; //Comprendido entre 0 y 5

    public vehiculo(String matricula, String marca, String modelo, int marcha) {

        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.marcha = marcha;

    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public boolean isLuces() {
        return luces;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setLuces(boolean luces) {
        this.luces = luces;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public int getMarcha() {
        return marcha;
    }

    @Override
    public String toString() {

        String lucestxt = "";

        switch (this.marcha) {
            case 0:
                this.velocidad = 0;
                break;
            case 1:
                this.velocidad = 10;
                break;
            case 2:
                this.velocidad = 30;
                break;
            case 3:
                this.velocidad = 60;
                break;
            case 4:
                this.velocidad = 90;
                break;
            default:
                this.velocidad = 120;
                break;
        }

        if (this.luces) {

            lucestxt = "Luces encendidas ";

        } else {

            lucestxt = "Luces apagadas ";

        }
        return "vehiculo{" + "matricula=" + matricula
                + ", marca=" + marca + ", modelo=" + modelo
                + ", velocidad=" + velocidad + ", luces=" + lucestxt + ", marcha=" + marcha + '}';
    }

}
