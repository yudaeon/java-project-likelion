package codeup;

import java.util.Scanner;

public class codeup1093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int[]arr = new int[24];

        for (int i = 0; i < val1; i++) {
            int num = sc.nextInt();
            arr[num-1] += 1;
        }
        for (int i = 0; i < 23; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
