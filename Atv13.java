import java.util.Scanner;

public class Atv13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int usuario1, usuario2, usuario3, truco = 0;

        System.out.println("informe o valor do usuário 1");
        usuario1 = sc.nextInt();

        System.out.println("informe o valor do usuário 2");
        usuario2 = sc.nextInt();

        System.out.println("informe o valor do usuário 3");
        usuario3 = sc.nextInt();
        if (usuario1 < 4 && usuario1 > 0) {
            truco++;
        }

        if (usuario2 < 4 && usuario1 > 0) {
            truco++;
        }

        if (usuario3 < 4 && usuario1 > 0) {
            truco++;
        }
        if (truco == 1) {
            System.out.println("TRUCO");
        } else if (truco == 2) {
            System.out.println("SEIS");

        } else if (truco == 3) {
            System.out.println("NOVE");

        } else if (truco == 0) {
            System.out.println("devagar pae");
        } else {
            System.out.println("exibir nada");
        }

    }
}