import java.util.Scanner;

public class Atv17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float salario, numeroDep, imposto, impostoperc = 0;

        System.out.println("informe o salário líquido");
        salario = sc.nextFloat();

        System.out.println("informe o número de dependentes");
        numeroDep = sc.nextFloat();

        if (salario < 2000) {
            impostoperc = 0;
        } else if (salario < 5000 && salario >= 2000) {
            impostoperc = 0.05f;
        } else if (salario < 10000 && salario >= 5000) {
            impostoperc = 0.10f;
        } else if (salario > 10000) {
            impostoperc = 0.15f;
        }
        imposto = salario * impostoperc /* 700sim */ - salario * impostoperc * (numeroDep * 2 / 100);
        System.out.println("O imposto é de " + impostoperc + "% R$" + imposto);

    }

}