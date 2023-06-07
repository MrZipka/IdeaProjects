import java.util.Scanner;

//correctAnswers = {2, 3, 1, 3, 3};
public class Test {
    public static void main(String[] args) {
        int correctCount = 0, wrongCount = 0;

        Question question1 = new Question("Лунную сонату написал ..");
        Question question2 = new Question("Фраза Время-деньги принадлежит ...");
        Question question3 = new Question("Государственный Музей Эрмитаж появился при ...");
        Question question4 = new Question("Самым большим пингвином является ...");
        Question question5 = new Question("Мужская гимнастика была включена в Олимпийские игры в ...");

        Question[] questions = {question1, question2, question3, question4, question5};

        Answer answer1 = new Answer(1, "Пётр Ильич Чайковский", false);
        Answer answer2 = new Answer(2, "Людвиг ван Бетховен", true);
        Answer answer3 = new Answer(3, "Иоганн Себастьян Бах", false);
        Answer answer4 = new Answer(1, "Джону Дэвисону Рокфеллеру", false);
        Answer answer5 = new Answer(2, "Джорджу Соросу", false);
        Answer answer6 = new Answer(3, "Бенджамину Франклину", true);
        Answer answer7 = new Answer(1, "Екатерина II", true);
        Answer answer8 = new Answer(2, "Пётр III", false);
        Answer answer9 = new Answer(3, "Пётр I", false);
        Answer answer10 = new Answer(1, "Королевский пингвин", false);
        Answer answer11 = new Answer(2, "Хохлатый пингвин", false);
        Answer answer12 = new Answer(3, "Императорский пингвин", true);
        Answer answer13 = new Answer(1, "1854 году", false);
        Answer answer14 = new Answer(2, "1800 году", false);
        Answer answer15 = new Answer(3, "1896 году", true);

        question1.answers = new Answer[]{answer1, answer2, answer3};
        question2.answers = new Answer[]{answer4, answer5, answer6};
        question3.answers = new Answer[]{answer7, answer8, answer9};
        question4.answers = new Answer[]{answer10, answer11, answer12};
        question5.answers = new Answer[]{answer13, answer14, answer15};

        for (int i = 0; i < questions.length; i++) {
            questions[i].print();
            System.out.println("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            int userAnswer = scanner.nextInt();

//        if (userAnswer == Answer.correctAnswers[i]) {
//            System.out.println("correct");
//            correctCount = correctCount + 1;
//        } else {
//            System.out.println("wrong");
//            wrongCount = wrongCount + 1;
//        }
//
//            System.out.println(questions[i].checkAnswer(userAnswer));
//
            if (questions[i].checkAnswer(userAnswer)) {
                System.out.println("correct");
                correctCount = correctCount + 1;
            } else {
                System.out.println("wrong");
                wrongCount = wrongCount + 1;
            }
        }
//
        System.out.println("correct ansers: " + correctCount);
        System.out.println("wrong answers: " + wrongCount);
    }
}
