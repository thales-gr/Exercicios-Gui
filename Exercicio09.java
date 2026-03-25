//Thales Guimarães Rodrigues

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    
    // Entrada de dados
        System.out.println("Digite o salário bruto: ");
        double salarioBruto = teclado.nextDouble();

        System.out.println("Digite o valor da prestação: ");
        double prestacao = teclado.nextDouble();

        // Cálculo do limite (30% do salário)
        double limite = salarioBruto * 0.30;

        // Verificação
        if (prestacao <= limite) {
            System.out.println("Empréstimo pode ser concedido!");
        } else {
            System.out.println("Empréstimo não pode ser concedido!");
        }
        teclado.close();
    }

}
