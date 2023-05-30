public class GameDrawTest{
    String scenario = "Проверка при ничьей";
    Dice dice;
    GameWinnerPrinter winnerPrinter;

    public GameDrawTest(Dice dice, GameWinnerPrinter winnerPrinter) {
        this.dice = dice;
        this.winnerPrinter = winnerPrinter;
    }

    public void drawTest() {
        try {
            Game game = new Game(dice, winnerPrinter);
            game.playGame(new Player("Вася"),new Player("Вася"));
            System.out.println();
            System.err.printf("\"%s\" faild. При ничьей программа определяет победителя %n", scenario);
        }catch (Exception e){
            System.out.printf("\"%s\" passed %n", scenario);
        }
    }


}
