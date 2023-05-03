package codeup;

import java.util.Scanner;

public class codeup1073_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1;
        do {
            val1 = sc.nextInt();
            if (val1 == 0) break;
            System.out.println(val1);
        }  while(val1 > 0);
    }
}
