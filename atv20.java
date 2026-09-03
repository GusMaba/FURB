import java.util.Scanner;

public class atv20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float nota1, nota2, nota3, media, notaExercícios;

        System.out.println("informe a primeira nota :");
        nota1 = sc.nextFloat();

        System.out.println("informe a segundo nota :");
        nota2 = sc.nextFloat();

        System.out.println("informe a terceira nota :");
        nota3 = sc.nextFloat();

        System.out.println("informe a média dos exercícios");
        notaExercícios = sc.nextFloat();

        media = (nota1 + nota2 * 2 + nota3 * 3 +  notaExercícios)/7;

        if (media >= 9) {
            System.out.println("conceito A");
        }
        else if (media>= 7.5 && media < 9.0	) {
            System.out.println("conceito B");
        }
        else if (media>= 6 && media < 7.5	) {
            System.out.println("conceito C");
        }
        else if (media>= 4 && media < 6	) {
            System.out.println("conceito D");
        }
        else if (media < 4) {
            System.out.println("conceito E");
        }
    }
}
