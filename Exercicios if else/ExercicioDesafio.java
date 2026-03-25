//Thales Guimarães Rodrigues

import java.util.Scanner;

public class ExercicioDesafio {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Digite sua idade: ");
        int idade = teclado.nextInt();

        System.out.println("Possui título de eleitor? (sim/não): ");
        boolean titulo = teclado.nextBoolean();

        System.out.println("Está em situação regular? (sim/não): ");
        boolean regular = teclado.nextBoolean();

        System.out.println("Sabe ler e escrever? (sim/não): ");
        boolean alfabetizado = teclado.nextBoolean();

        // Verificação
        if (idade < 16) {
            System.out.println("Não pode votar.");
        } else if (!titulo || !regular) {
            System.out.println("Não está apto a votar (pendências no título).");
        } else {
            if (idade >= 18 && idade <= 70 && alfabetizado) {
                System.out.println("Apto a votar. Voto OBRIGATÓRIO.");
            } else {
                System.out.println("Apto a votar. Voto FACULTATIVO.");
            }
        }

        teclado.close();
    }
}
