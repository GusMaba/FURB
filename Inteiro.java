import java.util.Scanner;

public class Inteiro {

public static void main(String[] args){

     //declaração de variáveis
    int valor, nota100, nota50, nota20, nota10, nota5, nota2, nota1;

    //definir o teclado
    Scanner tec = new Scanner (System.in);
     
     //ler Valor
     System.out.println("Digite o Valor");
     valor = tec.nextInt();

     //Calcule a quantidade de notas de cada tipo
     nota100 = valor / 100;
     nota50 = valor % 100 / 50;
     nota20 = valor % 100 % 50 /20;
     nota10 = valor % 100 % 50 % 20 / 10;
     nota5 = valor % 100 % 50 % 20 % 10 / 5;
     nota2 = valor % 100 % 50 % 20 % 10 % 5 / 2;
     nota1 = valor % 100 % 50 % 20 % 10 % 5 % 2;

     //mostrar a quantidade de notas
     System.out.println("Notas de 100 =" + nota100);
     System.out.println("Notas de 50 =" + nota50);
     System.out.println("Notas de 20 =" + nota20);
     System.out.println("Notas de 10 =" + nota10);
     System.out.println("Notas de 5 =" + nota5);
     System.out.println("Notas de 2 =" + nota2);
     System.out.println("Notas de 1 =" + nota1);
     
    }
}
