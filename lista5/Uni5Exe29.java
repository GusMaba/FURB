import java.util.Scanner;

public class Uni5Exe29 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int valor = teclado.nextInt();

        int notas20 = valor / 20;
        valor %= 20;

        int notas10 = valor / 10;
        valor %= 10;

        int notas5 = valor / 5;
        valor %= 5;

        int notas2 = valor / 2;
        valor %= 2;

        int notas1 = valor;

        System.out.println("Cédulas de 20: " + notas20);
        System.out.println("Cédulas de 10: " + notas10);
        System.out.println("Cédulas de 5: " + notas5);
        System.out.println("Cédulas de 2: " + notas2);
        System.out.println("Cédulas de 1: " + notas1);

        teclado.close();
    }
}
