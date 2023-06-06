public class Dice1 implements Dice{
    private int counter = 0;
    @Override
    public int roll() {
        if (counter == 0) {
            counter++;
            return 6;
        }
        else
            return 2;
    }
}

