public class GameWinnerConsolePrinter4 implements GameWinnerPrinter {
    String scenario = "Проверка при ничьей";
    @Override
    public void printWinner(Player winner)  {
        if (winner.getName().equals("Ничья"))
        System.out.printf("\"%s\" passed %n", scenario);
        else
        System.err.printf("\"%s\" faild. При ничьей программа должна выдавать ничью %n", scenario);
    }

}

