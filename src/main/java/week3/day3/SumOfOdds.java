package week3.day3;

import java.util.Scanner;

public class SumOfOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        int num = 10;
        for (int i = 1; i < 10; i+=2) {
            if (i % 2 != 0){
                answer += 1;
            }
        }
        System.out.println(answer);
    }
}
