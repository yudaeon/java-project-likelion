package codeup;

import java.util.Scanner;

public class codeup1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //3개의 수 입력해서 합, 평균 순서대로 출력하기
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double avg = (a+b+c)/3f; //float 형변환
        System.out.printf("%d\n%.1f", a+b+c, avg); // 3자리 더하기&평균(소수점1자리)
    }
}
