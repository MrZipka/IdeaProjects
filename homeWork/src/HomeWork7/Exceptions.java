package HomeWork7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exceptions {

    public static void main(String[] args) throws Exception {


        Question question = new Question("Сколько будет 2+2?");

        Answer answer1 = new Answer(1, 2, false);
        Answer answer2 = new Answer(2, 4, true);
        Answer answer3 = new Answer(3, 8, false);

        question.answers = new Answer[]{answer1, answer2, answer3};

        question.print();
        int userAnswer = 0;

        try {
            System.out.println("Your answer: ");
            Scanner sc = new Scanner(System.in);
            userAnswer = sc.nextInt();
            if (question.checkAnswer(userAnswer)) {
                System.out.println("correct");
            } else {
                System.out.println("wrong");
            }
        } catch (Exception e) {
            System.out.println("Введено недопустимое значение");
        }


        mathOption();

    tryWithResources();
    }

    private static void mathOption() throws Exception {
        int sum;
        int a;
        int b;
        System.out.println("поупражняемся в делении");
        Scanner sc = new Scanner(System.in);
        System.out.println("add fist num");
        a= sc.nextInt();
        System.out.println("add second num");
        b= sc.nextInt();
        if (b == 0){
            throw new Exception("Нельзя делить на ноль");
        }
        sum = a/b;
        System.out.println(sum);
    }

    private static void tryWithResources()    {
        BufferedReader br = null;
        String line;

        try {

            br = new BufferedReader(new FileReader("c:\\testing.txt"));
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    private static class Question {
        private String text;
        private Answer[] answers;

        private Question() {
        }

        private Question(String text) {
            this.text = text;
        }

        private void print() {
            System.out.println(this.text);

            for (Answer s : answers) {
                System.out.println(s.var + ". " + s.number);
            }
        }

        private boolean checkAnswer(int userAnswer) {
            userAnswer = userAnswer - 1;
            return (answers[userAnswer].isRight);
        }
    }

    private static class Answer {
        private int var;
        private int number;
        private boolean isRight;

        private Answer() {
        }

        private Answer(int var, int number, boolean isRight) {
            this.var = var;
            this.number = number;
            this.isRight = isRight;
        }
    }
}

