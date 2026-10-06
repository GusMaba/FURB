import java.util.Scanner;

public class Uni5Exe08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de números: ");
        int n = sc.nextInt();

        int menorNegativo = 0;
        int somaPositivos = 0;
        int quantidadePositivos = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            int numero = sc.nextInt();

            // Verifica o menor número negativo
            if (numero < 0) {
                if (menorNegativo == 0 || numero < menorNegativo) {
                    menorNegativo = numero;
                }
            }

            // Soma e conta os números positivos
            if (numero > 0) {
                somaPositivos += numero;
                quantidadePositivos++;
            }
        }

        double mediaPositivos = (double) somaPositivos / quantidadePositivos;

        System.out.println("Menor valor negativo: " + menorNegativo);
        System.out.println("Média dos números positivos: " + mediaPositivos);

        sc.close();
    }
}
