//Thales Guimarães Rodrigues

import java.util.Scanner;

public class Exercicio12 {
 
    public static void main(String[] args) {
      
       Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o salário: R$ ");
        double salario = teclado.nextDouble();

        double desconto;

        if (salario <= 600.00) {
            desconto = 0;
        } else if (salario <= 1200.00) {
            desconto = salario * 0.20;
        } else if (salario <= 2000.00) {
            desconto = salario * 0.25;
        } else {
            desconto = salario * 0.30;
        }

        System.out.println("Desconto do INSS: R$ " + desconto);
   teclado.close();
    }
}
