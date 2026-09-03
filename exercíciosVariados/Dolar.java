import java.util.Scanner;

public class Dolar {
    
    public static void main(String[] args) {
        //declaração de variáveis
        float dolares, cotacao, reais;

        //definir o teclado
        Scanner tec = new Scanner (System.in);

        System.out.println("Informe o valor em dólares");
        dolares = tec.nextFloat();

        System.out.println("Informe a cotação do dólar");
        cotacao = tec.nextFloat();

        //conversão de dólares pra reais
       reais = dolares * cotacao;

       //escrever resultado
       System.out.println("Valor em reais =" + reais);

     }
}
