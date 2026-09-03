import java.util.Scanner;

public class Uni4Exe10 {

    public static void main(String[] args) {

        // ler teclado
        Scanner tec = new Scanner(System.in);

        System.out.println("Digite a idade do Marquinhos");
        int valor1 = tec.nextInt();
        System.out.println("Digite a idade do Zezinho");
        int valor2 = tec.nextInt();
        System.out.println("Digite a idade da Luluzinha");
        int valor3 = tec.nextInt();

        if (valor1 < valor2 && valor1 < valor3) {
             System.out.println("Marquinhos é o caçula");
        }else{if (valor2 < valor1 && valor2 < valor3) {
              System.out.println("Zezinho é o caçula");
        }else{
              System.out.println("Luluzinha é a caçula");
        }}
    }

}
