import java.util.Scanner;

public class atv11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int irmao1, irmao2, irmao3;
        System.out.println("informe idade irmão 1");
        irmao1 = sc.nextInt();
        System.out.println("informe idade irmão 2");
        irmao2 = sc.nextInt();
        System.out.println("informe idade irmão 3");
        irmao3 = sc.nextInt();

        if (irmao2 == irmao1 && irmao2 == irmao3) {
            System.out.println("são trigêmeos");
        

        } else if (irmao2 == irmao1 || irmao2 == irmao3) {
            System.out.println("são gêmeos");

        } else if (irmao3 == irmao1 || irmao3 == irmao2) {
            System.out.println("são gêmeos");

        }else 
        if (irmao1 == irmao2 || irmao1 == irmao3) {
            System.out.println("são gêmeos");
        }
        else{
            System.out.println("são irmãos");
        }
    }
}