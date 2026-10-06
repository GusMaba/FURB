import java.util.Scanner;

public class Uni5Exe27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int maiorProducao = 0;
        int diaMaiorProducao = 0;

        int maiorManha = 0;
        int maiorTarde = 0;

        int dia;

        do {
            dia = teclado.nextInt();

            if (dia < 1 || dia > 30) {
                System.out.println("Dia inválido");
            }

        } while (dia < 1 || dia > 30);

        int opcao = 1;

        while (opcao == 1) {
            int manha = teclado.nextInt();
            int tarde = teclado.nextInt();

            int total = manha + tarde;

            double valor;

            if (dia <= 15) {
                if (total > 100 && manha >= 30 && tarde >= 30) {
                    valor = total * 0.80;
                } else {
                    valor = total * 0.50;
                }
            } else {
                valor = manha * 0.40 + tarde * 0.30;
            }

            System.out.printf(
                "R$ %.2f (valor recebido)%n",
                valor
            );

            if (total > maiorProducao) {
                maiorProducao = total;
                diaMaiorProducao = dia;
            }

            if (manha > maiorManha) {
                maiorManha = manha;
            }

            if (tarde > maiorTarde) {
                maiorTarde = tarde;
            }

            System.out.println(
                "Novo funcionário: (1.sim 2.não)?"
            );

            opcao = teclado.nextInt();

            if (opcao == 1) {
                do {
                    dia = teclado.nextInt();

                    if (dia < 1 || dia > 30) {
                        System.out.println("Dia inválido");
                    }

                } while (dia < 1 || dia > 30);
            }
        }

        System.out.println(
            "Dia da maior produção: " + diaMaiorProducao
        );

        if (maiorManha > maiorTarde) {
            System.out.println(
                "Período de maior produção: manhã - " + maiorManha
            );
        } else {
            System.out.println(
                "Período de maior produção: tarde - " + maiorTarde
            );
        }

        teclado.close();
    }
}
