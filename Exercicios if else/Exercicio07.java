//Thales Guimarães Rodrigues

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o salário do funcionário: ");
        double salario = teclado.nextDouble();

        System.out.print("Digite a quantidade de anos trabalhados: ");
        int anos = teclado.nextInt();

        // Cálculo do bônus
        double bonus;
        if (anos >= 5) {
            bonus = salario * 0.20; // 20%
        } else {
            bonus = salario * 0.10; // 10%
        }

        // Saída
        System.out.println("O valor do bônus é: R$ " + bonus);

        teclado.close();
    }
}
