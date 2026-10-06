import java.util.Scanner;

public class Uni5Exe31 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero = teclado.nextInt();

        int divisor = 2;

        while (numero > 1) {
            if (numero % divisor == 0) {
                System.out.println(numero + " | " + divisor);
                numero /= divisor;
            } else {
                divisor++;
            }
        }

        System.out.println("1 |");

        teclado.close();
    }
}
