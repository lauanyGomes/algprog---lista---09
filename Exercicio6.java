import java.util.Scanner;

public class Exercicio6 {

    public static int converterHora(int hora) {

        if (hora == 0) {
            return 12;
        } else if (hora > 12) {
            return hora - 12;
        } else {
            return hora;
        }
    }

    public static char converterPeriodo(int hora) {

        if (hora >= 12) {
            return 'P';
        } else {
            return 'A';
        }
    }

    public static void mostrar(int hora, int minuto, char periodo) {

        System.out.printf("%d:%02d %c.M.%n", hora, minuto, periodo);
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        char continuar = 'S';

        while (continuar == 'S') {

            System.out.println("Digite a hora:");
            int hora = entrada.nextInt();

            System.out.println("Digite os minutos:");
            int minuto = entrada.nextInt();

            int horaConvertida = converterHora(hora);

            char periodo = converterPeriodo(hora);

            mostrar(horaConvertida, minuto, periodo);

            System.out.println("Deseja converter outro horário? S/N");
            continuar = entrada.next().toUpperCase().charAt(0);
        }

        entrada.close();
    }
}
