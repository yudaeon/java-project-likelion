package week5.day2;

import java.util.Arrays;

public class InsertionSort01 {
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 11};
        //      i j j-1
        //1일때 1 0
        //2일때 2 1 1 0
        //3일때 3 2 2 1 1 0
        //9일때
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                System.out.printf("i:%d j:%d j-1:%d\n", i, j, j - 1);

            }
        }
    }
}