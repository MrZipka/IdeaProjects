import java.util.Scanner;

public class PriceToWordsNew {
    public static void main(String[] args) {
        Ones ones = new Ones();
        Tens tens = new Tens();

        System.out.println("Пиши");
        Scanner sc = new Scanner(System.in);
        ConverterImpl converter = new ConverterImpl(ones, tens, sc.nextInt());

        ConsoleResultPrinter printer = new ConsoleResultPrinter();
        Transformer transformer = new Transformer(converter, printer);

        transformer.transform();


    }
}
