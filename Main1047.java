import java.util.Scanner;

public class Main1047 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int HoraIni, HoraFim, MinIni, MinFim, Hora, Minuto;

        HoraIni = sc.nextInt();
        MinIni = sc.nextInt();
        HoraFim = sc.nextInt();
        MinFim = sc.nextInt();

        Hora = HoraFim - HoraIni;
        Minuto = MinFim - MinIni;

        if (Minuto < 0) {
            Hora--;
            Minuto += 60;
            
        }

        if (Hora == 0 && Minuto == 0) {
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        } else {
            System.out.println("O JOGO DUROU " + Hora + " HORA(S) E " + Minuto + " MINUTO(S)");
        }
    }
}