import java.util.Scanner;

public class Atv03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1, valor2;

        System.out.println("informe valor 1");
        valor1 = sc.nextInt();

        System.out.println("informe valor 2");
        valor2 = sc.nextInt();

        if (valor1 > valor2) {
            System.out.println("O valor " + valor1 + " é maior do que o valor " + valor2);
        } else if (valor2 > valor1) {
            System.out.println("O valor " + valor2 + " é maior do que o valor " + valor1);
        } else if (valor1 == valor2) {
            System.out.println("e mano, empatar é coisa de boiola");
        }

    }
}
