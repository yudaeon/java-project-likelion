package day4;

public class MultiplicationTable {
    //구구단 출력 2가지 방법
    //&d는 숫자를 출력할 때 사용합니다
    //%s로도 가능합니다. 하지만 1+2 -> x 문자열이기때문에 실행 x
    //%d, 1+2 -> 0 숫자이기때문에 실행 가능
    public static void main(String[] args) {
        System.out.printf("%d * %d = %d\n", 2, 2, 4);
        System.out.printf("%d * %d = %d\n", 2, 3, 6);
        System.out.printf("%d * %d = %d\n", 2, 4, 8);
        System.out.printf("%d * %d = %d\n", 2, 5, 10);
        System.out.printf("%d * %d = %d\n", 2, 6, 12);
        System.out.printf("%d * %d = %d\n", 2, 7, 14);
        System.out.printf("%d * %d = %d\n", 2, 8, 16);
        System.out.printf("%d * %d = %d\n", 2, 9, 18);
    }
}
