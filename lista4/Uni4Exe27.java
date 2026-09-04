import java.util.Scanner;

public class Atv27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float horaChegada, minChegada, horaSaida, minSaida, hora = 0, minuto = 0, valor;

        System.out.println("informe apenas a hora da entrada");
        horaChegada = sc.nextFloat();

        System.out.println("informe apenas o minuto da entrada");
        minChegada = sc.nextFloat();

        System.out.println("informe apenas a hora da Saida");
        horaSaida = sc.nextFloat();

        System.out.println("informe apenas o minuto da Saida");
        minSaida = sc.nextFloat();

        if (minChegada > minSaida) {
            horaSaida--;
            minSaida = minSaida + 60;
        }
        
        hora = horaSaida - horaChegada;
        minuto = minSaida - minChegada;
        if (minuto >= 30) {
            hora++;
        }

        if (hora == 1 || hora == 2) {
            valor = hora * 5;
            System.out.println("Preço cobrado = R$"+ valor);
        }
        else if(hora == 3 || hora == 4){
            valor = (hora - 2) * 7.50f + 10;
            System.out.println("Preço cobrado = R$"+ valor);
        }
        else if(hora >= 5){
            valor = (hora - 4) * 10 + 25;
            System.out.println("Preço cobrado = R$"+ valor);
        }
        else{
            System.out.println("Preço cobrado = R$5");
        }










        
    }
}
