import java.util.Scanner;

public class Exercicio3 {

    public static int somar(int a, int b, int c) {

        return a + b + c;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite três números:");

        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();

        int resultado = somar(a, b, c);

        System.out.println("Resultado: " + resultado);

        entrada.close();
    }
}
