import javax.swing.*;
import java.util.Scanner;

public class Question {
    public String text;
    Answer[] answers;


    public Question() {
    }

    public Question(String text) {
        this.text = text;
    }

    public void print() {
        System.out.println(this.text);


        for (int j = 0; j < answers.length; j++) {
            answers[j].print();
        }
    }

    public boolean checkAnswer(int userAnswer) {
                   return (answers[userAnswer].isRight&true);
        }
    }

//               if (questions[i].checkAnswer(userAnswer)==true) {
//            System.out.println("correct");
//            correctCount = correctCount + 1;
//        } else {
//            System.out.println("wrong");
//            wrongCount = wrongCount + 1;
//        }
//          }
//        return false;
//    }

//}
//    Question question1 = new Question(1, "Лунную сонату написал ..");


//    static Question[] questionNew = new Question[5];

//      public String[] questions = {
//            "Лунную сонату написал ..",
//            "Фраза Время-деньги принадлежит ...",
//            "Государственный Музей Эрмитаж появился при ...",
//            "Самым большим пингвином является ...",
//            "Мужская гимнастика была включена в Олимпийские игры в ..."
//    };


//    private void printAll() {
//        for (int i = 0; i < 5; i++) {
//            System.out.println(questions[i]);
//        }


// подобная попытка записать значение в массив без метода приводит к ошибке
//    static String questionNew[0] = "Лунную сонату написал .."

// добавление значений в массив в стандартном методе приводит к невозможности получить значение массива из другого класса. При подобной конфигурации создания массива, ссылка на конкретный (i-тый) элемент массива выдаёт значение null.
//    public static void main(String[] args) {
//        questionNew[0] = new Question("Лунную сонату написал ..");
//        questionNew[1] = new Question("Фраза Время-деньги принадлежит ...");
//        questionNew[2] = new Question("Государственный Музей Эрмитаж появился при ...");
//        questionNew[3] = new Question("Самым большим пингвином является ...");
//        questionNew[4] = new Question("Мужская гимнастика была включена в Олимпийские игры в ...");
//
//    // но в рамках этого класса всё работает и при запуске программы значения массива выводятся корректно
//        for (int i=0; i < 5; i++) {
//            System.out.println(questionNew[i].name);
//        }
//    }
//
//}
//class Question{
//    String name;
//
//    public Question (String name) {
//        this.name = name;
//    }

//    }
//}

