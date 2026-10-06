import java.util.Scanner;

public class Uni5Exe26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double valorMaximo = teclado.nextDouble();

        int acimaDoLimite = 0;
        int totalTrechos = 0;
        int trechosLongosAceitos = 0;

        double pedagio = teclado.nextDouble();

        while (pedagio >= 0) {
            double distancia = teclado.nextDouble();

            totalTrechos++;

            if (pedagio > valorMaximo) {
                acimaDoLimite++;
            }

            if (distancia > 150 && pedagio <= valorMaximo) {
                trechosLongosAceitos++;
            }

            pedagio = teclado.nextDouble();
        }

        System.out.println(
            acimaDoLimite
            + " (trechos com valor acima do qual ele nega-se a pagar)"
        );

        System.out.println(
            totalTrechos + " (quantidade de trechos informados)"
        );

        System.out.println(
            trechosLongosAceitos
            + " (trechos acima de 150km com valor aceito por ele)"
        );

        teclado.close();
    }
}
