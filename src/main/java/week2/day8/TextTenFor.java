package week2.day8;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TextTenFor {
    public static void main(String[] args) {
        int[][] arr10x10 = new int[10][10];
        for (int i = 0; i < 10; i++) {
            System.out.println(Arrays.toString(arr10x10[i]));
        }
    }
}
