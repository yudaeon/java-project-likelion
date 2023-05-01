package codeup;

import java.util.Scanner;

public class codeup1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int[]num = new int[val1];

        for (int i = 0; i < num.length; i++) {
            num [i] = sc.nextInt();
        }
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
