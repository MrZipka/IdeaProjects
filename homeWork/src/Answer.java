public class Answer {
    public int number;
    public String text;
    public boolean isRight;

    public Answer() {
    }

    public Answer(int number, String text, boolean isRight) {
        this.number = number;
        this.text = text;
        this.isRight = isRight;
    }

    public void print () {
        System.out.println(this.number + "." + this.text);
    }
//    public static int[] correctAnswers = {2, 3, 1, 3, 3};
}

//Answer answer1 = new Answer(1, "Пётр Ильич Чайковский");
//Answer answer2 = new Answer(2, "Людвиг ван Бетховен");
//Answer answer3 = new Answer(3, "Иоганн Себастьян Бах");

//Answer[] answers = {answer1, answer2, answer3};

//    public String[][] answerOptions = {
//            {"Пётр Ильич Чайковский", "Людвиг ван Бетховен", "Иоганн Себастьян Бах"},
//            {"Джону Дэвисону Рокфеллеру", "Джорджу Соросу", "Бенджамину Франклину"},
//            {"Екатерина II", "Пётр III", "Пётр I"},
//            {"Королевский пингвин", "Хохлатый пингвин", "Императорский пингвин"},
//            {"1854 году", "1800 году", "1896 году"}
//    };

//    public int [] correctAnswers = {2, 3, 1, 3, 3};

//}