package latwe.flamaster;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        int c;
        int i = 0;
        Scanner scanner2 = new Scanner(System.in);
        try (Scanner scanner = new Scanner(System.in)) {
            c = scanner.nextInt();
            while (i <= c) {
                String word = scanner2.nextLine();
                shortVersion(word);
                i++;
            }
        }

    }

    private static void shortVersion(String word) {
        char[] array = word.toCharArray();
        for (int j = 0; array[j] < array.length; ++j) {
            int counter = 0; // licznik
            for (; array[j] == array[j + 1]; ++j) {
                counter++;
            }
            System.out.println(array[j]);
            if (counter >= 2)
                System.out.println(counter + 1);
            if (counter == 1)
                j--;
        }
    }
}
