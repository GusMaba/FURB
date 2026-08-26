import java.util.Scanner;

public class Uni4Exe08 {

    public static void main(String[] args) {

        // definir o teclado
        Scanner tec = new Scanner(System.in);

        // ler letra
        System.out.println("Digite uma letra");
        char letra = tec.next().charAt(0);
        // converter letra para minúscula
        letra = Character.toLowerCase(letra);
        // testar se é vogal
        if (letra == 'a' || letra == 'e' || letra == 'o' || letra == 'i' || letra == 'u') {
            System.out.println("é uma vogal");
        } else {
            System.out.println("não é uma vogal");

        }

    }
}
