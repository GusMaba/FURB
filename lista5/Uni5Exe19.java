import java.util.Scanner;

public class Uni5Exe19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double valorCompra = teclado.nextDouble();
        double totalRecebido = 0;

        while (valorCompra != 0) {
            double valorPagar;

            if (valorCompra > 500) {
                valorPagar = valorCompra * 0.80;
            } else {
                valorPagar = valorCompra * 0.85;
            }

            System.out.printf("Valor a pagar: R$%.2f%n", valorPagar);

            totalRecebido += valorPagar;

            valorCompra = teclado.nextDouble();
        }

        System.out.printf(
            "O valor total recebido foi de R$%.2f%n",
            totalRecebido
        );

        teclado.close();
    }
}
