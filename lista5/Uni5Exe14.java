import java.util.Scanner;

public class Uni5Exe14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int menor10 = 0;
        int entre10e20 = 0;
        int maior20 = 0;

        double totalCompra = 0;
        double totalVenda = 0;

        for (int i = 1; i <= 20; i++) {
            String nome = teclado.next();
            double pc = teclado.nextDouble();
            double pv = teclado.nextDouble();

            double lucro = (pv - pc) / pc * 100;

            if (lucro < 10) {
                menor10++;
            } else if (lucro <= 20) {
                entre10e20++;
            } else {
                maior20++;
            }

            totalCompra += pc;
            totalVenda += pv;
        }

        double lucroTotal = totalVenda - totalCompra;

        System.out.println("Lucro menor que 10%: " + menor10);
        System.out.println("Lucro entre 10% e 20%: " + entre10e20);
        System.out.println("Lucro maior que 20%: " + maior20);

        System.out.println("Valor total de compra: " + totalCompra);
        System.out.println("Valor total de venda: " + totalVenda);
        System.out.println("Lucro total: " + lucroTotal);

        teclado.close();
    }
}
