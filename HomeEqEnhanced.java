package Homework5;

import java.util.Arrays;
import java.util.Random;

public class HomeEqEnhanced {
    public static void main(String[] args) {
        Random rand = new Random();
//        int[] mass1 = new int[rand.nextInt(4) + 1]; // Не хочу пустой массив
//        for (int i = 0; i < mass1.length; i++) {
//            mass1[i] = rand.nextInt(9) + 1; //Не хочу нуль
//        }
//        int[] mass2 = new int[rand.nextInt(4) + 1]; // И тут не хочу пустой массив
//        for (int j = 0; j < mass2.length; j++) {
//            mass2[j] = rand.nextInt(9) + 1; // И тут не хочу нуль
//        }
//        System.out.println("mass1 = " + Arrays.toString(mass1));
//        System.out.println("mass2 = " + Arrays.toString(mass2));
//
//        boolean result = equals(mass1, mass2);

        int[] mass1 = new int[rand.nextInt(4) + 1]; // Не хочу пустой массив
        int[] mass2 = new int[rand.nextInt(4) + 1]; // И тут не хочу пустой массив



                while (!equals(mass1, mass2)) {
                    for (int count = 1; count < rand.nextInt(3) + 2; count++) {
                    count += 1;
            System.out.println("Arrays are NOT equal");
            for (int i = 0; i < mass1.length; i++) {
                mass1[i] = rand.nextInt(9) + 1; //Не хочу нуль
            }
            for (int j = 0; j < mass2.length; j++) {
                mass2[j] = rand.nextInt(9) + 1; // И тут не хочу нуль
            }
            System.out.println("mass1 = " + Arrays.toString(mass1));
            System.out.println("mass2 = " + Arrays.toString(mass2));
            System.out.println(count);
            }


        }
       // System.out.println("Arrays ARE equal!");


//        if (equals(mass1, mass2)) {
//            System.out.println("Arrays are NOT equal");
//        } else {
//            System.out.println("Arrays are NOT equal");
//        }
    }

    static boolean equals(int[] mass1, int[] mass2) {
        return mass1 == mass2;
    }
}
