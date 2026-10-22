import java.util.Scanner;

public class exemplo1 {

    public int soma(int numero1, int numero2) {
        int total = numero1 + numero2;
        return total;
    }

    public int subtrai(int numero1, int numero2) {
        int total = numero1 - numero2;
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criando um objeto da própria classe para evitar o uso de método static (construtor)
        exemplo1 exe = new exemplo1();

        System.out.println("Digite o primeiro número: ");
        int numero1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int numero2 = sc.nextInt();

        int resultado = exe.soma( numero1, numero2);
        System.out.println("Soma = " + resultado);

        sc.close();
    }
}