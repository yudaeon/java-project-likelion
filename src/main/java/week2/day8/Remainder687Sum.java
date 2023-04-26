package week2.day8;

public class Remainder687Sum {
    public static void main(String[] args) {
        //%연산자로 나머지 구하기 % 사용
        int num = 687;
        int a  = num % 10;
            num = num / 10;
        int b  = num % 10;
            num = num / 10;
        int c  = num % 10;

        System.out.println(a + b + c);
    }
}
