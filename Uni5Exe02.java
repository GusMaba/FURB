import java.util.Scanner;

public class Uni5Exe02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, numero, impar = 0, par = 0;

        for (i = 1; i <= 5; i++) {
            numero = sc.nextInt();
            if (numero % 2 == 0) {
            par +=numero;              
            } else {
            impar +=numero;
            }
            System.out.println("Soma dos numeros pares: "+ par);
            System.out.println("Soma dos numeros ímpares: "+ impar);
        }
        

    }
}