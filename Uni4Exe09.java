import java.util.Scanner;

public class Uni4Exe09 {

    public static void main(String[] args) {

        // ler teclado
        Scanner tec = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        int valor1 = tec.nextInt();
        System.out.println("Digite o segundo número");
        int valor2 = tec.nextInt();

        if (valor1 % valor2 == 0 || valor2 % valor1 == 0) {
            System.out.println("os números são múltiplos");
        } else {
            System.out.println("os números não são múltiplos");
        }
    }
}
