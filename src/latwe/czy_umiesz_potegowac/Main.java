package latwe.czy_umiesz_potegowac;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        byte howMany;
        howMany = scanner.nextByte();
        int a, b;

        while (howMany > 0) {
            a = scanner.nextInt();
            a = a % 10;
            b = scanner.nextInt();

            switch (a) {
                case 0:
                case 1:
                case 5:
                case 6:
                    System.out.println(a);
                    break;

                case 2:
                    if (b % 4 == 1)
                        System.out.println(2);
                    if (b % 4 == 2)
                        System.out.println(4);
                    if (b % 4 == 3)
                        System.out.println(8);
                    if (b % 4 == 0)
                        System.out.println(6);
                    break;

                case 3:
                    if (b % 4 == 1)
                        System.out.println(3);
                    if (b % 4 == 2)
                        System.out.println(9);
                    if (b % 4 == 3)
                        System.out.println(7);
                    if (b % 4 == 0)
                        System.out.println(1);
                    break;

                case 7:
                    if (b % 4 == 1)
                        System.out.println(7);
                    if (b % 4 == 2)
                        System.out.println(9);
                    if (b % 4 == 3)
                        System.out.println(3);
                    if (b % 4 == 0)
                        System.out.println(1);
                    break;

                case 8:
                    if (b % 4 == 1)
                        System.out.println(8);
                    if (b % 4 == 2)
                        System.out.println(4);
                    if (b % 4 == 3)
                        System.out.println(2);
                    if (b % 4 == 0)
                        System.out.println(6);
                    break;

                case 4:
                    if (b % 2 == 0)
                        System.out.println(6);
                    else
                        System.out.println(4);
                    break;

                case 9:
                    if (b % 2 == 0)
                        System.out.println(1);
                    else
                        System.out.println(9);
                    break;

                default:
                    System.out.println("Error!");
                    break;
            }
            howMany--;
        }
    }
}
