import java.util.Random;
import java.util.Scanner;

public class Ejercicio05 {
    public static void main (String []args){


        int año=0;
        int mes=0;
        int dia=0;
        Random random = new Random();

    año = random.nextInt(9999) + 1000;
    mes = random.nextInt(12);

    if (mes == 02 ){
        
        if ( año % 4==0){
        dia = random.nextInt(29);                    
        } else {
        dia = random.nextInt(28);
        }  
        }

        if (mes == 3 || mes == 8 || mes==12 || mes==7 || mes==4 || mes== 10 || mes== 1)
        {
        dia= random.nextInt(31);
        }else {  
        dia= random.nextInt(30);
        }

        System.out.println(dia + "/" + mes + "/" + año);


    }
}