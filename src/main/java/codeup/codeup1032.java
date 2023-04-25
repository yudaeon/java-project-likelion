package codeup;

import java.util.Scanner;
//10진수->16진수로(소문자) 255->ff
public class codeup1032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.printf("%x", num);
    }
}
