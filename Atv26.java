import java.util.Scanner;

public class Atv26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float L, B, H, R, area;
        char opcao = 0;

        System.out.println("informe a opção desejada");
        System.out.println("T para triângulo");
        System.out.println("Q para quadrado");
        System.out.println("R para retângulo");
        System.out.println("C para círculo");

        opcao = sc.next().charAt(opcao);
        opcao = Character.toUpperCase(opcao);
        switch (opcao) {
            case 'T':
                System.out.println("informe o valor da base");
                B = sc.nextFloat();
                System.out.println("informe o valor da altura");
                H = sc.nextFloat();
                area = B * H / 2;
                System.out.println(area);
                break;
            case 'Q':
                System.out.println("informe o valor do lado");
                L = sc.nextFloat();
                area = L * L;
                System.out.println(area);
                break;
            case 'R':
                System.out.println("informe o valor da base");
                B = sc.nextFloat();
                System.out.println("informe o valor da altura");
                H = sc.nextFloat();
                area = B * H;
                System.out.println(area);
                break;
            case 'C':
                System.out.println("informe o valor do raio");
                R = sc.nextFloat();
                area = R * 3.14f * 2f;
                System.out.println(area);
                break;

            default:
                break;
        }

    }
}