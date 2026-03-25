import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = teclado.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = teclado.nextDouble();

        teclado.nextLine(); // consumir a quebra de linha pendente

        System.out.print("Escolha a operação (M - média, S - diferença, P - produto, D - divisão): ");
        String opcao = teclado.nextLine().toUpperCase();

        switch (opcao) {
            case "M":
                double media = (num1 + num2) / 2;
                System.out.printf("Média: %.2f\n", media);
                break;
            case "S":
                double diferenca = Math.abs(num1 - num2);
                System.out.printf("Diferença entre maior e menor: %.2f\n", diferenca);
                break;
            case "P":
                double produto = num1 * num2;
                System.out.printf("Produto: %.2f\n", produto);
                break;
            case "D":
                if (num2 != 0) {
                    double divisao = num1 / num2;
                    System.out.printf("Divisão: %.2f\n", divisao);
                } else {
                    System.out.println("Erro: divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Opção inválida.");
        }

        teclado.close();
    }
}
