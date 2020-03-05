package Homework6;

import java.util.Arrays;
import java.util.Scanner;


public class HomeArrayInput {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int length  = scanner.nextInt();
        int[] array = new int[length];


        for (int i = 0; i < array.length; i++) {
            System.out.println("Input array element # " + i);
            array[i] = scanner.nextInt();
        }

        System.out.println("Your array: " + Arrays.toString(array));

    }
}
