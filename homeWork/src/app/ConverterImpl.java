public class ConverterImpl implements Converter {
    StringBuilder result = new StringBuilder();
    private final Ones ones;
    private final Tens tens;
    int i;

    public ConverterImpl(Ones ones, Tens tens, int i) {
        this.ones = ones;
        this.tens = tens;
        this.i = i;
    }

    @Override
    public String numberToWords() {

        if (i == 0)
            return "ноль";
        if (i < 20)
            result.append(ones.getNumber(i));
        else if (i < 100) {
            int tensDigit = i / 10;
            int onesDigit = i % 10;
            result.append(tens.getNumber(tensDigit)).append(" ").append(ones.getNumber(onesDigit));
        }
        return result.toString();
    }
}


