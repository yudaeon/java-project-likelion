package week4.day2;

import java.lang.annotation.Repeatable;

public class Pyramid1 {
    private String spaceChar = "0";

    public Pyramid1(String spaceChar){
        this.spaceChar = spaceChar;
    }


public void printPyramid(int height){
    for (int i = 0; i < height; i++) {
        System.out.printf("%s%s\n", spaceChar.repeat(height-i-1), "*".repeat(2*i+1));
    }
    }

    public static void main(String[] args) {
        Pyramid1 pyramid1 = new Pyramid1(" ");
        Pyramid1 pyramidSpaceZero = new Pyramid1("0");

        pyramid1.printPyramid(4);
        pyramidSpaceZero.printPyramid(5);

    }
}
