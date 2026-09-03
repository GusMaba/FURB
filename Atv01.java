import java.util.Scanner;

public class Atv01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float valorHora, horasTrabalhas, HoraBonus = 0, salario;

        System.out.println("informe a quantidade de horas trabalhadas desse mês");
        horasTrabalhas = sc.nextInt();

        System.out.println("informe valor da hora trabalhada");
        valorHora = sc.nextInt();

        if (horasTrabalhas > 160) {
            HoraBonus = (horasTrabalhas - 160)/* 20 */ * (valorHora * 1.5f);
            horasTrabalhas = 160;
        }
        salario = horasTrabalhas * valorHora + HoraBonus;

        System.out.println("O salário total é: " + salario);

    }

}