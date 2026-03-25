import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o plano de trabalho (A, B ou C): ");
        String plano = teclado.nextLine().toUpperCase();

        System.out.print("Digite o salário atual: ");
        double salarioAtual = teclado.nextDouble();

        double novoSalario;

        switch (plano) {
            case "A":
                novoSalario = salarioAtual * 1.10; // aumento de 10%
                break;
            case "B":
                novoSalario = salarioAtual * 1.15; // aumento de 15%
                break;
            case "C":
                novoSalario = salarioAtual * 1.20; // aumento de 20%
                break;
            default:
                System.out.println("Plano inválido.");
                teclado.close();
                return;
        }

        System.out.printf("O novo salário é: %.2f\n", novoSalario);

        teclado.close();
    }
}
