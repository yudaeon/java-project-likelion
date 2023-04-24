package codeup;

import java.util.Scanner;

public class codeup1029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double val1 = sc.nextDouble();
        String str = String.format("%.11f", val1);
        System.out.printf(str);
    }
}
