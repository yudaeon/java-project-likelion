package codeup;

import javax.swing.*;
import java.util.Scanner;

public class codeup1098 {
    public static void main(String[] args) {
        //2차원 배열 설탕과자 뽑기

        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(); //세로
        int w = sc.nextInt(); //가로
        int [][] board  = new int[h][w]; //배열 세로가로

        int n = sc.nextInt(); //막대의 개수
        for (int i = 1; i <= n; i++) {
            int l = sc.nextInt(); //막대의 길이
            int d = sc.nextInt(); //막대놓는방향 (가로0, 세로1)
            int x = sc.nextInt(); //막대왼쪽
            int y = sc.nextInt(); //막대 오른쪽

            for (int j = 0; j < l; j++) {
                if (d==0)  //막대방향이 0이라면
                    board[x-1][y-1+j] = 1;
                else //막대방향 1이라면
                    board[x-1+j][y-1] = 1;
            }
        }
        for (int i = 0; i < h; i++) { //세로
            for (int j = 0; j < w; j++) { //가로
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
