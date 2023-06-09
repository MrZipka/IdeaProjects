public class AllTests {
    public static void main(String[] args) {

        Ones ones = new Ones();
        Tens tens = new Tens();


        new ConverterImplTest().convertNegative(-5);
        new ConverterImplTest().convertZero(0);
        new ConverterImplTest().convertThree(3);

    }
}
