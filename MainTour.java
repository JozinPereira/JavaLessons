package Lesson8;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class MainTour {
    public static void main(String[] args) {
        Tour tour = new Tour();
        tour.code = "FIRST";
        tour.name = "London";
        tour.descr = "Is the capital of Great Britain";
        tour.country = "Great Britain";
        tour.startDate = new Date();
        tour.dayCount = 30;
        tour.cost = 5000;


        Tour[] tours = new Tour[10];
        tours[0] = tour;
        tours[1] = tour;
        Scanner scanner = new Scanner(System.in);


        do {
            System.out.println("Подбор туров 2.0.1");
            menu("1 - Просмотреть все");
            menu("2 - Создать тур");
            menu("3 - Удалить тур");
            menu("4 - Найти тур");
            menu("5 - Выход");

            System.out.print("> ");
            String userInput = scanner.nextLine(); // Изменил тип ожидаемой переменной и кейсов, обновил дефолтное описание
            switch (userInput) {
                case "1":
                    showTourList(tours);
                    break;
                case "2":
                    Tour newTour = createTour(tours);
                    addTour(tours, newTour);
                    break;
                case "3":
                    delTour(tours);
                    break;
                case "4":
                    findTourAction(tours);
                    break;
                case "5":
                    return;
                default:
                    System.out.println("Выберите допустимое значение из меню. Ваше значение " + "\"" + userInput + "\" недопустимо!");
                    System.out.println("_________________________________________________");
            }
        } while (true);
    }


    static void delTour(Tour[] tours) {
        Scanner scanner = new Scanner(System.in);
        userInput("Код тура: ");
        String userCode = scanner.nextLine().trim();
        int codeIndex = -1;
        for (int i = 0; i < tours.length; i++) {
            if (tours[i] == null) {
                break;
            }
            if (tours[i].code.equalsIgnoreCase(userCode)) {
                codeIndex = i;
                break;
            }
        }
        if (codeIndex == -1) {
            System.out.println("Код тура " + userCode + " не найден!");
            return;
        }

        for (int i = codeIndex; i < tours.length - 1 || tours[i] != null; i++) {
            tours[i] = tours[i + 1];
            tours[i + 1] = null;
        }
        tours[tours.length - 1] = null;
        System.out.println("Tур " + userCode + " успешно удален");
    }


    private static void findTourAction(Tour[] tours) { //Добавил условие на выход из поисковика
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Для выхода введите \"q\"");
            userInput("Страну: ");
            String userCountry = scanner.nextLine().trim();
            if (userCountry.equals("q")) {
                return;
            }
            for (Tour tour : tours) {
                if (tour == null) {
                    System.out.println("Страна " + userCountry + " не найдена, повторите ввод");
                    break;
                }
                if (tour.country.equalsIgnoreCase(userCountry)) {
                    horLine();
                    showTour(tour);
                    horLine();
                }
            }
        }
        while (true);
    }

    private static void addTour(Tour[] tours, Tour newTour) {
        for (int i = 0; i < tours.length; i++) {
            if (tours[i] == null) {
                tours[i] = newTour;
                break;
            }
        }
    }

    private static Tour createTour(Tour[] tours) {
        for (Tour tour : tours) // Добавил условие на запрет создания тура, когда массив заполнен
            if ((tours[tours.length - 1]) != null) {
                System.out.println("Невозможно создать новый тур, сначала удалите один из имеющихся");
                return tour;
            }
        Scanner scanner = new Scanner(System.in);
        Tour tour = new Tour();
        userInput("Код тура: ");
        tour.code = scanner.nextLine();

        userInput("Название: ");
        tour.name = scanner.nextLine();

        userInput("Описание: ");
        tour.descr = scanner.nextLine();

        userInput("Страну: ");
        tour.name = scanner.nextLine();

        tour.startDate = new Date();

        while (true) { //Валидация на ввод букв и отрицательных чисел
            userInput("Количество дней: ");
            try {
                tour.dayCount = Integer.parseInt(scanner.nextLine());
                if (tour.dayCount <= 0) {
                    System.out.println("Введите корректное значение продолжительности визита, ваше значение: " + tour.dayCount);
                } else break;
            } catch (Exception e) {
                System.out.println("Поле должно быть числовым!");
            }
        }
        while (true) {
            userInput("Стоимость: ");
            try {
                tour.cost = Integer.parseInt(scanner.nextLine());
                if (0 > tour.cost) {
                    System.out.println("Введите корректное значение стоимости, ваше значение: " + tour.cost);
                } else break;
            } catch (Exception e) {
                System.out.println("Поле должно быть числовым!");
            }
        }

        return tour;
    }

    static void userInput(String fieldName) {
        System.out.print("Введите " + fieldName);
    }

    static void menu(String text) {
        System.out.println(text);
    }

    private static void showTourList(Tour[] tours) {
        for (Tour tour : tours) {
            if (tour == null) {
                break;
            }
            horLine();
            showTour(tour);
            horLine();
        }

    }

    private static void horLine() {
        System.out.println("------------------------------------------");
    }

    private static void showTour(Tour tour) {
        while (tour != null) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
            System.out.println(
                    "code: " + tour.code +
                            " date: " + dateFormat.format(tour.startDate) +
                            " " + tour.name +
                            " " + tour.country
            );
            System.out.println(tour.descr);
            System.out.println(
                    "day count: " + tour.dayCount +
                            " cost: " + tour.cost
            );
            break;
        }
    }
}