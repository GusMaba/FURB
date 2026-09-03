import java.util.Scanner;

public class Atv18 {
    public static void main(String[] args) {

        // acionar Scanner
        Scanner sc = new Scanner(System.in);

        // declarar as variáveis
        int pagamento, vencimento;
        float valor;

        // input do dia
        System.out.println("informe a data do pagamento");
        pagamento = sc.nextInt();

        // input do vencimento
        System.out.println("informe a data do vencimento");
        vencimento = sc.nextInt();

        // input do valor
        System.out.println("informe o valor da prestação");
        valor = sc.nextInt();

        if (pagamento < vencimento) {
            valor = valor * 0.90f;
            System.out.println("O pagamento está em dia. O valor da prestação com o desconto é de R$" + valor);
        } else if (pagamento - 5 <= vencimento) {
            System.out.println("O pagamento está em dia. O valor da prestação é de R$" + valor);
        } else if (pagamento - 6 > vencimento) {
            valor = (pagamento - vencimento) * 2 + valor;
            System.out.println("O pagamento está em dia. O valor da prestação é de R$" + valor);
        }

    }
}
