import java.util.Scanner;

public class Atv25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float numero1, numero2, resultado;
        int opcao;
        System.out.println("informe o valor 1");
        numero1 = sc.nextFloat();
        System.out.println("informe o valor 2");
        numero2 = sc.nextFloat();
        System.out.println("informe a opção");
        System.out.println("1- soma");
        System.out.println("2- subitração");
        System.out.println("3- multiplicação");
        System.out.println("4- divisão");
        opcao = sc.nextInt();
        if (opcao == 4 && numero2 == 0) {
            System.out.println("achou que ia ter erro aqui");
        } else {
            switch (opcao) {
                case 1:
                    resultado = numero1 + numero2;
                    System.out.println("o resultado da soma é de :" + resultado);
                    break;

                case 2:
                    resultado = numero1 - numero2;
                    System.out.println("o resultado da subitração é de :" + resultado);
                    break;

                case 3:
                    resultado = numero1 * numero2;
                    System.out.println("o resultado da multiplicação é de :" + resultado);

                    break;

                case 4:
                    resultado = numero1 / numero2;
                    System.out.println("o resultado da divisão é de :" + resultado);

                    break;

                default:
                    break;
            }
        }
    }
}
