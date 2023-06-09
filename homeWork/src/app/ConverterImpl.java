import java.util.Currency;

public class ConverterImpl implements Converter {
    StringBuilder result = new StringBuilder();
    private final Ones ones;
    private final Tens tens;
    private final Hundreds hundreds;
    private final Exchange exchange;
    int i;

    public ConverterImpl(Ones ones, Tens tens, Hundreds hundreds, Exchange exchange, int i) {
        this.ones = ones;
        this.tens = tens;
        this.hundreds = hundreds;
        this.exchange = exchange;
        this.i = i;
    }

    @Override
    public String numberToWords() {

        if (i < 20)
            result.append(ones.getNumber(i)).append(" ").append(exchange.getNumber(i));
        else if (i < 100) {
            int tensDigit = i / 10;
            int onesDigit = i % 10;
            result.append(tens.getNumber(tensDigit)).append(" ").append(ones.getNumber(onesDigit)).append(" ").append(exchange.getNumber(onesDigit));
        } else {
            int hundredsDigit = i / 100;
            int tensDigit = (i % 100) / 10;
            int onesDigit = i % 10;
            result.append(hundreds.getNumber(hundredsDigit)).append(" ").
                    append(tens.getNumber(tensDigit)).append(" ").append(ones.getNumber(onesDigit)).append(" ").append(exchange.getNumber(onesDigit));
        }
        return result.toString();
    }
}


