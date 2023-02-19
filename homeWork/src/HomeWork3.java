
import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        int correctCount = 0, wrongCount = 0, a = 0;

        for (int i = 0; i <= 4; i++) {
            a = a + 1;
            System.out.println("Вопрос №" + a + " " + Questions.questions[i]);
            int b = 0;
            for (int j = 0; j <= 2; j++) {
                b = b + 1;

                System.out.println(b + "." + " " + Answers.answerOptions[i][j]);
            }
            System.out.print("Ваш ответ: ");
            Scanner scanner = new Scanner(System.in);
            int answer = scanner.nextInt();
            if (answer == Answers.correctAnswers[i]) {
                System.out.println("Верно");
                correctCount = correctCount + 1;
            } else {
                System.out.println("Неверно");
                wrongCount = wrongCount + 1;
            }

        }
        System.out.println("Правильных ответов" + " " + correctCount);
        System.out.println("Неправильных ответов" + " " + wrongCount);
    }
}
