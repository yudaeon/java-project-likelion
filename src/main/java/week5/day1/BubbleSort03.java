package week5.day1;

import java.util.Arrays;

public class BubbleSort03 {
    public int[] sortARound(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        BubbleSort03 bubbleSort03 = new BubbleSort03(); //oop
        int[] arr = {7, 2, 3, 9, 28};

        for (int j = 1; j <= arr.length; j++) {
            arr = bubbleSort03.sortARound(arr);
        }
        System.out.println(Arrays.toString(arr));
    }
}
//[2, 3, 7, 9, 28]