package day5;

import day4.PrintHello;

public class ConstantEx {
    public final int MAX_LEVEL = 3; //상수를 바로 선언하는것
    public static final int MIN_LEVEL = 1;
    public static void main(String[] args) {
        final int ival;
        ival = 1;
        System.out.println(ival);

        final PrintHello printHello = new PrintHello();
        //2. final 붙여서 상수선언하는 방법 (마찬가지로 한번만 할당 가능)

    }
}
