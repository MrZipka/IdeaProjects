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

        new GamePlayersTest().checkPLayersAdd(new Player("Вася"),new Player("Вася"));
        new GameDrawTest(dice, winnerPrinter).drawTest();
        new DiceImplNegativeTest().rollTestNegativeValues();
        new DiceImplNumericTest().rollNumericValues();

    }
}