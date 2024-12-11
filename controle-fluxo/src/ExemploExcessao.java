import java.text.NumberFormat;

public class ExemploExcessao {
    public static void main(String[] args) {
        Number valor;
        try {
            valor = NumberFormat.getInstance().parse("a1.75");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
