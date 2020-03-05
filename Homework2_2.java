package Homework2;

public class Homework2_2 {
    public static void main(String[] args) {
        int score = 45;
        String text = "";
        switch (score){
            case 1:
                text = "Отстой";
                break;
            case 2:
                text = "Плохо";
                break;
            case 3:
                text = "Ничотак";
                break;
            case 4:
                text = "Хорошо";
                break;
            case 5:
                text = "Супер";
                break;
            default:
                text = "Слепой? Нет такой оценки!";
        }
        System.out.println("Оценка: " + score + "; Резюме: " + text);
    }
}
