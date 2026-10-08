import java.util.Scanner;

public class Uni5Exe13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número total de abastecimentos: ");
        int n = sc.nextInt();

        double totalKm = 0;
        double totalLitros = 0;

        for (int i = 1; i <= n; i++) {

            System.out.print("Digite a quilometragem da parada: ");
            double quilometragem = sc.nextDouble();

            System.out.print("Digite a quantidade de combustível abastecida: ");
            double combustivel = sc.nextDouble();

            double kmPorLitro = quilometragem / combustivel;

            System.out.printf(
                    "Parada %d: %.1f km por litro%n",
                    i, kmPorLitro
            );

            totalKm += quilometragem;
            totalLitros += combustivel;
        }

        double media = totalKm / totalLitros;

        System.out.printf(
                "Quilometragem média obtida por litro: %.2f%n",
                media
        );

        sc.close();
    }
}
