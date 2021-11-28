package basics;

public class g_Control_Loops {
    public static void main(String[] args) {

        int a, b;

        for (a = 0; a < 40; a++) {
            // % é o resto da divisão
            if (a % 19 == 0) {
                System.out.println(a + " é um número divisível por 19");
            }
        }

        for (b = 0; b < 15; b++) {
            if (b > 5 && b < 10) {
                continue;
            }
            System.out.println(b);
        }
    }
}
