import java.util.Scanner;

public class Uni5Exe18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int pessoas4 = 0;
        int pessoas5 = 0;
        int pessoas9 = 0;
        int pessoas12 = 0;

        int canal = teclado.nextInt();

        while (canal != 0) {
            int pessoas = teclado.nextInt();

            if (canal == 4) {
                pessoas4 += pessoas;
            } else if (canal == 5) {
                pessoas5 += pessoas;
            } else if (canal == 9) {
                pessoas9 += pessoas;
            } else if (canal == 12) {
                pessoas12 += pessoas;
            }

            canal = teclado.nextInt();
        }

        int total = pessoas4 + pessoas5 + pessoas9 + pessoas12;

        if (total > 0) {
            System.out.println(
                "Percentual de audiência do canal 4: "
                + (pessoas4 * 100.0 / total) + "%"
            );

            System.out.println(
                "Percentual de audiência do canal 5: "
                + (pessoas5 * 100.0 / total) + "%"
            );

            System.out.println(
                "Percentual de audiência do canal 9: "
                + (pessoas9 * 100.0 / total) + "%"
            );

            System.out.println(
                "Percentual de audiência do canal 12: "
                + (pessoas12 * 100.0 / total) + "%"
            );
        }

        teclado.close();
    }
}
