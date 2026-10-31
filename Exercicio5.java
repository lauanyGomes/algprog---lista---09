import java.util.Scanner;

public class Exercicio5 {

    public static double somaImposto(double taxaImposto, double custo) {

        double imposto = custo * (taxaImposto / 100);

        return custo + imposto;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o custo do produto:");
        double custo = entrada.nextDouble();

        System.out.println("Digite a taxa de imposto:");
        double taxa = entrada.nextDouble();

        double resultado = somaImposto(taxa, custo);

        System.out.println("Valor com imposto: " + resultado);

        entrada.close();
    }
}
