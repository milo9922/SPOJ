package latwe.zliczacz_liter;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int numberOfRows = scanner.nextInt();
            String text = "";
            scanner.nextLine();

            for (int i = 0; i < numberOfRows; i++) {
                text += scanner.nextLine();
            }
            printResult(getAlphabet(text));

        } catch (Exception ignore) {
        }
    }

    private static int[] getAlphabet(String text) {
        int[] alphabet = new int[52];
        for (int i = 0; i < text.length(); i++) {
            char currentLetter = text.charAt(i);
            int numericValueOfLetter = (int) currentLetter;

            if (Character.isLowerCase(currentLetter)) {
                alphabet[numericValueOfLetter - 97]++;
            } else if (Character.isUpperCase(currentLetter)) {
                alphabet[numericValueOfLetter - 65 + 26]++;
            }

        }
        return alphabet;
    }

    private static void printResult(int[] alphabet) {
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] != 0) {
                if (i < 26) {
                    int numericValueOfLetter = i + 97;
                    System.out.println(((char) numericValueOfLetter) + " " + alphabet[i]);
                } else {
                    int numericValueOfLetter = i + 39;
                    System.out.println((char) numericValueOfLetter + " " + alphabet[i]);
                }
            }
        }
    }

}
