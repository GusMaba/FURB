import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1040 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double N1 = sc.nextDouble();
        double N2 = sc.nextDouble();
        double N3 = sc.nextDouble();
        double N4 = sc.nextDouble();

        double Media = (N1 * 2 + N2 * 3 + N3 * 4 + N4) / 10;

        // Trunca para uma casa decimal
        Media = Math.floor(Media * 10) / 10;

        System.out.printf("Media: %.1f%n", Media);

        if (Media >= 7.0) {

            System.out.println("Aluno aprovado.");

        } else if (Media < 5.0) {

            System.out.println("Aluno reprovado.");

        } else {

            System.out.println("Aluno em exame.");

            double Prova = sc.nextDouble();

            System.out.printf("Nota do exame: %.1f%n", Prova);

            double MediaFinal = (Media + Prova) / 2;

            // Trunca a média final também
            MediaFinal = Math.floor(MediaFinal * 10) / 10;

            if (MediaFinal >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }

            System.out.printf("Media final: %.1f%n", MediaFinal);
        }

        sc.close();
    }
}
