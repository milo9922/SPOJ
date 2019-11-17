package latwe.sort1;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int howManySets = scanner.nextInt();
        Map<Double, String> treeMap = new TreeMap<>();

        for (int i = 0; i < howManySets; i++) {
            int howManyPoints = scanner.nextInt();
            scanner.nextLine();

            for (int j = 0; j < howManyPoints; j++) {
                String inputText = scanner.nextLine();
                String[] stringInputArray = inputText.split(" ");
                double currentDistance = centerDistance(Integer.parseInt(stringInputArray[1]), Integer.parseInt(stringInputArray[2]));
                treeMap.put(currentDistance, inputText);
            }
            printMap(treeMap);
            treeMap.clear();
        }
    }

    private static double centerDistance(int x, int y) {
        return Math.sqrt(x * x + y * y);
    }

    private static void printMap(Map<Double, String> treeMap) {
        Set s = treeMap.entrySet();
        for (Object o : s) {
            Map.Entry entry = (Map.Entry) o;
            String value = (String) entry.getValue();
            System.out.println(value);
        }//while
    }//printMap

}
