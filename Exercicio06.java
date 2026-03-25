//Thales Guimarães Rodrigues

import java.util.Scanner;

public class Exercicio06 {
    public static void main (String[] args){
    Scanner teclado = new Scanner(System.in);
         
    System.out.println("Você é do sexo amsculino ou feminino (M ou F)?");
        String sexo= teclado.nextLine().toUpperCase();

    System.out.println("Informe seua altura");     
         float altura = teclado.nextFloat();
         
         
        switch (sexo){
        case "M":
            System.out.printf( "Seu peso ideal é de %.3fKg" , ( 72.7 * altura ) - 58 );
            break;

        case "F":
            System.out.printf("Seu peso ideal é de %.3fKg" , ( 62.1 * altura ) - 44.7 );
            break;

        }
            teclado.close();

    }

}