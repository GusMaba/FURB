public class Uni5Exe10 {
    public static void main(String[] args) {
        int quantidade = 0;
        int numero = 1;

        while (quantidade < 10) {
            int quadrado = numero * numero;

            String texto = String.valueOf(quadrado);

            int meio = texto.length() / 2;

            String parte1;
            String parte2;

            if (texto.length() == 1) {
                parte1 = "0";
                parte2 = texto;
            } else {
                parte1 = texto.substring(0, meio);
                parte2 = texto.substring(meio);
            }

            int esquerda = Integer.parseInt(parte1);
            int direita = Integer.parseInt(parte2);

            if (esquerda + direita == numero) {
                System.out.println(numero);
                quantidade++;
            }

            numero++;
        }
    }
}
