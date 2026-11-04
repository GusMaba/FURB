
import java.util.Scanner;

public class Uni6Exe12 {

    // a) Verifica se o CPF possui exatamente 11 algarismos
    public static boolean tamanhoValido(String cpf) {
        return cpf.length() == 11;
    }

    // Verifica se todos os caracteres são algarismos
    public static boolean somenteNumeros(String cpf) {
        for (int i = 0; i < cpf.length(); i++) {
            if (!Character.isDigit(cpf.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    // Verifica se todos os algarismos são iguais
    public static boolean todosIguais(String cpf) {
        for (int i = 1; i < cpf.length(); i++) {
            if (cpf.charAt(i) != cpf.charAt(0)) {
                return false;
            }
        }
        return true;
    }

    // b) Calcula o primeiro dígito verificador
    public static int calcularPrimeiroDigito(String cpf) {
        int soma = 0;

        for (int i = 0; i < 9; i++) {
            int numero = Character.getNumericValue(cpf.charAt(i));
            soma += numero * (10 - i);
        }

        int resto = soma % 11;

        if (resto < 2) {
            return 0;
        } else {
            return 11 - resto;
        }
    }

    // c) Calcula o segundo dígito verificador
    public static int calcularSegundoDigito(String cpf, int primeiroDigito) {
        int soma = 0;

        for (int i = 0; i < 9; i++) {
            int numero = Character.getNumericValue(cpf.charAt(i));
            soma += numero * (11 - i);
        }

        soma += primeiroDigito * 2;

        int resto = soma % 11;

        if (resto < 2) {
            return 0;
        } else {
            return 11 - resto;
        }
    }

    // d) e) Valida o CPF utilizando os métodos anteriores
    public static boolean validarCPF(String cpf) {
        if (!tamanhoValido(cpf) || !somenteNumeros(cpf)) {
            return false;
        }

        if (todosIguais(cpf)) {
            return false;
        }

        int primeiroDigito = calcularPrimeiroDigito(cpf);
        int segundoDigito = calcularSegundoDigito(cpf, primeiroDigito);

        int digitoInformado1 =
                Character.getNumericValue(cpf.charAt(9));

        int digitoInformado2 =
                Character.getNumericValue(cpf.charAt(10));

        return primeiroDigito == digitoInformado1
                && segundoDigito == digitoInformado2;
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.print("Digite o CPF (11 algarismos): ");
        String cpf = tec.nextLine();

        if (!tamanhoValido(cpf)) {
            System.out.println("CPF invalido: deve conter exatamente 11 algarismos.");
        } else if (!somenteNumeros(cpf)) {
            System.out.println("CPF invalido: digite somente algarismos.");
        } else if (todosIguais(cpf)) {
            System.out.println("CPF invalido: todos os algarismos sao iguais.");
        } else {
            int primeiroDigito = calcularPrimeiroDigito(cpf);
            int segundoDigito = calcularSegundoDigito(cpf, primeiroDigito);

            System.out.println("Primeiro digito calculado: " + primeiroDigito);
            System.out.println("Segundo digito calculado: " + segundoDigito);

            if (validarCPF(cpf)) {
                System.out.println("CPF valido segundo o algoritmo de verificacao.");
            } else {
                System.out.println("CPF invalido.");
            }
        }

        tec.close();
    }
}
