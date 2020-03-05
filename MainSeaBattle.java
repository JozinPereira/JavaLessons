package Lesson7;

import java.util.Random;
import java.util.Scanner;

public class MainSeaBattle {
    private static final int SEA_SIZE = 9;static final char SHIP_CHAR = 'o';
    public static void main(String[] args) {
        char[][] sea = new char[SEA_SIZE][SEA_SIZE];
        initSea(sea);
        Random random = new Random();
        int[] shipStartPoint = {5, 5};
        int shipSize = random.nextInt(3) +1;
        boolean isHorizontal = random.nextBoolean();
        placeShipToSea(shipStartPoint, shipSize, isHorizontal, sea);

        printSea(sea);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Your turn ");
        String userPoint = scanner.nextLine();
        if (userPoint.length() !=2) {
            System.out.println("2 symbols needed! Number + Char");
            return;
        }
        char number = userPoint.charAt(0);
        if (number < '1' || number > '9') {
            System.out.println("Number from 1 to 9");
            return;
        }
        char letter = userPoint.charAt(1);
        if (letter < 'a' || letter > 'i') {
            System.out.println("Chars from a to i");
            return;
        }
        int y = number - '1';
        int x = letter - 'a';
        System.out.println("x = " + x + " y = " + y);

    }

    private static void placeShipToSea(int[] shipStartPoint, int shipSize, boolean isHorizontal, char[][] sea) {
        int x = shipStartPoint[0];
        int y = shipStartPoint[1];
        if (isHorizontal) {
            for (int i = 0; i < shipSize; i++) {
                sea[y][x + i] = 'o';
            }
        } else {
            for (int j = 0; j < shipSize; j++) {
                sea[y + j][x] = SHIP_CHAR;

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
}
