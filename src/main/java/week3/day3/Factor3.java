package week3.day3;

public class Factor3 {
    public static void main(String[] args) {
        int n = 36;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.printf("%d ", i);
            }
        }
    }
}
