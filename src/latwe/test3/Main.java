package latwe.test3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int previousNumber = 42;
            int counter = 0;
            int currentNumber;

            while (counter < 3) {
                currentNumber = scanner.nextInt();
                if (currentNumber == 42 && previousNumber != 42) {
                    ++counter;
                }
                System.out.println(currentNumber);
                previousNumber = currentNumber;
            }
        } catch (Exception ignore) {
        }
    }

}
