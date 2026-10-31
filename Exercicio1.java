import java.util.Scanner;

public class Exercicio1 {

    public static String imprimir(int n) {

        String resultado = "";

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                resultado += i + " ";
            }

            resultado += "\n";
        }

        return resultado;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número:");
        int n = entrada.nextInt();

        System.out.println(imprimir(n));

        entrada.close();
    }
}

