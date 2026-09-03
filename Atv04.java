import java.util.Scanner;

public class Atv04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float numero;

        System.out.println("informe um número com ou sem casas decimais");
        numero = sc.nextFloat();

        if (numero % 1 == 0) {
            System.out.println("Casas decimais não foram digitadas.");
        } else {
            System.out.println("Casas decimais foram digitadas.");
        }

    }
}
