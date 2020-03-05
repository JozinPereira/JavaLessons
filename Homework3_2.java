package Homework3;

import java.util.Scanner;

public class Homework3_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int res = 0;
        int i;
        System.out.print("Input number ");

        while (true) {
            int n = scan.nextInt();
            if (n > 0) {

                for (i = 1; n >= i; i++) {
                    res += i;
                    System.out.println("i: " + i);
                    System.out.println("Result: " + res);
                }
                System.out.println("result: " + res);
                break;
            } else {
                System.out.print("Input positive number: ");

            }
        }
    }
}

