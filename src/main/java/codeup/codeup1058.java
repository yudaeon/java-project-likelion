package codeup;

import java.util.Scanner;

public class codeup1058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();

        if (val1 == 0 && val2 == 0)
            System.out.println(1);
        else
            System.out.println(0);
    }
}
