package codeup;

import java.util.Scanner;

public class codeup1098_2 {
    public static void main(String[] args) {
        // 첫줄에는 격자판 세로h, 가로w 공백을 두고 입력된다.
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[sc.nextInt()][sc.nextInt()]; //배열 공백
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            // 세로 h 가로 w, 막대의 개수 n, 막대의 길이 l, 방향 d, 좌표 x,y
            int l = sc.nextInt();
            int d = sc.nextInt();
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            // 막대를 놓을건데 가로 세로 구분을 해야됨
            //막대가 놓이면 +1
            for (int k = 0; k < l; k++) {
                if (d == 0) { //가로라면
                    arr[x][y + k] = 1;
                } else { //세로라면
                    arr[x + k][y] = 1;
                }
            }
        }
        //출력
        for (int i = 0; i < arr.length; i++) { //가로 세로 길이가 지정이 안됐기때문에 arr.legnth를 붗여야함
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
