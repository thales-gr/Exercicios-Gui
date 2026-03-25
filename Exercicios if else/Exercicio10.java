//Thales Guimarães Rodrigues

import java.util.Scanner;

public class Exercicio10 {
 public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);   
    int numero1, numero2, numero3;

        System.out.println("Digite o primeiro número: ");
        numero1 = teclado.nextInt();

        System.out.println("Digite o segundo número: ");
        numero2 = teclado.nextInt();

        System.out.println("Digite o terceiro número: ");
        numero3 = teclado.nextInt();

        if (numero1 == numero2 && numero2 == numero3) {
            System.out.println("os números são iguais");
        } else {
            if (numero1 >= numero2 && numero1 >= numero3) {
                System.out.println("O maior número é: " + numero1);
            } else if (numero2 >= numero1 && numero2 >= numero3) {
                System.out.println("O maior número é: " + numero2);
            } else {
                System.out.println("O maior número é: " + numero3);
            }
        }

        teclado.close();
    
    }
}
