package codeup;

import java.util.Scanner;

public class codeup1077 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int val1 = sc.nextInt();
            if (val1 >= 0 && val1 <= 100){
                for (int i = 0; i <= val1; i++) {
                    System.out.println(i);
                }
            }
        }
    }
