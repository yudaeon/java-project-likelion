package codeup;

import java.util.Scanner;

public class codeup1091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long result = sc.nextInt();

        int val1 = sc.nextInt(); //시작값
        int val2 = sc.nextInt(); //곱할 값
        int val3 = sc.nextInt(); // 더할 값


            for (int i = 1; i < val3; i++) {
                result = result * val1 * val2;
            }
            System.out.println(result);
        }

    }

