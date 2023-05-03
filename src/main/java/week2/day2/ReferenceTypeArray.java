package week2.day2;

import java.util.Arrays;

public class ReferenceTypeArray {
    public static void main(String[] args) {
        float[] fArr = new float[3];
        String[] sArr = new String[10];
        System.out.println(Arrays.toString(fArr));
        System.out.println(Arrays.toString(sArr));
        //[0.0, 0.0, 0.0] / [null, null, null, null, null, null, null, null, null, null]출력
    }
}
