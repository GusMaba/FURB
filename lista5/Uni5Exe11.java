public class Uni5Exe11 {
    public static void main(String[] args) {
        int biscoitos = 1;
        int total = 0;

        for (int hora = 1; hora <= 16; hora++) {
            total += biscoitos;
            biscoitos *= 3;
        }

        System.out.println("Total de biscoitos quebrados: " + total);
    }
}
