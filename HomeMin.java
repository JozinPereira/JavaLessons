package Homework5;

import java.util.Arrays;
import java.util.Random;

public class HomeMin {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] mass = new int[9];

        for (int i = 0; i < mass.length; i++) { // Тут просто набираем значения для массива
            mass[i] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(mass)); // Вывод массива
        System.out.println(min(mass));
    }

    static int min(int[] mass) { // Зовем метод, которому на вход подаем сгенерированный массив
        int minimum = Integer.MAX_VALUE;
        for (int value : mass) { //Перебираем поочередно значения в массиве и сравниваем с максимально большим числом

            if (minimum > value) {
                minimum = value;
            }
        }
        return minimum;
    }
//    static int min(int[] mass) { // Зовем метод, которому на вход подаем сгенерированный массив
//        int minimum = Integer.MAX_VALUE;
//        for (int i = 0; i < mass.length; i++) { //Перебираем поочередно значения в массиве и сравниваем с максимально большим числом
//
//            if (minimum > mass[i]) {
//                minimum = mass[i];
//            }
//        }
//        return minimum;
//    }
}







