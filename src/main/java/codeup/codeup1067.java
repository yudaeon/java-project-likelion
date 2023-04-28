package codeup;

import java.util.Scanner;

public class codeup1067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();

        if (val1 < 0) { //조건1: 음수라면 minus
            System.out.printf("minus\n");
        } else {
            System.out.printf("plus\n");  //조건1: d라면 minus
    }
            if (val1 %2 == 0){
                System.out.printf("even\n"); //조건2:짝수라면 짝
            } else {
                System.out.printf("odd\n"); //조건2:홀수라면 홀
        }}}