package latwe.NWD;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int t = scanner.nextInt();
            int number1, number2;
            scanner = new Scanner(System.in);

            for (int i = 0; i < t; i++) {
                if (scanner.hasNextLine()) {
                    String text = scanner.nextLine();
                    String[] array = text.split(" ");
                    number1 = Integer.parseInt(array[0]);
                    number2 = Integer.parseInt(array[1]);
                    System.out.println(nwd(number1, number2));
                }
            }
        }
    }

    private static int nwd(int num1, int num2) {
        int pom;

        while (num2 != 0) {
            pom = num2;
            num2 = num1 % num2;
            num1 = pom;
        }
        return num1;
    }
}

