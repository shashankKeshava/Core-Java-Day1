package Lab02;

import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner reader = new Scanner(System.in);
        int input = reader.nextInt();
        int result = squaring(input);
        result = incrementing(result);
        result = doubleNum(result);
        System.out.println("Output:" + result);


        // TODO: Redo using methods
    }

    private static int squaring(int value) {
        int square = value * value;
        System.out.println("Square:" + square);
        return square;
    }

    private static int incrementing(int value) {
        int increment = value + 1;
        System.out.println("Increment:" + increment);
        return increment;
    }

    private static int doubleNum(int value) {
        int doubling = value * 2;
        System.out.println("Double:" + doubling);
        return doubling;
    }
}
