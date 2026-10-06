public class Uni5Exe22 {
    public static void main(String[] args) {
        int anoAtual = 2026;

        double salario = 2000;
        double percentual = 1.5;

        for (int ano = 1996; ano <= anoAtual; ano++) {
            salario += salario * percentual / 100;

            if (ano >= 1997) {
                percentual *= 2;
            }
        }

        System.out.printf(
            "Salário atual: R$%.2f%n",
            salario
        );
    }
}
