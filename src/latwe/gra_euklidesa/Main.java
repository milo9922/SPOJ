package latwe.gra_euklidesa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int numberOfGames = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < numberOfGames; i++) {
                String playersChips = scanner.nextLine();
                String[] chipsAmountArray = playersChips.split(" ");
                int player1Chips = Integer.parseInt(chipsAmountArray[0]);
                int player2Chips = Integer.parseInt(chipsAmountArray[1]);

                System.out.println(countChips(player1Chips, player2Chips));
            }
        } catch (Exception ignore) {
        }
    }

    private static int countChips(int player1Chips, int player2Chips) {
        while (!(player1Chips == player2Chips) && player1Chips > 0 && player2Chips > 0) {
            if (player1Chips < player2Chips) {
                player2Chips = player2Chips - player1Chips;
            }

            if (player2Chips < player1Chips) {
                player1Chips = player1Chips - player2Chips;
            }
        }

        return player1Chips + player2Chips;
    }
}
