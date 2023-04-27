package week2.day9;

public class AndOperatorEx {
    public static void main(String[] args) {
        //AND 연산자=둘다 참이여야함
        boolean result = true && true;
        System.out.printf("%b\n", result);

        result = true && false;
        System.out.printf("%b\n", result);

        result = false && true;
        System.out.printf("%b\n", result);

        result = false && false;
        System.out.printf("%b\n", result);
    }
}
