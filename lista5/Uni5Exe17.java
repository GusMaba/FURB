import java.util.Scanner;

public class Uni5Exe17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int inscricao = teclado.nextInt();

        int inscricaoMaior = 0;
        int inscricaoMenor = 0;

        double maior = 0;
        double menor = 0;
        double soma = 0;

        int quantidade = 0;

        while (inscricao != 0) {
            double altura = teclado.nextDouble();

            if (quantidade == 0) {
                maior = altura;
                menor = altura;
                inscricaoMaior = inscricao;
                inscricaoMenor = inscricao;
            } else {
                if (altura > maior) {
                    maior = altura;
                    inscricaoMaior = inscricao;
                }

                if (altura < menor) {
                    menor = altura;
                    inscricaoMenor = inscricao;
                }
            }

            soma += altura;
            quantidade++;

            inscricao = teclado.nextInt();
        }

        if (quantidade > 0) {
            double media = soma / quantidade;

            System.out.println(
                "O atleta mais baixo tem " + menor
                + "m e o seu número de inscrição é " + inscricaoMenor
            );

            System.out.println(
                "O atleta mais alto tem " + maior
                + "m e o seu número de inscrição é " + inscricaoMaior
            );

            System.out.println(
                "A altura média do grupo de atletas é: " + media
            );
        }

        teclado.close();
    }
}
