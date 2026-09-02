import java.util.Scanner;

public class Uni4Exe12 {

      public static void main(String[] args) {

            // ler teclado
            Scanner tec = new Scanner(System.in);

            System.out.println("Digite o primeiro lado do triângulo");
            int lado1 = tec.nextInt();
            System.out.println("Digite o segundo lado do triângulo");
            int lado2 = tec.nextInt();
            System.out.println("Digite o terceiro lado do triângulo");
            int lado3 = tec.nextInt();

            if (lado1 == lado2 && lado1 == lado3) {
                  System.out.println("Marquinhos é o caçula");
            } else {
                  if (lado1 != lado2 && lado1 == lado3) {
                        System.out.println("Zezinho é o caçula");
                  } else {
                        System.out.println("Luluzinha é a caçula");

                  }

            }
      }
}