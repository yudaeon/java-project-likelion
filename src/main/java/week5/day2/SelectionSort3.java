package week5.day2;

import java.util.Arrays;

public class SelectionSort3 {
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 11};

        for (int j = 0; j < arr.length - 1; j++) {

            int targetValue = arr[j];
            int targetIdx = j;
            for (int i = j+1; i < arr.length; i++) {
                if (targetValue > arr[i]) {
                    targetValue = arr[i];
                    targetIdx = i;
                }
            }
            int temp = arr[j];
            arr[j] = arr[targetIdx];
            arr[targetIdx] = temp;
        }
            System.out.println(Arrays.toString(arr));
        }
    }
