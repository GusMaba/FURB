import java.util.Scanner;

public class Uni4Exe24 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Informe o valor 1");
        int valor1 = tec.nextInt();
        System.out.println("Informe o valor 2");
        int valor2 = tec.nextInt();
        System.out.println("Informe o valor 3");
        int valor3 = tec.nextInt();
        System.out.println("Informe a opção desejada");
        System.out.println("1= ordem crescente");
        System.out.println("2= ordem decrescente");
        System.out.println("3 = maior no meio");
        int opcao = tec.nextInt();

        switch (opcao) {
            case 1:
                if (valor1 < valor2 && valor2 < valor3) {
                    System.out.println(valor1 + " " + valor2 + " " + valor3);
                } else if (valor2 < valor3 && valor3 < valor1) {
                    System.out.println(valor2 + " " + valor3 + " " + valor1);
                } else if (valor3 < valor1 && valor1 < valor2) {
                    System.out.println(valor3 + " " + valor1 + " " + valor2);
                } else if (valor1 < valor3 && valor3 < valor2) {
                    System.out.println(valor1 + " " + valor3 + " " + valor2);
                } else if (valor2 < valor1 && valor1 < valor3) {
                    System.out.println(valor2 + " " + valor1 + " " + valor3);
                } else if (valor3 < valor2 && valor2 < valor1) {
                    System.out.println(valor3 + " " + valor2 + " " + valor1);
                }
                break;
            case 2:
                if (valor1 > valor2 && valor2 > valor3) {
                    System.out.println(valor1 + " " + valor2 + " " + valor3);
                } else if (valor2 > valor3 && valor3 > valor1) {
                    System.out.println(valor2 + " " + valor3 + " " + valor1);
                } else if (valor3 > valor1 && valor1 > valor2) {
                    System.out.println(valor3 + " " + valor1 + " " + valor2);
                } else if (valor1 > valor3 && valor3 > valor2) {
                    System.out.println(valor1 + " " + valor3 + " " + valor2);
                } else if (valor2 > valor1 && valor1 > valor3) {
                    System.out.println(valor2 + " " + valor1 + " " + valor3);
                } else if (valor3 > valor2 && valor2 > valor1) {
                    System.out.println(valor3 + " " + valor2 + " " + valor1);
                }
                break;
            case 3:
                int maior = Math.max(valor1, Math.max(valor2, valor3));
                if (maior == valor1) {
                    System.out.println(valor2 + " " + valor1 + " " + valor3);
                } else if (maior == valor2) {
                    System.out.println(valor1 + " " + valor2 + " " + valor3);
                } else if (maior == valor3) {
                    System.out.println(valor1 + " " + valor3 + " " + valor2);
                }
                break;

            default:
                break;
        }
    }
}
