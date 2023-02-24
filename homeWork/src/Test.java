public class Test {
    public static void main(String[] args) {


        Question question1 = new Question(1, "Лунную сонату написал ..");
        Question question2 = new Question(2, "Фраза Время-деньги принадлежит ...");
        Question question3 = new Question(3, "Государственный Музей Эрмитаж появился при ...");
        Question question4 = new Question(4, "Самым большим пингвином является ...");
        Question question5 = new Question(5, "Мужская гимнастика была включена в Олимпийские игры в ...");

        Question[] questions = {question1, question2, question3, question4, question5};

        Answer answer1 = new Answer(1, "Пётр Ильич Чайковский");
        Answer answer2 = new Answer(1, "Людвиг ван Бетховен");
        Answer answer3 = new Answer(1, "Иоганн Себастьян Бах");
        Answer answer4 = new Answer(2, "Джону Дэвисону Рокфеллеру");
        Answer answer5 = new Answer(2, "Джорджу Соросу");
        Answer answer6 = new Answer(2, "Бенджамину Франклину");
        Answer answer7 = new Answer(3, "Екатерина II");
        Answer answer8 = new Answer(3, "Пётр III");
        Answer answer9 = new Answer(3, "Пётр I");
        Answer answer10 = new Answer(4, "Королевский пингвин");
        Answer answer11 = new Answer(4, "Хохлатый пингвин");
        Answer answer12 = new Answer(4, "Императорский пингвин");
        Answer answer13 = new Answer(5, "1854 году");
        Answer answer14 = new Answer(5, "1800 году");
        Answer answer15 = new Answer(5, "1896 году");

        Answer[] answers = {
                answer1, answer2, answer3,
                answer4, answer5, answer6,
                answer7, answer8, answer9,
                answer10, answer11, answer12,
                answer13, answer14, answer15
        };

        for (int i = 0; i < questions.length; i++) {
            System.out.println(answers[i].text);
        }
    }
}

