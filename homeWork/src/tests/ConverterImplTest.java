public class ConverterImplTest {
    Ones ones = new Ones();
    Tens tens = new Tens();


    public void convertNegative(int i) {
        String scenario = "Проверка отрицательных значений";
        ConverterImpl converter = new ConverterImpl(ones, tens, i);

        try {
            converter.numberToWords();
            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Exception e){
            System.err.printf("\"%s\" faild. Ошибка из-за отрицательного значения %n", scenario);

        }
    }

    public void convertZero(int i) {
        String scenario = "Проверка работы при 0";
        ConverterImpl converter = new ConverterImpl(ones, tens, i);

        try {
            converter.numberToWords();
            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Exception e){
            System.err.printf("\"%s\" faild. Ошибка из-за отрицательного значения %n", scenario);

        }
    }

}
