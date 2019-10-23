package latwe.liczby_pierwsze;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long turns = Long.valueOf(scanner.nextLine());
        while (turns > 0) {
            Long maybeFirst = Long.valueOf(scanner.nextLine());
            if (isFirst(maybeFirst)) {
                System.out.println("TAK");
            } else {
                System.out.println("NIE");
            }

            turns--;
        }
    }

    private static boolean isFirst(Long value) {
        if (value < 2) {
            return false;
        }
        for (int i = 2; i * i <= value; i++) {
            if (value % i == 0) {
                return false;
            }
        }

        return true;
    }
}