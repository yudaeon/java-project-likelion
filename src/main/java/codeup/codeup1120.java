package codeup;

import java.util.Scanner;
//세 수의 평균, 소수둘쨰자리까지
public class codeup1120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float val1 = sc.nextFloat();
        float val2 = sc.nextFloat();
        float val3 = sc.nextFloat();
        System.out.printf("%.2f\n", (val1 + val2 + val3) / 3);
    }
}
