package week2.day4;

import java.util.Arrays;

public class ComparisonArray {
    //버블정렬
    public static void main(String[] args) {
        int[] arr = {2,1,7,9};
        System.out.printf("%d < %d --> %b\n", arr[0], arr[1], arr[0] > arr[1]); //2,1중에 1이 더작니? true
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp; //  1과 2의 순서를 바꾸기
        System.out.println(Arrays.toString(arr)); // 1, 2, 7, 9 출력
        System.out.printf("%d < %d --> %b\n", arr[1], arr[2], arr[1] > arr[2]);
        System.out.println(Arrays.toString(arr)); // 1, 2, 7, 9 출력
        System.out.printf("%d < %d --> %b\n", arr[2], arr[3], arr[2] > arr[3]);
        System.out.println(Arrays.toString(arr)); // 1, 2, 7, 9 출력

    }
}
