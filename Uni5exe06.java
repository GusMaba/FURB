import java.util.Scanner;

public class Uni5exe06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0, altura;

        for (int i = 1; i < 21; i++) {
            System.out.println("informa a altura da pessoa " + i + "°: ");
            altura = sc.nextDouble();
            soma += altura;
        }
        soma = soma / 20;
        System.out.println("a média da soma das alturas das 20 pessoa é de :" + soma);
    }
}
