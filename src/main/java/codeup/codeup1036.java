package codeup;

import java.util.Scanner;
//영문자->아스키코드10진수로 A->65출력
public class codeup1036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char val1 = sc.nextLine().charAt(0);
        int val2 = (int) val1;
        System.out.println(val2);
    }
}
