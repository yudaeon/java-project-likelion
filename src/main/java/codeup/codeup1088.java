package codeup;

import java.util.Scanner;

public class codeup1088 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int val1 = sc.nextInt();

            for (int i = 1; i <= val1; i++) {
                if (i % 3 == 0){
                    continue;
                }
                System.out.printf("%d ", i );
            }
        }
    }