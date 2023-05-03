package codeup;

import java.util.Scanner;
//등차수열
public class codeup1089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        int val3 = sc.nextInt();

        int result = val1 + val2 * (val3 - 1);
        System.out.println(result);
    }
}