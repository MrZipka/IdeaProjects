public class Transformer {

        private final ConverterImpl converter;
        private final ConsoleResultPrinter printer;;

        public Transformer(ConverterImpl converter, ConsoleResultPrinter printer){
              this.converter = converter;
              this.printer = printer;

        }

        public void transform(){
                String string = converter.numberToWords();
                printer.printResult(string);

        }
}
