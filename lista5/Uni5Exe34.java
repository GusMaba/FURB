import java.util.Scanner;

public class Uni5Exe34 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int opcao;
        int contasEncerradas = 0;

        do {
            System.out.println("1 - Encerrar conta de um hóspede");
            System.out.println("2 - Verificar número de contas encerradas");
            System.out.println("3 - Sair");

            opcao = teclado.nextInt();

            if (opcao == 1) {
                String nome = teclado.next();

                int diarias = teclado.nextInt();

                double taxa;

                if (diarias < 15) {
                    taxa = 7.50;
                } else if (diarias == 15) {
                    taxa = 6.50;
                } else {
                    taxa = 5.00;
                }

                double total = diarias * 50 + diarias * taxa;

                System.out.println("Hóspede: " + nome);
                System.out.printf(
                    "Total a pagar: R$%.2f%n",
                    total
                );

                contasEncerradas++;

            } else if (opcao == 2) {
                System.out.println(
                    "Número de contas encerradas: "
                    + contasEncerradas
                );

            } else if (opcao != 3) {
                System.out.println("Opção inválida.");
            }

        } while (opcao != 3);

        teclado.close();
    }
}
