package Homework6;

import java.util.Arrays;
import java.util.Random;

public class HomeArraysCommon {
    public static void main(String[] args) {
        int[] arrayA = array();
        int[] arrayB = array();
        System.out.println("Array A: " + Arrays.toString(arrayA));
        System.out.println("Array B: " + Arrays.toString(arrayB));
        System.out.println("Array Common: " + Arrays.toString(arrayCommon(arrayA, arrayB)));
        System.out.println("Array Cut: " + Arrays.toString(arrayCut(arrayCommon(arrayA, arrayB))));
    }

    static int[] array() { // Генерируем массив произвольной длины и наполняем его произвольными значениями
        Random random = new Random();
        int[] array = new int[random.nextInt(9) + 1];
        for (int j = 0; j < array.length; j++) {
            array[j] = random.nextInt(9) + 1;
        }
        return array;
    }

    static int[] arrayCommon(int[] arrayA, int[] arrayB) { // Создаем массив, содержащий только такие числа, которые есть в двух сгенерированных массивах
        int l;
        if (arrayA.length == arrayB.length || arrayA.length > arrayB.length) { // Выбираем наибольшую длину среди массивов
            l = arrayA.length;
        } else {
            l = arrayB.length;
        }
        int[] arrayCommon = new int[l]; // Создаем массив длины, равной наибольшему значению среди сгенерированных массивов

        for (int i = 0; i < arrayA.length; i++) {       // Перебираем значения от 0 до длины массива A, в которых
            for (int value : arrayB) {                  // Для каждого значения массива B,
                if (arrayA[i] == value) {               // Если значение в i ячейке массива A равно значению ячейки из массива B
                    arrayCommon[i] = arrayA[i];         // Записываем значение из массива A в i ячейку массива Common
                    for (int k = 0; k < i; k++) {       // При этом перебираем значения внутри массива Common от нуля до текущего элемента записи
                        if (arrayA[k] == arrayA[i]) {   // И если находим в среди них числа, которые равны с числом в текущей ячейке,
                            arrayCommon[i] = 0;         // Заменяем значение текущей ячейки на ноль
                        }
                    }
                }
            }
        }
        return arrayCommon;
    }


    static int[] arrayCut(int[] arrayCommon) { // Генерируем массив, в котором будут содержаться только числа, отличные от нуля
        int count = 0;                  // Переменная счетчик
        for (int l : arrayCommon) {     // Перебираем все значения в массиве Common
            if (l != 0)                 // Если находим не нулевое -
                count++;                // Инкрементируем счетчик
        }
        System.out.println("Array Cut length: " + count);
        int[] arrayCut = new int[count];    // Создаем массив Cut, длина которого определена в предыдущем счетчике (длина равна количеству ненулевых элементов массива Common)
        int c = 0;                          // Переменная счетчик
        for (int a : arrayCommon) {         // Перебираем все значения массива Common
            if (a != 0) {                   // Если значение в ячейке массива не равно нулю
                arrayCut[c] = a;            // Записываем это значение в ячейку с номером счетчика
                c++;                        // И инкрементруем счетчик
            }
        }
        return arrayCut;
    }
}









