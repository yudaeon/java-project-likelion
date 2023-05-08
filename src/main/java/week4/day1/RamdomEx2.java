package week4.day1;

import java.util.Random;
import java.util.Scanner;

public class RamdomEx2 {
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);
        int me, com;
        System.out.println("무엇을 내시겠습니까? \n1.가위 \n2.바위 \n3.보 \n1~3의 값을 입력하세요->");
        me = sc.nextInt();
        com = ran.nextInt(3) + 1; //1~3 사이
        if (com == 1){
            System.out.println("컴퓨터는 가위를 냈습니다.");
        }else if (com == 2){
            System.out.println("컴퓨터는 바위를 냈습니다.");
        } else {
            System.out.println("컴퓨터는 보를 냈습니다.");
        }
        int result = (me - com + 3) % 3;
        switch (result){
            case 0 :
                System.out.println("비겼습니다.");
                break;
            case 1 :
                System.out.println("이겼습니다.");
                break;
            case 2 :
                System.out.println("졌습니다.");
                break;
        }
    }
}
