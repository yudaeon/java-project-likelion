package week5.day1;

import java.util.Arrays;

    public class BubbleSort01 {
        public static void main(String[] args) {
            int[] arr = {7, 2, 3, 9, 28, 11};

            //[2, 7, 3, 9, 28, 11]
            int temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
            System.out.println(Arrays.toString(arr));

            //[2, 3, 7, 9, 28, 11]
            temp = arr[1];
            arr[1] = arr[2];
            arr[2] = temp;
            System.out.println(Arrays.toString(arr));

            //[2, 3, 9, 7, 28, 11]
            temp = arr[2];
            arr[2] = arr[3];
            arr[3] = temp;
            System.out.println(Arrays.toString(arr));
        }
    }

