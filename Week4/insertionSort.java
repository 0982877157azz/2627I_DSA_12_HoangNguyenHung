import java.util.Arrays;

public class insertionSort {
    public static void sort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int current = numbers[i];
            int j = i - 1;

            while (j >= 0 && numbers[j] > current) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = current;
        }
    }

    public static void main(String[] args) {
        int[] numbers;
        if (args.length == 0) {
            numbers = new int[] { 5, 2, 9, 1, 5, 6 };
        } else {
            numbers = new int[args.length];
            for (int i = 0; i < args.length; i++) {
                numbers[i] = Integer.parseInt(args[i]);
            }
        }

        sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
