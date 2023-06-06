public class GameWinner1Test {
    public void Winner1Test() {
        Dice dice = new Dice1();
        Player player1 = new Player("Вася");
        Player player2 = new Player("Петя");
        GameWinnerPrinter winnerPrinter = new GameWinnerConsolePrinter1();
        Game game = new Game(dice, winnerPrinter);

        game.playGame(player1, player2);
        System.out.println();

    }

}
