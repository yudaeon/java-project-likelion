package codeup;

import java.util.Scanner;

public class codeup1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String val1 = sc.next();
        int num = Integer.parseInt(val1, 16);
        System.out.printf("%o", num);
    }
}
