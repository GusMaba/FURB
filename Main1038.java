
import java.util.Scanner;

public class Main1038 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int codigo;
        float valor,quantidade;

        codigo = sc.nextInt();
        quantidade = sc.nextFloat();

        if(codigo == 1){
            valor = quantidade * 4;
            System.out.println("Total: R$ "+ valor);
        }
        else if(codigo == 2){
            valor = quantidade * 4.50f;
            System.out.println("Total: R$ "+ valor);
        }
        else if(codigo == 3){
            valor = quantidade * 5;
            System.out.println("Total: R$ "+ valor);
        }
        else if(codigo == 4){
            valor = quantidade * 2;
            System.out.println("Total: R$ "+ valor);
        }
        else if(codigo == 5){
            valor = quantidade * 1.50f;
            System.out.println("Total: R$ "+ valor);
        }


    }
}
