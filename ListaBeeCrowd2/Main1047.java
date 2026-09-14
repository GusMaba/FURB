import java.util.Scanner;

public class Main1047 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaIni = sc.nextInt();
        int minIni = sc.nextInt();
        int horaFim = sc.nextInt();
        int minFim = sc.nextInt();

        int inicio = horaIni * 60 + minIni;
        int fim = horaFim * 60 + minFim;

        int duracao;

        if (fim > inicio) {
            duracao = fim - inicio;
        } else {
            duracao = (fim + 24 * 60) - inicio;
        }

        int hora = duracao / 60;
        int minuto = duracao % 60;

        System.out.println("O JOGO DUROU " + hora + " HORA(S) E " + minuto + " MINUTO(S)");
    }
}
