package programmers;

import java.util.Scanner;

public class _181944_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0){//2로 나누었을 때 나머지가 0인지
            System.out.printf("%d is even",n);

        } else {
            System.out.printf("%d is odd",n);
        }
    }
}
