package Homework4;

import java.util.Random;
import java.util.Scanner;

public class HomeworkGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int m = 10; //max random number
        int r = random.nextInt(m);//random generated number
        String text;
        int p = -1; // person input
        while (!(r == p)) {
            while (true) {
                text = scanner.nextLine();
                try {
                    p = Integer.parseInt(text);
                } catch (Exception e) {
                    System.err.print("It should be positive number!\nInput number: ");
                    break;
                }

                if (r < p) {
                    System.out.print("Your number " + p + " is greater then my number\nInput number: ");
                } else if (r > p) {
                    System.out.print("Your number " + p + " is smaller then my number\nInput number: ");
                } else break;

            }
        }
        System.out.println("Congrats! Your guess is correct! The number is " + r + "!");
    }
}
