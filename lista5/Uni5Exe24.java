import java.util.Scanner;

public class Uni5Exe24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double limiteKg = teclado.nextDouble();

        double totalGramas = 0;

        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) {
            double peso = teclado.nextDouble();

            totalGramas += peso;

            double totalKg = totalGramas / 1000;

            System.out.println(
                "Peso total da pesca: " + totalKg + " kg"
            );

            if (totalKg > limiteKg) {
                System.out.println(
                    "O limite diário de pesca foi excedido."
                );
                break;
            }

            System.out.println(
                "deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)?"
            );

            continuar = teclado.next();
        }

        teclado.close();
    }
}
