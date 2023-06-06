public class AllTests {

    /*
        Заготовка для ДЗ представляет собой игру в кости.
        При вызове game.playGame(), два игрока кидают кости.
        Выигрывает игрок, у кого результат (1-6) больше

        Написать тесты (минимум 4) на классы DiceImpl и Game.
        Тесты должны найти не менее двух ошибок.

        Информацию о пройденном тесте предлагается выводить в System.out, а об упавшем в System.err
     */
    public static void main(String[] args) {
        Dice dice = new Dice4();
        GameWinnerPrinter winnerPrinter = new GameWinnerConsolePrinter();
        Game game = new Game(dice, winnerPrinter);
        Player player1 = new Player("Вася");
        Player player2 = new Player("Петя");

        new GameDrawTest().drawTest();
        new DiceImplNegativeTest().rollTestNegativeValues();
        new DiceImplNumericTest().rollNumericValues();
        new GameWinner1Test().Winner1Test();
        new GameWinner2Test().Winner2Test();

    }
}
