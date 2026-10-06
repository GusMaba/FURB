import java.util.Scanner;

public class Uni5Exe13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();

        double totalKm = 0;
        double totalLitros = 0;

        for (int i = 1; i <= n; i++) {
            double quilometragem = teclado.nextDouble();
            double combustivel = teclado.nextDouble();

            double kmPorLitro = quilometragem / combustivel;

            System.out.println(
                "Parada " + i + ": " + kmPorLitro + " km por litro"
            );

            totalKm += quilometragem;
            totalLitros += combustivel;
        }

        double media = totalKm / totalLitros;

        System.out.println(
            "Quilometragem média obtida por litro: " + media
        );

        teclado.close();
    }
}
