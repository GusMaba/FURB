import java.util.Scanner;

public class Uni7Exe05 {

    private Scanner sc = new Scanner(System.in);

    /**
     *
     * @param respostas
     * @param rapaz
     * @param moca
     */
    private void preenchedor(String[] respostas, String[] rapaz, String[] moca) {
        for (int i = 0; i < 5; i++) {
            System.out.println(respostas[i]);
            rapaz[i] = sc.next();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(respostas[i]);
            moca[i] = sc.next();
        }
    }

    private int contagem(String[] rapaz, String[] moca, int contagem) {
        for (int i = 0; i < 5; i++) {

            // precisa por o valor de refencia "SIM" aqui
            if (rapaz[i].equals("SIM") && moca[i].equals("SIM")) {
                contagem += 3;
            }
            // precisa por o valor de refencia "NÃO" aqui
            else if (rapaz[i].equals("NÃO") && moca[i].equals("NÃO")) {
                contagem -= 1;
            } else {
                contagem += 1;
            }
        }
        return contagem;
    }

    private String relacionador(int contagem) {
        String mensagem = "";
        if (contagem == 15) {
            mensagem = "Casem";
        } else if (contagem <= 14 && contagem >= 10) {
            mensagem = "Vocês têm muita coisa em comum!";
        } else if (contagem <= 9 && contagem >= 5) {
            mensagem = "Talvez não dê certo :(";
        } else if (contagem <= 4 && contagem >= 0) {
            mensagem = "Vale um encontro.";
        } else if (contagem <= -10) {
            mensagem = "Vocês se odeiam!";
        } else {
            mensagem = "Melhor não perder tempo";
        }
        return mensagem;
    }

    public static void main(String[] args) {
        Uni7Exe05 exe05 = new Uni7Exe05();

        String respostas[] = new String[5];
        respostas[0] = "Gosta de música sertaneja?(responda com: SIM, NÃO OU IND(indiferente))";
        respostas[1] = "Gosta de futebol?";
        respostas[2] = "Gosta de seriados?";
        respostas[3] = "Gosta de redes sociais?";
        respostas[4] = "Gosta da Oktoberfest?";
        String rapaz[] = new String[5];
        String moca[] = new String[5];
        int contagem = 0;
        String mensagem = "";
        exe05.preenchedor(respostas, rapaz, moca);
        contagem = exe05.contagem(rapaz, moca, contagem);
        mensagem = exe05.relacionador(contagem);
        System.out.println(mensagem);
    }
}
