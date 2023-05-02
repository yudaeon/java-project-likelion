package week3.day2;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int answer = 1; //0으로 하면 안된다.
        // +=. *=
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
            answer *= i;
        }   System.out.println(answer);
    }
}
