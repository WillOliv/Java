import java.util.Random;

public class Exercicio4 {

    public static void main(String[] args) {

        Random generator = new Random();

        int n = 0;
        while(n < 5){
            int number = generator.nextInt(30);
            System.out.println(number);
            n = n + 1;
        }

        for (int n = 0; n < 5; n = n + 1 ){
            int number = generator.nextInt(30);
            System.out.println(number);
        }

    }
}
