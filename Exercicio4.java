import java.util.Scanner;

public class Exercicio4 {

    public static char verificar(int numero) {

        if (numero > 0) {
            return 'P';
        } else {
            return 'N';
        }
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número:");

        int numero = entrada.nextInt();

        char resultado = verificar(numero);

        System.out.println("Resultado: " + resultado);

        entrada.close();
    }
}
