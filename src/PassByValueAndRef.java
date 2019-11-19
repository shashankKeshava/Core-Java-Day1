
public class PassByValueAndRef {

    public static void main(String[] args) {
        int x = 10;
        doSomethingWithX(x);
        System.out.println("x : " + x);

        System.out.println();

        int[] numbers = { 1, 2, 3 };
        doSomethingWithNumbers(numbers);
        for (int i : numbers) {
            System.out.println(i);
        }
    }

    static void doSomethingWithNumbers(int[] items) {
        for (int i = 0; i < items.length; i++) {
            items[i] = items[i] * items[i];
        }
    }

    static void doSomethingWithX(int variable) {
        variable = variable * variable;
    }

}