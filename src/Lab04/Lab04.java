package Lab04;

public class Lab04 {
    public static void main(String[] args) {
        String input = "+5 -1 +9 +5 -7 +5 -3 +2 -4 +6 +8";
//        String input = "-5 -1";
        String[] inputNoWhiteSpace = input.split("\\s");

        String indexOneValue = String.valueOf(inputNoWhiteSpace[0].charAt(1));
        char operation = inputNoWhiteSpace[0].charAt(0);
        int result = Integer.parseInt(operation + indexOneValue);
//        char operation = operatorOfIndexOne;
        int operand = 0;
        for (int i = 1; i < inputNoWhiteSpace.length; i++) {
            operation = inputNoWhiteSpace[i].charAt(0);
            operand = Integer.parseInt(String.valueOf(inputNoWhiteSpace[i].charAt(1)));
            result = calculator(result, operation, operand);
        }


        System.out.println("The total is:" + result);
        alternateMethod(input);
    }

    // Alkternate method shown by instructor
    private static void alternateMethod(String input) {
        String[] items = input.split(" ");
        int total = 0;
        for (String item : items) {
            int num = Integer.parseInt(item);
            total += num;
        }
        System.out.println("Alternate method Solution:" + total);

    }

    private static int calculator(int result, char operation, int operand) {
        int total = result;
        switch (operation) {
            case '+':
                total = result + operand;

                break;

            case '-':
                total = result - operand;

            default:

        }
        return total;
    }


}
