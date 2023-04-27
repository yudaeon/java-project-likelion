package week2.day9;

public class IncreaseFirst2 {
    public static void main(String[] args) {
        int idx = 0;
        int[]arr = {2,1,7,4};
        System.out.println(arr[idx++]); //0번째 있는 2 출력
        System.out.println(arr[idx++]); //1번째가 있는 1 출력
        System.out.println(arr[idx++]); //2번째 있는 7 출력
        System.out.println(arr[idx++]); //3번째 있는 4 출력
    }
}
