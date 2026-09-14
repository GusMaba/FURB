import java.util.Scanner;

public class Main1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horainicio, horafim, horacalculo = 0;

        horainicio = sc.nextInt();
        horafim = sc.nextInt();

        if (horainicio == horafim) {
            horacalculo = +24;
        } else if (horainicio > horafim) {
            horacalculo = 24 + horafim - horainicio;
        } else if (horainicio < horafim) {
            horacalculo = horainicio - horafim;
        }
        if (horacalculo < 0) {
            horacalculo = horacalculo * -1;
        }
        System.out.println("O JOGO DUROU " + horacalculo + " HORA(S)");

    }
}
