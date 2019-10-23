package latwe.flamaster;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        shortVersion();
    }

    private static void shortVersion() {
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();

        for (int i = 0; i <= c; i++) {
            String word = scanner.nextLine();
            char[] array = word.toCharArray();
            String result = "";
            int j = 0;
            while (j < word.length()) {
                int counter = 1;
                char actualCharacter = array[j];
                j++;
                for (; j < word.length() && array[j] == actualCharacter; j++) {
                    counter++;
                }
                if (counter == 1) {
                    result += Character.toString(actualCharacter);
                } else if (counter == 2) {
                    result += Character.toString(actualCharacter);
                    result += Character.toString(actualCharacter);
                } else {
                    result += Character.toString(actualCharacter) + counter;
                }
            }
            System.out.println(result);
        }

    }
}
