import java.util.Scanner;

public class Atv14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int dia, mes, ano;
        boolean validez = false;

        System.out.println("informe o dia da data");
        dia = sc.nextInt();
        System.out.println("informe o mes da data");
        mes = sc.nextInt();
        System.out.println("informe o ano da data");
        ano = sc.nextInt();
        if (mes > 12) {
            validez = false;
        } else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 && dia <= 31) {
            validez = true;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11 && dia <= 30) {
            validez = true;
        } else if (mes == 2 && dia <= 28) {
            validez = true;
        } else if (mes == 2 && dia <= 29 && ano % 4 == 0) {
            validez = true;
        } else {
            validez = false;
        }
        if (validez = false) {
            System.out.println("inválido");
        } else {
            System.out.println("válido");
        }

    }
}
