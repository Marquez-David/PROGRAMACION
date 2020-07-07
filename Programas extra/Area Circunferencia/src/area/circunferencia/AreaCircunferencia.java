
package area.circunferencia;

import java.util.Scanner;
import java.util.Locale;


public class AreaCircunferencia {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double radio;
        double area;
        double longuitud;
        double pi = Math.PI;
        
        System.out.println("Intoduce el radio: ");
        radio = entrada.nextDouble();
                
        area = Math.pow(radio, 2)*pi;
        longuitud = pi*2*radio;
        
        System.out.println("Area: " + area + "Longuitud: " + longuitud);
        
    }
    
}
