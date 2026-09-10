import java.util.Scanner;
public class Teste {
    public static void main(String[] args) {
        System.out.println("Meu primeiro programa em Java");

        //declarar as variáveis
        float A;
        float B;
        float Média;

        //criar uma variável para o teclado
        Scanner tec = new Scanner (System.in);

        //entrada dos dados
        A = tec.nextFloat();
        B = tec.nextFloat();

        //calcular a média
        Média = (A * 3.5f + B * 7.5f) / 11 ;

        //escrever a média
        System.out.println("Média = " + Média);

}
}
