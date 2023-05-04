package codeup;

import java.util.Scanner;

public class codeup1097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[][] = new int[19][19];

        //1. 바둑판 입력
        for (int i = 1; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // 2. 십자뒤집기 횟수 n 입력
            int n = sc.nextInt();

        // 3. 십자뒤집기 좌표 x,y 입력
        for (int a = 0; a < n; a++) {

            int x = sc.nextInt();
            int y = sc.nextInt();
            //x열
            for (int i = 0; i < 19; i++) {
                if (arr[x][i]==0) arr[x][i] =1;
                else arr[x][i]=0;
            }
            //y열
            for (int j = 0; j < 19; j++) {
                if (arr[y][j]==0) arr[y][j]=1;
                else arr[y][j] = 0;
            }
        }
            //십자뒤집기
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
