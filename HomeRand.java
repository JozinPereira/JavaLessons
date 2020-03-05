package Homework4;

import java.util.Random;

public class HomeRand {
    public static void main(String[] args) {
        Random rand = new Random();
        int a= 100;
       for (int c = 0; c < 10; c++) {
           int n = rand.nextInt(a);
           System.out.println("rand " + n);
       }
    }

}
