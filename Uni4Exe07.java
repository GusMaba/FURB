import java.util.Scanner;

public class Uni4Exe07 {
    public static void main(String[] args) {

        // definir o teclado
        Scanner tec = new Scanner(System.in);

        // ler Valor
        System.out.println("Digite o Peso");
        int peso = tec.nextInt();
        double custo = 0.45;

        if (peso > 50) {
            int excesso = peso - 50;

            int adicionais = (excesso + 19) / 20;

            custo += adicionais * 0.45;
        }
        // Mostrar valor
        System.out.printf("O preço é de =%.2f%n", custo );
    }
}
