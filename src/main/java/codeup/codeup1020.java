package codeup;

import java.util.Scanner;
//주민번호에서 하이픈 제거 하고 출력되기
public class codeup1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] arr = str.split("\\-");
        System.out.printf("%s%s", arr[0], arr[1]);
    }
}
