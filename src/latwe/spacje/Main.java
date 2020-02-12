package latwe.spacje;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            String input = scanner.nextLine();
            System.out.println(format(input));
        } catch (Exception ignore) {
        }

    }

    private static String format(String inputText) {
        String[] array = inputText.split(" ");
        String output = "";

        for (String s : array) {
            output += s.substring(0, 1).toUpperCase() + s.substring(1);
        }
        return output;
    }
}
