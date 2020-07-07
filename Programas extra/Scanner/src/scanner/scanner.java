
package scanner;

import java.util.Locale;
import java.util.Scanner;

public class scanner {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        //Introduccion de decimales con punto.
        entrada.useLocale(Locale.US);
        
        String nombre;
        int edad;
        double altura;
        
        System.out.println("Introduce tu nombre: ");
        nombre = entrada.nextLine();
        
        System.out.println("Introduce tu edad: ");
        edad = entrada.nextInt();
        
        System.out.println("Introduce tu altura: ");
        altura = entrada.nextDouble();
        
        System.out.println("Nombre: " + nombre + " Edad: " + edad + " Altura: " + altura);
        
        
    }
    
}
