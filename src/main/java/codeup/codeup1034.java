package codeup;

import java.util.Scanner;
//8진수를 10진수로 바꾸기 13 -> 11 출력
public class codeup1034 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String num1 =sc.nextLine();
    int num = Integer.parseInt(num1, 8);
    System.out.print(num);
    }
}
