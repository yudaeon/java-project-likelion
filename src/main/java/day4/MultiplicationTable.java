package day4;

public class MultiplicationTable {
    //구구단 출력 2가지 방법
    //&d는 숫자를 출력할 때 사용합니다
    //%s로도 가능합니다. 하지만 1+2 -> x 문자열이기때문에 실행 x
    //%d, 1+2 -> 0 숫자이기때문에 실행 가능
    public static void main(String[] args) {
        System.out.println("2" + "*" + "1" + "=" + "2");
        System.out.printf("%d * %d = %d", 2, 2, 4);
    }
}
