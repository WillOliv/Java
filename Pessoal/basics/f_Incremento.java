package basics;

public class f_Incremento {
    public static void main(String[] args) {

        int a, b, c, x, y, z;

        a = 1;
        b = 1;
        c = 1;

        x = a + 1;
        y = ++b;
        z = c++;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
        a += 1;
        System.out.println(a);
    }
}
