public class ConverterImplTest {
    Ones ones = new Ones();
    Tens tens = new Tens();
    Hundreds hundreds = new Hundreds();
    Exchange exchange = new Exchange();


    public void convertNegative(int i) {
        String scenario = "Проверка отрицательных значений";
        ConverterImpl converter = new ConverterImpl(ones, tens, hundreds, exchange, i);

        try {
            converter.numberToWords();
            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Exception e){
            System.err.printf("\"%s\" faild. Ошибка из-за отрицательного значения %n", scenario);

        }
    }

    public void convertZero(int i) {
        String scenario = "Проверка работы при 0";
        ConverterImpl converter = new ConverterImpl(ones, tens, hundreds, exchange, i);

        try {
            String a = converter.numberToWords();
            if (a.equals("ноль Рублей"))
                System.out.printf("\"%s\" passed %n", scenario);
            else System.err.println("Ошибка теста при нуле");
        } catch (Exception e){
            System.err.printf("\"%s\" faild. Ошибка из-за отрицательного значения %n", scenario);

        }
    }

    public void convertThree(int i) {
        String scenario = "Проверка работы при числе 3";
        ConverterImpl converter = new ConverterImpl(ones, tens, hundreds, exchange, i);

        try {
            String a = converter.numberToWords();
            if (a.equals("три Рубля"))
                System.out.printf("\"%s\" passed %n", scenario);
            else System.err.println("Ошибка теста при 3");
        } catch (Exception e){
            System.err.printf("\"%s\" faild. Ошибка из-за отрицательного значения %n", scenario);

        }
    }

}
