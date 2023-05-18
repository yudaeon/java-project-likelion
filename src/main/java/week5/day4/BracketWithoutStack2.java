package week5.day4;

import java.util.Arrays;

public class BracketWithoutStack2 {
    //split, join으로 괄호만들기
    public static void main(String[] args) {
        String brackets = "((()()))()";

        while (brackets.indexOf("()") != -1){
        System.out.println("------cnt-----");
           // brackets = brackets.replace("()", "");
        String[] split = brackets.split("\\(\\)");
        brackets = String.join("",split);

        System.out.println(Arrays.toString(split));
        System.out.println(brackets);
        }
    }
}
