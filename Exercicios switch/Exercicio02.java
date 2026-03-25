import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] meses = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                           "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" };

        System.out.print("Digite um número de 1 a 12: ");
        int numero = teclado.nextInt();

        if (numero >= 1 && numero <= 12) {
            System.out.println(meses[numero - 1]);
        } else {
            System.out.println("Número inválido! Digite um número entre 1 e 12.");
        }

        teclado.close();
    }
}
