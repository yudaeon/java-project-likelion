package week2.day3;

public class Remainder687Sum {
    public static void main(String[] args) {
        //%연산자로 나머지 구하기 % 사용
        int num = 687;
        int first  = num % 10;  //687을 10으로 나눈 나머지
            num = num / 10;
        int second  = num % 10;  //68을 10으로 나눈 나머지
            num = num / 10;
        int third  = num % 10;  //6을 10으로 나눈 나머지

        System.out.println(first + second + third);
    }
}
