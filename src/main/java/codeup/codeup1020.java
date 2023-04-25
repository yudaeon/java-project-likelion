package codeup;

import java.util.Scanner;
//주민번호에서 하이픈 제거 하고 출력되기
public class codeup1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String val1 = sc.nextLine();
        System.out.println(val1.substring(0,6) + val1.substring(7, 14));
    }
}
