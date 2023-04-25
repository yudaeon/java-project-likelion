package codeup;

import java.util.Scanner;

public class codeup1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String val1 = sc.next();
        int val2= val1.length();
        for (int i = 0; i < val2; i++) { //fori 사용
            System.out.printf("\'%c\'\n",val1.charAt(i));
        }
    }
}