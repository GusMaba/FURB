import java.util.Scanner;

public class Uni4Exe14 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite o dia");
        int dia = tec.nextInt();
        System.out.println("Digite o mes");
        int mes = tec.nextInt();
        System.out.println("Digite o ano");
        int ano = tec.nextInt();
        boolean valido = false;

        if (dia > 31 || mes > 12) {
            System.out.println("insira um valor válido");
            valido = false;
        } else {
            if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia <= 31) {
                valido = true;
            } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia <= 30) {
                valido = true;
            } else if ((mes == 2 && ano % 4 == 0) && dia <= 29) {
                valido = true;
            } else if (mes == 2 && dia <= 28) {
                valido = true;
            }

            if (valido == true) {
                System.out.println("É válido");
            } else {
                System.out.println("Não é valido");
            }
        }

    }
}
