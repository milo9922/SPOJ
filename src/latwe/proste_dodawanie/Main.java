package latwe.proste_dodawanie;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        simpleAdd();
    }

    private static void simpleAdd() {
        try {
            Scanner scanner = new Scanner(System.in);
            int numberOfSets = scanner.nextInt();
            int result;

            for (int i = 0; i < numberOfSets; i++) {
                int howManyNumbers = scanner.nextInt();
                scanner.nextLine();

                if (howManyNumbers > 0) {
                    int[] numbersArray = new int[howManyNumbers];
                    result = 0;
                    String text = scanner.nextLine();
                    String[] inputArray = text.split(" ");

                    for (int j = 0; j < howManyNumbers; j++) {
                        numbersArray[j] = Integer.parseInt(inputArray[j]);
                        result = result + numbersArray[j];
                    }
                    System.out.println(result);
                }
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
