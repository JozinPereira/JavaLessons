package Lesson7;

import java.util.Random;
import java.util.Scanner;

public class MainSeaBattle {
    static final int SEA_SIZE = 9;                                                                                          // Переменная для построения игрового поля
    static final char SHIP_CHAR = 'o';                                                                                      // Обозначение палубы кораблика при генерации

    public static void main(String[] args) {
        char[][] sea = new char[SEA_SIZE][SEA_SIZE];                                                                        // Массив для игрового поля
        initSea(sea);                                                                                                       // Метод для присвоения игровому полю волн
        Random random = new Random();
        //int[] shipStartPoint = {5, 5};
        int[] shipStartPoint = {random.nextInt(8) + 1, random.nextInt(8) + 1};                                // Генерация случайного положения кораблика в рамках  поля 9х9, т.к. 1 строка и 1 столбец используются для цифр и букв
        int shipSize = random.nextInt(3) + 1;                                                                         // Генерация длины корабля
        boolean isHorizontal = random.nextBoolean();                                                                        // Генерация переменной, указывающей на то, как будет располагаться корабль (горизонтально или вертикально)
        placeShipToSea(shipStartPoint, shipSize, isHorizontal, sea);                                                        // Метод, генерирующий корабль в море

        printSea(sea);                                                                                                      // Метод, печатающий все безобразие, которое получилось

        Scanner scanner = new Scanner(System.in);
        System.out.print("Your turn ");
        String userPoint = scanner.nextLine();                                                                              // Ввод пользователем с консоли координат корабля
        if (userPoint.length() != 2) {
            System.out.println("2 symbols needed! Number + Char");
            return;
        }
        char letter = userPoint.charAt(0);
        if (letter < 'a' || letter > 'i') {
            System.out.println("Chars from a to i");
            return;
        }
        char number = userPoint.charAt(1);
        if (number < '1' || number > '9') {
            System.out.println("Number from 1 to 9");
            return;
        }

        int y = number - '1';
        int x = letter - 'a';

        System.out.println("x = " + x + " y = " + y);

        if (shipShoot(sea, x, y)) {
            System.out.println("HURT!");
        } else {
            System.out.println("MISS");
        }

    }

    private static void placeShipToSea(int[] shipStartPoint, int shipSize, boolean isHorizontal, char[][] sea) {
        int x = shipStartPoint[0];
        int y = shipStartPoint[1];
        if (isHorizontal) {
            for (int i = 0; i < shipSize && (x + i) < 9; i++) {                                                         //Добавил условие (&&) втыкаемости корабля в край по горизонтали
                if ((x + i) <= SEA_SIZE) {                                                                              //Добавил условие втыкаемости корабля в край по горизонтали
                    sea[y][x + i] = 'o';
                }
            }
        } else {
            for (int j = 0; j < shipSize && (y + j) < 9; j++) {                                                         //Добавил условие (&&) втыкаемости корабля в край по вертикали
                if ((y + j) <= SEA_SIZE) {                                                                              // Добавил условие втыкаемости корабля в край по вертикали
                    sea[y + j][x] = SHIP_CHAR;
                }
            }
        }
    }


    private static void printSea(char[][] sea) {
        printLetters();
        for (int i = 0; i < sea.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < sea[i].length; j++) {
                System.out.print(sea[i][j]);
            }
            System.out.println();
        }
    }

    private static void printLetters() {
        System.out.print("  ");
        for (int i = 0; i < SEA_SIZE; i++) {
            char letter = (char) ('a' + i);
            System.out.print(letter);
        }
        System.out.println();
    }

    private static void initSea(char[][] sea) {
        for (int i = 0; i < sea.length; i++) {
            for (int j = 0; j < sea[i].length; j++) {
                sea[i][j] = '~';
            }
        }
    }

    private static boolean shipShoot(char[][] sea, int x, int y){
        if (sea[x][y] == SHIP_CHAR) {
            return true;
        } else {
            return false;
        }
    }
}

