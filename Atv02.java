import java.util.Scanner;

public class Atv02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("informe um número");
        numero = sc.nextInt();
        if (numero % 2 == 1) {
            System.out.println("Impar");
        } else {
            System.out.println("Par");
        }

    }
}
