//Thales Guimarães Rodrigues

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double numero1, numero2, resultado = 0;
        char operacao;

        // Entrada
        System.out.print("Digite o primeiro número: ");
        numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        numero2 = scanner.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        operacao = scanner.next().charAt(0);

        // Processamento
        switch (operacao) {
            case '+':
                resultado = numero1 + numero2;
                System.out.println("Resultado: " + resultado);
                break;

            case '-':
                resultado = numero1 - numero2;
                System.out.println("Resultado: " + resultado);
                break;

            case '*':
                resultado = numero1 * numero2;
                System.out.println("Resultado: " + resultado);
                break;

            case '/':
                if (numero2 <= 0) {
                    System.out.println("Impossível dividir‼");
                } else {
                    resultado = numero1 / numero2;
                    System.out.println("Resultado: " + resultado);
                }
                break;

            default:
                System.out.println("Sinal Inválido");
                break;
        }
    scanner.close();
    }
}
