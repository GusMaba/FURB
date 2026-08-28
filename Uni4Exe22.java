import java.util.Scanner;

public class Uni4Exe22 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite 1, 2 ou 3 de acordo com seu curso (1 = Ciência da Computação, 2 = Licenciatura da Computação e 3 = Sistemas de Informação)");
        int variavel = tec.nextInt();
        switch (variavel) {
            case 1:
                System.out.println("o título será de Bacharel em Ciência da Computação");
                break;
            case 2:
                System.out.println("o título será de Licenciado em Computação");
                break;
            case 3:
                System.out.println("o título será de Bacharel em Sistemas de informação");
                break;
            default:
                break;
        }
    }
}
