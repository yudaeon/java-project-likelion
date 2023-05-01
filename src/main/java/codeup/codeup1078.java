package codeup;

import java.util.Scanner;

public class codeup1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        if (num >= 0 && num <= 100){
            for (int i = 2; i <= num; i+=2) {
                sum += i;
            }
            System.out.println(sum);
        }
    }
}
