package week3.day3;

public class IsPrime1 {
    public static void main(String[] args) {
        int num = 7;
        for (int i = 2; i < num; i++) {
            System.out.printf("%d %% %d = %d\n", num, i, num % i);
        }
    }
}