package week2.day8;

public class Acumulate687 {
    public static void main(String[] args) {
        int num = 687;
        int answer = 0;

        answer = answer + num % 10;
        System.out.printf("answer:%d\n", answer);

        num = num / 10;
        answer = answer + num % 10;
        System.out.printf("answer:%d\n", answer);

        num = num / 10;
        answer = answer + num % 10;
        System.out.printf("answer:%d\n", answer);
    }
}
