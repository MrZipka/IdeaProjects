public class DiceImplNumericTest {
    public void rollNumericValues() {
        int res = 0;
        String scenario = "Тест на недопустимые значения";
        Dice dice = new DiceImpl();
        res = dice.roll();
        if (Math.abs(res) <= 6)
            System.out.printf("\"%s\" passed %n", scenario);
        else System.err.printf("\"%s\" faild, значения должны быть не больше 6 %n", scenario);
    }
}
