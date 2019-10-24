package latwe.przedszkolanka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        candies();
    }

    //wynikiem jest wspólna wielokrotność dwóch podanych przez użytkownika
    private static void candies() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i <= n; i++) {
            String children = scanner.nextLine();
            char[] childrenArray = children.toCharArray();
            int num1, num2;

            if (children.length() > 0) {
                switch (childrenArray.length) {
                    case 3:
                        num1 = Integer.parseInt(Character.toString(childrenArray[0]));
                        num2 = Integer.parseInt(Character.toString(childrenArray[2]));
                        break;

                    case 4:
                        if (childrenArray[1] == ' ') {
                            num1 = Integer.parseInt(Character.toString(childrenArray[0]));
                            num2 = Integer.parseInt(Character.toString(childrenArray[2]) + Character.toString(childrenArray[3]));
                        } else {
                            num1 = Integer.parseInt(Character.toString(childrenArray[0]) + Character.toString(childrenArray[1]));
                            num2 = Integer.parseInt(Character.toString(childrenArray[3]));
                        }
                        break;

                    case 5:
                        num1 = Integer.parseInt(Character.toString(childrenArray[0]) + Character.toString(childrenArray[1]));
                        num2 = Integer.parseInt(Character.toString(childrenArray[3]) + Character.toString(childrenArray[4]));
                        break;

                    default:
                        num1 = 1;
                        num2 = 1;
                }
                System.out.println(num1 / commonDivide(num1, num2) * num2);
            }
        }
    }

    private static int commonDivide(int num1, int num2) {
        int pom;

        while (num2 != 0) {
            pom = num2;
            num2 = num1 % num2;
            num1 = pom;
        }
        return num1;
    }


}
