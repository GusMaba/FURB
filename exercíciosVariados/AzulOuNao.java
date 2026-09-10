import java.util.Scanner;

public class AzulOuNao {
  public static void main(String[] args) {
    Scanner tec = new Scanner(System.in);
    // fazer a pergunta
    System.out.println("A cor é azul? (responda S/N)");
    char resposta = tec.next().charAt(0);
    // testar a resposta
    if (resposta == 'S') {
      System.out.println("Sim");
    } else {
      System.out.println("Não");
    }

  }
}
