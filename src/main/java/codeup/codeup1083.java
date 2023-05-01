package codeup;

import java.util.Scanner;

public class codeup1083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();

        for (int i = 1; i <= val1; i++) {
            if (i % 3 == 0){
            System.out.print("X ");
        } else
                System.out.print(i + " ");
        }
    }
}