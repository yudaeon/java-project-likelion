//package week5.day1;
//
//import java.util.Arrays;
//import java.util.Comparator;
//
//public class BubbleSort4 {
//    private Comparator<Integer> comparator;
//
//    public BubbleSort4(Comparator<Integer> comparator) {
//        this.comparator = comparator;
//    }
//
//    public int[] sortARound(int[] arr, int until) {
//        for (int i = 0; i < arr.length - 1; i++) { //1을 -->j로
//            if (comparator.compare(arr[i], arr[i+1])> arr[i + 1]) {
//                int temp = arr[i];
//                arr[i] = arr[i + 1];
//                arr[i + 1] = temp;
//            }
//        }
//        return arr;
//    }
//
//    public int[]sort(int[]arr){
//        for (int j = 1; j <= arr.length; j++) {
//            arr = sortARound(arr, arr.length-j); //메서드 안에서만 입력하면 됨
//        }
//        return arr;
//    }
//
//
//    public static void main(String[] args) {
//        BubbleSort4 bubbleSort4 = new BubbleSort4(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1- o2;
//            }}}
//        int[] arr = {7, 2, 3, 9, 28};
//        arr =
//        System.out.println(Arrays.toString(arr));
