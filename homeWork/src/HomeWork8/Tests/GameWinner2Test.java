public class GameWinner2Test {
    public void Winner2Test() {
        Dice dice = new Dice2();
        Player player1 = new Player("Вася");
        Player player2 = new Player("Петя");
        GameWinnerPrinter winnerPrinter = new GameWinnerConsolePrinter2();
        Game game = new Game(dice, winnerPrinter);

        game.playGame(player1, player2);
        System.out.println();

    }
}
