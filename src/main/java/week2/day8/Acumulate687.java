package week2.day8;

public class Acumulate687 {
    public static void main(String[] args) {
        //변수,  누적, 연산자, 나머지, 몫
        int num = 687;
        int answer = 0;

        //나머지를 먼저 구하고
        answer = answer + (num % 10);
        //그 뒤에 몫을 구해야합니다.
        num = num / 10;
        System.out.printf("num%d, answer:%d\n", num, answer);
        //68-->10으로 나눈 나머지 = 8

        //나머지를 먼저 구하고
        answer = answer + (num % 10);
        //그 뒤에 몫을 구해야합니다.
        num = num / 10;
        System.out.printf("num%d, answer:%d\n", num, answer);
        //68-->10으로 나눈 나머지 = 8

        //나머지를 먼저 구하고
        answer = answer + (num % 10);
        //그 뒤에 몫을 구해야합니다.
        num = num / 10;
        System.out.printf("num%d, answer:%d\n", num, answer);
        //68-->10으로 나눈 나머지 = 8

    }
}
