package Homework3;
import java.util.Scanner;

public class Homework3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int n;


        while (true) {
            n = scanner.nextInt();
            int sum = 0;
            if (n < 0) {
                System.out.print("Input positive number: ");
            } else
                for (n = scanner.nextInt(); n > 0; n--) {
                    sum += n;
                    System.out.println("n is now " + n);
                    System.out.println("Result of the sum 1...n is " + sum);
                }


        }
    }
}
