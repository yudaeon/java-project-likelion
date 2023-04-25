package codeup;

import java.util.Scanner;
// 시분초에서 분만 출력하기
public class codeup1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr = sc.next();
        String[] hour = arr.split("\\:");
        int minute = Integer.parseInt(hour[1]);

        if( minute <= 9)
            System.out.printf("%1d", minute);
        else
            System.out.printf("%d",minute);

    }
}
