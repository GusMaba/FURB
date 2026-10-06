import java.util.*;

public class ex015 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String nome;
        // int nota1, nota2;
        // double media;

        // nome = input.nextLine();
        // while (!nome.equals("fim"))
        // {
        // nota1 = input.nextInt();
        // nota2 = input.nextInt();
        // media = (double) (nota1 + nota2) / 2;
        // System.out.println(media);
        // nome = input.nextLine();
        // }
        // System.out.println("Obrigado pela sua visita");

        // ler nome
        System.out.println("Digite o nome do aluno: ");
        String nome = sc.next();

        // repete até a flag "fim"
        while (!nome.equalsIgnoreCase("fim")) {
            // ler notas
            System.out.println("Digite a nota 1: ");
            double nota1 = sc.nextDouble();

            System.out.println("Digite a nota 2: ");
            double nota2 = sc.nextDouble();

            // calclar média
            double media = (nota1 + nota2) / 2;

            System.out.println("Media = " + media);

            // pega o nome do aluno denovo
            System.out.println("Digite o nome do aluno: ");

            nome = sc.next(); // não pode colocar o tipo de novo, não pode declarar novamente
        }

        sc.close();
    }
}
