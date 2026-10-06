import java.util.Scanner;

public class Uni5Exe20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double massaInicial = teclado.nextDouble();
        double massa = massaInicial;

        int tempo = 0;

        // 0,5 grama = 0,0005 kg
        while (massa >= 0.0005) {
            massa /= 2;
            tempo += 50;
        }

        System.out.println("Massa inicial: " + massaInicial + " kg");
        System.out.println("Massa final: " + massa + " kg");
        System.out.println("Tempo necessário: " + tempo + " segundos");

        teclado.close();
    }
}
