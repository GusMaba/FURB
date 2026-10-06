import java.util.Scanner;

public class Uni5Exe09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos: ");
        int n = sc.nextInt();
        sc.nextLine();

        String nomes18 = "";
        int quantidadeAcima20 = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine();

            if (idade == 18) {
                if (!nomes18.isEmpty()) {
                    nomes18 += " e ";
                }
                nomes18 += nome;
            }

            if (idade > 20) {
                quantidadeAcima20++;
            }
        }

        System.out.println("Nomes dos alunos que tem 18 anos: " + nomes18);
        System.out.println("Quantidade de alunos que tem idade acima de 20 anos: " + quantidadeAcima20);

        sc.close();
    }

}
