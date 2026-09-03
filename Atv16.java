import java.util.Scanner;

public class Atv16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int HomemN, HomemV, MulherN, MulherV, soma, produto;

        System.out.println("Informe a idade do homem mais novo");
        HomemN = sc.nextInt();

        System.out.println("Informe a idade do homem mais velho");
        HomemV = sc.nextInt();

        System.out.println("Informe a idade da mulher mais nova");
        MulherN = sc.nextInt();

        System.out.println("Informe a idade do mulher mais nova");
        MulherV = sc.nextInt();

        HomemN = Math.min(HomemN, HomemV);
        HomemV = Math.max(HomemN, HomemV);
        MulherN = Math.min(MulherN, MulherV);
        MulherV = Math.max(MulherN, MulherV);

        soma = HomemV + MulherN;

        produto = HomemN * MulherV;

        System.out.println("Soma: " + soma + " Produto: " + produto);

    }
}
