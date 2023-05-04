package codeup;

import java.util.Scanner;

public class codeup4596 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //배열 정의하기
      int xIdx = 0;
      int yIdx = 0;

        int maxValue = 0; //자연수니까 0으로 초기화

        // 0(N^2) N제곱
        for (int row = 1; row <= 9 ; row++) { //행
            for (int col = 1; col <= 9; col++) { //열
            int now = sc.nextInt();
            if (maxValue < now){
                maxValue = now;
                xIdx = col;
                yIdx = row;

            }
            }
        }
        System.out.println(maxValue);
        System.out.printf("%d %d\n",yIdx, xIdx);
    }
}
