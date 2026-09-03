import java.util.Scanner;

public class Atv05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean cor;

        System.out.println("a cor é azul? (responda com true ou false)");
        cor = sc.nextBoolean();
        if (cor == true) {
            System.out.println("Sim");
        } else {
            System.out.println("não");
        }

    }
}
