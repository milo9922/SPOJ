package srednie.dyzio;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        try {
            int num = 1000000;
            boolean[] bool = new boolean[num];
            int[] primeArray = new int[78498];

            Arrays.fill(bool, true);

            for (int i = 2; i < Math.sqrt(num); i++) {
                if (bool[i]) {
                    for (int j = (i * i); j < num; j = j + i) {
                        bool[j] = false;
                    }
                }
            }

            int i = 0;

            for (int j = 2; j < bool.length; j++) {
                if (bool[j]) {
                    primeArray[i] = j;
                    i++;
                }
            }

            System.out.println(primeArray.length);

            String inputData = "6 19";
            String[] array = inputData.split(" ");
            int lowerBand = Integer.parseInt(array[0]);
            int upperBand = Integer.parseInt(array[1]);
            i = 0;
            int counter = 0;
            int currentNumber;


        } catch (Exception ignore) {
        }
    }
}

//TODO Zliczanie wyników
