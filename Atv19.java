import java.util.Scanner;

public class Atv19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cord1, cord2;

        System.out.println("informe o valor do quadrante 1");
        cord1 = sc.nextInt();

        System.out.println("informe o valor do quadrante 2");
        cord2 = sc.nextInt();

        if (cord1 == 0 && cord2 == 0) {
            System.out.println("Quadrante 0");
        } else if (cord1 > 0 && cord2 > 0) {
            System.out.println("Quadrante 1");
        }

        else if (cord1 < 0 && cord2 > 0) {
            System.out.println("Quadrante 2");
        } else if (cord1 < 0 && cord2 < 0) {
            System.out.println("Quadrante 3");
        } else if (cord1 > 0 && cord2 < 0) {
            System.out.println("Quadrante 4");
        } else {
            System.out.println("Quadrante Indefinido");
        }

    }
}
