package latwe.pole_pewnego_kola;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            String input = scanner.nextLine();
            String[] array = input.split(" ");
            double radius = Double.parseDouble(array[0]);
            double distance = Double.parseDouble(array[1]);

            System.out.println(round(circleField(radius, distance)));

        } catch (Exception ignore) {
        }
    }


    private static double circleField(double r, double d) {
        return (r * r - (d * d) / 4) * Math.PI;
    }

    private static BigDecimal round(double value) {
        return new BigDecimal(Double.toString(value))
                .setScale(2, RoundingMode.HALF_UP);
    }
}
