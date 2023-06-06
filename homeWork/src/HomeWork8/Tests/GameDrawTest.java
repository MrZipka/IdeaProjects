public class GameDrawTest{
    public void drawTest() {
        Dice dice = new Dice4();
        Player player1 = new Player("Вася");
        Player player2 = new Player("Петя");
        GameWinnerPrinter winnerPrinter = new GameWinnerConsolePrinter4();
        Game game = new Game(dice, winnerPrinter);

            game.playGame(player1, player2);
            System.out.println();

    }


}
