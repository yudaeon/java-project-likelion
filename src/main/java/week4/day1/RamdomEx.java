package week4.day1;

import java.util.Random;

public class RamdomEx {
    public static void main(String[] args) {
        Random ran = new Random();
        //float 0.0에서 1.0 범위
        float user =  ran.nextFloat();
        System.out.println("float형 난수: " + user);
        //int 범위
        int range = ran.nextInt();
        System.out.println("int형 난수: " + range);
        //Math class
        int computer = (int)(Math.random()*3);
        System.out.println("int형 난수: " + computer);
    }
}
