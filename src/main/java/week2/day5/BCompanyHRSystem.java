package week2.day5;

import java.util.Scanner;

public class BCompanyHRSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int program = sc.nextInt();
        if (year > 5 || program > 10){ //연차가 5년이 넘었거나, 프로그램 횟수가 10회가 넘었다면
            System.out.println("팀장 승진 대상입니다.");
        } else{
            System.out.println("팀장 승진 대상이 아닙니다.");
        }
    }
}
