
package mayoromenor;

import java.util.Scanner;
import java.util.Locale;

public class MayoroMenor {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int num1, num2;
        
        System.out.println("Introduc el primer numero: ");
        num1 = entrada.nextInt();
        
        System.out.println("Introduce el segundo numero: ");
        num2 = entrada.nextInt();
        
        if(num1 < num2){
            System.out.println("Mayor el segundo");  
        }
        
        else if(num2 < num1){
            System.out.println("Es mayor el primero"); 
        }
        
        else {
            System.out.println("Son iguales");
        }
   
    }
    
}
