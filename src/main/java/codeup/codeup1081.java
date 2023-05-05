package codeup;

import java.util.Scanner;

public class codeup1081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dice1 = sc.nextInt(); //이너다이스
        int dice2 = sc.nextInt(); //아우터다이스

        for (int i = 1; i <= dice1; i++) {
            for (int j = 1; j <= dice2; j++) {
                System.out.println(i + " " + j);
            }
        }
    }
}
