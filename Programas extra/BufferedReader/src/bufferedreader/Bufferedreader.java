
package bufferedreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bufferedreader {

    public static void main(String[] args) throws IOException {
        
        // Creamos objeto BufferedReader
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        String nombre;
        
        int edad;
        
        double altura;
        
        System.out.println("Introduce tu nombre: ");
        nombre = entrada.readLine();
        
        System.out.println("Introduce tu edad: ");
        //Convertimos la cadena en integer
        edad  = Integer.parseInt(entrada.readLine()); 
        
        System.out.println("Introduce tu altura: ");
        //Convertimos la cadena el double
        altura = Double.parseDouble(entrada.readLine());
        
        System.out.println("Nombre: " + nombre + " Edad: " + edad
                + " Altura: " + altura);
         
        
        
        
        
        
        
        
        
        
    }
}
