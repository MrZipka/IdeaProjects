
import java.util.Scanner;
public class HomeWork3 {
    public static void main(String[] args) {
        int correctCount = 0, wrongCount = 0, a=0;


        String[] questions;
        questions = new String[5];
        questions[0] = "Лунную сонату написал ..";
        questions[1] = "Фраза Время-деньги принадлежит ...";
        questions[2] = "Государственный Музей Эрмитаж появился при ...";
        questions[3] = "Самым большим пингвином является ...";
        questions[4] = "Мужская гимнастика была включена в Олимпийские игры в ...";

        String[][] answerOptions;
        answerOptions = new String[5][3];
        answerOptions[0][0] = "Пётр Ильич Чайковский";
        answerOptions[0][1] = "Людвиг ван Бетховен";
        answerOptions[0][2] = "Иоганн Себастьян Бах";
        answerOptions[1][0] = "Джону Дэвисону Рокфеллеру";
        answerOptions[1][1] = "Джорджу Соросу";
        answerOptions[1][2] = "Бенджамину Франклину";
        answerOptions[2][0] = "Екатерина II";
        answerOptions[2][1] = "Пётр III";
        answerOptions[2][2] = "Пётр I";
        answerOptions[3][0] = "Королевский пингвин";
        answerOptions[3][1] = "Хохлатый пингвин";
        answerOptions[3][2] = "Императорский пингвин";
        answerOptions[4][0] = "1854 году";
        answerOptions[4][1] = "1800 году";
        answerOptions[4][2] = "1896 году";

        int[] correctAnswers = {2, 3, 1, 3, 3};

        for (int i = 0; i <= 4; i++) {
            a=a+1;
            System.out.println("Вопрос №" + a + " " + questions[i]);
            int b=0;
            for (int j = 0; j <= 2; j++) {
                b=b+1;

                System.out.println(b + "." + " " + answerOptions [i][j]);
            }
            System.out.print("Ваш ответ: ");
            Scanner scanner = new Scanner (System.in);
            int answer = scanner.nextInt();
            if (answer == correctAnswers[i]) {
                System.out.println("Верно");
                correctCount = correctCount + 1;
            }
            else {
                System.out.println("Неверно");
                wrongCount = wrongCount + 1;
            }

        }
        System.out.println("Правильных ответов" + " " + correctCount);
        System.out.println("Неправильных ответов" + " " + wrongCount);
    }
}
