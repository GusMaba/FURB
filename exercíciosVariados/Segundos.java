import java.util.Scanner;

public class Segundos {

public static void main(String[] args){
        //declaração de variáveis
        int duracao, segundos, horas, minutos; 

        //definir o teclado
        Scanner tec = new Scanner (System.in);
        
        //ler duração
         System.out.println("Digite a duração (em segundos)");
        duracao = tec.nextInt();

        //calcular duração em horas, minutos e segundos
        horas = duracao / 3600;
        minutos = duracao % 3600 / 60;
        segundos = duracao % 3600 % 60;

        //mostrar horas
        System.out.println("Valor em horas, minutoes e segundos");
         System.out.println(horas + ":" + minutos + ":" + segundos);
        
}

}
