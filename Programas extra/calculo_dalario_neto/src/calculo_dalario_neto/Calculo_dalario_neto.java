package calculo_dalario_neto;

import java.util.ArrayList;
import java.util.Random;

public class Calculo_dalario_neto {

    public static void main(String[] args) {

        double sueldo[][] = new double[20][3];
        Random rand = new Random();

        for (int i = 0; i < sueldo.length; i++) {

            sueldo[i][0] = rand.nextInt(300001);
            System.out.println(sueldo[i][0]);

            if (sueldo[i][0] <= 17.707) {

                sueldo[i][1] = 0.24;

            } else if (sueldo[i][0] <= 33.007) {

                sueldo[i][1] = 0.30;

            } else if (sueldo[i][0] <= 53.407) {

                sueldo[i][1] = 0.40;

            } else if(sueldo[i][0] <= 120.000){
                
                
                
            }

        }

    }

}
