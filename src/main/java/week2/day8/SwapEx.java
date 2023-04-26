package week2.day8;

import java.util.Arrays;

public class SwapEx {
    public static void main(String[] args) {
        // 오름차순으로 정렬하는 알고리즘을 만들어 보세요
        int[] arr = {2, 1, 4, 8, 7, 6};

        int temp = arr[0]; //0번에 있는 값 저장
        arr[0] = arr[1]; // 0번 방에 덮어쓰기
        arr[1] = temp; // 임시로 저장한 값을 1번에 넣기

        System.out.println(Arrays.toString(arr));
        //1,2,4,8,7,9 출력
    }
}
