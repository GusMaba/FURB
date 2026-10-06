import java.util.Scanner;

public class Uni5Exe25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int pontosD = 0;
        int pontosE = 0;

        while (true) {
            char ponto = teclado.next().charAt(0);

            if (ponto == 'D' || ponto == 'd') {
                pontosD++;
            } else if (ponto == 'E' || ponto == 'e') {
                pontosE++;
            }

            int diferenca = Math.abs(pontosD - pontosE);

            if ((pontosD >= 21 || pontosE >= 21) && diferenca >= 2) {
                break;
            }
        }

        if (pontosD > pontosE) {
            System.out.println("Vencedor: jogador D");
        } else {
            System.out.println("Vencedor: jogador E");
        }

        System.out.println("Pontos D: " + pontosD);
        System.out.println("Pontos E: " + pontosE);

        teclado.close();
    }
}
