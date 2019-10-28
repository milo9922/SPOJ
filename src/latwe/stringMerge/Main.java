package latwe.stringMerge;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int numberOfSets = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < numberOfSets; i++) {
                String text = scanner.nextLine();
                String[] textArray = text.split(" ");
                char[] word1 = textArray[0].toCharArray();
                char[] word2 = textArray[1].toCharArray();
                int shorterWordLength = Math.min(word1.length, word2.length);
                String result = "";

                for (int j = 0; j < shorterWordLength; j++) {
                    result += Character.toString(word1[j]) + Character.toString(word2[j]);
                }
                System.out.println(result);
            }
        } catch (Exception ignore) {
        }
    }
}
