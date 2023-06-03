public class ConsoleResultPrinter implements ResultPrinter{
        @Override
    public void printResult(String string) {
        System.out.println(string + " " + "Рублей");
    }
}
