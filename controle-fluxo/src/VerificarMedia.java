import java.util.Locale;
import java.util.Scanner;

public class VerificarMedia {
    public static void main(String[] args) {
        // Todo: Crie um programa que peça ao usuário para inserir as notas de um aluno.
        // O programa deve permitir que o usuário insira várias notas (quantidade
        // indefinida) e finalize a entrada digitando um número negativo. Depois, o
        // programa deve calcular a média das notas e informar se o aluno foi aprovado
        // (média >= 7), ficou de recuperação (média entre 5 e 6.9) ou foi reprovado
        // (média < 5).

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int finalizaEntrada = 0;
        int soma = 0;
        int contador = 0;
        float resultado = 0;
        boolean continua = true;

        while (continua == true) {
            System.out.println("Insira um nota: ");
            int nota = sc.nextInt();
            finalizaEntrada = nota;
            if (finalizaEntrada >= 0) {
                soma += nota;
                contador++;
            } else {
                continua = false;
            }
        }

        resultado = soma / contador;

        if (resultado >= 7) {
            System.out.printf("Aprovado, o valor da média é: %.2f", resultado);
        } else if (resultado >= 5 && resultado <= 6.9) {
            System.out.printf("Recuperação, o valor da média é: %.2f", resultado);
        } else {
            System.out.printf("Reprovador, o valor da média é: %.2f", resultado);
        }
        sc.close();
    }
}
