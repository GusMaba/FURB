
import java.util.Scanner;

public class Uni6Exe08 {

    // a) Comprime o texto
    public static String comprimir(String texto) {
        StringBuilder comprimido = new StringBuilder();

        int i = 0;

        while (i < texto.length()) {
            char caractere = texto.charAt(i);
            int quantidade = 0;

            while (i < texto.length()
                    && texto.charAt(i) == caractere) {
                quantidade++;
                i++;
            }

            comprimido.append(caractere);
            comprimido.append(quantidade);
        }

        return comprimido.toString();
    }

    // b) Descomprime o texto
    public static String descomprimir(String texto) {
        StringBuilder original = new StringBuilder();

        int i = 0;

        while (i < texto.length()) {
            char caractere = texto.charAt(i);
            i++;

            StringBuilder numero = new StringBuilder();

            while (i < texto.length()
                    && Character.isDigit(texto.charAt(i))) {
                numero.append(texto.charAt(i));
                i++;
            }

            int quantidade = Integer.parseInt(numero.toString());

            for (int j = 0; j < quantidade; j++) {
                original.append(caractere);
            }
        }

        return original.toString();
    }

    // c) Calcula a redução percentual
    public static double calcularReducao(int original, int comprimido) {
        if (original == 0) {
            return 0.0;
        }

        return ((double) (original - comprimido) / original) * 100;
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.print("Digite um texto com letras maiusculas: ");
        String texto = tec.nextLine();

        String textoComprimido = comprimir(texto);
        String textoDescomprimido = descomprimir(textoComprimido);

        int tamanhoOriginal = texto.length();
        int tamanhoComprimido = textoComprimido.length();

        double reducao = calcularReducao(
            tamanhoOriginal, tamanhoComprimido
        );

        System.out.println("\nTexto original: " + texto);
        System.out.println("Texto comprimido: " + textoComprimido);
        System.out.println("Texto descomprimido: " + textoDescomprimido);

        System.out.println("\nQuantidade de caracteres do texto original: "
                + tamanhoOriginal);
        System.out.println("Quantidade de caracteres do texto comprimido: "
                + tamanhoComprimido);

        System.out.printf("Reducao percentual: %.2f%%%n", reducao);

        if (texto.equals(textoDescomprimido)) {
            System.out.println("Verificacao: descompressao realizada corretamente!");
        } else {
            System.out.println("Verificacao: houve um erro na descompressao.");
        }

        tec.close();
    }
}
