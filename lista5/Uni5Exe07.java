import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // inicializar o maior valor possível 
        float maior = Float.MIN_VALUE;
        // inicializar o menor valor possível
        float menor = Float.MAX_VALUE;

        // ler quantidade de valores 
        System.out.println("Digite a quantidade de valores: ");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            // ler número
            System.out.println("Digite um número decimal: ");
            float numero = sc.nextFloat();
            // testar se é maior 
            if (numero > maior) {
                maior = numero;
            } 
            //testar se é menor 

            if (numero < menor) {
                menor = numero;
            }
        }

        // escrever o resultado
        System.out.println("Maior = " + maior);
        System.out.println("Menor = " + menor);

        sc.close();
    }
}
