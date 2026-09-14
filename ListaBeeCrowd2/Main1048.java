import java.io.IOException;
import java.util.Scanner;

public class Main1048 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        double salario_base = 0, salario_reajuste = 0, ganho = 0, percent = 0;

        salario_base = sc.nextDouble();

        if (salario_base <= 400) {
            ganho = salario_base * 0.15;
            salario_reajuste = salario_base + ganho;
            percent = 0.15;
        } else if (salario_base > 400 && salario_base <= 800) {
            ganho = salario_base * 0.12;
            salario_reajuste = salario_base + ganho;
            percent = 0.12;
        } else if (salario_base > 800 && salario_base <= 1200) {
            ganho = salario_base * 0.10;
            salario_reajuste = salario_base + ganho;
            percent = 0.10;
        } else if (salario_base > 1200 && salario_base <= 2000) {
            ganho = salario_base * 0.7;
            salario_reajuste = salario_base + ganho;
            percent = 0.07;
        } else if (salario_base > 2000) {
            ganho = salario_base * 0.5;
            salario_reajuste = salario_base + ganho;
            percent = 0.05;
        }
        System.out.println("Novo salário :" + salario_reajuste);
        System.out.println("Reajuste ganho :" + ganho);
        System.out.println("Em percentual:" + percent);
    }

}
