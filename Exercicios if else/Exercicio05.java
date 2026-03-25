//Thales Guimarães Rodrigues

import java.util.Scanner;
public class Exercicio05{
    public static void main(String[] args){

        Scanner teclado = new Scanner (System.in);
           
        System.out.println("Digite seu numero");
        int numero= teclado.nextInt ();

        if (numero >= 50 && numero <=100){
            System.out.println("Pertence ao intervalo");

        }else{
            System.out.println("Não pertence ao intervalo");
        }

                     
               
        
        teclado.close();


         }
    }
