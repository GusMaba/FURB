import java.util.Scanner;

public class ParOuImpar {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int numero;

        numero = tec.nextInt();
        if (numero % 2 == 0) {
            System.out.println("O número é Par");
        } else {
            System.out.println("O número é Impar");
        }
    }
}
