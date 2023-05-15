package week5.day1;

import java.util.Arrays;
import java.util.Comparator;

public class BubbleSortComparator {

    private Comparator<Integer> comparator;

    public BubbleSortComparator(Comparator<Integer> comparator) {
        this.comparator = comparator;
    }

    public int[] sortARound(int[] arr, int until) {
        for (int i = 0; i < arr.length - 1; i++) { //1을 -->j로
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        return arr;
    }
    public int[]sort(int[]arr){
        for (int j = 1; j <= arr.length; j++) {
            arr = sortARound(arr, arr.length-j); //메서드 안에서만 입력하면 됨
        }
        return arr;
    }

    public static void main(String[] args) {
        BubbleSortComparator bubbleSortComparator = new BubbleSortComparator(((o1, o2) -> o1-02)); //oop

        int[] arr = {7, 2, 3, 9, 28};
        System.out.println(Arrays.toString(arr));
    }
}
