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
        tour.descr = "BigBen";
        tour.country = "GB";
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
    int userInput = scanner.nextInt();
    switch (userInput) {
        case 1:
            showTourList(tours);
            break;
        case 2:
            Tour newTour = createTour();
            addTour(tours, newTour);
            break;
        case 4:
            findTourAction(tours);
            break;
        case 5:
            return;
        default:
            System.out.println("Unknown " + userInput);
    }
} while (true);
    }

    private static void findTourAction(Tour[] tours) {
        Scanner scanner = new Scanner(System.in);
        userInput("Страна");
        String userCountry = scanner.nextLine().trim();
        for (Tour tour: tours) {
            if (tour == null) {
                break;
            }
            if (tour.country.equalsIgnoreCase(userCountry)) {
                horLine();
                showTour(tour);
            }
        }
    }

    private static void addTour(Tour[] tours, Tour newTour) {
        for (int i = 0; i < tours.length; i++) {
            if (tours[i] == null) {
                tours[i] = newTour;
                break;
            }
        }
    }

    private static Tour createTour() {
        Scanner scanner = new Scanner(System.in);
        Tour tour = new Tour();
        userInput("Название");
        tour.name = scanner.nextLine();

        userInput("Страна");
        tour.name = scanner.nextLine();

        tour.startDate = new Date();
        return tour;
    }

    static void userInput(String fieldName) {
        System.out.print("Введите " + fieldName + " >");
    }

    static void menu(String text) {
        System.out.println(text);
    }

    private static void showTourList(Tour[] tours) {
        for (Tour tour: tours) {
            if (tour == null) {
                break;
            }
            horLine();
            showTour(tour);
        }

    }

    private static void horLine() {
        System.out.println("------------------------------------------");
    }

    private static void showTour(Tour tour) {
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
    }
}
