package week1.day4;

import java.util.Scanner;

public class ScannerFormating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("%d", sc.nextInt() + sc.nextInt());
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        System.out.printf("%d와 %d의 합은 %d입니다.",val1, val2, val1 + val2);

    }
}
