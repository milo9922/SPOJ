package latwe.dwumiany;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOfSets = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numberOfSets; i++) {
            String numbers = scanner.nextLine();
            String[] numbersArray = numbers.split(" ");
            int n = Integer.parseInt(numbersArray[0]);
            int k = Integer.parseInt(numbersArray[1]);

            System.out.println(newton(n, k));
        }

    }

    //TODO: Poprawić metodę newton (SPOJ: Przekroczono limit czasu)
    private static long newton(int n, int k) {
        if (k > n / 2) {
            k = n - k;
        }
        if (k == 0) {
            return 1L;
        }
        return newton(n - 1, k - 1) + newton(n - 1, k);
    }
}
