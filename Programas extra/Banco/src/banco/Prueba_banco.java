
package banco;

import java.time.LocalDate;


public class Prueba_banco {

  
    public static void main(String[] args) {
        
        Titular T1 = new Titular("47319570Z","David",689770454,"Direccion 2");
        Titular T2 = new Titular("12342178A","Adrian",654792451,"Direccion 2");
        
        Cuenta C1 = new Cuenta("ABCDEFG1",0,LocalDate.now());
        Cuenta C2 = new Cuenta("ABCDEFG2",0,LocalDate.now());
        
        /*
        System.out.println(C1.toString());
        C1.dar_alta(T1);
        C1.dar_alta(T2);
        System.out.println(C1.getTitulares());
        C1.dar_baja(T2);
        System.out.println(C1.getTitulares());
        C1.aniadir_saldo(200);
        System.out.println(C1.getSaldo());
        */
        
        System.out.println(C2.toString());
        C2.dar_alta(T2);
        System.out.println(C2.getTitulares());
        
        
    
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
