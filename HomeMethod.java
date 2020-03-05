package Homework4;

//реализовать метод, что для входного параметра типа int определяет четное оно или нет (т.е. возвращаемый тип boolean). Протестировать метод и результаты вывести в консоль.
//реализовать метод, который будет запрашивать ввод натурального числа у пользователя (должен возвращать int число, если пользователь ввёл 0 или меньше, ругаться и просить повторить ввод)

import java.util.Scanner;

public class HomeMethod {
    public static void main(String[] args) {
        System.out.print("Input number: ");
        Scanner scan = new Scanner(System.in);
        //test(scan.nextInt());
        System.out.println("Your number is " + superScan(scan.nextInt()) + "!");
    }
//    static boolean test(int a) {
//        while (a <= 0) {
//            System.out.println("Enter positive number!");
//            Scanner scanMethod = new Scanner(System.in);
//            a = scanMethod.nextInt();
//        }
//        int c = a % 2;
//        if (c == 0) {
//            System.out.println("Your number " + a + " is even");
//            return true;
//
//        } else {
//            System.out.println("Your number " + a + " is odd");
//            return false;
//        }
//    }

    static int superScan(int a) {
        while (a <= 0){
            System.out.println("Enter positive number!");
            Scanner scanMethod = new Scanner(System.in);
            a = scanMethod.nextInt();
        }
        return a;
    }
}




