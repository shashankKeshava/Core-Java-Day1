package Lab03;

import java.util.Arrays;
import java.util.Scanner;

public class Lab03 {
    public static void main(String[] args) {


        int[] InputArray = new int[3];

        Scanner readInput = new Scanner(System.in);
        System.out.println("Enter number I");
        int num1 = readInput.nextInt();
        InputArray[0] = num1;
        System.out.println("Enter number II");
        int num2 = readInput.nextInt();
        InputArray[1] = num2;
        System.out.println("Enter number III");
        int num3 = readInput.nextInt();
        InputArray[2] = num3;
//        InputArray=[num1,num2,num3];
        calculateSquare(InputArray);
        increment(InputArray);
        doubling(InputArray);
        readInput.close();

    }

    private static void calculateSquare(int... values) {
        for (int i = 0; i < values.length; i++) {
            values[i] = values[i] * values[i];
        }
        System.out.println("calculateSquare:" + Arrays.toString(values));
    }

    private static void increment(int... values) {
        for (int i = 0; i < values.length; i++) {
            values[i] = values[i] + 1;
        }
        System.out.println("Increment:" + Arrays.toString(values));
    }

    private static void doubling(int... values) {
        for (int i = 0; i < values.length; i++) {
            values[i] = values[i] * 2;
        }
        System.out.println("Doubling:" + Arrays.toString(values));
    }

}
