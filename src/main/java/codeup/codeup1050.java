package codeup;

import java.util.Scanner;

public class codeup1050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();

        if (val1 == val2)
            System.out.printf("1");
        else
            System.out.printf("0");
    }
}
