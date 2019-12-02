package latwe.zabawne_dodawanie_piotrusia;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int howMany = scanner.nextInt();
            int i = 0;

            while (i < howMany) {
                int number = scanner.nextInt();
                int counter = 0;
                while (!isPalindrome(reverse(number), number)) {
                    number = number + reverse(number);
                    counter++;
                }

                System.out.println(number + " " + counter);
                i++;
            }

        } catch (Exception ignore) {
        }
    }

    private static boolean isPalindrome(int reversedNumber, int number) {
        return reversedNumber == number;
    }

    private static int reverse(int number) {
        int result = 0;
        while (number != 0) {
            result = result * 10 + number % 10;
            number = number / 10;
        }
        return result;
    }

}
