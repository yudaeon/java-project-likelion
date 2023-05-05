package codeup;

import java.util.Scanner;

public class codeup1085 {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            double val1 = sc.nextInt();
            double val2 = sc.nextInt();
            double val3 = sc.nextInt();
            double val4 = sc.nextInt();

            double result = (val1 * val2* val3 * val4) / 8 / 1024 / 1024;
            System.out.printf("%.1f MB\n", result);
        }
    }
