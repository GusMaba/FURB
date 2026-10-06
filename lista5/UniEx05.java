import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero2, numero3;
        int n;
        int numero;

        System.out.println("Digite um número: ");
        numero = sc.nextInt();
        

        System.out.println("Digite a quantidade de vezes: ");
        n = sc.nextInt();

        System.out.println("A série vai ser repetida " + n + " vezes");
        System.out.println(numero);
        for (int i = 0; i < n; i++) {
            // numero 2 é igual ao número 1 + 2
            numero2 = numero + 2;
            System.out.println(numero2);

            numero3 = numero * 2;
            System.out.println(numero3);

            numero = numero3;
        }

        sc.close();
    }
}
