package codeup;

import java.util.Scanner;

public class codeup1096 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[][] = new int[19][19];

        for (int i = 0; i < num; i++) {
          int x = sc.nextInt();
          int y = sc.nextInt();

          arr[x-1][y-1]=1;
        }
        for (int j = 0; j < 19; j++) {
            for (int k = 0; k < 19; k++) {
                System.out.print(arr[j][k] + " ");
            }
            System.out.println();
        }
    }
}