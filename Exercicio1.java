//Thales Guimarães Rodrigues

import java.util.Scanner;
public class Exercicio1{
    public static void main(String[] args){

        Scanner teclado = new Scanner (System.in);
           
        System.out.println("Digite seu número");
        int número= teclado.nextInt ();

        if (número > 20){
    
            System.out.println("A metade do número é " + número/2);

        }

                     
               
        
        teclado.close();


         }
    }
