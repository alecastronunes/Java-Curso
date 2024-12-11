public class ResultadoEscolar {
    public static void main(String[] args) {
        float nota = 6.9f;

        if (nota >= 7) {
            System.out.println("Aprovado!!!");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Recuperação!!!");
        } else {
            System.out.println("Reprovado!!!");
        }
    }
}
