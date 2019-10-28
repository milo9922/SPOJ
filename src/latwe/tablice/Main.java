package latwe.tablice;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int numberOfSets = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < numberOfSets; i++) {
                String inputData = scanner.nextLine();
                String[] inputArray = inputData.split(" ");
                int howManyNumbers = Integer.parseInt(inputArray[0]);
                int[] array = new int[howManyNumbers];

                for (int j = 0; j < array.length; j++) {
                    array[j] = Integer.parseInt(inputArray[j + 1]);
                }
                reverse(array);
                printArray(array);
            }

        } catch (Exception ignore) {
        }
    }

    private static void reverse(int[] array) {
        Stack<Integer> stack = new Stack<>();
        for (int value : array) {
            stack.push(value);
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
    }

    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
