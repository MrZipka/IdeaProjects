public class GameWinnerConsolePrinter1 implements GameWinnerPrinter{
    String scenario = "Проверка победы первого игрока";
    @Override
    public void printWinner(Player winner)  {
        if (winner.getName().equals("Вася"))
            System.out.printf("\"%s\" passed %n", scenario);
        else
            System.err.printf("\"%s\" faild. Проверка победы игрока № 1 %n", scenario);
    }
}
