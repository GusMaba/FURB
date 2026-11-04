
import java.util.Scanner;

public class Uni6Exe15 {

    static Scanner tec = new Scanner(System.in);

    // Lê e valida um valor positivo
    public static double lerPositivo(String mensagem) {
        double valor;

        do {
            System.out.print(mensagem);
            valor = tec.nextDouble();

            if (valor <= 0) {
                System.out.println("Erro: informe um valor maior que zero.");
            }
        } while (valor <= 0);

        return valor;
    }

    // Lê e valida uma taxa de juros não negativa
    public static double lerTaxa() {
        double taxa;

        do {
            System.out.print("Taxa de juros mensal (%): ");
            taxa = tec.nextDouble();

            if (taxa < 0) {
                System.out.println("Erro: a taxa nao pode ser negativa.");
            }
        } while (taxa < 0);

        return taxa / 100.0;
    }

    // Lê e valida a quantidade de prestações
    public static int lerPrestacoes() {
        int quantidade;

        do {
            System.out.print("Quantidade de prestacoes: ");
            quantidade = tec.nextInt();

            if (quantidade <= 0) {
                System.out.println("Erro: informe uma quantidade maior que zero.");
            }
        } while (quantidade <= 0);

        return quantidade;
    }

    // a) Calcula o valor da prestação mensal
    public static double calcularPrestacao(
            double capital, double taxa, int quantidade) {

        if (taxa == 0) {
            return capital / quantidade;
        }

        double fator = Math.pow(1 + taxa, quantidade);

        return capital * taxa * fator / (fator - 1);
    }

    // b) Calcula o custo total do financiamento
    public static double calcularCustoTotal(
            double prestacao, int quantidade) {

        return prestacao * quantidade;
    }

    // Opção 1: calcular prestação mensal
    public static void opcao1() {
        System.out.println("\n--- CALCULAR PRESTACAO MENSAL ---");

        double capital = lerPositivo("Valor financiado: R$ ");
        double taxa = lerTaxa();
        int quantidade = lerPrestacoes();

        double prestacao = calcularPrestacao(
                capital, taxa, quantidade);

        System.out.printf("Valor da prestacao: R$ %.2f%n", prestacao);
    }

    // Opção 2: calcular custo total
    public static void opcao2() {
        System.out.println("\n--- CUSTO TOTAL DO FINANCIAMENTO ---");

        double capital = lerPositivo("Valor financiado: R$ ");
        double taxa = lerTaxa();
        int quantidade = lerPrestacoes();

        double prestacao = calcularPrestacao(
                capital, taxa, quantidade);

        double total = calcularCustoTotal(prestacao, quantidade);
        double diferenca = total - capital;

        System.out.printf("Valor da prestacao: R$ %.2f%n", prestacao);
        System.out.printf("Total pago: R$ %.2f%n", total);
        System.out.printf("Diferenca em relacao ao capital: R$ %.2f%n",
                diferenca);
    }

    // c) Simula a amortização da dívida
    public static void simularAmortizacao(
            double capital, double taxa,
            int quantidade, double prestacao) {

        double saldo = capital;

        System.out.println("\n--- SIMULACAO DA AMORTIZACAO ---");

        System.out.printf("%-10s %15s %15s %15s %15s%n",
                "Prestacao", "Saldo inicial", "Juros",
                "Amortizacao", "Saldo final");

        for (int mes = 1; mes <= quantidade; mes++) {
            double saldoInicial = saldo;
            double juros = saldoInicial * taxa;
            double amortizacao = prestacao - juros;

            if (amortizacao > saldo) {
                amortizacao = saldo;
            }

            saldo = saldoInicial - amortizacao;

            if (Math.abs(saldo) < 0.01) {
                saldo = 0;
            }

            System.out.printf("%-10d R$ %12.2f R$ %12.2f R$ %12.2f R$ %12.2f%n",
                    mes, saldoInicial, juros, amortizacao, saldo);

            if (saldo <= 0) {
                break;
            }
        }
    }

    // Opção 3: recebe os dados e chama a simulação
    public static void opcao3() {
        System.out.println("\n--- SIMULAR AMORTIZACAO ---");

        double capital = lerPositivo("Valor financiado: R$ ");
        double taxa = lerTaxa();
        int quantidade = lerPrestacoes();

        double prestacao = calcularPrestacao(
                capital, taxa, quantidade);

        System.out.printf("Prestacao fixa: R$ %.2f%n", prestacao);

        simularAmortizacao(capital, taxa, quantidade, prestacao);
    }

    // Opção 4: compara dois financiamentos
    public static void opcao4() {
        System.out.println("\n--- COMPARAR DOIS FINANCIAMENTOS ---");

        System.out.println("\nFinanciamento 1:");
        double capital1 = lerPositivo("Valor financiado: R$ ");
        double taxa1 = lerTaxa();
        int quantidade1 = lerPrestacoes();

        double prestacao1 = calcularPrestacao(
                capital1, taxa1, quantidade1);
        double total1 = calcularCustoTotal(prestacao1, quantidade1);

        System.out.println("\nFinanciamento 2:");
        double capital2 = lerPositivo("Valor financiado: R$ ");
        double taxa2 = lerTaxa();
        int quantidade2 = lerPrestacoes();

        double prestacao2 = calcularPrestacao(
                capital2, taxa2, quantidade2);
        double total2 = calcularCustoTotal(prestacao2, quantidade2);

        System.out.println("\n--- RESULTADO DA COMPARACAO ---");

        System.out.printf("Financiamento 1 - Prestacao: R$ %.2f | Total: R$ %.2f%n",
                prestacao1, total1);
        System.out.printf("Financiamento 2 - Prestacao: R$ %.2f | Total: R$ %.2f%n",
                prestacao2, total2);

        if (Math.abs(total1 - total2) < 0.01) {
            System.out.println("Os dois financiamentos possuem o mesmo custo total.");
        } else if (total1 < total2) {
            System.out.printf("O financiamento 1 e mais barato por R$ %.2f.%n",
                    total2 - total1);
        } else {
            System.out.printf("O financiamento 2 e mais barato por R$ %.2f.%n",
                    total1 - total2);
        }
    }

    // Exibe o menu
    public static void exibirMenu() {
        System.out.println("\n===== SIMULADOR DE FINANCIAMENTO =====");
        System.out.println("1 - Calcular o valor da prestacao mensal");
        System.out.println("2 - Calcular o custo total do financiamento");
        System.out.println("3 - Simular a amortizacao de uma divida");
        System.out.println("4 - Comparar dois financiamentos");
        System.out.println("0 - Encerrar o programa");
        System.out.print("Escolha uma opcao: ");
    }

    public static void main(String[] args) {
        int opcao;

        do {
            exibirMenu();
            opcao = tec.nextInt();

            switch (opcao) {
                case 1:
                    opcao1();
                    break;

                case 2:
                    opcao2();
                    break;

                case 3:
                    opcao3();
                    break;

                case 4:
                    opcao4();
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }

        } while (opcao != 0);

        tec.close();
    }
}
