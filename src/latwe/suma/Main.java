package latwe.suma;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int sum = 0;
            while (scanner.hasNext()) {
                int number = scanner.nextInt();
                sum += number;
                System.out.println(sum);
            }

        } catch (Exception ignore) {
        }
    }
}
