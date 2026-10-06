import java.util.Scanner;

public class Uni5Exe04 {

    public static void main(String[] args) {

        double X = 0, S = 0, numerador = 3, denominador = 2;

        S = numerador / denominador;
        X += S;
        
        for (int i = 0; i <= 18; i++) {

            numerador = numerador + 2;
            denominador = denominador + 4 + 2 * i;
            S = numerador / denominador;
            X += S;
            
            
        }   
            System.out.println(X);
            
            

    }
}
