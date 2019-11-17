package latwe.kalkulator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            while (scanner.hasNextLine()) {
                String inputData = scanner.nextLine();
                String[] inputArray = inputData.split(" ");
                int result;

                switch (inputArray[0]) {
                    case "+":
                        result = Integer.parseInt(inputArray[1]) + Integer.parseInt(inputArray[2]);
                        System.out.println(result);
                        break;

                    case "-":
                        result = Integer.parseInt(inputArray[1]) - Integer.parseInt(inputArray[2]);
                        System.out.println(result);
                        break;

                    case "*":
                        result = Integer.parseInt(inputArray[1]) * Integer.parseInt(inputArray[2]);
                        System.out.println(result);
                        break;

                    case "/":
                        result = Integer.parseInt(inputArray[1]) / Integer.parseInt(inputArray[2]);
                        System.out.println(result);
                        break;

                    case "%":
                        result = Integer.parseInt(inputArray[1]) % Integer.parseInt(inputArray[2]);
                        System.out.println(result);
                        break;

                    default:
                        break;
                }
            }
        } catch (Exception ignore) {
        }
    }
}
