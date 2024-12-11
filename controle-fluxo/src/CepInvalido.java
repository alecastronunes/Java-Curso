import java.util.Scanner;

public class CepInvalido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[10];

        for(int i = 0; i < 10; i++) {
            nomes[i] = sc.nextLine();
        }
        sc.close();
    }
}
