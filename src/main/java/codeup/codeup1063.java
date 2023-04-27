package codeup;

import java.util.Scanner;

public class codeup1063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        int max = (val1 > val2) ? val1 : val2;
        System.out.println(max);
    }
}

