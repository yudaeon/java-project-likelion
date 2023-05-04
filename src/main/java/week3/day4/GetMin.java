package week3.day4;

public class GetMin {
    public static void main(String[] args) {
        int[] arr = { 2, 1, 31, 9 ,7};
        int targetValue = arr[0];

        for (int i = 0; i < arr.length; i++) {
            //targetValue <arr[i] 일때 교체하면 됨'
            if (targetValue > arr[i]) targetValue = arr[i];
        }
        System.out.println("targetValue = " + targetValue);
    }
}