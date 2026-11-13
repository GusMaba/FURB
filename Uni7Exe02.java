import java.util.Scanner;

public class Uni7Exe02
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //criar vetor
        int numero [] = new int [10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Digita o número da posição " + i + " do vetor");
            numero[i] = sc.nextInt();           
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println("Vetor[" + i + "] = " + numero[i]);
        }
    }
    
}