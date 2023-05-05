package codeup;

import java.util.Arrays;
import java.util.Scanner;

public class codeup1099_2 {
    public static void printArr(int[][] arr) {
        for (int i = 0; i < 10; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("----------------");
    }

    public static void main(String[] args) {
        // 입력받은 지도를 배열에 입력 10 * 10
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        printArr(arr);

        int x = 1;
        int y = 1;
        while (x < 9 && y < 9 && arr[y][x] != 2) {
            if (arr[y][x + 1] == 1) {

            } else if (arr[y + 1][x] != 1) {

            } else {
            }
        }
    }
}