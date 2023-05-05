package codeup;

import java.util.Scanner;

public class codeup1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String val1 = sc.next();
        char[] arr = val1.toCharArray();
        for (int i = 0; i < val1.length(); i++) {
            System.out.print("[" + arr[i]);
            for (int j = 1; j < val1.length()- i; j++) {
                System.out.print("0");
            }
            System.out.println("]");
        }
    }
}
