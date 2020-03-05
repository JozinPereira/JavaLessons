package Home6Mac;

import java.util.Arrays;
import java.util.Random;

public class HomeBubbles {
    public static void main(String[] args) {
        int[] arrayA = arrayGen();
        int[] arrayB = arrayGen();

        System.out.println("Array A = " + Arrays.toString(arrayA));
        System.out.println("Array B = " + Arrays.toString(arrayB));
        System.out.println("Array Common = " + Arrays.toString(arrayCommon(arrayA, arrayB)));
        System.out.println("Array Cut = " + Arrays.toString(arrayCut(arrayCommon(arrayA, arrayB))));

    }

    public static int[] arrayGen() {
        Random random = new Random();
        int[] array = new int[random.nextInt(9) + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(9) + 1;
        }
        return array;
    }

    public static int[] arrayCommon(int[] arrayA, int[] arrayB) {
        int len;
        int count = 0;
        int b;
        if (arrayA.length >= arrayB.length) {
            len = arrayA.length;
        } else {
            len = arrayB.length;
        }
        int[] arrayCommon = new int[len];

        for (int a : arrayA) {
            for (b = 0; b < arrayB.length; b++) {
                if (a == arrayB[b]) {
                    arrayCommon[count] = a;
                    for (int c = 0; c < count; c++) {
                        if (arrayCommon[c] == arrayCommon[count]) {
                            arrayCommon[count] = 0;
                        }
                    }
                    count++;
                }
            }
        }
        return arrayCommon;
    }

    public static int[] arrayCut(int[] arrayCommon) {
        int count1 = 0;
        int fill = 0;
        for (int cut : arrayCommon) {
            if (cut != 0) {
                count1++;
            }
        }
        int[] arrayCut = new int[count1];
        for (int count2 : arrayCommon) {
            if (count2 != 0) {
                arrayCut[fill] = count2;
                fill++;
            }
        }

        for (int i = 0; i < arrayCut.length; i++) {
            for (int j = 0; j < arrayCut.length; j++) {

                if (arrayCut[i] > arrayCut[j]) {
                    int temp = arrayCut[i];
                    arrayCut[i] = arrayCut[j];
                    arrayCut[j] = temp;
                }
            }
        }
        System.out.println("Array Cut Tmp: " + Arrays.toString(arrayCut));


        for (int k = 0; k < arrayCut.length; k++) {
            for (int p = 1; p < arrayCut.length - k; p++) {
                int tmp = 0;
                if (arrayCut[p] < arrayCut[p - 1]) {
                    tmp = arrayCut[p];
                    arrayCut[p] = arrayCut[p - 1];
                    arrayCut[p - 1] = tmp;
                }
            }
        }
        return arrayCut;
    }
}
