public class GameDrawTest extends Game {
    String scenario = "Проверка при ничьей";
    Dice dice = new DiceImpl();
    GameWinnerPrinter winnerPrinter = new GameWinnerConsolePrinter();

    @Override
    public void playGame(Player player1, Player player2) {
        int player1Result = 4;
        int player2Result = 4;

        System.out.println("player1Result -> " + player1Result);
        System.out.println("player2Result -> " + player2Result);

        Player winner = (player1Result > player2Result) ? player1 : player2;
        winnerPrinter.printWinner(winner);
    }

    Game game = new Game(dice, winnerPrinter);
    Player player1 = new Player("Вася");
    Player player2 = new Player("Петя");

    public GameDrawTest(Dice dice, GameWinnerPrinter winnerPrinter) {
        super(dice, winnerPrinter);
    }

    public void drawTest() {
        try {
            game.playGame(player1, player2);
            System.err.printf("\"%s\" faild. При ничьей программа определяет победителя %n", scenario);
        }catch (Exception e){
            System.out.printf("\"%s\" passed %n", scenario);
        }
    }


}
