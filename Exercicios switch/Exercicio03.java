import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o período em que o aluno estuda (M - Matutino, V - Vespertino, N - Noturno): ");
        String periodo = teclado.nextLine().toUpperCase();

        switch (periodo) {
            case "M":
                System.out.println("bom dia");
                break;
            case "V":
                System.out.println("boa tarde");
                break;
            case "N":
                System.out.println("boa noite");
                break;
            default:
                System.out.println("Período inválido");
                break;
        }

        teclado.close();
    }
}