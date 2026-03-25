import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o código do produto: ");
        int codigo = teclado.nextInt();

        System.out.print("Digite a quantidade: ");
        int quantidade = teclado.nextInt();

        String produto = "";
        double preco = 0.0;

        switch (codigo) {
            case 100:
                produto = "Cachorro Quente";
                preco = 1.20;
                break;
            case 101:
                produto = "Bauru Simples";
                preco = 1.30;
                break;
            case 102:
                produto = "Bauru com ovo";
                preco = 1.50;
                break;
            case 103:
                produto = "Hambúrguer";
                preco = 1.20;
                break;
            case 104:
                produto = "Cheeseburguer";
                preco = 1.30;
                break;
            case 105:
                produto = "Refrigerante";
                preco = 1.00;
                break;
            default:
                System.out.println("Código inválido.");
                teclado.close();
                return;
        }

        double valorTotal = preco * quantidade;

        System.out.printf("Produto: %s\n", produto);
        System.out.printf("Valor a pagar: R$ %.2f\n", valorTotal);

        teclado.close();
    }
}
