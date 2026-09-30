import java.util.*;

public class ex016 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double valorCompra, somaCompra, valorAPagar;

        somaCompra = 0;
        valorCompra = sc.nextDouble();
        while (valorCompra != 0) {
            if (valorCompra >= 500) {
                valorAPagar = valorCompra * 0.8;
            } else {
                valorAPagar = valorCompra * 0.85;
            }
            System.out.print("Valor a pagar: ");
            System.out.println(valorAPagar);
            somaCompra = somaCompra + valorAPagar;
            System.out.println("Digite o valor da próxima compra");
            valorCompra = sc.nextDouble();
        }
        System.out.print("Valor total: ");
        System.out.println(somaCompra);

        sc.close();
    }
}
