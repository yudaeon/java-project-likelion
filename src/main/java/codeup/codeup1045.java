package codeup;

import java.util.Scanner;

public class codeup1045 {
     //10 3을 입력받아 차례대로 출력하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.printf("%d\n", a + b);
        System.out.printf("%d\n", a - b);
        System.out.printf("%d\n", a * b);
        System.out.printf("%d\n", a / b);
        System.out.printf("%d\n", a % b);

      // 3.33 출력
        double A = (double) a;
        System.out.printf("%.2f\n", A/b);
    }
}
