import java.util.Scanner;

public class Uni5Exe23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) {
            String nome = teclado.next();

            int n = teclado.nextInt();

            double totalVendas = 0;

            int i = 1;

            while (i <= n) {
                double preco = teclado.nextDouble();
                int quantidade = teclado.nextInt();

                totalVendas += preco * quantidade;

                i++;
            }

            double salario = totalVendas * 0.30;

            System.out.println("Nome: " + nome);
            System.out.printf(
                "Total de vendas: R$%.2f%n",
                totalVendas
            );
            System.out.printf(
                "Salário: R$%.2f%n",
                salario
            );

            System.out.println(
                "deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)?"
            );

            continuar = teclado.next();
        }

        teclado.close();
    }
}
