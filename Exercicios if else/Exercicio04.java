//Thales Guimarães Rodrigues

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        float numero1 = teclado.nextFloat();

        System.out.print("Digite o segundo numero: ");
        float numero2 = teclado.nextFloat();

        if (numero1 > numero2) {
            System.out.println("Ordem decrescente: " + numero1 + " , " + numero2);
        } else {
            System.out.println("Ordem decrescente: " + numero2 + " , " + numero1);
        }

        teclado.close();
    }
}
