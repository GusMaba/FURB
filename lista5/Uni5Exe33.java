import java.util.Scanner;

public class Uni5Exe33 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        int candidato4 = 0;

        int nulos = 0;
        int brancos = 0;

        int opcao;

        do {
            opcao = teclado.nextInt();

            if (opcao == 1) {
                candidato1++;
            } else if (opcao == 2) {
                candidato2++;
            } else if (opcao == 3) {
                candidato3++;
            } else if (opcao == 4) {
                candidato4++;
            } else if (opcao == 5) {
                nulos++;
            } else if (opcao == 6) {
                brancos++;
            } else if (opcao != 0) {
                System.out.println("Opção incorreta");
            }

        } while (opcao != 0);

        int totalVotos =
            candidato1 +
            candidato2 +
            candidato3 +
            candidato4 +
            nulos +
            brancos;

        System.out.println("Total de votos candidato 1: " + candidato1);
        System.out.println("Total de votos candidato 2: " + candidato2);
        System.out.println("Total de votos candidato 3: " + candidato3);
        System.out.println("Total de votos candidato 4: " + candidato4);

        System.out.println("Total de votos nulos: " + nulos);
        System.out.println("Total de votos em branco: " + brancos);

        if (totalVotos > 0) {
            double percentualNulos =
                nulos * 100.0 / totalVotos;

            double percentualBrancos =
                brancos * 100.0 / totalVotos;

            System.out.println(
                "Percentual de votos nulos: "
                + percentualNulos + "%"
            );

            System.out.println(
                "Percentual de votos em branco: "
                + percentualBrancos + "%"
            );
        }

        teclado.close();
    }
}
