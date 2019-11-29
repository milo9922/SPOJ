package latwe.pesel;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InputMismatchException {
        try {
            Scanner scanner = new Scanner(System.in);
            int numberOfSets = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < numberOfSets; i++) {
                String pesel = scanner.nextLine();
                peselValidator(pesel);
            }
        } catch (Exception ignore) {
        }
    }


    private static void peselValidator(String pesel) {
        try {
            char[] peselCharArray = pesel.toCharArray();
            int[] peselArray = new int[11];

            for (int i = 0; i < peselCharArray.length; i++) {
                peselArray[i] = Character.getNumericValue(peselCharArray[i]);
            }

            int sum = 0;
            int[] sumMultiply = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3, 1};

            for (int i = 0; i < 11; i++) {
                sum = sum + peselArray[i] * sumMultiply[i];
            }

            if (sum > 0) {
                if (sum % 10 == 0) {
                    System.out.println('D');
                } else {
                    System.out.println('N');
                }
            }

        } catch (Exception ignore) {
        }
    }
}
