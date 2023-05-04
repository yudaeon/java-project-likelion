package codeup;

import java.util.Scanner;

public class codeup1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int min = 24;
        for (int i = 0; i < num; i++) {
            int val1 = sc.nextInt();
            if (min > val1) {
                min = val1;
            }
        }
        System.out.println(min);
    }
}
