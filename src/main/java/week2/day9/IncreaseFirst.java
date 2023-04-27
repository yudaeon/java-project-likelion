package week2.day9;

public class IncreaseFirst {
    public static void main(String[] args) {
        int idx = 0;
        int[]arr = {2,1,7,4};
        System.out.println(arr[idx]); // 0번째 있는 2를 출력
        idx += 1;
        System.out.println(arr[idx]); // 1번째 있는 1을 출력
        idx += 1;
        System.out.println(arr[idx]); // 2번째 있는 7을 출력
        idx += 1;
        System.out.println(arr[idx]); // 3번째 있는 4을 출력
        idx += 1;
    }
}
