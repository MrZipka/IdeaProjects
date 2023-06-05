
import java.util.Scanner;

public class PriceToWordsNew {
    public static void main(String[] args) {
        Ones ones = new Ones();
        Tens tens = new Tens();
        Hundreds hundreds = new Hundreds();
        Exchange exchange = new Exchange();


        System.out.println("Пиши");
        Scanner sc = new Scanner(System.in);
        ConverterImpl converter = new ConverterImpl(ones, tens, hundreds, exchange, sc.nextInt());

        ConsoleResultPrinter printer = new ConsoleResultPrinter();
        Transformer transformer = new Transformer(converter, printer);

        transformer.transform();


    }
}
