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
            int num1;
            int num2;
            if (children.length() > 0) {
                switch (children.length()) {

                    case 3: {
                        String tempNum1 = Character.toString(childrenArray[0]);
                        String tempNum2 = Character.toString(childrenArray[2]);
                        num1 = Integer.parseInt(tempNum1);
                        num2 = Integer.parseInt(tempNum2);
                        break;
                    }

                    case 4: {
                        if (childrenArray[1] == ' ') {
                            String tempNum1 = Character.toString(childrenArray[0]);
                            String tempNum2 = Character.toString(childrenArray[2]) + Character.toString(childrenArray[3]);
                            num1 = Integer.parseInt(tempNum1);
                            num2 = Integer.parseInt(tempNum2);
                        } else {
                            String tempNum1 = Character.toString(childrenArray[0]) + Character.toString(childrenArray[1]);
                            String tempNum2 = Character.toString(childrenArray[3]);
                            num1 = Integer.parseInt(tempNum1);
                            num2 = Integer.parseInt(tempNum2);
                        }
                        break;
                    }

                    case 5: {
                        String tempNum1 = Character.toString(childrenArray[0]) + Character.toString(childrenArray[1]);
                        String tempNum2 = Character.toString(childrenArray[3]) + Character.toString(childrenArray[4]);
                        num1 = Integer.parseInt(tempNum1);
                        num2 = Integer.parseInt(tempNum2);
                        break;
                    }
                    default: {
                        num1 = 1;
                        num2 = 1;
                        break;
                    }
                }
                System.out.println(num1 / commonMultiple(num1, num2) * num2);
            }
        }


    }

    private static int commonMultiple(int num1, int num2) {
        int pom;

        while (num2 != 0) {
            pom = num2;
            num2 = num1 % num2;
            num1 = pom;
        }
        return num1;
    }
}
