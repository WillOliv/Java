package matriz;

import java.util.Scanner;

public class n3 {
    public static void main(String[] args) {
        /// Estrutura de Tomada de Decisão e Operadores Relacionais

        int condicao;

        Scanner input = new Scanner(System.in);

        System.out.print("\nType a number : ");
        condicao = input.nextInt();

        if (condicao > 5) {
            System.out.println("\nMaior que 5\n");

        } else if (condicao < 5) {
            System.out.println("\nMenor que 5\n");

        } else {
            System.out.println("\nError\n");
        }

        input.close();
    }
}
