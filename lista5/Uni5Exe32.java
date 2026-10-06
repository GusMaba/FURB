import java.util.Scanner;

public class Uni5Exe32 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int primeiroDia = teclado.nextInt();
        int quantidadeDias = teclado.nextInt();

        System.out.println("D\tS\tT\tQ\tQ\tS\tS");

        // Espaços antes do primeiro dia
        for (int i = 1; i < primeiroDia; i++) {
            System.out.print("\t");
        }

        for (int dia = 1; dia <= quantidadeDias; dia++) {
            System.out.print(dia + "\t");

            if ((primeiroDia + dia - 1) % 7 == 0) {
                System.out.println();
            }
        }

        teclado.close();
    }
}
