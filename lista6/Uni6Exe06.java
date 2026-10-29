import java.util.Scanner;

public class Uni6Exe06 {

    static char codificarCaractere(char c) {
        if (c >= 'A' && c <= 'Z') {
            return (char) ('Z' - (c - 'A'));
        }
        if (c >= 'a' && c <= 'z') {
            return (char) ('z' - (c - 'a'));
        }
        if (c >= '1' && c <= '9') {
            return (char) ('9' - (c - '1'));
        }
        return c;
    }

    static String codificarMensagem(String mensagem) {

        String resultado = "";

        for (int i = 0; i < mensagem.length(); i++) {
            char c = mensagem.charAt(i);

            resultado += codificarCaractere(c);
        }

        return resultado;
    }

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        System.out.println("Digite uma mensagem: ");

        String mensagem = tec.nextLine();

        String codificada = codificarMensagem(mensagem);

        System.out.println("Mensagem codificada: " + codificada);

        tec.close();

    }
}
