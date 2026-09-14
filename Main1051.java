import java.util.Scanner;
import java.io.IOException;
public class Main1051 {

    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();
        double imposto = 0;

        if (salario <= 2000.00) {
            System.out.println("Isento");

        } else if (salario <= 3000.00) {
            imposto = (salario - 2000.00) * 0.08;
            System.out.printf("R$ %.2f%n", imposto);

        } else if (salario <= 4500.00) {
            imposto = 1000.00 * 0.08;
            imposto += (salario - 3000.00) * 0.18;
            System.out.printf("R$ %.2f%n", imposto);

        } else {
            imposto = 1000.00 * 0.08;
            imposto += 1500.00 * 0.18;
            imposto += (salario - 4500.00) * 0.28;
            System.out.printf("R$ %.2f%n", imposto);
        }
    }
}
