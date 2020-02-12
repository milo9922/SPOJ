package latwe.nwd;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int i = 0;
            int howMany = scanner.nextInt();
            scanner.nextLine();

            while (i < howMany) {
                String[] input = scanner.nextLine().split(" ");
                int number1 = Integer.parseInt(input[0]);
                int number2 = Integer.parseInt(input[1]);
                System.out.println(nwd(number1, number2));
                i++;
            }
        } catch (Exception ignore) {
        }
    }

    private static boolean isDividable(int number, int divider) {
        return number % divider == 0;
    }

    private static int nwd(int a, int b) {
        while (!isDividable(a, b)) {
            int temp = a % b;
            a = b;
            b = temp;
        }

        return b;
    }
}
