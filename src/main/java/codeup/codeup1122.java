package codeup;

import java.util.Scanner;

public class codeup1122 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min  = sc.nextInt();
        System.out.printf("%d %d", min/60, min%60);
    }
}
