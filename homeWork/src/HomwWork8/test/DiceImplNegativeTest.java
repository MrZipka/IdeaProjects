public class DiceImplNegativeTest {
//    public void rollTestLargeValues() {
//        int res = 0;
//        String scenario = "Тест значения больше 6";
//        Dice dice = new DiceImpl();
//        res = dice.roll();
//        if (res <= 6)
//            System.out.printf("\"%s\" passed %n", scenario);
//        else System.err.printf("\"%s\" faild, значения должны быть не больше 6 %n", scenario);
//        System.out.println(res);
//    }

    public void rollTestNegativeValues() {
        int res = 0;
        String scenario = "Тест на отрицательные значения";
        Dice dice = new DiceImpl();
        res = dice.roll();
        if (res >= 1)
            System.out.printf("\"%s\" passed %n", scenario);
        else System.err.printf("\"%s\" faild, значения должны быть не меньше 1 %n", scenario);
    }
}

