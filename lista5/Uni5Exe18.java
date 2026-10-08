import java.util.Scanner;

public class Uni5Exe18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pessoas4 = 0;
        int pessoas5 = 0;
        int pessoas9 = 0;
        int pessoas12 = 0;

        System.out.println("Digite o canal de Televisão que você está assistindo: ");
        System.out.println("4 - Canal 4");
        System.out.println("5 - Canal 5");
        System.out.println("9 - Canal 9");
        System.out.println("12 - Canal 12");
        System.out.println("0 - Se não estiver assistindo a nenhum canal");

        int canal = sc.nextInt();

            while (canal != 0) {

                System.out.println("Digite o nome de pessoas que estão assistindo televisão no momento: ");
                
                int pessoas = sc.nextInt();

                System.out.println("Digite o canal de televisão que você está assistindo: ");
                System.out.println("4 - Canal 4");
                System.out.println("5 - Canal 5");
                System.out.println("9 - Canal 9");
                System.out.println("12 - Canal 12");
                System.out.println("0 - Se não estiver assistindo a nenhum canal");

                if (canal == 4) {
                    pessoas4 += pessoas;
                } else if (canal == 5) {
                    pessoas5 += pessoas;
                } else if (canal == 9) {
                    pessoas9 += pessoas;
                } else if (canal == 12) {
                    pessoas12 += pessoas;
                }

                canal = sc.nextInt();
            }

        int total = pessoas4 + pessoas5 + pessoas9 + pessoas12;

        // só mostra as audiências se pelo menos alguma pessoa acessa algum canal 
        if (total > 0) {
            System.out.println(
                    "Percentual de audiência do canal 4: "
                                // cálculo da porcentagem
                            + (pessoas4 * 100.0 / total) + "%");

            System.out.println(
                    "Percentual de audiência do canal 5: "
                                 // cálculo da porcentagem
                            + (pessoas5 * 100.0 / total) + "%");

            System.out.println(
                    "Percentual de audiência do canal 9: "
                                 // cálculo da porcentagem
                            + (pessoas9 * 100.0 / total) + "%");

            System.out.println(
                    "Percentual de audiência do canal 12: "
                                 // cálculo da porcentagem
                            + (pessoas12 * 100.0 / total) + "%");
        }

        sc.close();
    }
}
