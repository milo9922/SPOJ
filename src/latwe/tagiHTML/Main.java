package latwe.tagiHTML;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            while (scanner.hasNextLine()) {
                String inputText = scanner.nextLine();
                inputText += "\n";
                char[] html_code = inputText.toCharArray();
                int i = 0;

                // if char is placed between '<'  '>' and is lowercase change it to uppercase
                while (i < html_code.length) {
                    if (html_code[i] == '<') {
                        while (html_code[i] != '>') {
                            int numeric = Character.getNumericValue(html_code[i]);
                            if (numeric > 9 && numeric < 36) {
                                html_code[i] = Character.toUpperCase(html_code[i]);
                            }
                            i++;
                        }
                    } else {
                        i++;
                    }
                }
                for (char c : html_code) {
                    System.out.print(c);
                }

            }
        } catch (Exception ignore) {
        }

    }
}
