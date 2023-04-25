package codeup;

import java.util.Scanner;
//10진수->16진수로(대문자) 255->FF
public class codeup1033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.printf("%X", num);
    }
}
