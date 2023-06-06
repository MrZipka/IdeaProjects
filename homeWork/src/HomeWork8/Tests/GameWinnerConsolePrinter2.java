public class GameWinnerConsolePrinter2 implements GameWinnerPrinter{
    String scenario = "Проверка победы второго игрока";
    @Override
    public void printWinner(Player winner)  {
        if (winner.getName().equals("Петя"))
            System.out.printf("\"%s\" passed %n", scenario);
        else
            System.err.printf("\"%s\" faild. Проверка победы игрока № 2 %n", scenario);
    }
}
