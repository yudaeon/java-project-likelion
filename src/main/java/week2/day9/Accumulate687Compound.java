package week2.day9;

public class Accumulate687Compound {
    public static void main(String[] args) {
        int num = 687;
        int answer = 0;
        //1 나머지 2 몫
        answer += num % 10;
        num /= 10;
        answer += num % 10;
        num /= 10;
        answer += num % 10;
        System.out.printf("answer:%d\n",answer);

    }
}
