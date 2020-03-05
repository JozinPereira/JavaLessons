package Homework2;

public class Homework2_1 {
    public static void main(String[] args) {
        int score = 475;
        String text = "";
        if (score == 1) {
            text = "Отстой";
        } else if (score == 2) {
            text = "Плохо";
        } else if (score == 3) {
            text = "Ничотак";
        } else if (score == 4) {
            text = "Хорошо";
        } else if (score == 5) {
            text = "Супер";
        } else {
            text = "Слепой? Нет такой оценки!";
        }

        System.out.println("Оценка: " + score + ";" + " Резюме: " + text);
    }
         }


