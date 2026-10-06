import java.util.Scanner;

public class Uni5Exe28 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int votos1 = 0;
        int votos2 = 0;
        int votos3 = 0;
        int votos4 = 0;

        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) {
            int voto = teclado.nextInt();

            if (voto == 1) {
                votos1++;
            } else if (voto == 2) {
                votos2++;
            } else if (voto == 3) {
                votos3++;
            } else if (voto == 4) {
                votos4++;
            }

            System.out.println(
                "mais um voto: s (SIM) / n (NÃO)?"
            );

            continuar = teclado.next();
        }

        int total = votos1 + votos2 + votos3 + votos4;

        System.out.println("BTS: " + votos1 + " votos");
        System.out.println("ColdPlay: " + votos2 + " votos");
        System.out.println("Linkin Park: " + votos3 + " votos");
        System.out.println("Twenty One Pilots: " + votos4 + " votos");

        if (total > 0) {
            System.out.println(
                "Percentual BTS: " + (votos1 * 100.0 / total) + "%"
            );

            System.out.println(
                "Percentual ColdPlay: " + (votos2 * 100.0 / total) + "%"
            );

            System.out.println(
                "Percentual Linkin Park: " + (votos3 * 100.0 / total) + "%"
            );

            System.out.println(
                "Percentual Twenty One Pilots: "
                + (votos4 * 100.0 / total) + "%"
            );
        }

        int maior = votos1;
        String vencedor = "BTS";

        if (votos2 > maior) {
            maior = votos2;
            vencedor = "ColdPlay";
        }

        if (votos3 > maior) {
            maior = votos3;
            vencedor = "Linkin Park";
        }

        if (votos4 > maior) {
            maior = votos4;
            vencedor = "Twenty One Pilots";
        }

        System.out.println("Banda vencedora: " + vencedor);

        teclado.close();
    }
}
