package codeup;

import java.util.Scanner;

public class codeup1287 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int star = sc.nextInt();
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j< i*star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
