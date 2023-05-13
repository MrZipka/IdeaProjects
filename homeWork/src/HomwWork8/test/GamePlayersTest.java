public class GamePlayersTest {
    public void checkPLayersAdd(Player player1, Player player2) {
        String scenario = "Проверка допустимости участия 1 игрока (100% победа)";

        Dice dice = new DiceImpl();
        GameWinnerPrinter winnerPrinter = new GameWinnerConsolePrinter();

        Game game = new Game(dice, winnerPrinter);


        try {
            game.playGame(player1, player2);
            System.err.printf("\"%s\" faild. Программа допускает участие одного игрока %n", scenario);
        } catch (Exception e) {
            System.out.printf("\"%s\" passed %n", scenario);
        }
    }
}
