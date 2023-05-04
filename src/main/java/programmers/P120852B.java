package programmers;

public class P120852B {
    public static void main(String[] args) {
        int n = 12;
        int divisor = 2;
        int[] arr = new int[n +1]; //나누어 떨어진다면? array정의
        int idx = 0;


    while (n > 1) {
            if (n % divisor == 0) { //나누어 떨어지는지 ?
                arr[idx++] = divisor;
                n /= divisor; //n울 i로 나눠버리기
            } else {
                //12-->6-->3 인경우 2로 안나누어 떨어짐
                //2 / 3 --> x 안나누어 떨어짐
                divisor++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}
