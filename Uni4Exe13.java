import java.util.Scanner;

public class Uni4Exe13 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Digite o valor da primeira carta");
        int carta1 = tec.nextInt();
        System.out.println("Digite o valor da segunda carta");
        int carta2 = tec.nextInt();
        System.out.println("Digite o valor da terceira carta");
        int carta3 = tec.nextInt();
        int truco = 0;
        if (carta1 >= 14 || carta2 >= 14 || carta3 >= 14 || carta1 <= 0 || carta2 <= 0 || carta3 <= 0) {
            System.out.println("Insira um valor válido!");
        } else {
            if (carta1 < 4) {
                truco += 1;
            }
            if (carta2 < 4) {
                truco += 1;
            }
            if (carta3 < 4) {
                truco += 1;
            }
            if (truco == 1) {
                System.out.println("TRUCO");
            }
            else if (truco == 2) {
                System.out.println("SEIS");
            }
            else if (truco == 3) {
                System.out.println("NOVE");
            }

        }

    }
}
