
import java.util.Scanner;

public class Uni6Exe03 {

    // Subprograma para contar os caracteres de uma palavra
    public static int contarCaracteres(String palavra) {
        return palavra.length();
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = tec.nextLine();

        System.out.println("\n" + frase + "\n");

        // Separa a frase em palavras
        String[] palavras = frase.split("\\s+");

        // Percorre cada palavra e mostra sua quantidade de caracteres
        for (int i = 0; i < palavras.length; i++) {
            System.out.println(palavras[i] + " " + contarCaracteres(palavras[i]));
        }

        tec.close();
    }
}
