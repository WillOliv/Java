package basics;

import java.util.Scanner;

public class e_InputThings {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ///
        System.out.print("String : ");
        String str = input.nextLine();

        System.out.print("Float : ");
        float numFloat = input.nextFloat();

        System.out.print("Double : ");
        double numDouble = input.nextDouble();

        System.out.print("Int : ");
        int numInt = input.nextInt();

        System.out.print("Long : ");
        long numLong = input.nextLong();

        System.out.print("Byte : ");
        byte numByte = input.nextByte();

        System.out.print("Boolean : ");
        boolean bool = input.nextBoolean();
        ///
        input.close();
        ///
        System.out.println("\nString is : " + str);
        System.out.println("Float is : " + numFloat);
        System.out.println("Double is : " + numDouble);
        System.out.println("Int is : " + numInt);
        System.out.println("Long is : " + numLong);
        System.out.println("Byte is : " + numByte);
        System.out.println("Boolean is: " + bool);

    }
}
