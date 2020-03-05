package Homework2;

public class Homework2_3 {
    enum Evaluation {
        SUCKS,
        BAD,
        OK,
        NICE,
        GREAT,
        HAVENTSEEN
    }
    public static void main(String[] args) {
        String text = "";
        Evaluation score = Evaluation.HAVENTSEEN;
        switch (score){
            case SUCKS:
                text = "Отстой";
                break;
            case BAD:
                text = "Плохо";
                break;
            case OK:
                text = "Ничотак";
                break;
            case NICE:
                text = "Хорошо";
                break;
            case GREAT:
                text = "Супер";
                break;
            default:
                text = "Слепой? Нет такой оценки!";
        }
        System.out.println("Оценка: " + score + "; Резюме: " + text);

    }
}
