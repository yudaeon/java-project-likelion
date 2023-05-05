package codeup;

import java.util.Arrays;
import java.util.Scanner;

public class codeup1099 {
    public static void printArr(int[][]arr){
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
        arr[1][1] = 9;
        boolean canMove = true;

        while (canMove){
                //오른쪽
            if (arr[y][x] == 2){
                arr[y][x] = 9;
                break;
            } else if (arr[y][x+1] == 1) {//2 또는 1인 경우
                y++;
                arr[y][x] = 9;
            } else if (x == 8 && y ==8) { //x와 y가 8인경우 break
                arr[y][x] = 9;
                break;

            } else if (x ==8 && arr[y+1][x] == 0) {
                arr[y++][x] = 9;

            } else if (x ==8 && arr[y][x+1] == 0) {
                arr[y][x++] = 9;
            } else {
                System.out.printf("x:%d y:%d\n", x, y);
            }
        }
    }
}