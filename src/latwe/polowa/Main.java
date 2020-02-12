package latwe.polowa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int numberOfSets = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < numberOfSets; i++) {
                String text = scanner.nextLine();
                System.out.println(cutHalf(text));
            }
        } catch (Exception ignore) {
        }
    }

    private static String cutHalf(String text) {
        return text.substring(0, text.length() / 2);
    }
}
