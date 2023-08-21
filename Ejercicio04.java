import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);


        System.out.print("Por favor ingrese un numero (Maximo de 6 digitos): ");
        int numero = entrada.nextInt();

        if (numero > 0 && numero < 9){
            System.out.print("El numero es palindromo");
        } 

        if (numero > 9 && numero < 100){
            int d1=numero % 10;
            int d2=numero / 10;
            if (d1 == d2){
            System.out.print("El numero es palindromo");
            } 
        } 

        if (numero > 99 && numero < 1000){
            int d1=numero % 10;
            int d2=(numero / 10) % 10;
            int d3=(numero / 100) % 10;
            if (d1 == d2 && d2 == d3){
            System.out.print("El numero es palindromo");
            } 
        } 
        
        if (numero > 999 && numero < 10000){
            int d1=numero % 10;
            int d2=(numero / 10) % 10;
            int d3=(numero / 100) % 10;
            int d4=(numero / 1000) % 10;
            if (d1 == d4 && d2 == d3){
            System.out.print("El numero es palindromo");
            } 
        }

        if (numero >9999  && numero < 100000){
            int d1=numero % 10;
            int d2=(numero / 10) % 10;
            int d3=(numero / 100) % 10;
            int d4=(numero / 1000) % 10;
            int d5=(numero / 10000) % 10;
            if (d1 == d2 && d2 == d3){
            } if (d3 == d4 && d4 == d5){
            System.out.print("El numero es palindromo");  
            } 
        } 

        if (numero >99999  && numero < 1000000){
            int d1=numero % 10;
            int d2=(numero / 10) % 10;
            int d3=(numero / 100) % 10;
            int d4=(numero / 1000) % 10;
            int d5=(numero / 10000) % 10;
            int d6=(numero / 100000) % 10;
            if (d1 == d6 && d2 == d5){
            } if (d3 == d4){
            System.out.print("El numero es palindromo");  
            }
        } 
        else {
            System.out.print("El numero NO es palindromo");  
        }

        entrada.close();

    }
}