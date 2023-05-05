package programmers;

import java.util.Scanner;

public class 문자열반복해서출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        System.out.println(str.repeat(n)); //str을 n번 반복해라
        }
    }
