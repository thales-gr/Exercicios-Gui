//Thales Guimarães Rodrigues

import java.util.Scanner;
public class Exercicio03{
    public static void main(String[] args){

        Scanner teclado = new Scanner (System.in);
           
        System.out.println("Digite seu primeiro numero");
        int numero1= teclado.nextInt ();

        System.out.println("Digite seu segundo numero");
        int numero2= teclado.nextInt ();

        if (numero1==numero2){
            System.out.println("Os numeros são iguais");

        }else{
        int maior = Math.max(numero1, numero2);
        int menor = Math.min(numero1, numero2);

        int diferenca = maior - menor;
                   
            System.out.println("A diferença entre eles é " + diferenca);
        }

                     
               
        
        teclado.close();


         }
    }
