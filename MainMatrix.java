package Lesson7;

public class MainMatrix {
    public static void main(String[] args) {
        int[][] m = new int[3][3];
        m[0][0] = 1;
        m[1][1] = 2;
        m[2][2] = 3;
        print(m);

    }

    private static void print(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                //System.out.println("i = " + i + " j = " + j + " " + m[i][j]);
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
