public class Dice2 implements Dice{
    private int counter = 0;
    @Override
    public int roll() {
        if (counter == 0) {
            counter++;
            return 2;
        }
        else
            return 6;
    }
}
