import java.util.Scanner;

public class MaiorOuMenor {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        int a, b;

        a = tec.nextInt();
        b = tec.nextInt();
        if (a > b) {
            System.out.println(a + " é Maior que " + b);
        } else {
            if (a == b) {
                System.out.println("Ambos são iguais");
            } else {
                System.out.println( b + " é Maior que " + a);
            }
        }
    }
}
