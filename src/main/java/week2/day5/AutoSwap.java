package week2.day5;

import java.util.Arrays;

public class AutoSwap {
    public static void main(String[] args) {
        //  오름차순정렬
        int[] arr = { 2, 1, 7, 9};
        boolean check = arr[0] > arr[1];

        if (check){
            int temp = arr[0];
            arr[0] = arr[1]; //arr0에 있는걸 1번으로 바꾼다
            arr[1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
