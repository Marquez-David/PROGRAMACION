
package vehiculos;

public class vehiculo_main {

    public static void main(String[] args) {
        vehiculo v1 = new vehiculo("ASDF","Audi","A6",2);
        vehiculo v2 = new vehiculo("QWER","Audi","R8",1);
        vehiculo v3 = new vehiculo("ZXCV","Porche","Carrera",4);
        vehiculo v4 = new vehiculo("GHK","Seat","Ibiza",5);
        
        v1.setVelocidad(30);
        v2.setLuces(true);
        System.out.println(v4.toString());
         
    }
    
}
