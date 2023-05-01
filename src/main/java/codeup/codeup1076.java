package codeup;

import java.util.Scanner;

public class codeup1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char val1 = 'a';
        char val2 = sc.next().charAt(0);
        do {
            System.out.println(val1);
            val1 += 1;
        }while (val1 <= val2);
    }
}
