import java.util.Scanner;

public class exemplo09 {

    private long fatorial(long numero) {
        // inicializar variável para multiplicação
        long produto = 1;
        // repetição para número até 1
        for (long i = numero; i > 1; i--) {
            // multiplica o I e guarda no produto
            produto *= i; // Equivale a produto = produto * i
        }
        // Cuidado: Não colocar o return dentro do for
        return produto;
    }

    private long combinacao(long n, long p) {
        return fatorial(n) / (fatorial(p) * fatorial(n - p));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        exemplo09 exe09 = new exemplo09();

        System.out.println("Digite o n: ");
        long n = sc.nextInt();

        System.out.println("Digite o p: ");
        long p = sc.nextInt();

        System.out.println("Combinação: " + exe09.combinacao(n, p));

        sc.close();
    }
}
