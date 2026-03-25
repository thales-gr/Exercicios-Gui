//Thales Guimarães Rodrigues

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Entrada
        System.out.println("Digite a senha: ");
        String senha = teclado.nextLine();

        // Verificação
        if (senha.equals("R10p5")) {
            System.out.println("Acesso concedido");
        } else {
            System.out.println("Acesso negado");
        }

        teclado.close();
    
    }
}