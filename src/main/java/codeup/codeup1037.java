package codeup;

import java.util.Scanner;
public class codeup1037 {
    //10진수->아스키문자로 65->A출력
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        char val2 = (char) val1;
        System.out.println(val2);
    }
}
