package latwe.nowa_dzialka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int numberOfSets = scanner.nextInt();

            for (int i = 0; i < numberOfSets; i++) {
                int steps = scanner.nextInt();
                System.out.println(square(steps));
            }
        } catch (Exception ignore) {
        }
    }

    private static int square(int number) {
        return number * number;
    }
}
